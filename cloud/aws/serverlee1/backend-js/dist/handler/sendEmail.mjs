import { SESClient, SendEmailCommand } from "@aws-sdk/client-ses";
const sesClient = new SESClient({ region: "us-east-1" }); // SESクライアントを作成
export const handler = async (users) => {
    try {
        await sendNotificationEmails(users);
        return {};
    }
    catch (error) {
        console.error("Error in entryLambda:", error);
        throw error;
    }
};
async function sendNotificationEmails(users) {
    for (const user of users) {
        if (user.email) {
            const command = new SendEmailCommand({
                Destination: {
                    ToAddresses: [user.email],
                },
                Message: {
                    Body: {
                        Text: {
                            Data: `Hello ${user.name}, you have been assigned to a new group!`,
                        },
                    },
                    Subject: { Data: "Group Assignment Notification" },
                },
                Source: "noreply@example.com",
            });
            if (true) {
                // 今は送らない
                console.log("Email sent successfully to:");
                return;
            }
            try {
                const response = await sesClient.send(command);
                console.log("Email sent successfully to:", user.email, "Response:", response);
            }
            catch (error) {
                console.error("Failed to send email to:", user.email, "Error:", error);
            }
        }
    }
}
