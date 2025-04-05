#!/bin/bash

# エラー発生時に停止
set -e

echo "SpeechAppをビルドしています..."

# Swiftコンパイラでアプリケーションをビルド
swiftc \
  Constants.swift \
  Models.swift \
  SpeakerService.swift \
  VoiceSelector.swift \
  CommandInterpreter.swift \
  AppController.swift \
  main.swift \
  -o SpeechApp \
  -framework AVFoundation \
  -swift-version 5

echo "ビルド完了！"
echo "実行するには './SpeechApp' を実行してください。"