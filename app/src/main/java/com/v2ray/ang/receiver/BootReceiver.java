package com.v2ray.ang.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.v2ray.ang.service.b;
import defpackage.yg0;
import defpackage.zq0;
import kotlin.Lazy;
import kotlin.Metadata;
import libv2ray.CoreController;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/v2ray/ang/receiver/BootReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String strX;
        if (context != null) {
            if (yg0.a(intent != null ? intent.getAction() : null, "android.intent.action.BOOT_COMPLETED")) {
                Lazy lazy = zq0.a;
                if (!zq0.z().b("pref_is_booted", false) || (strX = zq0.x()) == null || strX.length() == 0) {
                    return;
                }
                CoreController coreController = b.a;
                b.b(context);
            }
        }
    }
}
