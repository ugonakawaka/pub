import AVFoundation
import Foundation

// 標準エラー出力
class StandardError: TextOutputStream {
    func write(_ string: String) {
        try! FileHandle.standardError.write(contentsOf: Data(string.utf8))
    }
}

class TextToSpeech: NSObject, AVSpeechSynthesizerDelegate {
    let synthesizer = AVSpeechSynthesizer()
    var standardError = StandardError()

    override init() {
        super.init()
        synthesizer.delegate = self
    }

    func speak(_ text: String) {
        // print("*** speak \(text) isPaused=>\(synthesizer.isPaused) isSpeaking=>\(synthesizer.isSpeaking) \(synthesizer.delegate)")
        let utterance = AVSpeechUtterance(string: text)
        synthesizer.speak(utterance)
    }

    func stopSpeaking() {
        synthesizer.stopSpeaking(at: .immediate)
    }

    func pauseSpeaking() {
        synthesizer.pauseSpeaking(at: .word)
    }

    func resumeSpeaking() {
        synthesizer.continueSpeaking()
    }

    func cancelSpeaking() {
        synthesizer.stopSpeaking(at: .word)
    }

    func speechSynthesizer(_: AVSpeechSynthesizer, didStart utterance: AVSpeechUtterance) {
        // 読み上げが開始したときに呼ばれるメソッド
        print("読み上げが開始しました: \(utterance.speechString)", to: &standardError)
    }

    func speechSynthesizer(_: AVSpeechSynthesizer, didFinish _: AVSpeechUtterance) {
        // 音声合成が完了した時の処理
        print("*** 音声合成が完了した", to: &standardError)
    }

    func speechSynthesizer(_: AVSpeechSynthesizer, didPause _: AVSpeechUtterance) {
        // 音声合成が一時停止した時の処理
        print("*** 音声合成が一時停止した", to: &standardError)
    }

    func speechSynthesizer(_: AVSpeechSynthesizer, didContinue _: AVSpeechUtterance) {
        // 音声合成が再開した時の処理
        print("*** 音声合成が再開した", to: &standardError)
    }

    func speechSynthesizer(_: AVSpeechSynthesizer, didCancel _: AVSpeechUtterance) {
        // 音声合成がキャンセルされた時の処理
        print("*** 音声合成がキャンセルされた", to: &standardError)
    }
}

// extension TextToSpeech: AVSpeechSynthesizerDelegate {
//     func speechSynthesizer(_: AVSpeechSynthesizer, didFinish _: AVSpeechUtterance) {
//         // 読み上げが完了したときの処理（ここでは何もしない）
//     }
// }

func main() {
    let textToSpeech = TextToSpeech()

    while true {
        print("文字列を入力してください:", terminator: " ")
        if let input = readLine(), !input.isEmpty {
            let cmd = input.lowercased()
            switch cmd {
            case "cancel":
                textToSpeech.cancelSpeaking()
            case "stop":
                textToSpeech.stopSpeaking()
            case "exit":
                textToSpeech.stopSpeaking()
                exit(0)
            case "p", "apuse":
                textToSpeech.pauseSpeaking()
            case "r", "resume":
                textToSpeech.resumeSpeaking()
            default:
                textToSpeech.speak(input)
            }
        }
    }
}

DispatchQueue.global().async {
    main()
}

RunLoop.main.run()
