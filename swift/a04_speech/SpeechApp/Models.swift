import AVFoundation
import Foundation

/// 音声オプションを表すモデル
struct VoiceOption {
    /// 表示用の識別子（a-z）
    let identifier: String
    
    /// 実際の音声オブジェクト
    let voice: AVSpeechSynthesisVoice
    
    /// 表示用の文字列
    var displayString: String {
        return "\(identifier): \(voice.name) (\(voice.language))"
    }
}

/// 音声発話リクエストを表すモデル
struct SpeechRequest {
    /// 発話するテキスト
    let text: String
    
    /// 使用する音声
    let voice: AVSpeechSynthesisVoice
    
    /// 発話速度
    let rate: Float
    
    /// 音程の倍率
    let pitchMultiplier: Float
    
    /// デフォルト設定で初期化
    static func withDefaults(text: String = SpeechConstants.defaultText,
                            voice: AVSpeechSynthesisVoice = AVSpeechSynthesisVoice(language: SpeechConstants.defaultLanguage)!) -> SpeechRequest {
        return SpeechRequest(
            text: text,
            voice: voice,
            rate: SpeechConstants.speechRate,
            pitchMultiplier: SpeechConstants.pitchMultiplier
        )
    }
}