package com.vpn.sandok.ultrasshservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vpn.sandok.ultrasshservice.tunnel.TunnelManagerHelper;
import defpackage.wl0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class MainReceiver extends BroadcastReceiver {
    public static final String ACTION_SERVICE_RESTART = "sshTunnelServiceRestsrt";
    public static final String ACTION_SERVICE_STOP = "sshtunnelservicestop";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        if (action.equals(ACTION_SERVICE_STOP)) {
            TunnelManagerHelper.stopSocksHttp(context);
        } else if (action.equals(ACTION_SERVICE_RESTART)) {
            wl0.a(context).c(new Intent(SocksHttpService.TUNNEL_SSH_RESTART_SERVICE));
        }
    }
}
