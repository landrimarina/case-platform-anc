import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import AncHome from './exposed/AncHome'

// Standalone entry point (dev only, not used when embedded in Shell)
createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <AncHome />
  </StrictMode>,
)
