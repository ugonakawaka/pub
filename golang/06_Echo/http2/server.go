package main

import (
	"github.com/labstack/echo/v4"
	"golang.org/x/net/http2"
	"log"
	"net/http"
	"time"
)

func main() {
	// https://echo.labstack.com/guide/http_server/

	e := echo.New()
	// add middleware and routes
	// ...
	s := &http2.Server{
		MaxConcurrentStreams: 250,
		MaxReadFrameSize:     1048576,
		IdleTimeout:          10 * time.Second,
	}
	e.GET("/", func(c echo.Context) error {
		return c.String(http.StatusOK, "Hello, World!")
	})
	if err := e.StartH2CServer(":8080", s); err != http.ErrServerClosed {
		log.Fatal(err)
	}

}
