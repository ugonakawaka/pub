

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