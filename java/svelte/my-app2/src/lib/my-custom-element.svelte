<svelte:options customElement="my-custom-element" />

<script>
	export let name = 'world';
  </script>
  
  <h1>Hello {name}!</h1>
  <slot />