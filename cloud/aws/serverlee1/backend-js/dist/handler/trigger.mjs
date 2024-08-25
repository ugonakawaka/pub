import { SFNClient, StartExecutionCommand } from "@aws-sdk/client-sfn";
import { SSMClient, GetParameterCommand } from "@aws-sdk/client-ssm";
import { unmarshall } from "@aws-sdk/util-dynamodb";
const sfnClient = new SFNClient({});
const ssmClient = new SSMClient({});
export const handler = async (event) => {
    try {
        // 環境変数からステートマシン名を取得
        const stateMachineName = process.env.STATE_MACHINE_NAME;
        if (!stateMachineName) {
            throw new Error("ステートマシン名が環境変数から取得できませんでした。");
        }
        // パラメータストアからステートマシンARNを取得
        const stateMachineArn = await getStateMachineArnFromSSM(stateMachineName);
        if (!stateMachineArn) {
            throw new Error("ステートマシンのARNがパラメータストアから取得できませんでした。");
        }
        let input;
        if (isDynamoDBStreamEvent(event)) {
            // DynamoDB Stream Event からの呼び出し
            console.log("Received DynamoDB Stream Event");
            input = event.Records.map((record) => parseDynamoDBRecord(record));
        }
        else {
            // 他の Lambda または任意のオブジェクトからの呼び出し
            console.log("Received Direct Invocation with payload:", event);
            input = event;
        }
        const params = {
            stateMachineArn: stateMachineArn, // パラメータストアから取得したステートマシンのARNを使用
            input: JSON.stringify(input),
            name: `Trigger${Date.now()}`,
        };
        const command = new StartExecutionCommand(params);
        await sfnClient.send(command);
        return {
            statusCode: 200,
            body: JSON.stringify({
                message: "Step Function triggered successfully!",
            }),
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
            body: JSON.stringify({
                message: "Failed to trigger Step Function.",
                errorMessage,
            }),
        };
    }
};
// パラメータストアからステートマシンのARNを取得する関数
async function getStateMachineArnFromSSM(stateMachineName) {
    try {
        const command = new GetParameterCommand({
            Name: stateMachineName,
            WithDecryption: true,
        });
        const response = await ssmClient.send(command);
        return response.Parameter?.Value || null;
    }
    catch (error) {
        console.error(`Error retrieving the state machine ARN from SSM for ${stateMachineName}:`, error);
        return null;
    }
}
function isDynamoDBStreamEvent(event) {
    return event.Records !== undefined && Array.isArray(event.Records);
}
function parseDynamoDBRecord(record) {
    if (record.dynamodb?.NewImage) {
        return unmarshall(record.dynamodb.NewImage);
    }
    return null;
}
