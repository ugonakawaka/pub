osx

```
export PATH="./node_modules/.bin:$PATH"
```

```
npm install --save-dev tsconfig-paths
```

vscode に Prettier のインストール

このプロジェクトの目標は、ts-node で、ts ファイルを実行することです。  
それから、呼び出した ts ファイルは他の ts を呼び出して動作するかの確認します。

```
ts-node ./src/a.ts
ts-node ./src/b.ts
ts-node ./src/c.ts
ts-node ./src/d.ts
ts-node ./src/e.ts
ts-node ./src/f.ts
```
