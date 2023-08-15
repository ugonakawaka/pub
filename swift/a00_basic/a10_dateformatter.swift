import Foundation
do { //
// Appleの公式ドキュメントによると、iOS 7以降、DateFormatterはスレッドセーフになりました。
    print("######################## 1")
    let dateFormatter = DateFormatter()
    dateFormatter.dateFormat = "yyyy-MM-dd HH:mm:ss.SSSSSSSZ"
    // let dateString = "2023-03-21 12:34:56"

    DispatchQueue.concurrentPerform(iterations: 1000) { index in
        // print("Task \(index) is running on thread \(Thread.current)")
        let now = Date()
        // Dateから文字列表現する
        let formattedDate0 = dateFormatter.string(from: now)

        // 文字列表現からDateにする
        guard let date = dateFormatter.date(from: formattedDate0) else {
            print("Error: Failed to parse date.")
            return
        }

        let formattedDate1 = dateFormatter.string(from: date)

        if formattedDate0 == formattedDate1 {
        } else {
            print("Thread \(index): \(formattedDate0) \(formattedDate1)")
        }
    }
}
