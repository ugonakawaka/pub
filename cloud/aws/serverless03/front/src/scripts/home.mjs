import { auth } from "./auth.mjs";

export function checkAuthOnHome() {
  if (window.location.pathname === config.routes.home) {
    if (!auth.isAuthenticated()) {
      auth.redirectToLogin();
    }
  }
}
