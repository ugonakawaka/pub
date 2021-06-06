package main

import (
	"fmt"
	"strconv"
	"sync/atomic"
)

type Counter struct {
	name string
	cnt0 int64
	cnt1 int64
	cnt2 int64
}

var (
	MapOfCounter map[string]*Counter = map[string]*Counter{}
)

func CreateHandler(name string, f func() error) func() error {

	counter := new(Counter)

	MapOfCounter[name] = counter

	return func() error {
		counter.AddCnt0()
		fmt.Println(counter.cnt0)

		err := f()

		if err != nil {
			counter.AddCnt2()
			return nil
		}
		counter.AddCnt1()
		return err
	}
}

func (cnt *Counter) AddCnt0() {
	atomic.AddInt64(&cnt.cnt0, 1)
}

func (cnt *Counter) AddCnt1() {
	atomic.AddInt64(&cnt.cnt1, 1)
}

func (cnt *Counter) AddCnt2() {
	atomic.AddInt64(&cnt.cnt2, 1)
}

func (cnt *Counter) Clear() {
	atomic.StoreInt64(&cnt.cnt0, 0)
	atomic.StoreInt64(&cnt.cnt1, 0)
	atomic.StoreInt64(&cnt.cnt2, 0)
}

func (c *Counter) String() string {
	return "name: " + c.name + "\tc0: " + strconv.FormatInt(c.cnt0, 10) + "\tc1: " + strconv.FormatInt(c.cnt1, 10) + "\tc2: " + strconv.FormatInt(c.cnt2, 10)
}
