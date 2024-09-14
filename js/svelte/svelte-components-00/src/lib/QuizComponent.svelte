<svelte:options tag="quiz-component" />

<script lang="ts">
  function checkAnswer(event: MouseEvent): void {
    const button = event.currentTarget as HTMLButtonElement;
    if (button.hasAttribute("correct")) {
      alert("正解！");
    } else {
      alert("不正解。再挑戦してください。");
    }
  }
</script>

<div>
  <question-component />
  <ul on:click={checkAnswer}>
    <slot name="ops" />
  </ul>
</div>
