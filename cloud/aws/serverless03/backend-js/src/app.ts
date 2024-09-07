import express, { Request, Response, NextFunction } from "express";
import multer from "multer";

const app = express();

// 環境変数から許可するオリジンを取得
const allowedOrigins = process.env.ALLOWED_ORIGINS
  ? process.env.ALLOWED_ORIGINS.split(",")
  : ["http://localhost:3000"]; // デフォルト値

// 共通のCORSヘッダー
const corsHeaders = {
  "Access-Control-Allow-Headers":
    "Content-Type,X-Amz-Date,Authorization,X-Api-Key,X-Amz-Security-Token",
  "Access-Control-Allow-Methods": "OPTIONS,GET,POST,PUT,DELETE",
};

// CORSミドルウェア
app.use((req: Request, res: Response, next: NextFunction) => {
  const origin = req.headers.origin;
  if (origin && allowedOrigins.includes(origin)) {
    res.setHeader("Access-Control-Allow-Origin", origin);
  }
  Object.entries(corsHeaders).forEach(([key, value]) => {
    res.setHeader(key, value);
  });
  if (req.method === "OPTIONS") {
    res.sendStatus(200);
  } else {
    next();
  }
});

// JSON形式のリクエストボディを解析
app.use(express.json());

console.log("####################################");

app.get("/hello", (req: Request, res: Response) => {
  res.send("Hello, this is a GET response from Lambda!");
});

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

// GET メソッドの処理
app.get("/check", (req, res) => {
  res.json({ message: "GET request successful", status: "OK" });
});

// POST メソッドの処理
app.post("/check", (req, res) => {
  const { message } = req.body;
  console.log("**************************** postmessage:", message);

  if (!message) {
    return res.status(400).json({ message: "Message is missing in the body" });
  }

  res.json({
    message: `POST request received with message: ${message}`,
    status: "OK",
  });
});

// エラーハンドリング
app.use((err: Error, req: Request, res: Response, next: NextFunction) => {
  console.error(err.stack);
  res.status(500).send("サーバーエラーが発生しました");
});

export default app;
