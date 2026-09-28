package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import com.google.zxing.DecodeHintType;
import com.journeyapps.barcodescanner.camera.CameraInstance;
import defpackage.r4;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class BarcodeView extends CameraPreview {
    public DecodeMode B;
    public BarcodeCallback C;
    public DecoderThread D;
    public DecoderFactory E;
    public Handler F;
    public final a G;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    public enum DecodeMode {
        NONE,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        this.B = DecodeMode.NONE;
        this.C = null;
        this.G = new a(this);
        j();
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    public final void c() {
        l();
        super.c();
    }

    @Override // com.journeyapps.barcodescanner.CameraPreview
    public final void d() {
        k();
    }

    public DecoderFactory getDecoderFactory() {
        return this.E;
    }

    public final Decoder i() {
        if (this.E == null) {
            this.E = new DefaultDecoderFactory();
        }
        DecoderResultPointCallback decoderResultPointCallback = new DecoderResultPointCallback();
        HashMap map = new HashMap();
        map.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, decoderResultPointCallback);
        Decoder decoderCreateDecoder = this.E.createDecoder(map);
        decoderResultPointCallback.a = decoderCreateDecoder;
        return decoderCreateDecoder;
    }

    public final void j() {
        this.E = new DefaultDecoderFactory();
        this.F = new Handler(this.G);
    }

    public final void k() {
        l();
        if (this.B == DecodeMode.NONE || !this.g) {
            return;
        }
        DecoderThread decoderThread = new DecoderThread(getCameraInstance(), i(), this.F);
        this.D = decoderThread;
        decoderThread.f = getPreviewFramingRect();
        DecoderThread decoderThread2 = this.D;
        decoderThread2.getClass();
        Util.a();
        HandlerThread handlerThread = new HandlerThread("DecoderThread");
        decoderThread2.b = handlerThread;
        handlerThread.start();
        decoderThread2.c = new Handler(decoderThread2.b.getLooper(), decoderThread2.i);
        decoderThread2.g = true;
        CameraInstance cameraInstance = decoderThread2.a;
        cameraInstance.h.post(new r4(11, cameraInstance, decoderThread2.j));
    }

    public final void l() {
        DecoderThread decoderThread = this.D;
        if (decoderThread != null) {
            Util.a();
            synchronized (decoderThread.h) {
                decoderThread.g = false;
                decoderThread.c.removeCallbacksAndMessages(null);
                decoderThread.b.quit();
            }
            this.D = null;
        }
    }

    public void setDecoderFactory(DecoderFactory decoderFactory) {
        Util.a();
        this.E = decoderFactory;
        DecoderThread decoderThread = this.D;
        if (decoderThread != null) {
            decoderThread.d = i();
        }
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = DecodeMode.NONE;
        this.C = null;
        this.G = new a(this);
        j();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = DecodeMode.NONE;
        this.C = null;
        this.G = new a(this);
        j();
    }
}
