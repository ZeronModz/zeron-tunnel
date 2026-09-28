package com.vpn.sandok.ultrasshservice.tunnel.vpn;

import android.content.Intent;
import android.net.VpnService;
import android.os.Binder;
import android.os.IBinder;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import defpackage.wl0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class TunnelVpnService extends VpnService {
    private static final String LOG_TAG = "TunnelVpnService";
    public static final String TUNNEL_VPN_DISCONNECT_BROADCAST = "tunnelVpnDisconnectBroadcast";
    public static final String TUNNEL_VPN_START_BROADCAST = "tunnelVpnStartBroadcast";
    public static final String TUNNEL_VPN_START_SUCCESS_EXTRA = "tunnelVpnStartSuccessExtra";
    private TunnelVpnManager m_tunnelManager = new TunnelVpnManager(this);
    private final IBinder m_binder = new LocalBinder();

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class LocalBinder extends Binder {
        public LocalBinder() {
        }

        public TunnelVpnService getService() {
            return TunnelVpnService.this;
        }
    }

    private void dispatchBroadcast(Intent intent) {
        wl0.a(this).c(intent);
    }

    public void broadcastVpnDisconnect() {
        dispatchBroadcast(new Intent(TUNNEL_VPN_DISCONNECT_BROADCAST));
    }

    public void broadcastVpnStart(boolean z) {
        Intent intent = new Intent(TUNNEL_VPN_START_BROADCAST);
        intent.putExtra(TUNNEL_VPN_START_SUCCESS_EXTRA, z);
        dispatchBroadcast(intent);
    }

    public VpnService.Builder newBuilder() {
        return new VpnService.Builder(this);
    }

    @Override // android.net.VpnService, android.app.Service
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        return (action == null || !action.equals("android.net.VpnService")) ? this.m_binder : super.onBind(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        TunnelState.getTunnelState().setTunnelManager(this.m_tunnelManager);
    }

    @Override // android.app.Service
    public void onDestroy() {
        TunnelState.getTunnelState().setTunnelManager(null);
        this.m_tunnelManager.onDestroy();
    }

    @Override // android.net.VpnService
    public void onRevoke() {
        SkStatus.logInfo("<strong>VPN service revoked</strong>");
        broadcastVpnDisconnect();
        stopSelf();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null || !"STOP".equals(intent.getAction())) {
            return this.m_tunnelManager.onStartCommand(intent, i, i2);
        }
        broadcastVpnDisconnect();
        stopSelf();
        return 2;
    }
}
