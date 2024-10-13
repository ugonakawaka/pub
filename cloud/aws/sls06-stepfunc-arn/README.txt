serverlessでステップファンクションをデプロイしつつそのarnをパラメータストアにシークレットで設定します。

パラメータストアに設定するのは、serverlessのプラグインを用意して実現してみます。

使用しているものは


brew install oven-sh/bun/bun
bun run build

bun add --dev serverless-step-functions


export AWS_ACCESS_KEY_ID=
export AWS_SECRET_ACCESS_KEY=

npx sls deploy -c sls.yml --stage dev --aws-profile admin0  
npx sls remove -c sls.yml --stage dev --aws-profile admin0  


bun run deploy