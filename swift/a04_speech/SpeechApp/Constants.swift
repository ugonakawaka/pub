import Foundation

/// アプリケーション全体で使用される定数
enum SpeechConstants {
    /// デフォルトの言語
    static let defaultLanguage = "en-US"
    
    /// デフォルトの音声名
    static let defaultVoiceName = "Samantha"
    
    /// デフォルトの発話テキスト
    static let defaultText = "Hello, this is a test."
    
    /// 発話速度（0.0-1.0）
    static let speechRate: Float = 0.48
    
    /// 音程の倍率
    static let pitchMultiplier: Float = 1.05
    
    /// 最大待機時間（秒）
    static let maxWaitTimeSeconds: TimeInterval = 30.0
    
    /// ポーリング間隔（秒）
    static let pollingIntervalSeconds: TimeInterval = 0.1
    
    /// 音声選択のためのプロンプト
    static let voiceSelectionPrompt = "音声を選択してください："
    
    /// テキスト入力のためのプロンプト
    static let textInputPrompt = "発話するテキストを入力してください："
    
    /// 終了コマンド
    static let exitCommand = "exit"
}