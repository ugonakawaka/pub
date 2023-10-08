## プロジェクト開始

```
npm install -g typescript
mkdir my-ts-project3
cd my-ts-project3
npm init -y
tsc --init
npm install --save-dev @types/node
mkdir src
npm install --save-dev ts-node
export PATH="./node_modules/.bin:$PATH"
```

## 目的

ts-node で実行したいのが目的です。ts-node で実行した場合に、import の連鎖があると動作させるの難しいように思います。

## package.json

### 参考

複数のエントリーポイントを公開する  
https://nodejs.org/api/packages.html#package-entry-points

### その 0

正直わかっていなことが多いです..

プロジェクトフォルダ内に src フォルダを用意します。ソースはこの中に入れて、my-lib1,my-lib2、...とパッケージを分けていくイメージです。
※これは TypeScript のプロジェクトの一般かわかっていませんが。

esm(ES Modules)を使うことを想定しています。

ソースフォルダからさらにフォルダを分けるために、以下のようなことをしたのですが、おそらく、そういうことをしなくてもよいはずです...
パッケージ名前と package.json の name フィールドと合致しているかの判定する箇所があった。

ts-node/dist-raw/node-internal-modules-esm-resolve.js

```
  const packageConfig = getPackageScopeConfig(base);
  if (packageConfig.exists) {
    const packageJSONUrl = pathToFileURL(packageConfig.pjsonPath);
    if ((packageConfig.name === packageName || "my-lib1" === packageName || "my-lib2" === packageName) &&
        packageConfig.exports !== undefined && packageConfig.exports !== null) {
      return packageExportsResolve(
        packageJSONUrl, packageSubpath, packageConfig, base, conditions
      ).resolved;
    }
  }
```

### その 1

```
import { a } from 'my-lib1/aaa/a';
```

この import を実現するために export に設定した。

```
"./aaa/*": "./src/my-lib1/aaa/*.ts",

OR

"./aaa/a": "./src/my-lib1/aaa/a",

```

### その 2

```
import { ba, bb, bc } from 'my-lib1/bbb';
```

この import を実現するために、'my-lib1/bbb/index.ts'を用意して、設定した export は、

```
    "./bbb": "./src/my-lib1/bbb",
    "./bbb/*": "./src/my-lib1/bbb/*.ts"
```

"\*"を使わない場合は、ひとつづつ記載...

## tsconfig.json

```

```
