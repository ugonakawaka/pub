import Foundation

do {
    let formatter = ISO8601DateFormatter()
    formatter.date(from: "2018-09-18T02:00:00Z")
    if let date = formatter.date(from: "2018-09-18T02:00:00Z") {
        print(date)
    } else {
        print("Invalid date string.")
    }
}

do {
    let dateFormatter = ISO8601DateFormatter()
    // 秒の小数部を変換するにはオプションを設定する
    dateFormatter.formatOptions.insert(.withFractionalSeconds)
    // ローカル環境の日付にする
    dateFormatter.timeZone = TimeZone.current
    let dateString = "2023-03-05T09:06:19.741Z"
    if let date = dateFormatter.date(from: dateString) {
        print(date)

        let localDate = dateFormatter.string(from: date)
        print(localDate)

        let dateFormatter1 = DateFormatter()
        dateFormatter1.dateFormat = "yyyy年MM月dd日HH時mm分ss秒"
        let formattedDate = dateFormatter1.string(from: date)
        print(formattedDate)

    } else {
        print("Invalid date string.")
    }
}
