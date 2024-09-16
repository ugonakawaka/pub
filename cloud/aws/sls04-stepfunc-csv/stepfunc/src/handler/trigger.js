"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.handler = void 0;
const client_sfn_1 = require("@aws-sdk/client-sfn");
const sfnClient = new client_sfn_1.SFNClient();
const STATE_MACHINE_ARN = process.env.STATE_MACHINE_ARN;
const handler = (event) => __awaiter(void 0, void 0, void 0, function* () {
    const { inputFileName, outputFileName } = event;
    const params = {
        stateMachineArn: STATE_MACHINE_ARN,
        input: JSON.stringify({
            inputFileName,
            outputFileName,
        }),
    };
    try {
        const command = new client_sfn_1.StartExecutionCommand(params);
        yield sfnClient.send(command);
        return {
            statusCode: 200,
            body: 'Step Functions execution started.',
        };
    }
    catch (error) {
        console.error('Error starting Step Functions execution:', error);
        return {
            statusCode: 500,
            body: 'Error starting Step Functions execution.',
        };
    }
});
exports.handler = handler;
