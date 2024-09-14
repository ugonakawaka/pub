package main

import (
	"bytes"
	"fmt"
	"io/ioutil"
	"net/http"
	"net/http/cgi"
	"net/http/httputil"
	"net/url"
)

// https://kido0617.github.io/go/2016-08-10-reverse-proxy/
// https://ja.stackoverflow.com/questions/26731/golang%E3%81%AEcgi%E3%81%A7%E3%83%AA%E3%82%AF%E3%82%A8%E3%82%B9%E3%83%88%E3%82%92%E3%81%9D%E3%81%AE%E3%81%BE%E3%81%BE%E5%88%A5%E3%81%AE%E3%82%B5%E3%83%BC%E3%83%90%E3%81%AB%E9%80%81%E3%82%8A%E3%81%9F%E3%81%84
func main() {
	if err := cgi.Serve(http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {

		buffer, _ := ioutil.ReadAll(r.Body)
		req2, _ := http.NewRequest(r.Method, "", bytes.NewBuffer(buffer))

		remote, _ := url.Parse("https://deijitools.appspot.com/")
		// remote, _ := url.Parse("http://localhost:8080")
		proxy := httputil.NewSingleHostReverseProxy(remote)

		proxy.ServeHTTP(w, req2)
	})); err != nil {
		fmt.Println(err)
	}
}
