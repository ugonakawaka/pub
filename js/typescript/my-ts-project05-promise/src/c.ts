// TypeScriptでの非同期関数の定義
async function fetchUserData(
  userId: string,
): Promise<{ name: string; age: number }> {
  // ... ユーザーデータのフェッチ
  return { name: 'John Doe', age: 25 }; // 仮の戻り値
}

async function fetchProductData(
  productId: string,
): Promise<{ title: string; price: number }> {
  // ... 製品データのフェッチ
  return { title: 'Widget', price: 9.99 }; // 仮の戻り値
}

// 非同期関数の並行実行
async function fetchData() {
  try {
    const results = await Promise.all([
      fetchUserData('user123'),
      fetchProductData('product456'),
    ]);

    // results[0] には fetchUserData の結果が、results[1] には fetchProductData の結果が格納されています。
    console.log(results);
  } catch (error) {
    console.error('Error fetching data:', error);
  }
}

// 関数の呼び出し
fetchData();
