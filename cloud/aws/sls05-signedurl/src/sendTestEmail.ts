// src/sendTestEmail.ts

import { APIGatewayProxyHandler } from "aws-lambda";
import {
  S3Client,
  HeadObjectCommand,
  PutObjectCommand,
} from "@aws-sdk/client-s3";
import { SESClient, SendEmailCommand } from "@aws-sdk/client-ses";
import { CloudFrontClient } from "@aws-sdk/client-cloudfront";
import { getSignedUrl } from "@aws-sdk/cloudfront-signer";
import { SSMClient, GetParameterCommand } from "@aws-sdk/client-ssm";

const s3 = new S3Client({});
const ses = new SESClient({});
const ssm = new SSMClient({});

const BUCKET_NAME = process.env.BUCKET_NAME!;
const CLOUDFRONT_DISTRIBUTION_ID = process.env.CLOUDFRONT_DISTRIBUTION_ID!;
const SES_EMAIL = process.env.SES_EMAIL!;
const ENCRYPTION_KEY = process.env.ENCRYPTION_KEY!;

export const handler: APIGatewayProxyHandler = async (event) => {
  const encryptionKey = await getEncryptionKey();

  if (!encryptionKey) {
    throw new Error("Encryption key not found in Parameter Store");
  }

  const { companyId, eventId } = JSON.parse(event.body!);

  const htmlKey = `${companyId}/${eventId}.html`;

  // Check if HTML file already exists
  try {
    await s3.send(new HeadObjectCommand({ Bucket: BUCKET_NAME, Key: htmlKey }));
    return {
      statusCode: 200,
      body: JSON.stringify({ message: "HTML file already exists" }),
    };
  } catch (error) {
    // File doesn't exist, continue with creation
  }

  // Generate HTML content
  const htmlContent = generateHtmlContent(companyId, eventId);

  // Upload HTML to S3
  await s3.send(
    new PutObjectCommand({
      Bucket: BUCKET_NAME,
      Key: htmlKey,
      Body: htmlContent,
      ContentType: "text/html",
    })
  );

  // Create signed URL
  const signedUrl = generateSignedUrl(htmlKey, encryptionKey);

  console.log("Signed URL:", signedUrl);
  // Send email
  await sendEmail(SES_EMAIL, signedUrl);

  return {
    statusCode: 200,
    body: JSON.stringify({ message: "Email sent successfully" }),
  };
};

function generateHtmlContent(companyId: string, eventId: string): string {
  // Implement HTML generation logic here
  return `
    <!DOCTYPE html>
    <html>
      <body>
        <h1>Safety Confirmation</h1>
        <button onclick="confirmSafety('${companyId}', '${eventId}')">Confirm Safety</button>
        <script>
          function confirmSafety(companyId, eventId) {
            const url = '/receive-test-event?data=' + encodeURIComponent(JSON.stringify({companyId, eventId}));
            fetch(url).then(response => response.json()).then(data => alert(JSON.stringify(data)));
          }
        </script>
      </body>
    </html>
  `;
}

function generateSignedUrl(key: string, encryptionKey: string): string {
  const cloudFrontUrl = `https://${process.env.CLOUDFRONT_DISTRIBUTION_ID}.cloudfront.net/${key}`;

  return getSignedUrl({
    url: cloudFrontUrl,
    keyPairId: process.env.CLOUDFRONT_DISTRIBUTION_ID!,
    privateKey: encryptionKey,
    dateLessThan: new Date(Date.now() + 5 * 60 * 1000).toISOString(),
  });
}

async function sendEmail(to: string, signedUrl: string): Promise<void> {
  await ses.send(
    new SendEmailCommand({
      Source: SES_EMAIL,
      Destination: { ToAddresses: [to] },
      Message: {
        Subject: { Data: "Safety Confirmation" },
        Body: {
          Html: {
            Data: `Please confirm your safety: <a href="${signedUrl}">Click here</a>`,
          },
        },
      },
    })
  );
}

async function getEncryptionKey(): Promise<string> {
  const paramName = process.env.ENCRYPTION_KEY_PARAM!;

  const command = new GetParameterCommand({
    Name: paramName,
    WithDecryption: true,
  });

  const response = await ssm.send(command);
  return response.Parameter?.Value || "";
}
