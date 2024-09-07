import { APIGatewayProxyEvent, APIGatewayProxyResult } from "aws-lambda";
import * as jwt from "jsonwebtoken";

interface AuthResponse {
  accessToken: string;
  refreshToken: string;
}

const authenticateUser = (username: string, password: string): boolean => {
  return username === "b" && password === "b";
};

const createAccessToken = (username: string): string => {
  return jwt.sign({ username }, "your-secret-key", { expiresIn: "15m" });
};

const createRefreshToken = (username: string): string => {
  return jwt.sign({ username }, "your-refresh-secret-key", { expiresIn: "7d" });
};

const corsHeaders = {
  "Access-Control-Allow-Origin": "*",
  "Access-Control-Allow-Methods": "POST, OPTIONS",
  "Access-Control-Allow-Headers": "Content-Type, Authorization",
  "Access-Control-Allow-Credentials": "true",
};

export const handler = async (
  event: APIGatewayProxyEvent
): Promise<APIGatewayProxyResult> => {
  console.log("event:", event);

  // OPTIONS リクエスト（preflight）の処理
  if (event.httpMethod === "OPTIONS") {
    return {
      statusCode: 200,
      headers: corsHeaders,
      body: "",
    };
  }

  try {
    if (event.httpMethod !== "POST") {
      return {
        statusCode: 405,
        headers: corsHeaders,
        body: JSON.stringify({ message: "Method Not Allowed" }),
      };
    }

    const { username, password } = JSON.parse(event.body || "{}");

    console.log("username:", username);
    console.log("password:", password);

    if (!username || !password) {
      return {
        statusCode: 400,
        headers: corsHeaders,
        body: JSON.stringify({ message: "Username and password are required" }),
      };
    }

    if (authenticateUser(username, password)) {
      const accessToken = createAccessToken(username);
      const refreshToken = createRefreshToken(username);

      const response: AuthResponse = { accessToken, refreshToken };

      return {
        statusCode: 200,
        headers: corsHeaders,
        body: JSON.stringify(response),
      };
    } else {
      return {
        statusCode: 401,
        headers: corsHeaders,
        body: JSON.stringify({ message: "Invalid credentials" }),
      };
    }
  } catch (error) {
    console.error("Error during login:", error);
    return {
      statusCode: 500,
      headers: corsHeaders,
      body: JSON.stringify({ message: "Internal server error" }),
    };
  }
};
