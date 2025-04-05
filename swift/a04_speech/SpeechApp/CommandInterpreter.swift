import Foundation

/// コマンドラインからの入力を処理するインタープリタ
final class CommandInterpreter {
    /// 前回の音声選択
    private var lastVoiceSelection: String = ""
    
    /// 前回のテキスト入力
    private var lastTextInput: String = SpeechConstants.defaultText
    
    /// 標準入力から1行読み込む
    /// - Returns: 入力された文字列（トリミング済み）
    func readLine() -> String {
        return Swift.readLine()?.trimmingCharacters(in: .whitespacesAndNewlines) ?? ""
    }
    
    /// 音声選択のためのプロンプトを表示して入力を受け付ける
    /// - Returns: 入力された音声識別子
    func promptForVoiceSelection() -> String {
        if lastVoiceSelection.isEmpty {
            print(SpeechConstants.voiceSelectionPrompt, terminator: " ")
        } else {
            print("\(SpeechConstants.voiceSelectionPrompt) [\(lastVoiceSelection)]", terminator: " ")
        }
        
        let input = readLine()
        
        // 入力がない場合は前回の選択を使用
        if input.isEmpty && !lastVoiceSelection.isEmpty {
            return lastVoiceSelection
        }
        
        // 入力を保存して返す
        lastVoiceSelection = input
        return input
    }
    
    /// テキスト入力のためのプロンプトを表示して入力を受け付ける
    /// - Returns: 入力されたテキスト
    func promptForText() -> String {
        print("\(SpeechConstants.textInputPrompt) [\(lastTextInput)]", terminator: " ")
        let input = readLine()
        
        // 入力がない場合は前回のテキストを使用
        if input.isEmpty {
            return lastTextInput
        }
        
        // 入力を保存して返す
        lastTextInput = input
        return input
    }
    
    /// 入力が終了コマンドかどうかを判定
    /// - Parameter input: 入力文字列
    /// - Returns: 終了コマンドかどうか
    func isExitCommand(_ input: String) -> Bool {
        return input.lowercased() == SpeechConstants.exitCommand
    }
}