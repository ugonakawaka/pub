import Foundation

do { /* guard */
    // guard <#condition#> else {
//    <#statements#>
    // }

    { // 無名関数のようなイメージ
        let a: String? = nil

        guard let b = a else {
            print("guard ok a:")
            return
        }

        print("guard ok b:\(b)")
    }()
}

print("***** ")

do {
    let s: String? = "test"
    let a = if let a = s {
        String(format: "ok \(a)")
    } else {
        String(format: "ok nil")
    }
    print("*** ok a:\(a)")
}

do {
    let s: String? = "test"
    let a = if let a = s {
        String(format: "ok \(a)")
    } else {
        String(format: "ok nil")
    }
    print("*** ok a:\(a)")
}

do { // この書き方はできない
    // let s: Int? = 100
    // let a = if let a = s {
    //     let b = a + 100
    //     String(format: "ok \(b)")
    // } else {
    //     String(format: "not 100")
    // }
    // print("*** ok a:\(a)")
}

do { // 中身をクロージャにすると複数行でもかける
    let s: Int? = 100
    let a = if let a = s {
        { let b = a + 100
            return String(format: "ok \(b)")
        }()
    } else {
        String(format: "not 100")
    }
    print("*** ok a:\(a)")
}
