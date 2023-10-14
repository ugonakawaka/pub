//
const promise = new Promise<string>((resolve, reject) => {
  setTimeout(() => {
    resolve('成功！');
  }, 1000);
});

promise
  .then((message) => {
    console.log(message);
  })
  .catch((error) => {
    console.error(error);
  });

console.log('======================');
// 関数
// 非同期関数を定義します。
function asyncFunction(): Promise<string> {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve('非同期操作が成功しました');
      // エラーの場合は以下のようにrejectを呼び出します
      // reject('何かがうまくいきませんでした');
    }, 1000);
  });
}

const a = asyncFunction();
console.log(a); // romise { <pending> }

// 非同期関数を呼び出し、その結果を処理します。
asyncFunction().then(
  /* resolve */
  (successMessage) => {
    console.log(successMessage); // '非同期操作が成功しました' と出力します
  },
  /* reject */
  (errorMessage) => {
    console.log(errorMessage); // エラーメッセージを出力します
  },
);

asyncFunction()
  .then((successMessage) => {
    // resolveでエラーを起こしてみる
    if (true) throw new Error('*** error message');
    console.log(successMessage); // '非同期操作が成功しました' と出力します
  })
  .catch((errorMessage) => {
    console.log('*** catch', errorMessage); // エラーメッセージを出力します
  });
