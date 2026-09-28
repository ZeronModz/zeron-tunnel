package com.journeyapps.barcodescanner;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import defpackage.m9;
import defpackage.rb0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class DecoderThread {
    public final CameraInstance a;
    public HandlerThread b;
    public Handler c;
    public Decoder d;
    public final Handler e;
    public Rect f;
    public boolean g = false;
    public final Object h = new Object();
    public final m9 i = new m9(this, 1);
    public final rb0 j = new rb0(this, 5);

    public DecoderThread(CameraInstance cameraInstance, Decoder decoder, Handler handler) {
        Util.a();
        this.a = cameraInstance;
        this.d = decoder;
        this.e = handler;
    }
}
