package com.v2ray.ang.util;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import dev.zeron.tunnel.R;
import defpackage.n5;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ProxyService extends Service {
    public int a;
    public ServerThreadTask b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public class ServerThreadTask extends Thread {
        public final int a;

        public ServerThreadTask(ProxyService proxyService, int i) {
            this.a = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                ServerSocket serverSocket = new ServerSocket(this.a);
                while (!Thread.interrupted()) {
                    Socket socketAccept = serverSocket.accept();
                    System.out.println("Socket accepted");
                    new ClientSocketHandler(socketAccept).start();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.b.interrupt();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            return 2;
        }
        this.a = intent.getIntExtra("port", 8080);
        Intent intent2 = new Intent(this, (Class<?>) MainActivityWifi.class);
        int i3 = Build.VERSION.SDK_INT;
        PendingIntent activity = PendingIntent.getActivity(this, 0, intent2, i3 >= 31 ? 67108864 : 0);
        if (i3 >= 26) {
            n5.f();
            NotificationChannel notificationChannel = new NotificationChannel(getPackageName(), "ProxyService", 4);
            notificationChannel.setDescription(getString(R.string.app_name) + ": Tethering");
            notificationChannel.enableLights(true);
            notificationChannel.setLightColor(-16776961);
            notificationChannel.enableVibration(true);
            notificationChannel.setLockscreenVisibility(1);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, getPackageName());
        builder.e(2, true);
        builder.M.icon = R.drawable.icon;
        builder.e = NotificationCompat.Builder.c(getString(R.string.app_name) + ": HotSpot");
        builder.f = NotificationCompat.Builder.c(getString(R.string.app_name) + ": HotSpot service is running");
        builder.g = activity;
        builder.l = 1;
        builder.A = "service";
        builder.d(-1);
        startForeground(1, builder.a());
        ServerThreadTask serverThreadTask = new ServerThreadTask(this, this.a);
        this.b = serverThreadTask;
        serverThreadTask.setDaemon(true);
        this.b.start();
        return super.onStartCommand(intent, i, i2);
    }
}
