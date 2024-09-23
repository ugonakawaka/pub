// src/receiveTestEvent.ts
import * as crypto from "crypto";
const ENCRYPTION_KEY = process.env.ENCRYPTION_KEY;
const IV_LENGTH = 16; // AES ブロックサイズ
export const handler = async (event) => {
    const { data } = event.queryStringParameters;
    try {
        if (!data) {
            throw new Error("Data is undefined");
        }
        const decryptedData = decryptData(data);
        return {
            statusCode: 200,
            body: JSON.stringify({ message: "Event received", data: decryptedData }),
        };
    }
    catch (error) {
        console.error("Decryption error:", error);
        return {
            statusCode: 400,
            body: JSON.stringify({ message: "Invalid data" }),
        };
    }
};
function decryptData(encryptedData) {
    const textParts = encryptedData.split(":");
    const iv = Buffer.from(textParts.shift(), "hex");
    const encryptedText = Buffer.from(textParts.join(":"), "hex");
    const decipher = crypto.createDecipheriv("aes-256-cbc", Buffer.from(ENCRYPTION_KEY), iv);
    let decrypted = decipher.update(encryptedText);
    decrypted = Buffer.concat([decrypted, decipher.final()]);
    return JSON.parse(decrypted.toString());
}
//# sourceMappingURL=receiveTestEvent.js.map