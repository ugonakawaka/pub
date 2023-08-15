import Foundation

do { // 参考) https://qiita.com/valmet/items/6de0921ca6106414228c
    // 実行しているスレッドの判定
    if Thread.isMainThread {
        print("MainThreadです")
    } else {
        print("MainThreadではない")
    }
}

if false { // urlのlinesを使ってみる
    let url = URL(string: "https://deiji.jp/")!

    Task { // 一行づつプリント
        for try await line in url.lines {
            print(line)
        }
    }

    // 無理やりまたせる
    try await Task.sleep(nanoseconds: 1_000_000_000)
}

if false { // https://swift.codelly.dev/guide/%E3%83%8D%E3%83%83%E3%83%88%E3%83%AF%E3%83%BC%E3%82%AF/#urlsessionconfiguration
    // 通信してまるっととってくる
    let url = URL(string: "https://google.com")!
    var request = URLRequest(url: url)
    request.httpMethod = "GET"
    let task = URLSession.shared.dataTask(with: request) { data, response, error in

        if let error {
            print(error.localizedDescription)
            return
        }

        guard let data, let response = response as? HTTPURLResponse else {
            print("データがありませんでした。")
            return
        }

        if response.statusCode == 200 {
            do {
                var s = String(data: data, encoding: .utf8)
                print(s!)

            } catch {
                print("不正なデータです")
            }
            // 処理...
        }
        print("*** ok 2-1")

        print("*** ok 2-2")
    }
    print("*** ok 3")
    task.resume()
    try await Task.sleep(nanoseconds: 2_000_000_000)
}

do {
    let url = URL(string: "https://google.com")!
    var request = URLRequest(url: url)
    request.httpMethod = "GET"
    let task = URLSession.shared.dataTask(with: request, completionHandler: { data, response, error in
        dump(data)
        dump(response)
        dump(error)
    })
    task.resume()
    try await Task.sleep(nanoseconds: 2_000_000_000)
}

do { // await
    let url = URL(string: "https://google.com")!
    var request = URLRequest(url: url)
    let (data, response) = try await URLSession.shared.data(for: request)
    dump(data)
}


