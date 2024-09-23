import {
  SSMClient,
  PutParameterCommand,
  GetParameterCommand,
  DeleteParameterCommand,
} from "@aws-sdk/client-ssm";
import { generateKeyPairSync } from "crypto";
import { CloudFormationCustomResourceEvent } from "aws-lambda";

import axios from "axios";

const ssm = new SSMClient({});

export const handler = async (event: CloudFormationCustomResourceEvent) => {
  try {
    console.log("Event received:", event);
    const callerReference = event.ResourceProperties.CallerReference;

    if (!callerReference) {
      throw new Error("CallerReference is required");
    }

    let physicalResourceId = event.LogicalResourceId || `KeyPair`;

    let responseData = {};

    switch (event.RequestType) {
      case "Create":
        responseData = await handleCreate(callerReference);
        break;
      case "Update":
        responseData = await handleUpdate(callerReference);
        break;
      case "Delete":
        await handleDelete(callerReference);
        break;
    }
    await sendResponse(event, "SUCCESS", physicalResourceId, responseData);
  } catch (error) {
    console.error("Error processing event:", error);
    await sendResponse(event, "FAILED", event.LogicalResourceId, {});
  }
};

async function handleCreate(callerReference: string) {
  const { publicKey, privateKey } = generateKeyPairSync("rsa", {
    modulusLength: 2048,
    publicKeyEncoding: { type: "spki", format: "pem" },
    privateKeyEncoding: { type: "pkcs8", format: "pem" },
  });

  const publicKeyParam = `${process.env.PUBLIC_KEY_PARAM!}`;
  const privateKeyParam = `${process.env.PRIVATE_KEY_PARAM!}`;

  await saveToParameterStore(publicKeyParam, publicKey);
  await saveToParameterStore(privateKeyParam, privateKey, true);

  return {
    PublicKeyParameter: publicKeyParam,
    PrivateKeyParameter: privateKeyParam,
    PublicKey: publicKey,
  };
}

async function handleUpdate(callerReference: string) {
  const existingKeys = await getKeyPair(callerReference);
  if (!existingKeys) {
    return handleCreate(callerReference);
  } else {
    console.log("Keys already exist, no update needed.");
    return {
      PublicKeyParameter: `${process.env.PUBLIC_KEY_PARAM!}`,
      PrivateKeyParameter: `${process.env.PRIVATE_KEY_PARAM!}`,
      PublicKey: existingKeys.publicKey,
    };
  }
}

async function handleDelete(callerReference: string) {
  await deleteFromParameterStore(`${process.env.PUBLIC_KEY_PARAM!}`);
  await deleteFromParameterStore(`${process.env.PRIVATE_KEY_PARAM!}`);
}

async function saveToParameterStore(
  paramName: string,
  value: string,
  isSecure: boolean = false
) {
  const command = new PutParameterCommand({
    Name: paramName,
    Value: value,
    Type: isSecure ? "SecureString" : "String",
    Overwrite: true,
  });
  await ssm.send(command);
}

async function getFromParameterStore(
  paramName: string
): Promise<string | null> {
  try {
    const command = new GetParameterCommand({
      Name: paramName,
      WithDecryption: true,
    });
    const response = await ssm.send(command);
    return response.Parameter?.Value || null;
  } catch (error) {
    console.error(`Error getting parameter ${paramName}:`, error);
    return null;
  }
}

async function deleteFromParameterStore(paramName: string) {
  try {
    const command = new DeleteParameterCommand({
      Name: paramName,
    });
    await ssm.send(command);
  } catch (error) {
    console.error(`Error deleting parameter ${paramName}:`, error);
  }
}

async function getKeyPair(
  callerReference: string
): Promise<{ publicKey: string; privateKey: string } | null> {
  const publicKey = await getFromParameterStore(
    `${process.env.PUBLIC_KEY_PARAM!}`
  );
  const privateKey = await getFromParameterStore(
    `${process.env.PRIVATE_KEY_PARAM!}`
  );

  if (publicKey && privateKey) {
    return { publicKey, privateKey };
  }
  return null;
}

async function getPublicKey(callerReference: string): Promise<string | null> {
  return getFromParameterStore(`${process.env.PUBLIC_KEY_PARAM!}`);
}

async function getPrivateKey(callerReference: string): Promise<string | null> {
  return getFromParameterStore(`${process.env.PRIVATE_KEY_PARAM!}`);
}

async function sendResponse(
  event: CloudFormationCustomResourceEvent,
  status: "SUCCESS" | "FAILED",
  physicalResourceId: string,
  data: any
) {
  const responseBody = JSON.stringify({
    Status: status,
    Reason: `See the details in CloudWatch Log Stream: ${event.RequestId}`,
    PhysicalResourceId: physicalResourceId,
    StackId: event.StackId,
    RequestId: event.RequestId,
    LogicalResourceId: event.LogicalResourceId,
    Data: data,
  });

  console.log("Response body:", responseBody);

  const responseOptions = {
    headers: {
      "content-type": "",
      "content-length": responseBody.length,
    },
  };

  try {
    await axios.put(event.ResponseURL, responseBody, responseOptions);
    console.log(`Response sent to CloudFormation: ${status}`);
  } catch (error) {
    console.error("Failed to send response to CloudFormation:", error);
  }
}
