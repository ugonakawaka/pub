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



