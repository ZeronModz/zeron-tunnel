package com.journeyapps.barcodescanner.camera;

import android.hardware.Camera;
import android.os.Handler;
import defpackage.m9;
import defpackage.n9;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class AutoFocusManager {
    public static final ArrayList g;
    public boolean a;
    public boolean b;
    public final boolean c;
    public final Camera d;
    public final Handler e;
    public final n9 f;

    static {
        ArrayList arrayList = new ArrayList(2);
        g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public AutoFocusManager(Camera camera, CameraSettings cameraSettings) {
        m9 m9Var = new m9(this, 0);
        this.f = new n9(this);
        this.e = new Handler(m9Var);
        this.d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        cameraSettings.getClass();
        this.c = g.contains(focusMode);
        this.a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.a && !this.e.hasMessages(1)) {
            Handler handler = this.e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    public final void b() {
        if (!this.c || this.a || this.b) {
            return;
        }
        try {
            this.d.autoFocus(this.f);
            this.b = true;
        } catch (RuntimeException unused) {
            a();
        }
    }
}
