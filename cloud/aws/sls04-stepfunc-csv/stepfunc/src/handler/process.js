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
const client_s3_1 = require("@aws-sdk/client-s3");
const s3Client = new client_s3_1.S3Client();
const handler = (event) => __awaiter(void 0, void 0, void 0, function* () {
    console.log('Process function started');
    console.log('Received event:', JSON.stringify(event, null, 2));
    const { bucketName, batchData, outputPrefix } = event;
    if (!bucketName) {
        throw new Error('bucketName is not provided in the event');
    }
    try {
        // JSON文字列をパース
        const records = JSON.parse(batchData);
        console.log(`Parsed ${records.length} records`);
        // 処理したレコードをS3に保存
        const processedDataKey = `${outputPrefix}/processed_data_${Date.now()}.json`;
        yield s3Client.send(new client_s3_1.PutObjectCommand({
            Bucket: bucketName,
            Key: processedDataKey,
            Body: JSON.stringify(records),
            ContentType: 'application/json',
        }));
        console.log(`Processed data saved to S3: ${processedDataKey}`);
        return {
            processedRecordsCount: records.length,
            processedDataLocation: processedDataKey,
        };
    }
    catch (error) {
        console.error('Error in process function:', error);
        throw error instanceof Error
            ? new Error(`Error in process function: ${error.message}`)
            : new Error('An unknown error occurred in the process function.');
    }
});
exports.handler = handler;
