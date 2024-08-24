import { APIGatewayProxyEvent, APIGatewayProxyResult } from 'aws-lambda';

module.exports.handler = async (event: APIGatewayProxyEvent): Promise<APIGatewayProxyResult> => {
    // ここにロジックを記述します
    return {
        statusCode: 200,
        body: JSON.stringify({
            message: "Hello, world!",
        }),
    };
};
