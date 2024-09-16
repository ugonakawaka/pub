import { Handler } from 'aws-lambda';
import { SFNClient, StartExecutionCommand } from '@aws-sdk/client-sfn';

const sfnClient = new SFNClient();
const STATE_MACHINE_ARN = process.env.STATE_MACHINE_ARN!;

interface Event {
  inputFileName: string;
  outputFileName: string;
}

export const handler: Handler<Event> = async (event) => {
  const { inputFileName, outputFileName } = event;

  const params = {
    stateMachineArn: STATE_MACHINE_ARN,
    input: JSON.stringify({
      inputFileName,
      outputFileName,
    }),
  };

  try {
    const command = new StartExecutionCommand(params);
    await sfnClient.send(command);

    return {
      statusCode: 200,
      body: 'Step Functions execution started.',
    };
  } catch (error) {
    console.error('Error starting Step Functions execution:', error);
    return {
      statusCode: 500,
      body: 'Error starting Step Functions execution.',
    };
  }
};