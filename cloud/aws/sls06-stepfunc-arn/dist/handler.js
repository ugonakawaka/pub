// src/handler.ts
var handler = async (event, context) => {
  console.log("Event:", JSON.stringify(event, null, 2));
  return {
    statusCode: 200,
    body: JSON.stringify({
      message: "Hello from Lambda!",
      input: event
    })
  };
};
export {
  handler
};
