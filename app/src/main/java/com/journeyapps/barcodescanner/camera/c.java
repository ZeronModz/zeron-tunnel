package com.journeyapps.barcodescanner.camera;

import android.hardware.Camera;
import dev.zeron.tunnel.R;
import defpackage.zk3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Runnable {
    public final /* synthetic */ CameraInstance a;

    public c(CameraInstance cameraInstance) {
        this.a = cameraInstance;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            CameraManager cameraManager = this.a.c;
            AutoFocusManager autoFocusManager = cameraManager.c;
            if (autoFocusManager != null) {
                autoFocusManager.a = true;
                autoFocusManager.b = false;
                autoFocusManager.e.removeMessages(1);
                if (autoFocusManager.c) {
                    try {
                        autoFocusManager.d.cancelAutoFocus();
                    } catch (RuntimeException unused) {
                    }
                }
                cameraManager.c = null;
            }
            if (cameraManager.d != null) {
                cameraManager.d = null;
            }
            Camera camera = cameraManager.a;
            if (camera != null && cameraManager.e) {
                camera.stopPreview();
                cameraManager.m.a = null;
                cameraManager.e = false;
            }
            CameraManager cameraManager2 = this.a.c;
            Camera camera2 = cameraManager2.a;
            if (camera2 != null) {
                camera2.release();
                cameraManager2.a = null;
            }
        } catch (Exception unused2) {
        }
        CameraInstance cameraInstance = this.a;
        cameraInstance.g = true;
        cameraInstance.d.sendEmptyMessage(R.id.zxing_camera_closed);
        zk3 zk3Var = this.a.a;
        synchronized (zk3Var.e) {
            try {
                int i = zk3Var.b - 1;
                zk3Var.b = i;
                if (i == 0) {
                    zk3Var.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
