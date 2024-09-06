import express, { Request, Response } from "express";
import multer from "multer";

const app = express();

// JSON形式のリクエストボディを解析
app.use(express.json());

// ファイルアップロード用のmulter設定
const upload = multer({ storage: multer.memoryStorage() });

// multipart/form-data 用のルート (ファイルアップロード)
app.post("/upload", upload.single("file"), (req: Request, res: Response) => {
  const name = req.body.name; // formのnameフィールドのデータ
  const file = req.file; // アップロードされたファイルのデータ

  // JSONも同時に含まれる可能性があるため、リクエストがJSON形式か確認
  if (req.is("application/json")) {
    const jsonData = req.body; // JSON データもここで処理
    console.log("JSON データ:", jsonData);
  }

  // アップロードされたファイルがある場合
  if (file) {
    console.log(`アップロードされたファイル: ${file.originalname}`);
    console.log(`ファイルサイズ: ${file.size} bytes`);
  }

  res.send({
    message: "ファイルとデータが正常にアップロードされました",
    fileName: file ? file.originalname : "ファイルなし",
    name,
  });
});

// JSON専用のルート
app.post("/json", (req: Request, res: Response) => {
  const jsonData = req.body; // JSON データ
  res.json({
    message: "JSON データが受信されました",
    data: jsonData,
  });
});

// エラーハンドリング
app.use((err: Error, req: Request, res: Response, next: Function) => {
  console.error(err.stack);
  res.status(500).send("サーバーエラーが発生しました");
});

export default app;
