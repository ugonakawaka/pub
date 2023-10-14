// フェッチされるデータの構造に基づいてカスタム型を定義します。
interface dataType {
  id: number;
  name: string;
  email: string;
  url: string;
}

// 非同期関数を定義します。この関数は、指定されたURLからデータをフェッチし、dataType型のオブジェクトを返します。
async function fetchData(url: string): Promise<dataType> {
  const response = await fetch(url);
  if (!response.ok) {
    throw new Error('Network response was not ok ' + response.statusText);
  }

  const json = await response.json();
  console.log('json', json);
  const data: dataType = json;
  return data;
}

// fetchData関数を呼び出し、結果を表示します。
fetchData('https://archive.org/wayback/available?url=www.example.com')
  .then((data) => {
    console.log(data);
  })
  .catch((error) => {
    console.error('There has been a problem with your fetch operation:', error);
  });

async function displayData(url: string) {
  const data = await fetchData(url);
  console.log(data);
}

//  asyncキーワードは、関数がPromiseを返すことを保証します。async関数は、明示的なPromiseを返さなくても常にPromiseを返します。
