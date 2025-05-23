import {
  APIGatewayAuthorizerResult,
  APIGatewayRequestAuthorizerEvent,
  PolicyDocument,
} from "aws-lambda";
import jwt from "jsonwebtoken";

// 環境変数から秘密鍵を取得
const JWT_SECRET = process.env.JWT_SECRET || "your-secret-key";

export const handler = async (
  event: APIGatewayRequestAuthorizerEvent
): Promise<APIGatewayAuthorizerResult> => {
  try {
    // console.log("event:", event);
    const authHeader = event.headers?.Authorization;
    console.log("Authorization header:", authHeader);
    const token = extractTokenFromHeader(authHeader);
    const decoded = verifyToken(token);
    console.log("Token verification succeeded:", decoded);
    const resourceArn = generateResourceArn(event);
    return generatePolicy(decoded.username, "Allow", resourceArn);
  } catch (err) {
    console.error("Authorization failed:", err);
    return generatePolicy("user", "Deny", event.methodArn);
  }
};

const extractTokenFromHeader = (authHeader: string | undefined): string => {
  if (!authHeader) {
    throw new Error("Authorization header is missing");
  }
  const parts = authHeader.split(" ");
  if (parts.length !== 2 || parts[0] !== "Bearer") {
    throw new Error("Invalid Authorization header format");
  }
  return parts[1];
};

const verifyToken = (token: string): jwt.JwtPayload => {
  try {
    return jwt.verify(token, JWT_SECRET) as jwt.JwtPayload;
  } catch (err) {
    throw new Error("Invalid token");
  }
};

const generatePolicy = (
  principalId: string,
  effect: "Allow" | "Deny",
  resource: string
): APIGatewayAuthorizerResult => {
  const policyDocument: PolicyDocument = {
    Version: "2012-10-17",
    Statement: [
      {
        Action: "execute-api:Invoke",
        Effect: effect,
        Resource: resource,
      },
    ],
  };
  return {
    principalId,
    policyDocument,
  };
};

const generateResourceArn = (
  event: APIGatewayRequestAuthorizerEvent
): string => {
  const arnParts = event.methodArn.split(":");
  const region = arnParts[3];
  const accountId = arnParts[4];
  const resourceParts = arnParts[5].split("/");
  const stage = resourceParts[1];
  return `arn:aws:execute-api:${region}:${accountId}:*/${stage}/*/*`;
};
