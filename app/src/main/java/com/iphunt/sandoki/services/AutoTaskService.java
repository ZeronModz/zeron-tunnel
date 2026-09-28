package com.iphunt.sandoki.services;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos$Edition;
import dev.zeron.tunnel.R;
import com.iphunt.sandoki.services.AutoTaskService;
import com.iphunt.sandoki.ui.AirplaneModeActivity;
import com.iphunt.sandoki.ui.TransparentActivity;
import defpackage.ii2;
import defpackage.ja;
import defpackage.k5;
import defpackage.vh;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class AutoTaskService extends Service {
    public static final /* synthetic */ int c = 0;
    public final Handler a = new Handler(Looper.getMainLooper());
    public ja b;

    public final void a(String str) {
        Intent intent = new Intent(this, (Class<?>) TransparentActivity.class);
        intent.addFlags(402718720);
        intent.putExtra("command", str);
        startActivity(intent);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        ja jaVar = this.b;
        if (jaVar != null) {
            this.a.removeCallbacks(jaVar);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Handler handler = this.a;
        final int i3 = 0;
        final int i4 = 1;
        if (intent != null && intent.hasExtra("command") && "timed_toggle".equals(intent.getStringExtra("command"))) {
            String stringExtra = intent.getStringExtra("mode");
            boolean zEquals = "secure".equals(stringExtra);
            if (stringExtra == null) {
                zEquals = getSharedPreferences("airplane_mode_prefs", 0).getBoolean("control_mode_secure", false);
            }
            if (!zEquals) {
                a("smart_toggle");
                handler.postDelayed(new Runnable(this) { // from class: ia
                    public final /* synthetic */ AutoTaskService b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i3;
                        AutoTaskService autoTaskService = this.b;
                        switch (i5) {
                            case 0:
                                int i6 = AutoTaskService.c;
                                autoTaskService.a("smart_toggle");
                                break;
                            default:
                                int i7 = AutoTaskService.c;
                                try {
                                    ii2.u(autoTaskService, false);
                                    ii2.m(autoTaskService);
                                } catch (Throwable unused) {
                                    return;
                                }
                                break;
                        }
                    }
                }, 2000L);
                return 2;
            }
            try {
                ii2.m(this);
                ii2.u(this, true);
                handler.postDelayed(new Runnable(this) { // from class: ia
                    public final /* synthetic */ AutoTaskService b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i4;
                        AutoTaskService autoTaskService = this.b;
                        switch (i5) {
                            case 0:
                                int i6 = AutoTaskService.c;
                                autoTaskService.a("smart_toggle");
                                break;
                            default:
                                int i7 = AutoTaskService.c;
                                try {
                                    ii2.u(autoTaskService, false);
                                    ii2.m(autoTaskService);
                                } catch (Throwable unused) {
                                    return;
                                }
                                break;
                        }
                    }
                }, 2000L);
            } catch (Throwable unused) {
            }
            return 2;
        }
        SharedPreferences sharedPreferences = getSharedPreferences("airplane_mode_prefs", 0);
        boolean z = sharedPreferences.getBoolean("control_mode_secure", false);
        int intExtra = sharedPreferences.getInt("toggle_interval", 1);
        if (intent != null && intent.hasExtra("interval_minutes")) {
            intExtra = intent.getIntExtra("interval_minutes", intExtra);
        }
        long j = 60000 * ((long) intExtra);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("auto_task_channel", "自动任务", 2);
            notificationChannel.setDescription("飞行模式自动定时切换");
            NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        boolean z2 = k5.a(this, "android.permission.WRITE_SECURE_SETTINGS") == 0;
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) AirplaneModeActivity.class), 67108864);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "auto_task_channel");
        builder.e = NotificationCompat.Builder.c("飞行模式自动任务");
        StringBuilder sbV = vh.v(intExtra, "每 ", " 分钟切换一次 · WSS权限:");
        sbV.append(z2 ? "已授权" : "未授权");
        builder.f = NotificationCompat.Builder.c(sbV.toString());
        builder.M.icon = R.drawable.icon;
        builder.g = activity;
        builder.e(2, true);
        startForeground(DescriptorProtos$Edition.EDITION_2024_VALUE, builder.a());
        ja jaVar = this.b;
        if (jaVar != null) {
            handler.removeCallbacks(jaVar);
        }
        ja jaVar2 = new ja(this, z, j, 0);
        this.b = jaVar2;
        handler.post(jaVar2);
        return 1;
    }
}
