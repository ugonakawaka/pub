module.exports.handler = async (event: any) => {
    try {
        // グループごとの処理を行う
        console.log("Processing group:", event);

        // 処理結果を次のステートに渡す
        return {
            processedGroup: event
        };
    } catch (error) {
        console.error("Error in processGroupLambda:", error);
        throw error;
    }
};
