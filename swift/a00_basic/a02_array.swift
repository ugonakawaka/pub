
import Foundation

do { // 設定
    var arr: [String] = []

    print(arr.count)
    arr[...] = ["ok"]
    print("set \(arr.count) \(arr[0])")
    // 削除
    arr = []
    print("delete all \(arr.count)")
}

do { // 乱数
    // 東経 とうけい 120度から150度の間
    // 北緯 ほくい 20度から45度の間

    for _ in 0 ... 1000 {
        let lng = Double.random(in: 120.0 ..< 150.0)
        let lat = Double.random(in: 20.0 ..< 45.0)
        print("\(lng) \(lat)")
    }
}
