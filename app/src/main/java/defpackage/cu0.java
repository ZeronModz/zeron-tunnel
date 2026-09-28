package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.v2ray.ang.Hometab;
import com.v2ray.ang.service.ServiceControl;
import com.v2ray.ang.service.b;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cu0 {
    public static NotificationCompat.Builder a;
    public static Job b;
    public static NotificationManager c;

    public static void a() {
        Service serviceB = b();
        if (serviceB == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            serviceB.stopForeground(1);
        } else {
            serviceB.stopForeground(true);
        }
        a = null;
        Job job = b;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        b = null;
        c = null;
    }

    public static Service b() {
        ServiceControl serviceControl;
        SoftReference softReference = b.d;
        if (softReference == null || (serviceControl = (ServiceControl) softReference.get()) == null) {
            return null;
        }
        return serviceControl.getService();
    }

    public static void c() {
        String str;
        Service serviceB = b();
        if (serviceB == null) {
            return;
        }
        PendingIntent activity = PendingIntent.getActivity(serviceB, 0, new Intent(serviceB, (Class<?>) Hometab.class), 201326592);
        Intent intent = new Intent("com.v2ray.ang.action.service");
        intent.setPackage("dev.zeron.tunnel");
        intent.putExtra("key", 4);
        PendingIntent broadcast = PendingIntent.getBroadcast(serviceB, 1, intent, 201326592);
        Intent intent2 = new Intent("com.v2ray.ang.action.service");
        intent2.setPackage("dev.zeron.tunnel");
        intent2.putExtra("key", 5);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(serviceB, 2, intent2, 201326592);
        if (Build.VERSION.SDK_INT >= 26) {
            n5.f();
            str = "RAY_NG_M_CH_ID";
            NotificationChannel notificationChannel = new NotificationChannel("RAY_NG_M_CH_ID", "v2rayNG Background Service", 4);
            notificationChannel.setLightColor(-12303292);
            notificationChannel.setImportance(0);
            notificationChannel.setLockscreenVisibility(0);
            NotificationManager notificationManager = c;
            if (notificationManager == null) {
                Service serviceB2 = b();
                if (serviceB2 == null) {
                    notificationManager = null;
                } else {
                    Object systemService = serviceB2.getSystemService("notification");
                    systemService.getClass();
                    notificationManager = (NotificationManager) systemService;
                    c = notificationManager;
                }
            }
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        } else {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(serviceB, str);
        builder.M.icon = R.drawable.ic_stat_name;
        Lazy lazy = zq0.a;
        builder.e = NotificationCompat.Builder.c("Connected to: " + zq0.D());
        builder.f = NotificationCompat.Builder.c(zq0.C());
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.e = NotificationCompat.Builder.c("Network: " + zq0.C());
        builder.g(bigTextStyle);
        builder.l = -2;
        builder.e(2, true);
        builder.m = false;
        builder.e(8, true);
        builder.g = activity;
        NotificationCompat.Action action = new NotificationCompat.Action(R.drawable.ic_delete_24dp, serviceB.getString(R.string.notification_action_stop_v2ray), broadcast);
        ArrayList arrayList = builder.b;
        arrayList.add(action);
        arrayList.add(new NotificationCompat.Action(R.drawable.ic_delete_24dp, serviceB.getString(R.string.title_service_restart), broadcast2));
        a = builder;
        serviceB.startForeground(1, builder.a());
    }

    public static void d(long j, String str, long j2) {
        NotificationCompat.Builder builder = a;
        if (builder != null) {
            Notification notification = builder.M;
            if ((j >= 3000 || j2 >= 3000) && j > j2) {
                notification.icon = R.drawable.ic_stat_name;
            } else {
                notification.icon = R.drawable.ic_stat_name;
            }
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            bigTextStyle.e = NotificationCompat.Builder.c(str);
            builder.g(bigTextStyle);
            NotificationCompat.Builder builder2 = a;
            if (builder2 != null) {
                builder2.f = NotificationCompat.Builder.c(str);
            }
            NotificationManager notificationManager = c;
            if (notificationManager == null) {
                Service serviceB = b();
                if (serviceB == null) {
                    notificationManager = null;
                } else {
                    Object systemService = serviceB.getSystemService("notification");
                    systemService.getClass();
                    notificationManager = (NotificationManager) systemService;
                    c = notificationManager;
                }
            }
            if (notificationManager != null) {
                NotificationCompat.Builder builder3 = a;
                notificationManager.notify(1, builder3 != null ? builder3.a() : null);
            }
        }
    }
}
