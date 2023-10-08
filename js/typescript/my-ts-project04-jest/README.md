# プロジェクト開始

```
mkdir my-ts-project04-jest
cd my-ts-project04-jest
npm init -y
npm install --save-dev typescript
npm install --save-dev jest
npm install --save-dev typescript ts-jest @types/jest
export PATH="./node_modules/.bin:$PATH"
tsc --init
npm install --save-dev @types/node
npm install --save-dev ts-node
mkdir -p src/lib
```

ローカルのコマンドを優先させたいので、ターミナルを新しく開くときは、下記のコマンドを実行しておく

```
export PATH="./node_modules/.bin:$PATH"
```

ローカルのコマンドが優先されたかどうか which しておく

```
% which tsc
./node_modules/.bin/tsc
```

## .vscode の設定

## Prettier

vscode のプラグインとしていれおく
プロジェクト内に入れたほうがよいのだろうか。ビルドするときにかけるとか。
.prettierrc

# 設定の説明など

# ts-node

## 'ERR_UNKNOWN_FILE_EXTENSION'

tsconfig.json の ts-node の設定か？

確認

```
% ts-node src/lib/a.ts
% ts-node src/lib/b.ts
```

# jest

jest.config.js → jest.config.cjs すると OK だった。

```
ReferenceError: module is not defined in ES module scope
This file is being treated as an ES module because it has a '.js' file extension ....
```
