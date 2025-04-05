import AVFoundation
import Foundation

/// 音声合成処理を担当するサービス
final class SpeakerService {
    /// 音声合成エンジン
    private let synthesizer = AVSpeechSynthesizer()
    
    /// 音声合成の完了を監視するデリゲート
    private let delegate = SpeechDelegate()
    
    /// 初期化
    init() {
        synthesizer.delegate = delegate
    }
    
    /// 指定されたリクエストに基づいて音声を発話する
    /// - Parameter request: 発話リクエスト
    /// - Returns: 発話が正常に完了したかどうか
    func speak(_ request: SpeechRequest) -> Bool {
        // リクエストからAVSpeechUtteranceを作成
        let utterance = AVSpeechUtterance(string: request.text)
        utterance.voice = request.voice
        utterance.rate = request.rate
        utterance.pitchMultiplier = request.pitchMultiplier
        
        // デバッグ情報を表示
        print("選択された音声: \(request.voice.name)")
        print("テキスト: \(request.text)")
        print("発話を開始します...")
        
        // 完了フラグをリセット
        delegate.isDone = false
        
        // 発話開始
        synthesizer.speak(utterance)
        
        // 完了またはタイムアウトまで待機
        return waitForCompletion()
    }
    
    /// 発話の完了を待機する
    /// - Returns: タイムアウトせずに完了したかどうか
    private func waitForCompletion() -> Bool {
        let startTime = Date()
        
        while !delegate.isDone {
            // 短時間実行してイベントを処理
            RunLoop.current.run(until: Date().addingTimeInterval(SpeechConstants.pollingIntervalSeconds))
            
            // タイムアウトチェック
            if Date().timeIntervalSince(startTime) > SpeechConstants.maxWaitTimeSeconds {
                print("タイムアウト: \(SpeechConstants.maxWaitTimeSeconds)秒経過しました")
                return false
            }
        }
        
        return true
    }
}

/// 音声合成の完了を監視するデリゲート
final class SpeechDelegate: NSObject, AVSpeechSynthesizerDelegate {
    /// 発話が完了したかどうか
    var isDone = false
    
    /// 発話完了時に呼ばれるデリゲートメソッド
    func speechSynthesizer(_ synthesizer: AVSpeechSynthesizer, didFinish utterance: AVSpeechUtterance) {
        print("発話が完了しました")
        isDone = true
    }
}