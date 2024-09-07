import { apiClient } from "./api-client.mjs";
import { auth } from "./auth.mjs";

export function setupLoginForm() {
  const loginButton = document.getElementById("loginButton");
  const errorMessageElement = document.getElementById("errorMessage");

  if (loginButton) {
    loginButton.addEventListener("click", async () => {
      const username = document.getElementById("username").value;
      const password = document.getElementById("password").value;

      try {
        const { accessToken, refreshToken } = await apiClient.login(
          username,
          password
        );
        auth.setTokens(accessToken, refreshToken);
        auth.redirectToHome();
      } catch (error) {
        console.error("Login failed:", error);
        errorMessageElement.textContent =
          "ログインに失敗しました: " + error.message;
        errorMessageElement.style.display = "block";
      }
    });
  }
}
