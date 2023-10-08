export function printSourceLocation() {
  const error = new Error();
  const stackLines = error.stack?.split('\n') || [];
  // 通常、1行目はエラーメッセージ、2行目はこの関数の位置なので、3行目を取得
  const sourceLocation = stackLines[2] || 'Unknown location';
  console.log(sourceLocation);
}
