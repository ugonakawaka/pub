const packages = {
  "aws-serverless-express": {
    version: "3.4.0",
    resolved:
      "https://registry.npmjs.org/aws-serverless-express/-/aws-serverless-express-3.4.0.tgz",
    overridden: false,
    dependencies: {
      "@vendia/serverless-express": { version: "4.0.0", dependencies: {} },
      "binary-case": { version: "1.2.3", dependencies: {} },
      "type-is": { version: "2.3.0", dependencies: {} },
    },
  },
  axios: {
    version: "1.7.7",
    resolved: "https://registry.npmjs.org/axios/-/axios-1.7.7.tgz",
    overridden: false,
    dependencies: {
      "follow-redirects": { version: "1.14.8", dependencies: {} },
      "form-data": { version: "3.0.0", dependencies: {} },
      "proxy-from-env": { version: "1.1.0", dependencies: {} },
    },
  },
  express: {
    version: "4.19.2",
    resolved: "https://registry.npmjs.org/express/-/express-4.19.2.tgz",
    overridden: false,
    dependencies: {
      accepts: { version: "1.3.7", dependencies: {} },
      "array-flatten": { version: "1.1.1", dependencies: {} },
      "body-parser": { version: "1.19.0", dependencies: {} },
    },
  },
  multer: {
    version: "1.4.5-lts.1",
    resolved: "https://registry.npmjs.org/multer/-/multer-1.4.5-lts.1.tgz",
    overridden: false,
    dependencies: {
      "append-field": { version: "1.0.0", dependencies: {} },
      busboy: { version: "1.6.0", dependencies: {} },
      "concat-stream": { version: "1.6.2", dependencies: {} },
    },
  },
};

// 再帰的に依存関係を収集する関数
function collectDependencies(pkg) {
  const result = [];

  function recurse(deps) {
    Object.keys(deps).forEach((key) => {
      const dep = deps[key];
      result.push({ name: key, version: dep.version });

      // 依存関係が存在する場合は再帰的に収集
      if (dep.dependencies && Object.keys(dep.dependencies).length > 0) {
        recurse(dep.dependencies);
      }
    });
  }

  // トップレベルの依存関係も収集
  result.push({ name: pkg.name, version: pkg.version });
  recurse(pkg.dependencies);
  return result;
}

// 各パッケージの依存関係を収集する
const allDependencies = Object.keys(packages).reduce((acc, packageName) => {
  const collectedDeps = collectDependencies({
    name: packageName,
    version: packages[packageName].version,
    dependencies: packages[packageName].dependencies,
  });
  return acc.concat(collectedDeps);
}, []);

console.log(allDependencies);
