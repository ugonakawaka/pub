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
