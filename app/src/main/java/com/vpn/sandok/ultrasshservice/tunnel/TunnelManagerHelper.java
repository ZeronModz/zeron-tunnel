package com.vpn.sandok.ultrasshservice.tunnel;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.vpn.sandok.ultrasshservice.SocksHttpService;
import defpackage.wl0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class TunnelManagerHelper {
    public static void startSocksHttp(Context context) {
        Intent intent = new Intent(context, (Class<?>) SocksHttpService.class);
        TunnelUtils.restartRotateAndRandom();
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static void stopSocksHttp(Context context) {
        Intent intent = new Intent(context, (Class<?>) SocksHttpService.class);
        intent.setAction(SocksHttpService.ACTION_STOP);
        context.startService(intent);
        wl0.a(context).c(new Intent(SocksHttpService.TUNNEL_SSH_STOP_SERVICE));
    }
}
