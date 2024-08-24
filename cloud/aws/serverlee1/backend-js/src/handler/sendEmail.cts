import * as AWS from 'aws-sdk';

const ses = new AWS.SES();

export const handler = async (event: any) => {
    try {
        // グループのユーザに対してメールを送信
        for (const user of event.processedGroup) {
            await sendEmail(user.email);
        }

        return { message: "Emails sent successfully" };
    } catch (error) {
        console.error("Error in sendEmailLambda:", error);
        throw error;
    }
};

async function sendEmail(email: string) {
    const params = {
        Source: process.env.SES_EMAIL_SOURCE!,
        Destination: {
            ToAddresses: [email],
        },
        Message: {
            Subject: {
                Data: "Safety Confirmation",
            },
            Body: {
                Text: {
                    Data: "Please confirm your safety.",
                },
            },
        },
    };

    await ses.sendEmail(params).promise();
}
