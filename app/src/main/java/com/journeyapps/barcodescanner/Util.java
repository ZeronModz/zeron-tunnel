package com.journeyapps.barcodescanner;

import android.os.Looper;
import defpackage.u7;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class Util {
    public static void a() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        u7.p("Must be called from the main thread.");
    }
}
