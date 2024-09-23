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
        const callerReference = event.ResourceProperties.CallerReference;
        if (!callerReference) {
            throw new Error("CallerReference is required");
        }
        let physicalResourceId = event.LogicalResourceId || `KeyPair`;
        let responseData = {};
        switch (event.RequestType) {
            case "Create":
                responseData = await handleCreate(callerReference);
                break;
            case "Update":
                responseData = await handleUpdate(callerReference);
                break;
            case "Delete":
                await handleDelete(callerReference);
                break;
        }
        await sendResponse(event, "SUCCESS", physicalResourceId, responseData);
    }
    catch (error) {
        console.error("Error processing event:", error);
        await sendResponse(event, "FAILED", event.LogicalResourceId, {});
    }
};
exports.handler = handler;
async function handleCreate(callerReference) {
    const { publicKey, privateKey } = (0, crypto_1.generateKeyPairSync)("rsa", {
        modulusLength: 2048,
        publicKeyEncoding: { type: "spki", format: "pem" },
        privateKeyEncoding: { type: "pkcs8", format: "pem" },
    });
    const publicKeyParam = `${process.env.PUBLIC_KEY_PARAM}`;
    const privateKeyParam = `${process.env.PRIVATE_KEY_PARAM}`;
    await saveToParameterStore(publicKeyParam, publicKey);
    await saveToParameterStore(privateKeyParam, privateKey, true);
    return {
        PublicKeyParameter: publicKeyParam,
        PrivateKeyParameter: privateKeyParam,
        PublicKey: publicKey,
    };
}
async function handleUpdate(callerReference) {
    const existingKeys = await getKeyPair(callerReference);
    if (!existingKeys) {
        return handleCreate(callerReference);
    }
    else {
        console.log("Keys already exist, no update needed.");
        return {
            PublicKeyParameter: `${process.env.PUBLIC_KEY_PARAM}`,
            PrivateKeyParameter: `${process.env.PRIVATE_KEY_PARAM}`,
            PublicKey: existingKeys.publicKey,
        };
    }
}
async function handleDelete(callerReference) {
    await deleteFromParameterStore(`${process.env.PUBLIC_KEY_PARAM}`);
    await deleteFromParameterStore(`${process.env.PRIVATE_KEY_PARAM}`);
}
async function saveToParameterStore(paramName, value, isSecure = false) {
    const command = new client_ssm_1.PutParameterCommand({
        Name: paramName,
        Value: value,
        Type: isSecure ? "SecureString" : "String",
        Overwrite: true,
    });
    await ssm.send(command);
}
async function getFromParameterStore(paramName) {
    try {
        const command = new client_ssm_1.GetParameterCommand({
            Name: paramName,
            WithDecryption: true,
        });
        const response = await ssm.send(command);
        return response.Parameter?.Value || null;
    }
    catch (error) {
        console.error(`Error getting parameter ${paramName}:`, error);
        return null;
    }
}
async function deleteFromParameterStore(paramName) {
    try {
        const command = new client_ssm_1.DeleteParameterCommand({
            Name: paramName,
        });
        await ssm.send(command);
    }
    catch (error) {
        console.error(`Error deleting parameter ${paramName}:`, error);
    }
}
async function getKeyPair(callerReference) {
    const publicKey = await getFromParameterStore(`${process.env.PUBLIC_KEY_PARAM}`);
    const privateKey = await getFromParameterStore(`${process.env.PRIVATE_KEY_PARAM}`);
    if (publicKey && privateKey) {
        return { publicKey, privateKey };
    }
    return null;
}
async function getPublicKey(callerReference) {
    return getFromParameterStore(`${process.env.PUBLIC_KEY_PARAM}`);
}
async function getPrivateKey(callerReference) {
    return getFromParameterStore(`${process.env.PRIVATE_KEY_PARAM}`);
}
async function sendResponse(event, status, physicalResourceId, data) {
    const responseBody = JSON.stringify({
        Status: status,
        Reason: `See the details in CloudWatch Log Stream: ${event.RequestId}`,
        PhysicalResourceId: physicalResourceId,
        StackId: event.StackId,
        RequestId: event.RequestId,
        LogicalResourceId: event.LogicalResourceId,
        Data: data,
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
//# sourceMappingURL=generateKeyPair.js.map