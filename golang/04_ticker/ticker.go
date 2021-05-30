package main

import (
	"context"
	"fmt"
	"sync/atomic"
	"time"
)

func main() {

	ctx, cancel := context.WithCancel(context.Background())
	ctx2, cancel2 := context.WithCancel(context.Background())
	defer cancel()

	var cnt uint64

	rps := uint64(10)

	go func() {
		ticker1(ctx2, int(rps), func() {
			atomic.AddUint64(&cnt, 1)
			if cnt%rps == 0 {
				fmt.Printf("%v %v\n", time.Now().Format(time.RFC3339Nano), "ticker1")
			}
		})
	}()
	go func() {
		ticker2(ctx2, int(rps), func() {
			atomic.AddUint64(&cnt, 1)
			if cnt%rps == 0 {
				fmt.Printf("%v %v\n", time.Now().Format(time.RFC3339Nano), "ticker2")
			}
		})
	}()
	go func() {
		cmd := ""
		for {

			fmt.Scan(&cmd)
			cancel2()
		}

	}()

	for {
		select {
		case <-ctx.Done():
			fmt.Println("bye...")
		default:
		}
	}
}

func Duration(rps int) time.Duration {
	nanosecond := 1000 * 1000 * 1000
	return time.Duration(nanosecond / rps)
}
func ticker1(ctx context.Context, rps int, f func()) {

	t := time.NewTicker(Duration(rps))
	defer t.Stop()

	for {
		select {
		case <-t.C:
			// fmt.Println(now.Format(time.RFC3339))
			go f()
		case <-ctx.Done():
			fmt.Println("bye...")
		default:
		}
	}
}

func waiting(start time.Time, wait time.Duration) {

	end := start.Add(wait)
	now := time.Now()
	for now.Before(end) {
		now = time.Now()
	}
}

// ticker2
func ticker2(ctx context.Context, rps int, f func()) {

	wait := Duration(rps)

	for {
		select {

		case <-ctx.Done():
			fmt.Println("bye...")
		default:
		}
		start := time.Now()
		go f()
		waiting(start, wait)
	}
}
