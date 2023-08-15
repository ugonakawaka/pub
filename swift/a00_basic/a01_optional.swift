import Foundation

do {
    // https://github.com/apple/swift/blob/main/stdlib/public/core/Optional.swift
}

do { // パターンマッチ
    // 参考) https://useyourloaf.com/blog/swift-optional-pattern-matching/

    // オプショナル型は共用型の列挙型

    // 参考) https://qiita.com/0901_yasyun/items/7f7047a45952a2e914d0
    // 共用型の列挙型は、実体型を指定しないシンプルな列挙型と、複数の異なるタプルの構造を併せ持つことができる型です。

    // 首都 オプショナルのString
    let capital: String? = "London"

    // 判定して
    switch capital {
    case .none:
        print("value is nil")
    case let .some(capital):
        print("value is \(capital)")
    }
}

// MARK:

do { // パターンマッチ
    // 自分で定義してみる

    enum a懸垂 {
        case none
        case a回数(String, Int) // 懸垂の種類と回数
    }

    let my懸垂: a懸垂 = a懸垂.a回数("順手", 9)

    switch my懸垂 {
    case .none:
        print("...")
    case let .a回数(_, c) where c > 8:
        print("Great! \(my懸垂)")
    }
}
