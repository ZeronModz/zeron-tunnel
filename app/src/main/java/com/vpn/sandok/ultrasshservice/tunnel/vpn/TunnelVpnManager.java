package com.vpn.sandok.ultrasshservice.tunnel.vpn;

import android.content.Context;
import android.content.Intent;
import android.net.VpnService;
import dev.zeron.tunnel.R;
import com.vpn.sandok.ultrasshservice.config.Settings;
import com.vpn.sandok.ultrasshservice.config.SettingsConstants;
import com.vpn.sandok.ultrasshservice.logger.SkStatus;
import com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class TunnelVpnManager implements Tunnel.HostService {
    private static final String TAG = "TunnelManager";
    public static final String VPN_SETTINGS = "vpnSettings";
    private TunnelVpnSettings mSettings;
    private TunnelVpnService m_parentService;
    private Tunnel m_tunnel;
    private Thread m_tunnelThread;
    private CountDownLatch m_tunnelThreadStopSignal;
    private AtomicBoolean m_isStopping = new AtomicBoolean(false);
    private AtomicBoolean m_isReconnecting = new AtomicBoolean(false);

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public interface ManagerListener {
        void onLog(String str);
    }

    public TunnelVpnManager(TunnelVpnService tunnelVpnService) {
        this.m_tunnel = null;
        this.m_parentService = tunnelVpnService;
        this.m_tunnel = Tunnel.newTunnel(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[PHI: r12
      0x0041: PHI (r12v7 com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel) = (r12v2 com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel), (r12v10 com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel) binds: [B:23:0x0075, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void runTunnel(java.lang.String r11, java.lang.String[] r12, boolean r13, java.lang.String r14, boolean r15) {
        /*
            r10 = this;
            java.lang.String r1 = "Start tunnel failed: "
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.m_isStopping
            r2 = 0
            r0.set(r2)
            r3 = 1
            com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel r4 = r10.m_tunnel     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            boolean r11 = r4.startTunneling(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            if (r11 == 0) goto L54
            com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnService r11 = r10.m_parentService     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r11.broadcastVpnStart(r3)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            java.util.concurrent.CountDownLatch r11 = r10.m_tunnelThreadStopSignal     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24 java.lang.InterruptedException -> L27
            r11.await()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24 java.lang.InterruptedException -> L27
            goto L2e
        L21:
            r0 = move-exception
            r11 = r0
            goto L79
        L24:
            r0 = move-exception
            r11 = r0
            goto L5c
        L27:
            java.lang.Thread r11 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r11.interrupt()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
        L2e:
            java.util.concurrent.atomic.AtomicBoolean r11 = r10.m_isStopping     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r11.set(r3)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            java.util.concurrent.atomic.AtomicBoolean r11 = r10.m_isReconnecting
            boolean r11 = r11.get()
            com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel r12 = r10.m_tunnel
            if (r11 == 0) goto L41
        L3d:
            r12.stopTunneling()
            goto L4e
        L41:
            r12.stop()
            com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnService r11 = r10.m_parentService
            r11.stopForeground(r3)
            com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnService r11 = r10.m_parentService
            r11.stopSelf()
        L4e:
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.m_isReconnecting
            r10.set(r2)
            goto L78
        L54:
            java.lang.Exception r11 = new java.lang.Exception     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            java.lang.String r12 = "application is not prepared or revoked"
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            throw r11     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
        L5c:
            java.lang.String r11 = r11.getMessage()     // Catch: java.lang.Throwable -> L21
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21
            r12.<init>(r1)     // Catch: java.lang.Throwable -> L21
            r12.append(r11)     // Catch: java.lang.Throwable -> L21
            com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnService r11 = r10.m_parentService     // Catch: java.lang.Throwable -> L21
            r11.broadcastVpnStart(r2)     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicBoolean r11 = r10.m_isReconnecting
            boolean r11 = r11.get()
            com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel r12 = r10.m_tunnel
            if (r11 == 0) goto L41
            goto L3d
        L78:
            return
        L79:
            java.util.concurrent.atomic.AtomicBoolean r12 = r10.m_isReconnecting
            boolean r12 = r12.get()
            com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel r13 = r10.m_tunnel
            if (r12 == 0) goto L87
            r13.stopTunneling()
            goto L94
        L87:
            r13.stop()
            com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnService r12 = r10.m_parentService
            r12.stopForeground(r3)
            com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnService r12 = r10.m_parentService
            r12.stopSelf()
        L94:
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.m_isReconnecting
            r10.set(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnManager.runTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void");
    }

    private void startTunnel() {
        this.m_tunnelThreadStopSignal = new CountDownLatch(1);
        Thread thread = new Thread(new Runnable() { // from class: com.vpn.sandok.ultrasshservice.tunnel.vpn.TunnelVpnManager.1
            @Override // java.lang.Runnable
            public void run() {
                TunnelVpnManager tunnelVpnManager = TunnelVpnManager.this;
                tunnelVpnManager.runTunnel(tunnelVpnManager.mSettings.mSocksServer, TunnelVpnManager.this.mSettings.mDnsResolver, TunnelVpnManager.this.mSettings.mDnsForward, TunnelVpnManager.this.mSettings.mUdpResolver, TunnelVpnManager.this.mSettings.mUdpDnsRelay);
            }
        });
        this.m_tunnelThread = thread;
        thread.start();
    }

    @Override // com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel.HostService
    public String getAppName() {
        return getContext().getString(R.string.app_name);
    }

    @Override // com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel.HostService
    public Context getContext() {
        return this.m_parentService;
    }

    @Override // com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel.HostService
    public VpnService.Builder newVpnServiceBuilder() {
        return this.m_parentService.newBuilder();
    }

    public void onDestroy() {
        if (this.m_tunnelThread == null) {
            return;
        }
        signalStopService();
        try {
            this.m_tunnelThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.m_tunnelThreadStopSignal = null;
        this.m_tunnelThread = null;
    }

    @Override // com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel.HostService
    public void onDiagnosticMessage(String str) {
        if (new Settings(getContext()).getPrefsPrivate().getBoolean(SettingsConstants.CONFIG_PROTEGER_KEY, false)) {
            for (String str2 : this.mSettings.mExcludeIps) {
                str = str.replace(str2, "********");
            }
        }
        SkStatus.logInfo(str);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            this.m_parentService.broadcastVpnStart(false);
            return 0;
        }
        TunnelVpnSettings tunnelVpnSettings = (TunnelVpnSettings) intent.getParcelableExtra(VPN_SETTINGS);
        this.mSettings = tunnelVpnSettings;
        if (tunnelVpnSettings == null) {
            this.m_parentService.broadcastVpnStart(false);
            return 0;
        }
        if (tunnelVpnSettings.mSocksServer == null) {
            this.m_parentService.broadcastVpnStart(false);
            return 0;
        }
        if (tunnelVpnSettings.mDnsResolver == null) {
            this.m_parentService.broadcastVpnStart(false);
            return 0;
        }
        try {
            if (this.m_tunnel.startRouting(tunnelVpnSettings)) {
                return 2;
            }
            this.m_parentService.broadcastVpnStart(false);
            return 2;
        } catch (Exception e) {
            new StringBuilder("Failed to establish VPN: ").append(e.getMessage());
            this.m_parentService.broadcastVpnStart(false);
            return 2;
        }
    }

    @Override // com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel.HostService
    public void onVpnEstablished() {
        startTunnel();
    }

    public void restartTunnel(String str) {
        if (str == null || str.equals(this.mSettings.mSocksServer)) {
            this.m_parentService.broadcastVpnStart(true);
            return;
        }
        this.mSettings.mSocksServer = str;
        this.m_isReconnecting.set(true);
        signalStopService();
    }

    public void signalStopService() {
        CountDownLatch countDownLatch = this.m_tunnelThreadStopSignal;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel.HostService
    public VpnService getVpnService() {
        return this.m_parentService;
    }

    @Override // com.vpn.sandok.ultrasshservice.tunnel.vpn.Tunnel.HostService
    public void onTunnelConnected() {
    }
}
