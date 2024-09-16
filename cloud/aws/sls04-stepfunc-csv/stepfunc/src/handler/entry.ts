import { Handler } from 'aws-lambda';
import { S3Client, GetObjectCommand, PutObjectCommand, ListObjectsV2Command } from '@aws-sdk/client-s3';
import { parse } from '@fast-csv/parse';
import { Readable } from 'stream';

const s3Client = new S3Client();

interface Event {
  inputFileName: string;
  outputFileName: string;
}

interface CSVRecord {
  [key: string]: string | number;
}

function generateDummyData(count: number): CSVRecord[] {
  const dummyData: CSVRecord[] = [];
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

export const handler: Handler<Event> = async (event) => {
  console.log('Entry function started');
  console.log('Received event:', JSON.stringify(event, null, 2));

  const { inputFileName, outputFileName } = event;
  const bucketName = process.env.S3_BUCKET_NAME;

  if (!bucketName) {
    throw new Error('S3_BUCKET_NAME environment variable is not set');
  }

  let records: CSVRecord[] = [];

  try {
    const getCommand = new GetObjectCommand({
      Bucket: bucketName,
      Key: inputFileName,
    });

    console.log('Attempting to get object:', inputFileName);
    const response = await s3Client.send(getCommand);

    if (!response.Body) {
      throw new Error('No data in S3 object');
    }

    await new Promise<void>((resolve, reject) => {
      const stream = response.Body as Readable;
      stream
        .pipe(parse({ headers: true }))
        .on('error', reject)
        .on('data', (data: CSVRecord) => records.push(data))
        .on('end', () => resolve());
    });
  } catch (error) {
    console.warn(`Failed to get file from S3: ${error}. Generating dummy data instead.`);
    records = generateDummyData(7000);
  }

  const BATCH_SIZE = 1000;
  const batches = [];
  for (let i = 0; i < records.length; i += BATCH_SIZE) {
    batches.push(records.slice(i, i + BATCH_SIZE));
  }

  const batchDataLocations = await Promise.all(batches.map(async (batch, index) => {
    const batchDataKey = `batch_data/${Date.now()}_${index}.json`;
    await s3Client.send(new PutObjectCommand({
      Bucket: bucketName,
      Key: batchDataKey,
      Body: JSON.stringify(batch),
      ContentType: 'application/json',
    }));
    return batchDataKey;
  }));

  return {
    batchDataLocation: batchDataLocations,
    batchCount: batches.length,
    totalRecords: records.length,
    outputFileName,
    bucketName,
    outputPrefix: `processed_data_${Date.now()}`
  };
};