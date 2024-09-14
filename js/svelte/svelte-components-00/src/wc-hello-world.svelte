<svelte:options customElement="wc-hello-world" />

<script>
  export let name = "User";
</script>

<h1>Welcome to Svelte: Web Components</h1>
<p>Hello {name}, your journey starts now.</p>

<style>
  :host {
    display: block;
    background-color: white;
    border: 1px solid white;
    border-radius: 4px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
    width: 90%;
    max-width: 600px;
    margin: auto;
  }

  * {
    box-sizing: border-box;
  }

  h1 {
    text-align: center;
  }
</style>
