#!/bin/bash
# このスクリプトは、指定されたAWSプロファイルから認証情報を取得し、
# 環境変数としてエクスポートします。
#
# 使い方:
#   chmod +x export_aws_credentials.sh  # 実行権限を与える
#   ./export_aws_credentials.sh your-profile-name  # プロファイル名を指定して実行
#
# 注意: AWS_SESSION_TOKEN は存在する場合のみエクスポートされます。
# プロファイル名を引数として受け取る

PROFILE_NAME=$1

if [ -z "$PROFILE_NAME" ]; then
  echo "Usage: $0 <profile-name>"
  exit 1
fi

# credentialsファイルのパス
CREDENTIALS_FILE="$HOME/.aws/credentials"

# プロファイルの情報を取得
AWS_ACCESS_KEY_ID=$(awk -v profile="[$PROFILE_NAME]" '$0 == profile {getline; print $3}' $CREDENTIALS_FILE)
AWS_SECRET_ACCESS_KEY=$(awk -v profile="[$PROFILE_NAME]" '$0 == profile {getline; getline; print $3}' $CREDENTIALS_FILE)
AWS_SESSION_TOKEN=$(awk -v profile="[$PROFILE_NAME]" '$0 == profile {getline; getline; getline; if ($1 == "aws_session_token") print $3}' $CREDENTIALS_FILE)

# 環境変数としてエクスポート
export AWS_ACCESS_KEY_ID
export AWS_SECRET_ACCESS_KEY

# AWS_SESSION_TOKENが存在する場合のみエクスポート
if [ -n "$AWS_SESSION_TOKEN" ]; then
  export AWS_SESSION_TOKEN
fi

# 確認用にエクスポートした環境変数を出力
echo "AWS_ACCESS_KEY_ID and AWS_SECRET_ACCESS_KEY have been set."
if [ -n "$AWS_SESSION_TOKEN" ]; then
  echo "AWS_SESSION_TOKEN has also been set."
fi
