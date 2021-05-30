package main

import (
	"context"
	"fmt"
	"log"
	"net"
	"os"
	"sync/atomic"
	"time"
)

const MAX = 50000

var (
	cnt uint64
)

func main() {

	ctx, cancel := context.WithCancel(context.Background())
	ctx2, cancel2 := context.WithCancel(context.Background())
	defer cancel()

	rps := uint64(5000)

	go func() {
		ticker2(ctx2, int(rps), func() {

			atomic.AddUint64(&cnt, 1)
			if cnt%rps == 0 {
				fmt.Printf("%v %v\n", time.Now().Format(time.RFC3339Nano), "ticker2")
			}
			sendudp("192.168.1.6:55501", "test")

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
		if cnt >= MAX {
			fmt.Println(cnt)
			os.Exit(0)
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
		if cnt >= uint64(MAX) {
			fmt.Println(cnt)
			os.Exit(0)
		}
	}
}

func sendudp(saddr string, msg string) {
	conn, err := net.Dial("udp", saddr)
	if err != nil {
		log.Fatalln(err)
	}
	defer conn.Close()

	_, err = conn.Write([]byte(msg))
	if err != nil {
		log.Fatalln(err)
	}
}
