import { config } from "./config.mjs";

class ApiClient {
  constructor(baseUrl) {
    this.baseUrl = baseUrl;
  }

  async request(endpoint, method = "GET", body = null, token = null) {
    const url = `${this.baseUrl}${endpoint}`;
    const headers = {
      "Content-Type": "application/json",
    };

    if (token) {
      headers["Authorization"] = `Bearer ${token}`;
    }

    const options = {
      method,
      headers,
      body: body ? JSON.stringify(body) : null,
    };

    const response = await fetch(url, options);
    if (!response.ok) {
      throw new Error(`API request failed: ${response.statusText}`);
    }
    return response.json();
  }

  async login(username, password) {
    return this.request(config.routes.login, "POST", { username, password });
  }

  async check(token) {
    return this.request(config.routes.check, "GET", null, token);
  }

  async checkPost(token, message) {
    return this.request(config.routes.check, "POST", { message }, token);
  }
}

export const apiClient = new ApiClient(config.apiUrl);
