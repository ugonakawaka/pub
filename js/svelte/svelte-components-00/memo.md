# 参考サイト
https://qiita.com/tronicboy/items/dd9bf434003d2f81c8b2

https://zenn.dev/eringiv3/articles/225e9bc2c92ff1  

```
npm create vite@latest svelte-components-00 --template svelte
cd svelte-components-00
npm install
```

いらないファイルを消す
```
    src/App.svelte
    src/app.css
    src/main.js
    src/assets/svelte.svg
```

```
% npm run dev 
```

このメッセージはどうにかならないのだろうか...
```
The 'customElement' option is used when generating a custom element. Did you forget the 'customElement: true' compile option?svelte(missing-custom-element-compile-options)
```

```
export default defineConfig({
  build: {
    lib: {
      entry: ["./src/wc-hello-world.svelte"],
      formats: ["es"],
    },
  },
  plugins: [svelte({ compilerOptions: { customElement: true } })],
})
```


```
export default defineConfig({
  build: {
    lib: {
      entry: './src/main.ts',
      name: 'MyLibrary',
      fileName: (format) => `svelte-web-components-example.${format}.js`,
    },
  },
  plugins: [svelte({ compilerOptions: { customElement: true } })],
})
```