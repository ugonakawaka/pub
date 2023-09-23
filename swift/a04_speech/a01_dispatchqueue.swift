import AVFoundation

// DispatchGroupのインスタンスを作成
let group = DispatchGroup()

// バックグラウンドキューを作成
let speechQueue = DispatchQueue(label: "com.example.speechQueue", qos: .background)

// DispatchGroupにタスクを追加
group.enter()

// バックグラウンドスレッドでテキストを読み上げる
speechQueue.async {
    print("start")

    // AVSpeechSynthesizerのインスタンスを作成
    let synthesizer = AVSpeechSynthesizer()

    // 読み上げるテキストを設定
    let textToSpeak = "こんにちは、これはバックグラウンドで読み上げられるテキストです。"

    // AVSpeechUtteranceのインスタンスを作成し、テキストを設定
    let speechUtterance = AVSpeechUtterance(string: textToSpeak)

    // 読み上げる言語を日本語に設定
    speechUtterance.voice = AVSpeechSynthesisVoice(language: "ja-JP")

    // 読み上げ速度を設定（オプション）
    speechUtterance.rate = 0.5 // 0.5倍速

    // DispatchSemaphoreのインスタンスを作成
    let semaphore = DispatchSemaphore(value: 0)

    // 読み上げ完了時にSemaphoreを解放
    synthesizer.delegate = self // delegateの設定が必要

    print("***  読み上げ中")

    // 読み上げを実行
    synthesizer.speak(speechUtterance)

    // Semaphoreを待機
    semaphore.wait()
    print("***  after speek")
}

// DispatchGroupの待機
group.wait()
