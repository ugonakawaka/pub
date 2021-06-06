package main

import "fmt"

func main() {
	{
		handler := CreateHandler("aaa", func() error { return nil })
		handler()
	}
	{
		handler := CreateHandler("bbb", func() error { return nil })
		handler()
		handler()
	}
	fmt.Println(MapOfCounter)
}
