package com.iphunt.sandoki;

import android.app.Application;
import androidx.lifecycle.r;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class AirplaneControlApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        r.i.getClass();
        r.j.f.a(new AppLifecycleObserver());
    }
}
