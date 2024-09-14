
pyhtonでサーバ起動

cgi-binディレクトリを作成して、そこに拡張子cgiの実行ファイルをおく

$ python3 -m http.server 8080 --cgi

例）
http://localhost:8080/cgi-bin/main.cgi



■リバースプロキシ
"net/http/httputil"