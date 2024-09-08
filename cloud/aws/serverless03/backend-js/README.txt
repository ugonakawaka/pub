
==================

npm install serverless@3.19 --save-dev

npm install  @types/aws-serverless-express --save-dev

npm install multer
npm i --save-dev @types/multer



==================
backend-js/
├── src/
│   ├── controllers/    # ビジネスロジック
│   ├── models/         # データモデル
│   ├── routes/         # ルート定義
│   ├── services/       # サービスやビジネスロジック
│   ├── middlewares/    # ミドルウェア
│   ├── utils/          # ユーティリティ関数
│   ├── handlers/       # Lambdaハンドラー
│   │   ├── handler1.ts # Lambda関数1のハンドラー
│   │   └── handler2.ts # Lambda関数2のハンドラー
│   ├── app.ts          # Expressアプリケーション
│   └── handler.ts      # Lambdaハンドラー (メイン)
├── package.json
├── tsconfig.json

==================
aws apigateway get-rest-apis
aws apigateway get-rest-api --rest-api-id <API ID>
aws apigateway get-rest-api --rest-api-id 8bupepispf

aws apigateway get-method --rest-api-id <API ID> --resource-id <RESOURCE ID> --http-method <METHOD> --region <リージョン>


aws apigateway get-method --rest-api-id 8bupepispf --resource-id q0t9ez --http-method OPTIONS

==================

npx sls remove -c sls-layers.yml --stage dev --aws-profile  admin0
npx sls remove -c sls-functions.yml --stage dev --aws-profile  admin0


npx sls deploy -c sls-layers.yml --stage dev --aws-profile  admin0
npx sls deploy -c sls-functions.yml --stage dev --aws-profile  admin0

xxx npx serverless offline -c sls-functions.yml --stage dev --aws-profile  admin0　--port 3000

npx serverless offline --config sls-functions.yml --stage dev
