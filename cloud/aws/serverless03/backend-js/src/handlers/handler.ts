import awsServerlessExpress from "aws-serverless-express";
import app from "../app"; // app.tsで定義されたExpressアプリケーションをインポート

// AWS Lambdaで動作するためのサーバーを作成
const server = awsServerlessExpress.createServer(app);

// Lambdaハンドラーを定義
export const handler = (event: any, context: any) => {
  awsServerlessExpress.proxy(server, event, context);
};
