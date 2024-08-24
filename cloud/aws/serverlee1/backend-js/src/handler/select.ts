
const axios = require('axios');
import { APIGatewayProxyEvent, APIGatewayProxyResult } from 'aws-lambda';

module.exports.select = async (event: APIGatewayProxyEvent): Promise<APIGatewayProxyResult> => {
  const response = await axios.get('https://deiji.jp');
  return {
    statusCode: 200,
    body: JSON.stringify(
      {
        message: 'Hello, World!',
        data: response.data
      },
      null,
      2
    ),
  };
};
