package main

import (
	"fmt"
	"github.com/labstack/echo"
	"io/ioutil"
	"log"
	"net/http"
)

func main() {
	e := echo.New()
	e.GET("/", func(c echo.Context) error {
		return c.String(http.StatusOK, "Hello, World!")
	})

	// {apiRoot}/nnrf-nfm/v1/nf-instances/{nfInstanceId}

	// StatusOK                   = 200 // RFC 7231, 6.3.1
	// StatusCreated              = 201 // RFC 7231, 6.3.2
	//

	e.POST("/:apiRoot/nnrf-nfm/v1/nf-instances/:nfInstanceId", func(c echo.Context) error {

		json := readFile("a.json")
		fmt.Println(json)

		return c.String(http.StatusCreated, json)
	})
	e.Logger.Fatal(e.Start(":8080"))
}

func readFile(fpath string) string {

	content, err := ioutil.ReadFile(fpath)
	if err != nil {
		log.Println(err)
		return ""
	}

	return string(content)
}
