import { Handler } from 'aws-lambda';
import { S3Client, PutObjectCommand } from '@aws-sdk/client-s3';
import { Readable } from 'stream';
import { parse, ParserOptionsArgs, HeaderArray } from '@fast-csv/parse';

const s3Client = new S3Client();

interface Record {
  [key: string]: string | number;
}

interface Event {
  batchData: string;
  bucketName: string;
  outputPrefix: string;
}

export const handler: Handler<Event> = async (event) => {
  console.log('Process function started');
  console.log('Received event:', JSON.stringify(event, null, 2));

  const { bucketName, batchData, outputPrefix } = event;

  if (!bucketName) {
    throw new Error('bucketName is not provided in the event');
  }

  try {


    // JSON文字列をパース
    const records: Record[] = JSON.parse(batchData);

    console.log(`Parsed ${records.length} records`);
    

    // 処理したレコードをS3に保存
    const processedDataKey = `${outputPrefix}/processed_data_${Date.now()}.json`;
    await s3Client.send(new PutObjectCommand({
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
  } catch (error) {
    console.error('Error in process function:', error);
    throw error instanceof Error
      ? new Error(`Error in process function: ${error.message}`)
      : new Error('An unknown error occurred in the process function.');
  }
};