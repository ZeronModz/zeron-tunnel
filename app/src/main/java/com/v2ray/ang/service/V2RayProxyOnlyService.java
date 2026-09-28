package com.v2ray.ang.service;

import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.IBinder;
import com.v2ray.ang.util.MyContextWrapper;
import defpackage.l71;
import java.lang.ref.SoftReference;
import java.util.Locale;
import kotlin.Metadata;
import libv2ray.CoreController;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/v2ray/ang/service/V2RayProxyOnlyService;", "Landroid/app/Service;", "Lcom/v2ray/ang/service/ServiceControl;", "<init>", "()V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class V2RayProxyOnlyService extends Service implements ServiceControl {
    @Override // android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ContextWrapper contextWrapperA;
        if (context != null) {
            MyContextWrapper.Companion companion = MyContextWrapper.a;
            Locale localeB = l71.b();
            companion.getClass();
            contextWrapperA = MyContextWrapper.Companion.a(context, localeB);
        } else {
            contextWrapperA = null;
        }
        super.attachBaseContext(contextWrapperA);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        CoreController coreController = b.a;
        b.a(new SoftReference(this));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        CoreController coreController = b.a;
        b.f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        CoreController coreController = b.a;
        b.c();
        return 1;
    }

    @Override // com.v2ray.ang.service.ServiceControl
    public final void stopService() {
        stopSelf();
    }

    @Override // com.v2ray.ang.service.ServiceControl
    public final boolean vpnProtect(int i) {
        return true;
    }

    @Override // com.v2ray.ang.service.ServiceControl
    public final Service getService() {
        return this;
    }

    @Override // com.v2ray.ang.service.ServiceControl
    public final void startService() {
    }
}
