"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (k !== "default" && Object.prototype.hasOwnProperty.call(mod, k)) __createBinding(result, mod, k);
    __setModuleDefault(result, mod);
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.handler = void 0;
const jwt = __importStar(require("jsonwebtoken"));
const authenticateUser = (username, password) => {
    return username === "b" && password === "b";
};
const createAccessToken = (username) => {
    return jwt.sign({ username }, "your-secret-key", { expiresIn: "15m" });
};
const createRefreshToken = (username) => {
    return jwt.sign({ username }, "your-refresh-secret-key", { expiresIn: "7d" });
};
const corsHeaders = {
    "Access-Control-Allow-Origin": "*",
    "Access-Control-Allow-Methods": "POST, OPTIONS",
    "Access-Control-Allow-Headers": "Content-Type, Authorization",
    "Access-Control-Allow-Credentials": "true",
};
const handler = async (event) => {
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
            const response = { accessToken, refreshToken };
            return {
                statusCode: 200,
                headers: corsHeaders,
                body: JSON.stringify(response),
            };
        }
        else {
            return {
                statusCode: 401,
                headers: corsHeaders,
                body: JSON.stringify({ message: "Invalid credentials" }),
            };
        }
    }
    catch (error) {
        console.error("Error during login:", error);
        return {
            statusCode: 500,
            headers: corsHeaders,
            body: JSON.stringify({ message: "Internal server error" }),
        };
    }
};
exports.handler = handler;
