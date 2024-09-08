import express, { Request, Response, NextFunction } from "express";
import multer from "multer";
import jwt from "jsonwebtoken";
import { IncomingMessage } from "http";

const app = express();

// 定数とコンフィグ
const JWT_SECRET = process.env.JWT_SECRET || "your-secret-key";
const TOKEN_EXPIRATION = "15m";
const allowedOrigins = process.env.ALLOWED_ORIGINS
  ? process.env.ALLOWED_ORIGINS.split(",")
  : ["http://localhost:3000"];

// ヘルパー関数
function extractTokenFromHeader(authHeader: string | undefined): string {
  if (!authHeader) {
    throw new Error("Authorization header is missing");
  }
  const [bearer, token] = authHeader.split(" ");
  if (bearer !== "Bearer" || !token) {
    throw new Error("Invalid Authorization header format");
  }
  return token;
}

function getAuthorizationHeader(req: IncomingMessage): string | undefined {
  // 1. 標準的なヘッダーオブジェクトをチェック
  const authHeader = req.headers["authorization"];
  if (authHeader) {
    if (Array.isArray(authHeader)) {
      return authHeader[0];
    }
    return authHeader;
  }

  // 2. rawHeaders をチェック
  const rawHeaders = req.rawHeaders;
  for (let i = 0; i < rawHeaders.length; i += 2) {
    if (rawHeaders[i].toLowerCase() === "authorization") {
      return rawHeaders[i + 1];
    }
  }

  // 3. デバッグ情報を出力
  console.log("All headers:", req.headers);
  console.log("Raw headers:", req.rawHeaders);

  // ヘッダーが見つからない場合
  return undefined;
}

function generateToken(payload: jwt.JwtPayload): string {
  const newExp = Math.floor(Date.now() / 1000) + 15 * 60; // 現在時刻 + 15分
  return jwt.sign({ ...payload, exp: newExp }, JWT_SECRET);
}

// ミドルウェア
const corsMiddleware = (req: Request, res: Response, next: NextFunction) => {
  const origin = req.headers.origin;
  if (origin && allowedOrigins.includes(origin)) {
    res.setHeader("Access-Control-Allow-Origin", origin);
  }
  res.setHeader(
    "Access-Control-Allow-Headers",
    "Content-Type,X-Amz-Date,Authorization,X-Api-Key,X-Amz-Security-Token"
  );
  res.setHeader("Access-Control-Allow-Methods", "OPTIONS,GET,POST,PUT,DELETE");
  res.setHeader("Access-Control-Expose-Headers", "New-Token");

  if (req.method === "OPTIONS") {
    res.sendStatus(200);
  } else {
    next();
  }
};

const verifyAndRefreshToken = (
  req: Request,
  res: Response,
  next: NextFunction
) => {
  try {
    const authHeader = getAuthorizationHeader(req);
    const token = extractTokenFromHeader(authHeader);
    const decoded = jwt.verify(token, JWT_SECRET) as jwt.JwtPayload;

    const newToken = generateToken(decoded);
    res.setHeader("New-Token", newToken);

    (req as any).userId = decoded.userId;
    next();
  } catch (error) {
    console.error("Token verification failed:", error);
    if (error instanceof jwt.TokenExpiredError) {
      try {
        const authHeader = getAuthorizationHeader(req);
        const token = extractTokenFromHeader(authHeader);
        const decoded = jwt.decode(token) as jwt.JwtPayload;
        if (!decoded || !decoded.userId) {
          throw new Error("Invalid token");
        }
        const newToken = generateToken(decoded);
        res.setHeader("New-Token", newToken);
        (req as any).userId = decoded.userId;
        next();
      } catch (refreshError) {
        res.status(401).json({ message: "Token refresh failed" });
      }
    } else {
      res.status(401).json({ message: "Invalid token" });
    }
  }
};

// ミドルウェアの適用
app.use(corsMiddleware);
app.use(verifyAndRefreshToken);
app.use(express.json());

// ファイルアップロード設定
const upload = multer({ storage: multer.memoryStorage() });

// ルート
app.get("/hello", (req: Request, res: Response) => {
  res.send("Hello, this is a GET response from Lambda!");
});

app.post("/upload", upload.single("file"), (req: Request, res: Response) => {
  const { name } = req.body;
  const file = req.file;

  if (req.is("application/json")) {
    console.log("JSON データ:", req.body);
  }

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

app.post("/json", (req: Request, res: Response) => {
  res.json({
    message: "JSON データが受信されました",
    data: req.body,
  });
});

app.get("/check", (req, res) => {
  res.json({ message: "GET request successful", status: "OK" });
});

app.post("/check", (req, res) => {
  const { message } = req.body;
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
