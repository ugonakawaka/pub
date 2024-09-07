"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.handler = void 0;
const aws_serverless_express_1 = __importDefault(require("aws-serverless-express"));
const app_1 = __importDefault(require("../app")); // app.tsで定義されたExpressアプリケーションをインポート
// AWS Lambdaで動作するためのサーバーを作成
const server = aws_serverless_express_1.default.createServer(app_1.default);
// Lambdaハンドラーを定義
const handler = (event, context) => {
    aws_serverless_express_1.default.proxy(server, event, context);
};
exports.handler = handler;
