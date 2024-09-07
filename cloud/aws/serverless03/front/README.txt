

npm show serverless versions


npm install serverless-s3-sync --save-dev

npm install serverless-cloudfront-invalidate --save-dev

npm install serverless-scriptable-plugin --save-dev

 npm audit fix --force

npm install serverless-s3-sync@latest --save-dev

npm install serverless-cloudfront-invalidate@latest --save-dev

npm install serverless-scriptable-plugin@latest --save-dev
==============
npx sls deploy -c sls-cloudfront.yml --stage dev --aws-profile  admin0


==============
find . -name "*.js" -exec sh -c 'mv "$0" "${0%.js}.mjs"' {} \;