import { config } from "./config.mjs";

// JWT デコード用の関数（ブラウザ環境用）
function parseJwt(token) {
  const base64Url = token.split(".")[1];
  const base64 = base64Url.replace(/-/g, "+").replace(/_/g, "/");
  const jsonPayload = decodeURIComponent(
    atob(base64)
      .split("")
      .map(function (c) {
        return "%" + ("00" + c.charCodeAt(0).toString(16)).slice(-2);
      })
      .join("")
  );

  return JSON.parse(jsonPayload);
}

function formatDate(timestamp) {
  return new Date(timestamp * 1000).toLocaleString("ja-JP", {
    timeZone: "Asia/Tokyo",
  });
}

export const auth = {
  setTokens(accessToken, refreshToken) {
    localStorage.setItem("authToken", accessToken);
    localStorage.setItem("refreshToken", refreshToken);
  },
  setToken(token) {
    localStorage.setItem("authToken", token);
  },

  // 新しいメソッド: トークンの更新
  updateToken(newToken) {
    if (newToken) {
      this.setToken(newToken);
    }
  },
  getToken() {
    return localStorage.getItem("authToken");
  },
  removeTokens() {
    localStorage.removeItem("authToken");
    localStorage.removeItem("refreshToken");
  },
  isAuthenticated() {
    return !!this.getToken();
  },
  redirectToLogin() {
    window.location.href = config.routes.loginPage;
  },
  redirectToHome() {
    window.location.href = config.routes.homePage;
  },

  // =======
  logout() {
    this.removeTokens();
    this.redirectToLogin();
  },

  // =======
  isTokenExpired() {
    const token = this.getToken();
    if (!token) return true;

    const decodedToken = parseJwt(token);
    const currentTime = Date.now() / 1000;
    return decodedToken.exp < currentTime;
  },

  getTokenStatus() {
    const token = this.getToken();
    if (!token)
      return { exists: false, expired: true, issuedAt: null, expiresAt: null };

    const decodedToken = parseJwt(token);
    const currentTime = Math.floor(Date.now() / 1000);
    const expired = decodedToken.exp < currentTime;

    return {
      exists: true,
      expired,
      issuedAt: decodedToken.iat ? formatDate(decodedToken.iat) : "Unknown",
      expiresAt: decodedToken.exp ? formatDate(decodedToken.exp) : "Unknown",
    };
  },
};
