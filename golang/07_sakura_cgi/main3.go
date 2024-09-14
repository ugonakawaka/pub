package main

import (
	"fmt"
	"net/http"
	"net/http/cgi"
)

func viewHandler(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "text/plain; charset=utf-8")
	fmt.Fprintln(w, "Hello World")
}

func main() {
	http.HandleFunc("/", viewHandler)

	cgi.Serve(nil)
}
