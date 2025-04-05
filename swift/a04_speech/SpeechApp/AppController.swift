import Foundation

/// アプリケーション全体の処理フローを制御するコントローラ
final class AppController {
    /// 音声選択サービス
    private let voiceSelector = VoiceSelector()
    
    /// 音声発話サービス
    private let speakerService = SpeakerService()
    
    /// コマンド解釈サービス
    private let commandInterpreter = CommandInterpreter()
    
    /// アプリケーションのメインループを実行
    func run() {
        // コマンドライン引数からの初期設定を試みる
        processCommandLineArguments()
        
        // メインループ
        mainLoop()
    }
    
    /// コマンドライン引数を処理
    private func processCommandLineArguments() {
        let arguments = CommandLine.arguments
        
        // コマンドライン引数からテキストと音声名を取得
        if arguments.count > 1 {
            let text = arguments[1]
            var selectedVoice = voiceSelector.getDefaultVoiceOption()?.voice
            
            if arguments.count > 2 {
                // 音声名が指定されている場合は対応する音声を探す
                let voiceName = arguments[2]
                selectedVoice = voiceSelector.voiceOptions
                    .first(where: { $0.voice.name == voiceName })?.voice ?? selectedVoice
            }
            
            // 音声が見つかった場合は発話実行
            if let voice = selectedVoice {
                let request = SpeechRequest(
                    text: text,
                    voice: voice,
                    rate: SpeechConstants.speechRate,
                    pitchMultiplier: SpeechConstants.pitchMultiplier
                )
                
                _ = speakerService.speak(request)
            }
        }
    }
    
    /// メインループを実行
    private func mainLoop() {
        var shouldExit = false
        
        while !shouldExit {
            // 利用可能な音声を表示
            voiceSelector.displayAvailableVoices()
            
            // 音声選択
            let voiceInput = commandInterpreter.promptForVoiceSelection()
            
            // 終了コマンドのチェック
            if commandInterpreter.isExitCommand(voiceInput) {
                shouldExit = true
                continue
            }
            
            // 音声オプションを取得
            guard let voiceOption = voiceSelector.getVoiceOption(forIdentifier: voiceInput) else {
                print("無効な選択です。もう一度お試しください。")
                continue
            }
            
            // テキスト入力
            let text = commandInterpreter.promptForText()
            
            // 終了コマンドのチェック
            if commandInterpreter.isExitCommand(text) {
                shouldExit = true
                continue
            }
            
            // 発話リクエストの作成と実行
            let request = SpeechRequest(
                text: text,
                voice: voiceOption.voice,
                rate: SpeechConstants.speechRate,
                pitchMultiplier: SpeechConstants.pitchMultiplier
            )
            
            _ = speakerService.speak(request)
        }
        
        print("プログラムを終了します")
    }
}