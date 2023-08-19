### まずはバージョンを確認しましょう
```
swift --version 
```

### コンパイルするよ
```
swiftc main.swift 
swiftc main.swift -suppress-warnings 
```

### 即時実行
```
swift main.swift
```

### swiftformt
```
brew install swiftformat
swiftformat main.swift
```
### ワーニングをおさえるよ  
```
-suppress-warnings      Suppress all warnings  
```

### 言語仕様とか  

[https://docs.swift.org/swift-book/documentation/the-swift-programming-language](https://docs.swift.org/swift-book/documentation/the-swift-programming-language)  

### beta版を使う

1\. apple develoterサイトからbeta版をダウンロード  
2\. アプリケーションフォルダにbeta版を移動させる  
3\. プロンプトで下記のコマンド実行して、使用するxcodeを変更する  
```
sudo xcode-select -s /Applications/Xcode-beta.app 
```
