import { setupLoginForm } from "./login.mjs";
import { checkAuthOnHome } from "./home.mjs";
import { apiCheck } from "./api-check.mjs";

document.addEventListener("DOMContentLoaded", () => {
  setupLoginForm();
  checkAuthOnHome();
});
