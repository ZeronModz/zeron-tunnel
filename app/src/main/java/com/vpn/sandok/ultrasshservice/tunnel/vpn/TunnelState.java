package com.vpn.sandok.ultrasshservice.tunnel.vpn;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class TunnelState {
    private static TunnelState m_tunnelState;
    private TunnelVpnManager m_tunnelManager = null;
    private boolean m_startingTunnelManager = false;

    private TunnelState() {
    }

    public static synchronized TunnelState getTunnelState() {
        TunnelState tunnelState;
        tunnelState = m_tunnelState;
        if (tunnelState == null) {
            tunnelState = new TunnelState();
            m_tunnelState = tunnelState;
        }
        return tunnelState;
    }

    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public synchronized boolean getStartingTunnelManager() {
        return this.m_startingTunnelManager;
    }

    public synchronized TunnelVpnManager getTunnelManager() {
        return this.m_tunnelManager;
    }

    public synchronized void setStartingTunnelManager() {
        this.m_startingTunnelManager = true;
    }

    public synchronized void setTunnelManager(TunnelVpnManager tunnelVpnManager) {
        this.m_tunnelManager = tunnelVpnManager;
        this.m_startingTunnelManager = false;
    }
}
