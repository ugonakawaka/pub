import AVFoundation
import Dispatch

class SpeechDelegate: NSObject, AVSpeechSynthesizerDelegate {
    let semaphore: DispatchSemaphore

    init(semaphore: DispatchSemaphore) {
        self.semaphore = semaphore
    }

    func speechSynthesizer(_: AVSpeechSynthesizer, didFinish utterance: AVSpeechUtterance) {
        // 読み上げが完了したときに呼ばれるメソッド
        print("読み上げが完了しました: \(utterance.speechString)")
        // Semaphoreを解放して待機を終了
        semaphore.signal()
    }

    func speechSynthesizer(_: AVSpeechSynthesizer, didStart utterance: AVSpeechUtterance) {
        // 読み上げが開始したときに呼ばれるメソッド
        print("読み上げが開始しました: \(utterance.speechString)")
    }

    func speechSynthesizer(_: AVSpeechSynthesizer, didPause utterance: AVSpeechUtterance) {
        // 読み上げが一時停止したときに呼ばれるメソッド
        print("読み上げが一時停止しました: \(utterance.speechString)")
    }

    func speechSynthesizer(_: AVSpeechSynthesizer, didContinue utterance: AVSpeechUtterance) {
        // 一時停止から再開したときに呼ばれるメソッド
        print("読み上げを再開しました: \(utterance.speechString)")
    }

    func speechSynthesizer(_: AVSpeechSynthesizer, didCancel utterance: AVSpeechUtterance) {
        // 読み上げがキャンセルされたときに呼ばれるメソッド
        print("読み上げがキャンセルされました: \(utterance.speechString)")

        // Semaphoreを解放して待機を終了
        semaphore.signal()
    }
}

print("start")

// AVSpeechSynthesizerのインスタンスを作成
let synthesizer = AVSpeechSynthesizer()

// 読み上げるテキストを設定
let textToSpeak = "漢字は正しく読めるのだろうか？"

// AVSpeechUtteranceのインスタンスを作成し、テキストを設定
let speechUtterance = AVSpeechUtterance(string: textToSpeak)

// 読み上げる言語を日本語に設定
speechUtterance.voice = AVSpeechSynthesisVoice(language: "ja-JP")

// 読み上げ速度を設定（オプション）
speechUtterance.rate = 0.69 //

// DispatchSemaphoreのインスタンスを作成
let semaphore = DispatchSemaphore(value: 0)
unowned let delegate: SpeechDelegate? = SpeechDelegate(semaphore: semaphore)
synthesizer.delegate = delegate
// 読み上げを実行
synthesizer.speak(speechUtterance)
// Semaphoreを待機
semaphore.wait()
// try await Task.sleep(until: .now + .seconds(10))
print("*** exit")
