import { useEffect, useState } from 'react'

const ANC_API_URL = import.meta.env.VITE_ANC_API_URL ?? ''

interface MenuMessage {
  message: string
}

export default function AncMenu() {
  const [message, setMessage] = useState<string | null>(null)

  useEffect(() => {
    fetch(`${ANC_API_URL}/api/anc/menu`)
      .then((res) => (res.ok ? (res.json() as Promise<MenuMessage>) : null))
      .then((data) => { if (data) setMessage(data.message) })
      .catch(() => setMessage('Menù'))
  }, [])

  return <span>{message ?? '...'}</span>
}
