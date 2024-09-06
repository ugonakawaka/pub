"use strict";
var __importDefault =
  (this && this.__importDefault) ||
  function (mod) {
    return mod && mod.__esModule ? mod : { default: mod };
  };
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = __importDefault(require("express"));
const multer_1 = __importDefault(require("multer"));
const app = (0, express_1.default)();
// JSON形式のリクエストボディを解析
app.use(express_1.default.json());
app.get("/hello", (req, res) => {
  res.send("Hello, this is a GET response from Lambda!");
});
app.get("/hi", (req, res) => {
  res.send("hI 0_0!, this is a GET response from Lambda!");
});
// ファイルアップロード用のmulter設定
const upload = (0, multer_1.default)({
  storage: multer_1.default.memoryStorage(),
});
// multipart/form-data 用のルート (ファイルアップロード)
app.post("/upload", upload.single("file"), (req, res) => {
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
app.post("/json", (req, res) => {
  const jsonData = req.body; // JSON データ
  res.json({
    message: "JSON データが受信されました",
    data: jsonData,
  });
});
// エラーハンドリング
app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).send("サーバーエラーが発生しました");
});
exports.default = app;
