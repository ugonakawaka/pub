import { promises as fs } from "fs";
import path from "path";

const sourcePath = path.resolve("node_modules");
const targetDir = path.resolve(".serverless-wrok/layers/nodejs");
const targetPath = path.resolve(targetDir, "node_modules");

async function setupSymlink() {
  try {
    // ディレクトリが存在しない場合に作成
    await fs.mkdir(targetDir, { recursive: true });
    console.log(`Directory created or already exists: ${targetDir}`);

    // シンボリックリンクの作成
    await fs.symlink(sourcePath, targetPath);
    console.log(`Symlink created from ${sourcePath} to ${targetPath}`);
  } catch (error) {
    if (error.code !== "EEXIST") {
      throw error;
    } else {
      console.log("Symlink already exists, skipping...");
    }
  }
}

setupSymlink();
