// APIのベースURLを設定します。環境に応じて変更が容易になります。
const apiUrl = "http://localhost:3000/dev";

// 認証情報（ログイン用）のエンドポイントに対してリクエストを送信する関数
async function login(username, password) {
  const response = await fetch(`${apiUrl}/login`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({ username, password }), // ユーザー名とパスワードを送信
  });

  if (!response.ok) {
    throw new Error(`Login failed: ${response.statusText}`);
  }

  const data = await response.json();
  return data; // APIから返されたデータ（トークンなど）を返す
}

document.addEventListener("DOMContentLoaded", () => {
  const loginButton = document.getElementById("loginButton");
  const errorMessageElement = document.getElementById("errorMessage");

  // ログインボタンが存在する場合
  if (loginButton) {
    loginButton.addEventListener("click", async () => {
      const username = document.getElementById("username").value;
      const password = document.getElementById("password").value;

      try {
        const { accessToken, refreshToken } = await login(username, password);

        localStorage.setItem("authToken", accessToken); // これを認証用に使う
        localStorage.setItem("refreshToken", refreshToken); // リフレッシュ用に保存

        window.location.href = "home.html";
      } catch (error) {
        console.error("Login failed:", error);
        // エラーメッセージを表示
        errorMessageElement.textContent =
          "ログインに失敗しました: " + error.message;
        errorMessageElement.style.display = "block"; // エラーメッセージを表示
      }
    });
  }

  // home.html でトークンをチェック
  if (window.location.pathname === "/home.html") {
    const token = localStorage.getItem("authToken");
    if (!token) {
      // トークンがなければログイン画面にリダイレクト
      window.location.href = "index.html";
    }
  }
});

// script.mjs

export async function apiCheck() {
  const token = localStorage.getItem("authToken"); // ローカルストレージからトークンを取得
  if (!token) {
    alert("認証トークンがありません。ログインしてください。");
    return;
  }

  const a = `${apiUrl}/check`; // APIエンドポイント

  try {
    // GETリクエスト
    const getResponse = await fetch(a, {
      method: "GET",
      headers: {
        Authorization: `Bearer ${token}`, // トークンをヘッダーに追加
      },
    });

    if (getResponse.ok) {
      const data = await getResponse.mjson();
      console.log("GETリクエスト成功:", data);

      return data; // APIの結果を返す
    } else {
      console.error("GETリクエスト失敗:", getResponse.status);
    }

    // POSTリクエスト
    const postResponse = await fetch(a, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
        Authorization: `Bearer ${token}`,
      },
      body: JSON.stringify({ message: "API Check POST Request" }),
    });

    if (postResponse.ok) {
      const postData = await postResponse.mjson();
      console.log("POSTリクエスト成功:", postData);
      return postData; // APIの結果を返す
    } else {
      console.error("POSTリクエスト失敗:", postResponse.status);
    }
  } catch (error) {
    console.error("API リクエスト中にエラーが発生しました:", error);
  }
}
