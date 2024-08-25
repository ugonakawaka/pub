export const handler = async (event) => {
    // ここにロジックを記述します
    return {
        statusCode: 200,
        body: JSON.stringify({
            message: "Hello, world!",
        }),
    };
};
