package main

import (
	"fmt"
	"net/http"
	"net/http/cgi"
	"net/http/httputil"
	"net/url"
	"path/filepath"
)

// https://ja.stackoverflow.com/questions/26731/golang%E3%81%AEcgi%E3%81%A7%E3%83%AA%E3%82%AF%E3%82%A8%E3%82%B9%E3%83%88%E3%82%92%E3%81%9D%E3%81%AE%E3%81%BE%E3%81%BE%E5%88%A5%E3%81%AE%E3%82%B5%E3%83%BC%E3%83%90%E3%81%AB%E9%80%81%E3%82%8A%E3%81%9F%E3%81%84
func main() {
	if err := cgi.Serve(http.HandlerFunc(func(w http.ResponseWriter, r *http.Request) {

		// ヘッダをセット
		header := w.Header()
		header.Set("Content-Type", "text/html; charset=utf-8")

		// パスを取得
		proxyPath := r.FormValue("proxyPath")
		if !filepath.IsAbs(proxyPath) {
			fmt.Fprintf(w, "Invalid request")
			return
		}
		formValue := r.Form

		// パスをQueryStringから消去
		formValue.Del("proxyPath")

		target, err := url.Parse("[address]")
		if err != nil {
			fmt.Println(err)
		}
		r.URL, err = url.Parse("" + proxyPath + "?" + formValue.Encode())
		if err != nil {
			fmt.Println(err)
		}
		proxy := httputil.NewSingleHostReverseProxy(target)
		proxy.ServeHTTP(w, r)
	})); err != nil {
		fmt.Println(err)
	}
}
