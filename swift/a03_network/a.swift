import _Concurrency
import Foundation

if false { // urlのlinesを使ってみる
    let url = URL(string: "https://deiji.jp/")!

    Task {
        for try await line in url.lines {
            print(line)
        }
    }

    // 無理やりまたせる
    try await Task.sleep(nanoseconds: 1_000_000_000)
}

if true { // 参考) https://qiita.com/solty_919/items/3d582ddd47b5b727e230
    var component = URLComponents(string: "http://zipcloud.ibsnet.co.jp/api/search")!
    component.queryItems = [URLQueryItem(name: "zipcode", value: "150-0011")]

    URLSession.shared.dataTask(with: component.url!) { data, _, _ in
        let json = String(data: data!, encoding: .utf8)!
        print(json)
    }.resume()

    // 無理やりまたせる
    try await Task.sleep(nanoseconds: 1_000_000_000)
}
