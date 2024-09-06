import { promises as fs } from 'fs';
import path from 'path';
import { fileURLToPath } from 'url';
import { exec } from 'child_process';
import util from 'util';

const execPromise = util.promisify(exec);

// デフォルトのdepthを7に設定
const DEFAULT_DEPTH = 7;

// コマンドライン引数からdepthを取得、デフォルトは7
const depthArg = process.argv[2] ? parseInt(process.argv[2], 10) : DEFAULT_DEPTH;

async function getDependencies() {
    try {
        // 現在のファイルのディレクトリパスを取得
        const __filename = fileURLToPath(import.meta.url);
        const __dirname = path.dirname(__filename);

        // プロジェクトのルートを基準にして package.json のパスを取得
        const packageJsonPath = path.resolve(__dirname, '../package.json');
        const packageJson = await fs.readFile(packageJsonPath, 'utf-8');
        const packageData = JSON.parse(packageJson);

        // `dependencies`と`devDependencies`の両方を取得
        const dependencies = packageData.dependencies || {};
        const devDependencies = packageData.devDependencies || {};

        return { dependencies, devDependencies };
    } catch (error) {
        console.error('Error reading package.json:', error);
        return { dependencies: {}, devDependencies: {} };
    }
}

async function getNpmProductionDependencies(depth) {
    try {
        // npm ls --production コマンドを実行して、プロダクション用依存関係のみを取得
        const { stdout } = await execPromise(`npm ls --production --depth=${depth} --json`);
        const npmData = JSON.parse(stdout);
        const npmDependencies = Object.keys(npmData.dependencies || {});

        return npmDependencies;
    } catch (error) {
        console.error('Error executing npm ls --production:', error);
        return [];
    }
}

async function createServerlessPackageLists() {
    const { dependencies, devDependencies } = await getDependencies();

    // `npm ls --production` で取得した依存関係を含める
    const npmDependencies = await getNpmProductionDependencies(depthArg);

    // 手動でdependenciesから取得したものとnpm ls --productionの結果を統合
    const includedDependencies = [...new Set(Object.keys(dependencies).concat(npmDependencies))].sort();
    
    // devDependenciesは自動的に除外されるので、手動での除外作業は不要に
    const excludedDependencies = [...new Set(Object.keys(devDependencies))].sort();

    // 出力するフォーマット
    console.log('--- ALL Exclude in Serverless package:');
    console.log('        - "!node_modules/**"');

    console.log('\n--- Include in Serverless package:');
    includedDependencies.forEach(dep => console.log(`        - "node_modules/${dep}/**"`));

    console.log('\n--- Exclude from Serverless package:');
    excludedDependencies.forEach(dep => console.log(`        - "!node_modules/${dep}/**"`));

    // レポートの出力: includeするパッケージの数
    console.log(`\n--- Report: Included dependencies count: ${includedDependencies.length}`);
}

// 実行
createServerlessPackageLists();
