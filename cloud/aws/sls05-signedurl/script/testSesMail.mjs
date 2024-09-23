import { SESClient, SendEmailCommand } from "@aws-sdk/client-ses";

// AWS SESクライアントを作成（プロファイルは環境変数から自動的に取得）
const sesClient = new SESClient({ region: "ap-northeast-1" });

// コマンドライン引数からメールアドレスを取得
const email = process.argv[2];

if (!email) {
  console.error(
    "メールアドレスを引数として指定してください。例: node sendEmail.js your_email@example.com"
  );
  process.exit(1);
}

async function sendEmail() {
  // 送信するメールの詳細を設定
  const params = {
    Destination: {
      ToAddresses: [email], // 宛先のメールアドレス（引数で指定）
    },
    Message: {
      Body: {
        Text: { Data: "これはテストメールです。" }, // メール本文
      },
      Subject: { Data: "テストメール" }, // メールの件名
    },
    Source: email, // SESで認証済みの送信元メールアドレス（引数で指定）
  };

  try {
    // メール送信
    const data = await sesClient.send(new SendEmailCommand(params));
    // 成功時にバナーを表示
    console.log(`
    *******************************************
    *                                         *
    *       テストメールが送信されました！        *
    *                                         *
    *******************************************
    `);
    console.log("送信結果:", data);
  } catch (error) {
    console.error("メール送信エラー:", error);
  }
}

// メール送信を実行
sendEmail();
