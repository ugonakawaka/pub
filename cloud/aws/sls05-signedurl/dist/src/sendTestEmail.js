// src/sendTestEmail.ts
import * as AWS from 'aws-sdk';
const s3 = new AWS.S3();
const ses = new AWS.SES();
const cloudFront = new AWS.CloudFront();
const BUCKET_NAME = process.env.BUCKET_NAME;
const CLOUDFRONT_DISTRIBUTION_ID = process.env.CLOUDFRONT_DISTRIBUTION_ID;
const SES_EMAIL = process.env.SES_EMAIL;
const ENCRYPTION_KEY = process.env.ENCRYPTION_KEY;
export const handler = async (event) => {
    const { companyId, eventId } = JSON.parse(event.body);
    const htmlKey = `${companyId}/${eventId}.html`;
    // Check if HTML file already exists
    try {
        await s3.headObject({ Bucket: BUCKET_NAME, Key: htmlKey }).promise();
        return {
            statusCode: 200,
            body: JSON.stringify({ message: 'HTML file already exists' }),
        };
    }
    catch (error) {
        // File doesn't exist, continue with creation
    }
    // Generate HTML content
    const htmlContent = generateHtmlContent(companyId, eventId);
    // Upload HTML to S3
    await s3.putObject({
        Bucket: BUCKET_NAME,
        Key: htmlKey,
        Body: htmlContent,
        ContentType: 'text/html',
    }).promise();
    // Create signed URL
    const signedUrl = generateSignedUrl(htmlKey);
    // Send email
    await sendEmail(SES_EMAIL, signedUrl);
    return {
        statusCode: 200,
        body: JSON.stringify({ message: 'Email sent successfully' }),
    };
};
function generateHtmlContent(companyId, eventId) {
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
function generateSignedUrl(key) {
    const cloudFrontUrl = `https://${CLOUDFRONT_DISTRIBUTION_ID}.cloudfront.net/${key}`;
    const signer = new AWS.CloudFront.Signer(CLOUDFRONT_DISTRIBUTION_ID, ENCRYPTION_KEY);
    return signer.getSignedUrl({
        url: cloudFrontUrl,
        expires: Math.floor(Date.now() / 1000) + 5 * 60, // 5 minutes
    });
}
async function sendEmail(to, signedUrl) {
    await ses.sendEmail({
        Source: SES_EMAIL,
        Destination: { ToAddresses: [to] },
        Message: {
            Subject: { Data: 'Safety Confirmation' },
            Body: { Html: { Data: `Please confirm your safety: <a href="${signedUrl}">Click here</a>` } },
        },
    }).promise();
}
//# sourceMappingURL=sendTestEmail.js.map