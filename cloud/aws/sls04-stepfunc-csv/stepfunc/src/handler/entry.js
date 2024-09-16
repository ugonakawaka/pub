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
const parse_1 = require("@fast-csv/parse");
const s3Client = new client_s3_1.S3Client();
function generateDummyData(count) {
    const dummyData = [];
    for (let i = 0; i < count; i++) {
        dummyData.push({
            id: i + 1,
            name: `User ${i + 1}`,
            email: `user${i + 1}@example.com`,
            age: Math.floor(Math.random() * 50) + 20,
            createdAt: new Date().toISOString()
        });
    }
    return dummyData;
}
const handler = (event) => __awaiter(void 0, void 0, void 0, function* () {
    console.log('Entry function started');
    console.log('Received event:', JSON.stringify(event, null, 2));
    const { inputFileName, outputFileName } = event;
    const bucketName = process.env.S3_BUCKET_NAME;
    if (!bucketName) {
        throw new Error('S3_BUCKET_NAME environment variable is not set');
    }
    let records = [];
    try {
        const getCommand = new client_s3_1.GetObjectCommand({
            Bucket: bucketName,
            Key: inputFileName,
        });
        console.log('Attempting to get object:', inputFileName);
        const response = yield s3Client.send(getCommand);
        if (!response.Body) {
            throw new Error('No data in S3 object');
        }
        yield new Promise((resolve, reject) => {
            const stream = response.Body;
            stream
                .pipe((0, parse_1.parse)({ headers: true }))
                .on('error', reject)
                .on('data', (data) => records.push(data))
                .on('end', () => resolve());
        });
    }
    catch (error) {
        console.warn(`Failed to get file from S3: ${error}. Generating dummy data instead.`);
        records = generateDummyData(7000);
    }
    const BATCH_SIZE = 1000;
    const batches = [];
    for (let i = 0; i < records.length; i += BATCH_SIZE) {
        batches.push(records.slice(i, i + BATCH_SIZE));
    }
    const batchDataLocations = yield Promise.all(batches.map((batch, index) => __awaiter(void 0, void 0, void 0, function* () {
        const batchDataKey = `batch_data/${Date.now()}_${index}.json`;
        yield s3Client.send(new client_s3_1.PutObjectCommand({
            Bucket: bucketName,
            Key: batchDataKey,
            Body: JSON.stringify(batch),
            ContentType: 'application/json',
        }));
        return batchDataKey;
    })));
    return {
        batchDataLocation: batchDataLocations,
        batchCount: batches.length,
        totalRecords: records.length,
        outputFileName,
        bucketName,
        outputPrefix: `processed_data_${Date.now()}`
    };
});
exports.handler = handler;
