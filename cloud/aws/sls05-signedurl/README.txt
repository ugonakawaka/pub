npm install --save-dev typescript
npm install --save-dev @aws-sdk/client-lambda
npm install --save-dev @aws-sdk/client-s3
npm install --save-dev @aws-sdk/client-ses
npm install --save-dev @aws-sdk/client-cloudfront
npm install --save-dev @aws-sdk/cloudfront-signer
npm install --save-dev @aws-sdk/client-ssm
npm install axios


npm install --save-dev @types/aws-lambda
npm install --save-dev @types/aws-sdk
npm install --save-dev @types/node

npm install --save-dev serverless@3.39.0
npm install --save-dev serverless-scriptable-plugin
npm install --save-dev serverless-plugin-typescript typescript

##

npx sls deploy -c sls.yml --stage dev --aws-profile admin0  
npx sls remove -c sls.yml --stage dev --aws-profile admin0  

## 事前準備として
ローカルからsedメールを送信できるか試す。

AWS_PROFILE=my-aws-profile node sendEmail.js your_email@example.com
