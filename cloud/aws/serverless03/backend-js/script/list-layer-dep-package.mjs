import { promises as fs } from "fs";
import path from "path";
import { fileURLToPath } from "url";
import { exec } from "child_process";
import util from "util";

const execPromise = util.promisify(exec);

// デフォルトのdepthを7に設定
const DEFAULT_DEPTH = 7;

// コマンドライン引数からdepthを取得、デフォルトは7
const depthArg = process.argv[2]
  ? parseInt(process.argv[2], 10)
  : DEFAULT_DEPTH;

async function getDependencies() {
  try {
    // 現在のファイルのディレクトリパスを取得
    const __filename = fileURLToPath(import.meta.url);
    const __dirname = path.dirname(__filename);

    // プロジェクトのルートを基準にして package.json のパスを取得
    const packageJsonPath = path.resolve(__dirname, "../package.json");
    const packageJson = await fs.readFile(packageJsonPath, "utf-8");
    const packageData = JSON.parse(packageJson);

    // `dependencies`と`devDependencies`の両方を取得
    const dependencies = packageData.dependencies || {};
    const devDependencies = packageData.devDependencies || {};

    return { dependencies, devDependencies };
  } catch (error) {
    console.error("Error reading package.json:", error);
    return { dependencies: {}, devDependencies: {} };
  }
}

async function getNpmProductionDependencies(depth) {
  try {
    // npm ls --production コマンドを実行して、プロダクション用依存関係のみを取得
    const { stdout } = await execPromise(
      `npm ls --all --prod --depth=${depth} --json`
    );
    const npmData = JSON.parse(stdout);
    const npmDependencies = npmData.dependencies || {};

    return npmDependencies;
  } catch (error) {
    console.error("Error executing npm ls --production:", error);
    return {};
  }
}

// 再帰的に依存関係を収集する関数
function collectAllDependencies(npmDependencies) {
  function collectDependencies(pkg) {
    const result = [];

    function recurse(deps) {
      Object.keys(deps).forEach((key) => {
        result.push(key); // 依存パッケージ名のみを収集
        const dep = deps[key];

        // 依存関係が存在する場合は再帰的に収集
        if (dep.dependencies && Object.keys(dep.dependencies).length > 0) {
          recurse(dep.dependencies);
        }
      });
    }

    // トップレベルの依存関係も収集
    result.push(pkg.name); // パッケージ名のみを収集
    recurse(pkg.dependencies);
    return result;
  }

  // 各パッケージの依存関係を収集する
  const allDependencies = Object.keys(npmDependencies).reduce(
    (acc, packageName) => {
      const collectedDeps = collectDependencies({
        name: packageName,
        dependencies: npmDependencies[packageName].dependencies,
      });
      return acc.concat(collectedDeps);
    },
    []
  );

  // 重複を排除し、ソートして返す
  const uniqueSortedDependencies = [...new Set(allDependencies)].sort();
  console.log(uniqueSortedDependencies);
  return uniqueSortedDependencies;
}

async function createServerlessPackageLists() {
  const { dependencies, devDependencies } = await getDependencies();

  // npm ls --production で取得した依存関係
  const npmDependencies = await getNpmProductionDependencies(depthArg);

  // トップレベルの dependencies を起点に再帰的に依存関係を収集
  const includedDependencies = collectAllDependencies(npmDependencies);

  // devDependencies は自動的に除外される
  const excludedDependencies = [
    ...new Set(Object.keys(devDependencies)),
  ].sort();

  // 出力フォーマット
  console.log("--- ALL Exclude in Serverless package:");
  console.log('        - "!nodejs/node_modules/**"');

  console.log("\n--- Include in Serverless package:");
  includedDependencies.forEach((dep) =>
    console.log(`        - "nodejs/node_modules/${dep}/**"`)
  );

  console.log("\n--- Exclude from Serverless package:");
  excludedDependencies.forEach((dep) =>
    console.log(`        - "!nodejs/node_modules/${dep}/**"`)
  );

  // レポートの出力: includeするパッケージの数
  console.log(
    `\n--- Report: Included dependencies count: ${includedDependencies.length}`
  );
}

// 実行
createServerlessPackageLists();
