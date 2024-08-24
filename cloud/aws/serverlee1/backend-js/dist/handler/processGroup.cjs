"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.handler = void 0;
const handler = async (event) => {
    try {
        // グループごとの処理を行う
        console.log("Processing group:", event);
        // 処理結果を次のステートに渡す
        return {
            processedGroup: event
        };
    }
    catch (error) {
        console.error("Error in processGroupLambda:", error);
        throw error;
    }
};
exports.handler = handler;
