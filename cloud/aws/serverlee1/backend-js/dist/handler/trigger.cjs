"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (k !== "default" && Object.prototype.hasOwnProperty.call(mod, k)) __createBinding(result, mod, k);
    __setModuleDefault(result, mod);
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.handler = void 0;
const AWS = __importStar(require("aws-sdk"));
const stepFunctions = new AWS.StepFunctions();
const handler = async (event) => {
    try {
        let input;
        if (isDynamoDBStreamEvent(event)) {
            // DynamoDB Stream Event からの呼び出し
            console.log("Received DynamoDB Stream Event");
            input = event.Records.map(record => parseDynamoDBRecord(record));
        }
        else {
            // 他の Lambda または任意のオブジェクトからの呼び出し
            console.log("Received Direct Invocation with payload:", event);
            input = event;
        }
        const params = {
            stateMachineArn: '<StepFunction-ARN>', // ステートマシンのARNを指定
            input: JSON.stringify(input),
            name: `Trigger${Date.now()}`
        };
        await stepFunctions.startExecution(params).promise();
        return {
            statusCode: 200,
            body: JSON.stringify({ message: "Step Function triggered successfully!" })
        };
    }
    catch (error) {
        console.error("Error triggering Step Function:", error);
        let errorMessage = "Failed to trigger Step Function.";
        if (error instanceof Error) {
            errorMessage = error.message;
        }
        return {
            statusCode: 500,
            body: JSON.stringify({ message: "Failed to trigger Step Function.", errorMessage })
        };
    }
};
exports.handler = handler;
function isDynamoDBStreamEvent(event) {
    return event.Records !== undefined && Array.isArray(event.Records);
}
function parseDynamoDBRecord(record) {
    if (record.dynamodb?.NewImage) {
        return AWS.DynamoDB.Converter.unmarshall(record.dynamodb.NewImage);
    }
    return null;
}
