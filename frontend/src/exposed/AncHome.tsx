import { useEffect, useState } from 'react'

const ANC_API_URL = import.meta.env.VITE_ANC_API_URL ?? ''

interface HomePageMessage {
  message: string
}

export default function AncHome() {
  const [message, setMessage] = useState<string | null>(null)
  const [error, setError] = useState<string | null>(null)

  useEffect(() => {
    fetch(`${ANC_API_URL}/api/anc/home`)
      .then((res) => {
        if (!res.ok) throw new Error(`HTTP ${res.status}`)
        return res.json() as Promise<HomePageMessage>
      })
      .then((data) => setMessage(data.message))
      .catch((err: unknown) => setError(err instanceof Error ? err.message : 'Errore sconosciuto'))
  }, [])

  return (
    <div style={{ padding: '2rem' }}>
      <h1>ANC</h1>
      {error && <p style={{ color: 'red' }}>Errore: {error}</p>}
      {!error && !message && <p>Caricamento...</p>}
      {message && <p data-testid="anc-message">{message}</p>}
    </div>
  )
}
