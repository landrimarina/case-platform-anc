import { defineConfig, loadEnv } from 'vite'
import react from '@vitejs/plugin-react'
import { federation } from '@module-federation/vite'

export default defineConfig(({ mode }) => {
  const env = loadEnv(mode, process.cwd(), '')
  return {
  plugins: [
    react(),
    federation({
      name: 'anc_mfe',
      filename: 'remoteEntry.js',
      exposes: {
        './AncHome': './src/exposed/AncHome',
        './AncMenu': './src/exposed/AncMenu',
      },
      shared: {
        react: { singleton: true, requiredVersion: '^19.0.0' },
        'react-dom': { singleton: true, requiredVersion: '^19.0.0' },
      },
    }),
  ],
  server: {
    port: parseInt(env.PORT),
    cors: true,
    headers: {
      'Access-Control-Allow-Origin': '*',
    },
  },
  // base path where the MFE assets are served — must match the APISIX/proxy route prefix
  base: env.ANC_MFE_BASE,
  build: {
    target: 'esnext',
  },
  }
})
