import Combine
import Foundation
do { // 参考) https://www.bravesoft.co.jp/blog/archives/15610
    var cancellable: AnyCancellable?

    let subject = PassthroughSubject<Int, Never>() //

    cancellable = subject.sink { num in //
        print(num)
    }

    subject.send(1)
    subject.send(2)

    cancellable?.cancel() //

    subject.send(3)
}

do {
    func performAsyncActionAsFuture() -> Future<Void, Never> {
        Future { promise in
            DispatchQueue.main.asyncAfter(deadline: .now() + 1) {
                promise(Result.success(()))
            }
        }
    }
    print("1秒後に「HOGE」が出力されます")
    _ = performAsyncActionAsFuture().sink { _ in
        print("HOGE")
    }

    // 2秒またせる
    try await Task.sleep(nanoseconds: 2_000_000_000)
}

do { // Just
    let subscribe: Just<Int> = Just(11111)

    subscribe.sink { num in
        print(num)
    }
}

do { // 参考) https://www.bravesoft.co.jp/blog/archives/15610
    var cancellable: AnyCancellable?

    let subject = PassthroughSubject<[Int], Never>() //

    cancellable = subject.sink { num in //
        print(num)
    }

    subject.send([1, 2, 3, 4])
    subject.send([1, 2, 3, 4, 5, 6])
    cancellable?.cancel() //

    subject.send([3])
}
