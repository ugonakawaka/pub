import { promises as fs } from 'fs';
import path from 'path';

const serverlessWorkDir = '.serverless-work';
const nodeModulesSource = 'node_modules';  // シンボリックリンク元
const nodeModulesTargetDir = path.join(serverlessWorkDir, 'nodejs');
const nodeModulesTarget = path.join(nodeModulesTargetDir, 'node_modules');  // シンボリックリンク先

async function setupSymlink() {
  try {
    // .serverless-work/nodejs ディレクトリの存在確認
    try {
      await fs.access(nodeModulesTargetDir);
    } catch {
      // 存在しない場合、ディレクトリを作成
      await fs.mkdir(nodeModulesTargetDir, { recursive: true });
      console.log(`Created directory: ${nodeModulesTargetDir}`);
    }

    // シンボリックリンク作成
    await fs.symlink(path.resolve(nodeModulesSource), nodeModulesTarget, 'dir');
    console.log(`Created symlink from ${nodeModulesSource} to ${nodeModulesTarget}`);
  } catch (error) {
    console.error('Error setting up symlink:', error);
  }
}

setupSymlink();
