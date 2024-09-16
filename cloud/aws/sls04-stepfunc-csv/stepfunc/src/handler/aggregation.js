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
const format_1 = require("@fast-csv/format");
const s3Client = new client_s3_1.S3Client();
const handler = (event) => __awaiter(void 0, void 0, void 0, function* () {
    console.log('Aggregation function started');
    console.log('Received event:', JSON.stringify(event, null, 2));
    const { processedResults, outputFileName, bucketName } = event;
    if (!bucketName) {
        throw new Error('bucketName is not provided in the event');
    }
    try {
        let allRecords = [];
        for (const result of processedResults) {
            const getCommand = new client_s3_1.GetObjectCommand({
                Bucket: bucketName,
                Key: result.processedDataLocation,
            });
            const response = yield s3Client.send(getCommand);
            if (!response.Body) {
                throw new Error(`No data found in ${result.processedDataLocation}`);
            }
            const batchData = yield response.Body.transformToString();
            allRecords = allRecords.concat(JSON.parse(batchData));
        }
        if (allRecords.length === 0) {
            throw new Error('No records found to aggregate');
        }
        const fields = Object.keys(allRecords[0]);
        const csvData = yield (0, format_1.writeToString)(allRecords, { headers: fields });
        const putCommand = new client_s3_1.PutObjectCommand({
            Bucket: bucketName,
            Key: outputFileName,
            Body: csvData,
            ContentType: 'text/csv',
        });
        yield s3Client.send(putCommand);
        console.log(`Final CSV saved to S3: s3://${bucketName}/${outputFileName}`);
        return {
            statusCode: 200,
            body: `Aggregation completed. Output file: ${outputFileName}`,
            totalRecords: allRecords.length,
        };
    }
    catch (error) {
        console.error('Error in aggregation function:', error);
        throw error instanceof Error
            ? new Error(`Error in aggregation function: ${error.message}`)
            : new Error('An unknown error occurred in the aggregation function.');
    }
});
exports.handler = handler;
