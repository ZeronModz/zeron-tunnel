package com.iphunt.sandoki;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.iphunt.sandoki.services.AutoTaskService;
import defpackage.i5;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class BootCompletedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("airplane_mode_prefs", 0);
            boolean z = sharedPreferences.getBoolean("auto_toggle_enabled", false);
            int i = sharedPreferences.getInt("toggle_interval", 1);
            if (z) {
                Intent intent2 = new Intent(context.getApplicationContext(), (Class<?>) AutoTaskService.class);
                intent2.putExtra("interval_minutes", i);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 26) {
                    context.getApplicationContext().startService(intent2);
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                if (i2 >= 26) {
                    i5.C(applicationContext, intent2);
                } else {
                    applicationContext.startService(intent2);
                }
            }
        } catch (Exception unused) {
        }
    }
}
