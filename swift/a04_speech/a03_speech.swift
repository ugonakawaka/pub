import AVFoundation
import Foundation

// コマンドライン引数を取得
let arguments = CommandLine.arguments
let text = arguments.count > 1 ? arguments[1] : "Hello, this is a test."
let voiceName = arguments.count > 2 ? arguments[2] : "Samantha"

// 音声合成の設定
let synthesizer = AVSpeechSynthesizer()
let utterance = AVSpeechUtterance(string: text)

// 利用可能な音声から選択
let allVoices = AVSpeechSynthesisVoice.speechVoices()
var selectedVoice: AVSpeechSynthesisVoice? = nil

for voice in allVoices where voice.language.starts(with: "en") {
    if voice.name == voiceName {
        selectedVoice = voice
        break
    }
}

// 見つからなければデフォルトの英語音声
if selectedVoice == nil {
    selectedVoice = AVSpeechSynthesisVoice(language: "en-US")
}

utterance.voice = selectedVoice
utterance.rate = 0.48
utterance.pitchMultiplier = 1.05

// デバッグ情報を表示
print("選択された音声: \(selectedVoice?.name ?? "不明")")
print("テキスト: \(text)")
print("発話を開始します...")

// タイムアウト付きの待機
class SpeechDelegate: NSObject, AVSpeechSynthesizerDelegate {
    var isDone = false
    
    func speechSynthesizer(_ synthesizer: AVSpeechSynthesizer, didFinish utterance: AVSpeechUtterance) {
        print("発話が完了しました")
        isDone = true
    }
}

let delegate = SpeechDelegate()
synthesizer.delegate = delegate

// 発話開始
synthesizer.speak(utterance)

// タイムアウト付きで待機
let startTime = Date()
let maxWaitTime: TimeInterval = 30  // 最大30秒待機
var shouldExit = false

while !delegate.isDone && !shouldExit {
    RunLoop.current.run(until: Date().addingTimeInterval(0.1))
    
    // タイムアウトチェック
    if Date().timeIntervalSince(startTime) > maxWaitTime {
        print("タイムアウト: 30秒経過しました")
        shouldExit = true
    }
}

print("プログラムを終了します")
exit(0)  // 強制的に終了