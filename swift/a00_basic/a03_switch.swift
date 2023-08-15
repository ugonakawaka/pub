import Foundation

do { // 設定
    // version 5.9
    // switchで値を返せるようになった！

    let anotherCharacter: Character = "a"
    let message: String = switch anotherCharacter {
    case "a":
        "アルファベットの最初の文字"
    case "z":
        "アルファベットの最後の文字"
    default:
        "その他の文字"
    }

    print(message)
    // "アルファベットの最初の文字"
}

do {
    //
    let f = { (a: Character) -> String in switch a {
    case "a":
        "アルファベットの最初の文字"
    case "z":
        "アルファベットの最後の文字"
    default:
        "その他の文字"
    }
    }
    print(f("z"))
    print(f("a"))
    print(f("x"))

    // アルファベットの最後の文字
    // アルファベットの最初の文字
    // その他の文字
}

do {
    var a = "a"
    let f = { switch a {
    case "a":
        "アルファベットの最初の文字"
    case "z":
        "アルファベットの最後の文字"
    default:
        "その他の文字"
    }
    }

    print(f())
    a = "z"
    print(f())

    // アルファベットの最初の文字
    // アルファベットの最後の文字
}

do {
    let a = { (n: Int) -> Int in n }
    let result = a(1)
    print(result)
}
