import { apiClient } from "./api-client.mjs";
import { auth } from "./auth.mjs";

export async function apiCheck() {
  if (!auth.isAuthenticated()) {
    alert("認証トークンがありません。ログインしてください。");
    return;
  }

  const token = auth.getToken();

  try {
    const getData = await apiClient.check(token);
    console.log("GETリクエスト成功:", getData);

    const postData = await apiClient.checkPost(token, "API Check POST Request");
    console.log("POSTリクエスト成功:", postData);

    return { getData, postData };
  } catch (error) {
    console.error("API リクエスト中にエラーが発生しました:", error);
  }
}
