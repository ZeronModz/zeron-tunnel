package com.v2ray.ang;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.core.app.n;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.internal.view.SupportMenu;
import dev.zeron.tunnel.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.NotificationParams;
import com.google.firebase.messaging.RemoteMessage;
import defpackage.bu0;
import defpackage.kx;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void d(RemoteMessage remoteMessage) {
        IconCompat iconCompat;
        Bundle bundle = remoteMessage.a;
        if (remoteMessage.c == null && NotificationParams.j(bundle)) {
            remoteMessage.c = new kx(new NotificationParams(bundle));
        }
        kx kxVar = remoteMessage.c;
        ArrayMap arrayMap = remoteMessage.b;
        if (arrayMap == null) {
            arrayMap = new ArrayMap();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(TypedValues.TransitionType.S_FROM) && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            remoteMessage.b = arrayMap;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("fcm_default", "FCM Messages", 4);
            notificationChannel.setDescription("Firebase push notifications");
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(SupportMenu.CATEGORY_MASK);
            notificationChannel.enableVibration(true);
            notificationChannel.setVibrationPattern(new long[]{150, 250, 150, 250});
            notificationChannel.setShowBadge(true);
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent(this, (Class<?>) Hometab.class);
        intent.addFlags(67108864);
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 201326592);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "fcm_default");
        Notification notification = builder.M;
        notification.icon = R.drawable.icon;
        String str3 = kxVar.b;
        String str4 = kxVar.c;
        builder.e = NotificationCompat.Builder.c(str3);
        builder.f = NotificationCompat.Builder.c(str4);
        builder.e(16, true);
        builder.C = Color.parseColor("#3F51B5");
        builder.g = activity;
        notification.sound = RingtoneManager.getDefaultUri(2);
        notification.audioStreamType = -1;
        notification.audioAttributes = n.a(n.e(n.c(n.b(), 4), 5));
        builder.l = 1;
        builder.f(BitmapFactory.decodeResource(getResources(), R.drawable.icon));
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.e = NotificationCompat.Builder.c(str4);
        builder.g(bigTextStyle);
        try {
            String str5 = (String) arrayMap.get("picture");
            if (str5 != null && !str5.isEmpty()) {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str5).openConnection().getInputStream());
                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                if (bitmapDecodeStream == null) {
                    iconCompat = null;
                } else {
                    IconCompat iconCompat2 = new IconCompat(1);
                    iconCompat2.b = bitmapDecodeStream;
                    iconCompat = iconCompat2;
                }
                bigPictureStyle.e = iconCompat;
                bigPictureStyle.c = NotificationCompat.Builder.c(str4);
                bigPictureStyle.d = true;
                builder.g(bigPictureStyle);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        new bu0(this).b((int) System.currentTimeMillis(), builder.a());
    }
}
