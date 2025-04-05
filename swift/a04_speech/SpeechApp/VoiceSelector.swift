import AVFoundation
import Foundation

/// 利用可能な音声の選択と管理を担当するサービス
final class VoiceSelector {
    /// 利用可能な音声オプション
    private(set) var voiceOptions: [VoiceOption] = []
    
    /// 初期化時に利用可能な音声をロード
    init() {
        loadAvailableVoices()
    }
    
    /// 利用可能な音声をロードして選択可能なオプションに変換
    private func loadAvailableVoices() {
        // すべての音声を取得
        let allVoices = AVSpeechSynthesisVoice.speechVoices()
        
        // 英語音声をフィルタリング
        let englishVoices = allVoices.filter { voice in
            voice.language.starts(with: "en")
        }
        
        // 識別子を生成（a-z, aa-az, ba-bz, ...）
        voiceOptions = englishVoices.enumerated().map { index, voice in
            let identifier = generateIdentifier(index)
            return VoiceOption(identifier: identifier, voice: voice)
        }
    }
    
    /// 利用可能な音声オプションを表示
    func displayAvailableVoices() {
        print("\n利用可能な音声:")
        voiceOptions.forEach { option in
            print(option.displayString)
        }
        print()
    }
    
    /// 識別子から対応する音声オプションを取得
    /// - Parameter identifier: 音声識別子
    /// - Returns: 対応する音声オプション（存在しない場合はnil）
    func getVoiceOption(forIdentifier identifier: String) -> VoiceOption? {
        return voiceOptions.first { $0.identifier == identifier.lowercased() }
    }
    
    /// インデックスから識別子を生成（a-z, aa-az, ba-bz, ...）
    /// - Parameter index: 音声のインデックス
    /// - Returns: 生成された識別子
    private func generateIdentifier(_ index: Int) -> String {
        let chars = "abcdefghijklmnopqrstuvwxyz"
        let singleCharCount = chars.count
        
        // 1文字目のインデックス
        let firstCharIndex = index / singleCharCount
        // 2文字目のインデックス（25以下の場合は1文字だけ）
        let secondCharIndex = index % singleCharCount
        
        if firstCharIndex == 0 {
            // a-zの範囲（インデックス0-25）
            return String(chars[chars.index(chars.startIndex, offsetBy: secondCharIndex)])
        } else {
            // aa-az, ba-bz, ...の範囲（インデックス26以上）
            let firstChar = chars[chars.index(chars.startIndex, offsetBy: firstCharIndex - 1)]
            let secondChar = chars[chars.index(chars.startIndex, offsetBy: secondCharIndex)]
            return String(firstChar) + String(secondChar)
        }
    }
    
    /// デフォルトの音声オプションを取得
    /// - Returns: デフォルトの音声オプション
    func getDefaultVoiceOption() -> VoiceOption? {
        // Samanthaという名前の音声を探す
        if let defaultOption = voiceOptions.first(where: { $0.voice.name == SpeechConstants.defaultVoiceName }) {
            return defaultOption
        }
        
        // 見つからなければ最初の音声を返す
        return voiceOptions.first
    }
}