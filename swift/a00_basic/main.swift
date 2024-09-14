
import CoreData

print(1)
print("ok")
print("ok")

// クロージャー
aaa: do {
    var c1 = { () in print("hello") } // これがいいかなーどうだろう
    var c2 = { () in print("hello") }
    var c3 = { () in print("hello") }
    var c4 = { print("hello") } // 省略しまくり
    c1()
    c2()
    c3()
    c4()

    // ==================
    let d1 = { print("即hello"); return "ok" }() // 即時実行して値を
    print("値を返す場合は、即時実行できるぽい \(d1)")
}

// クロージャー
bbb: do {
    var CONST1 = "o_o!"
    var c1 = { print("hello \(CONST1)") } // 外側の値を使う
    c1()
    CONST1 = ">_<!"
    c1()
}

do { // User Defaultsを使ってみるよ
    // https://developer.apple.com/documentation/foundation/userdefaults
    // UserDefaults.standard.set("Tokyo", forKey: "currentCity")
    // オプショナルになる
    let currentCity = UserDefaults.standard.string(forKey: "currentCity")
    print("\(currentCity)")
}

do { // Core dataを使ってみるよ
    lazy var persistentContainer: NSPersistentContainer = {
        let container = NSPersistentContainer(name: "CoreDataDemo")
        container.loadPersistentStores(completionHandler: { _, error in
            if let error = error as NSError? {
                print(error.userInfo)
            }
        })
        return container
    }()
}

do { // http通信?
    struct Img: Hashable, Codable {
        var large: String?
        var medium: String?
        var small: String?
    }
    print("*** ok 0")
    func request() {
        guard let url = URL(string: "https://deiji.jp") else { return }
        var request = URLRequest(url: url)
        request.httpMethod = "GET"
        let task = URLSession.shared.dataTask(with: request, completionHandler: { data, _, _ in
            if let data {
                dump(data)
            }
        })
        task.resume()
    }

    request()
}

if false {
    func getGurudocoId() {
        print("*** ok 1")

        let url = URL(string: "http://localhost:8080/api/gurudocoid")!
        var request = URLRequest(url: url)
        request.httpMethod = "POST"
        let task = URLSession.shared.dataTask(with: request) { data, response, error in
            print("*** ok 2")
            if let error {
                print("クライアントエラー: \(error.localizedDescription) \n")
                return
            }

            guard let data, let response = response as? HTTPURLResponse else {
                print("no data or no response")
                return
            }

            print("*** ok 2-1")
            if response.statusCode == 200 {
                var s = String(data: data, encoding: .utf8)
                print(s!)
                print(data)
            } else {
                // レスポンスのステータスコードが200でない場合などはサーバサイドエラー
                print("サーバエラー ステータスコード: \(response.statusCode)\n")
            }
            print("*** ok 2-2")
        }
        print("*** ok 3")
        task.resume()
    }

    getGurudocoId()

    // 無理やりまたせる
    try await Task.sleep(nanoseconds: 1_000_000_000)
}

if true {
    let url = URL(string: "http://localhost:8080/api/gurudocoid")!
    var request = URLRequest(url: url)
    request.httpMethod = "POST"

    URLSession.shared.dataTask(with: request) { data, _, _ in
        var s = String(data: data!, encoding: .utf8)
        print(s!)

    }.resume()

    try await Task.sleep(nanoseconds: 2_000_000_000)
}
