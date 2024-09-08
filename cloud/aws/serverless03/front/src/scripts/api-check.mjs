import { apiClient } from "./api-client.mjs";
import { auth } from "./auth.mjs";

function formatJSTTimestamp(date) {
  const options = {
    timeZone: "Asia/Tokyo",
    year: "numeric",
    month: "2-digit",
    day: "2-digit",
    hour: "2-digit",
    minute: "2-digit",
    second: "2-digit",
    hour12: false,
  };
  return date.toLocaleString("ja-JP", options) + " JST";
}

export async function apiCheck() {
  if (!auth.isAuthenticated()) {
    throw new Error("認証トークンがありません。ログインしてください。");
  }

  const token = auth.getToken();

  try {
    const getStartTime = new Date();
    const getResult = await apiClient.check(token);
    const getEndTime = new Date();

    const postStartTime = new Date();
    const postResult = await apiClient.checkPost(
      token,
      "API Check POST Request"
    );
    const postEndTime = new Date();

    return {
      get: {
        success: true,
        data: getResult,
        requestTime: getEndTime - getStartTime,
        startTimestamp: formatJSTTimestamp(getStartTime),
      },
      post: {
        success: true,
        data: postResult,
        requestTime: postEndTime - postStartTime,
        startTimestamp: formatJSTTimestamp(postStartTime),
      },
    };
  } catch (error) {
    console.error("API リクエスト中にエラーが発生しました:", error);
    return {
      get: {
        success: false,
        error: error.message,
        requestTime: 0,
        startTimestamp: formatJSTTimestamp(new Date()),
      },
      post: {
        success: false,
        error: error.message,
        requestTime: 0,
        startTimestamp: formatJSTTimestamp(new Date()),
      },
    };
  }
}
