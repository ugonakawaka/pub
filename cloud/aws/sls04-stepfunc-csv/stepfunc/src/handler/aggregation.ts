import { Handler } from 'aws-lambda';
import { S3Client, GetObjectCommand, PutObjectCommand } from '@aws-sdk/client-s3';
import { writeToString } from '@fast-csv/format';

const s3Client = new S3Client();

interface ProcessedResult {
  processedDataLocation: string;
  processedRecordsCount: number;
}

interface Event {
  processedResults: ProcessedResult[];
  outputFileName: string;
  bucketName: string;
}

export const handler: Handler<Event> = async (event) => {
  console.log('Aggregation function started');
  console.log('Received event:', JSON.stringify(event, null, 2));

  const { processedResults, outputFileName, bucketName } = event;

  if (!bucketName) {
    throw new Error('bucketName is not provided in the event');
  }

  try {
    let allRecords: any[] = [];

    for (const result of processedResults) {
      const getCommand = new GetObjectCommand({
        Bucket: bucketName,
        Key: result.processedDataLocation,
      });

      const response = await s3Client.send(getCommand);
      if (!response.Body) {
        throw new Error(`No data found in ${result.processedDataLocation}`);
      }

      const batchData = await response.Body.transformToString();
      allRecords = allRecords.concat(JSON.parse(batchData));
    }

    if (allRecords.length === 0) {
      throw new Error('No records found to aggregate');
    }

    const fields = Object.keys(allRecords[0]);
    const csvData = await writeToString(allRecords, { headers: fields });

    const putCommand = new PutObjectCommand({
      Bucket: bucketName,
      Key: outputFileName,
      Body: csvData,
      ContentType: 'text/csv',
    });

    await s3Client.send(putCommand);

    console.log(`Final CSV saved to S3: s3://${bucketName}/${outputFileName}`);

    return {
      statusCode: 200,
      body: `Aggregation completed. Output file: ${outputFileName}`,
      totalRecords: allRecords.length,
    };
  } catch (error) {
    console.error('Error in aggregation function:', error);
    throw error instanceof Error
      ? new Error(`Error in aggregation function: ${error.message}`)
      : new Error('An unknown error occurred in the aggregation function.');
  }
};