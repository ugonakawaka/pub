import Dispatch

do {
    let semaphore = DispatchSemaphore(value: 0)

    // スレッド1
    DispatchQueue.global().async {
        print("スレッド1 開始")
        // 何らかの処理
        semaphore.signal() // セマフォの値をインクリメント
    }

    // スレッド2
    DispatchQueue.global().async {
        print("スレッド2 開始")
        semaphore.wait() // セマフォの値が0未満の場合、ここでブロック
        print("スレッド2 続行")
    }

    // ブロック
    try await Task.sleep(until: .now + .seconds(3))
}

/* */
func exampleAsyncFunction() async {
    let semaphore = DispatchSemaphore(value: 3)

    let value = await withCheckedContinuation { continuation in
        Task {
            let result = semaphore.wait(timeout: .now())
            continuation.resume(returning: result)
        }
    }

    print("セマフォの値: \(value)")
}

do {
    Task {
        await exampleAsyncFunction()
    }
}
