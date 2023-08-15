import Foundation

do { // 参考) https://thinkit.co.jp/article/13489
    // この?をつけたのがオプショナル
    // let s: Optional<String>
    let s: String? = "HELLO"
    if let s2 = s?.lowercased() {
        print(s2)
    }
}

do { // nilを設定してもおちないよ
    let s: String? = nil
    if let s2 = s?.lowercased() {
        print(s2)
    }
}

do { // nilを設定してもおちないよ
    let s: String? = nil
    if let s2 = s?.lowercased() {
        print(s2)
    }
}

do { // 開示(unwrap)
    let a: Int? = Int("2022")
    let b: Int = a! + 1
    print(b)
}

do { // if-let文
    if var y = Int("1986") {
        y += 75
        print("\(y)")
    }

    if var y = Int("1986a") {
        y += 75
        print("\(y)")
    }

    // この書き方は便利そう,カンマが論理演算子の役割をしている
    let y = 1998
    if y > 1900, let y2 = Int("2022"), y2 > y {
        print("\(y2 - y)")
    }
}

aaa: do { // guard文
    print("何か入力してください")
    let s = readLine()! // 標準入力

    guard let i = Int(s) else {
        print("*** not number '\(s)'")
        // ラベルまでとぶよ
        break aaa
    }
    print(" '\(i)' is number")
}
