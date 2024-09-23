"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.handler = void 0;
const client_ssm_1 = require("@aws-sdk/client-ssm");
const crypto_1 = require("crypto");
const axios_1 = __importDefault(require("axios"));
const ssm = new client_ssm_1.SSMClient({});
const handler = async (event) => {
    try {
        console.log("Event received:", event);
        // カスタムリソースが削除された場合は何もせず終了
        if (event.RequestType === "Delete") {
            await sendResponse(event, "SUCCESS", event.PhysicalResourceId || event.LogicalResourceId);
            return;
        }
        // 鍵ペアを生成
        const { privateKey } = (0, crypto_1.generateKeyPairSync)("rsa", {
            modulusLength: 2048,
            publicKeyEncoding: {
                type: "spki",
                format: "pem",
            },
            privateKeyEncoding: {
                type: "pkcs8",
                format: "pem",
            },
        });
        // パラメータストアに秘密鍵を保存
        const paramName = process.env.ENCRYPTION_KEY_PARAM;
        const command = new client_ssm_1.PutParameterCommand({
            Name: paramName,
            Value: privateKey,
            Type: "SecureString",
            Overwrite: true,
        });
        await ssm.send(command);
        // 成功レスポンスをCloudFormationに送信
        await sendResponse(event, "SUCCESS", event.LogicalResourceId);
    }
    catch (error) {
        console.error("Error processing event:", error);
        await sendResponse(event, "FAILED", event.LogicalResourceId);
    }
};
exports.handler = handler;
// CloudFormationへの応答を送信するヘルパー関数
async function sendResponse(event, status, physicalResourceId) {
    const responseBody = JSON.stringify({
        Status: status,
        Reason: `See the details in CloudWatch Log Stream: ${event.RequestId}`,
        PhysicalResourceId: physicalResourceId,
        StackId: event.StackId,
        RequestId: event.RequestId,
        LogicalResourceId: event.LogicalResourceId,
        Data: {},
    });
    console.log("Response body:", responseBody);
    const responseOptions = {
        headers: {
            "content-type": "",
            "content-length": responseBody.length,
        },
    };
    try {
        await axios_1.default.put(event.ResponseURL, responseBody, responseOptions);
        console.log(`Response sent to CloudFormation: ${status}`);
    }
    catch (error) {
        console.error("Failed to send response to CloudFormation:", error);
    }
}
//# sourceMappingURL=generateEncryptionKey.js.map