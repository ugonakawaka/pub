```
npm install -g typescript
mkdir my-ts-project2
cd my-ts-project2
npm init -y
tsc --init
npm install --save-dev @types/node
mkdir src
npm install --save-dev ts-node
export PATH="./node_modules/.bin:$PATH"
```

この方法が正しいのかわかっていないが

ts-node/dist-raw/node-internal-modules-esm-resolve.js

```
  if (packageConfig.exists) {
    const packageJSONUrl = pathToFileURL(packageConfig.pjsonPath);
    if ((packageConfig.name === packageName || "my-lib1" == packageName) &&
        packageConfig.exports !== undefined && packageConfig.exports !== null) {
      return packageExportsResolve(
        packageJSONUrl, packageSubpath, packageConfig, base, conditions
      ).resolved;
    }
  }
```
