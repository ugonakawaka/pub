<svelte:options customElement="parent-component" />

<script>
  import ChildComponent from "./ChildComponent.svelte";
</script>

<div>
  <h1>これは親コンポーネントです</h1>
  <ChildComponent message="親から子へのメッセージ" />
</div>
