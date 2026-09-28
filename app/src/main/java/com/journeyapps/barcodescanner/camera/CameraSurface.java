package com.journeyapps.barcodescanner.camera;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import defpackage.u7;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class CameraSurface {
    public final SurfaceHolder a;
    public final SurfaceTexture b;

    public CameraSurface(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.a = surfaceHolder;
        } else {
            u7.r("surfaceHolder may not be null");
            throw null;
        }
    }

    public CameraSurface(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.b = surfaceTexture;
        } else {
            u7.r("surfaceTexture may not be null");
            throw null;
        }
    }
}
