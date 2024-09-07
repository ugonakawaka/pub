"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.handler = void 0;
const jsonwebtoken_1 = __importDefault(require("jsonwebtoken"));
// 環境変数から秘密鍵を取得
const JWT_SECRET = process.env.JWT_SECRET || "your-secret-key";
const handler = async (event) => {
    try {
        console.log("event:", event);
        const authHeader = event.headers?.Authorization;
        console.log("Authorization header:", authHeader);
        const token = extractTokenFromHeader(authHeader);
        const decoded = verifyToken(token);
        console.log("Token verification succeeded:", decoded);
        const a = "arn:aws:execute-api:*";
        // return generatePolicy(decoded.username, "Allow", event.methodArn);
        return generatePolicy(decoded.username, "Allow", a);
    }
    catch (err) {
        console.error("Authorization failed:", err);
        return generatePolicy("user", "Deny", event.methodArn);
    }
};
exports.handler = handler;
const extractTokenFromHeader = (authHeader) => {
    if (!authHeader) {
        throw new Error("Authorization header is missing");
    }
    const parts = authHeader.split(" ");
    if (parts.length !== 2 || parts[0] !== "Bearer") {
        throw new Error("Invalid Authorization header format");
    }
    return parts[1];
};
const verifyToken = (token) => {
    try {
        return jsonwebtoken_1.default.verify(token, JWT_SECRET);
    }
    catch (err) {
        throw new Error("Invalid token");
    }
};
const generatePolicy = (principalId, effect, resource) => {
    const policyDocument = {
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
