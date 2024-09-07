import { config } from "./config.mjs";

export const auth = {
  setTokens(accessToken, refreshToken) {
    localStorage.setItem("authToken", accessToken);
    localStorage.setItem("refreshToken", refreshToken);
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
    window.location.href = config.routes.index;
  },

  redirectToHome() {
    window.location.href = config.routes.home;
  },
};
