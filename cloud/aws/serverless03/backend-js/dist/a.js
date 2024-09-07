"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const jsonwebtoken_1 = __importDefault(require("jsonwebtoken"));
// トークンをデコードする関数（署名の検証は行わない）
const decodeTokenWithoutVerification = (token) => {
    // トークンのペイロードをデコード
    const decoded = jsonwebtoken_1.default.decode(token);
    return decoded;
};
const verifyToken = (token, secretKey) => {
    try {
        // トークンの署名を検証（検証には同じ秘密鍵を使用）
        const decoded = jsonwebtoken_1.default.verify(token, secretKey); // アクセストークン用の秘密鍵
        console.log("検証成功:", decoded);
        return decoded;
    }
    catch (err) {
        console.error("トークンの検証に失敗しました:", err);
        return null;
    }
};
// 使用例
const token = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VybmFtZSI6ImIiLCJpYXQiOjE3MjU2NzA5MTcsImV4cCI6MTcyNTY3MTgxN30.gFqcdzbXvYG5qnjHWUQigAEbwS_nMaHzkrw9p68Nvvk";
const secretKey = "your-secret-key";
const verifiedPayload = verifyToken(token, secretKey);
if (verifiedPayload) {
    console.log("トークンは有効です:", verifiedPayload);
}
else {
    console.log("トークンは無効です");
}
const decodedPayload = decodeTokenWithoutVerification(token);
console.log("署名を検証せずにデコードされたペイロード:", decodedPayload);
