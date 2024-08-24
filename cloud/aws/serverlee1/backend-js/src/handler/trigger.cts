import { DynamoDBStreamEvent, DynamoDBRecord } from 'aws-lambda';
import * as AWS from 'aws-sdk';

const stepFunctions = new AWS.StepFunctions();

export const handler = async (event: DynamoDBStreamEvent | any) => {
    try {
        let input: any;

        if (isDynamoDBStreamEvent(event)) {
            // DynamoDB Stream Event からの呼び出し
            console.log("Received DynamoDB Stream Event");
            input = event.Records.map(record => parseDynamoDBRecord(record));
        } else {
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
    } catch (error) {
        console.error("Error triggering Step Function:", error);
        let errorMessage = "Failed to trigger Step Function.";
        if (error instanceof Error) {
            errorMessage = error.message;
        }
        return {
            statusCode: 500,
            body: JSON.stringify({ message: "Failed to trigger Step Function.", errorMessage})
        };
    }
};

function isDynamoDBStreamEvent(event: any): event is DynamoDBStreamEvent {
    return event.Records !== undefined && Array.isArray(event.Records);
}

function parseDynamoDBRecord(record: DynamoDBRecord): any {
    if (record.dynamodb?.NewImage) {
        return AWS.DynamoDB.Converter.unmarshall(record.dynamodb.NewImage);
    }
    return null;
}
