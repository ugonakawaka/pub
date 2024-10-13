import { SSMClient, PutParameterCommand } from "@aws-sdk/client-ssm";
import { CloudFormationClient, DescribeStacksCommand } from "@aws-sdk/client-cloudformation";

class StoreArnsPlugin {
  constructor(serverless, options) {
    this.serverless = serverless;
    this.options = options;
    this.hooks = {
      'after:deploy:deploy': this.storeArns.bind(this),
    };
  }

  async storeArns() {
    const region = this.serverless.service.provider.region;
    const ssmClient = new SSMClient({ region });
    const cfClient = new CloudFormationClient({ region });
    const stackName = `${this.serverless.service.service}-${this.serverless.service.provider.stage}`;

    try {
      // CloudFormationスタックの出力を取得
      const { Stacks } = await cfClient.send(new DescribeStacksCommand({ StackName: stackName }));
      const outputs = Stacks[0].Outputs;

      // Step FunctionsのARNを見つける
      const stepFunctionOutput = outputs.find(output => 
        output.OutputValue.startsWith('arn:aws:states:') && 
        output.OutputValue.includes(':stateMachine:')
      );

      if (!stepFunctionOutput) {
        throw new Error('Step Functions ARN not found in CloudFormation outputs');
      }

      const stepFunctionArn = stepFunctionOutput.OutputValue;

      // ARNをParameter Storeにセキュアに保存
      const parameterName = `/my-service/${this.serverless.service.provider.stage}/step-function-arn`;
      await ssmClient.send(new PutParameterCommand({
        Name: parameterName,
        Value: stepFunctionArn,
        Type: 'SecureString',
        Overwrite: true,
      }));

      this.serverless.cli.log(`Securely stored Step Functions ARN in Parameter Store: ${parameterName}`);
      this.serverless.cli.log(`Step Functions ARN: ${stepFunctionArn}`);
    } catch (error) {
      this.serverless.cli.log(`Error storing ARN: ${error.message}`);
    }
  }
}

export default StoreArnsPlugin;