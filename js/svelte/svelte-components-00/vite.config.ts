import { defineConfig } from 'vite'
import { svelte } from '@sveltejs/vite-plugin-svelte'

// https://vitejs.dev/config/
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
