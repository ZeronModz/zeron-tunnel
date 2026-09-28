package com.journeyapps.barcodescanner;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import dev.zeron.tunnel.R;
import com.journeyapps.barcodescanner.camera.DisplayConfiguration;
import defpackage.u7;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Handler.Callback {
    public final /* synthetic */ CameraPreview a;

    public b(CameraPreview cameraPreview) {
        this.a = cameraPreview;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        DisplayConfiguration displayConfiguration;
        CameraPreview cameraPreview = this.a;
        c cVar = cameraPreview.z;
        int i = message.what;
        if (i != R.id.zxing_prewiew_size_ready) {
            if (i != R.id.zxing_camera_error) {
                if (i == R.id.zxing_camera_closed) {
                    cVar.cameraClosed();
                }
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (cameraPreview.a != null) {
                cameraPreview.c();
                cVar.cameraError(exc);
            }
            return false;
        }
        Size size = (Size) message.obj;
        int i2 = CameraPreview.A;
        cameraPreview.n = size;
        Size size2 = cameraPreview.m;
        if (size2 == null) {
            return true;
        }
        if (size == null || (displayConfiguration = cameraPreview.k) == null) {
            cameraPreview.r = null;
            cameraPreview.q = null;
            cameraPreview.o = null;
            u7.p("containerSize or previewSize is not set yet");
            return false;
        }
        int i3 = size.a;
        int i4 = size.b;
        int i5 = size2.a;
        int i6 = size2.b;
        Rect rectC = displayConfiguration.c.c(size, displayConfiguration.a);
        if (rectC.width() > 0 && rectC.height() > 0) {
            cameraPreview.o = rectC;
            Rect rect = new Rect(0, 0, i5, i6);
            Rect rect2 = cameraPreview.o;
            Rect rect3 = new Rect(rect);
            rect3.intersect(rect2);
            if (cameraPreview.s != null) {
                rect3.inset(Math.max(0, (rect3.width() - cameraPreview.s.a) / 2), Math.max(0, (rect3.height() - cameraPreview.s.b) / 2));
            } else {
                int iMin = (int) Math.min(((double) rect3.width()) * cameraPreview.t, ((double) rect3.height()) * cameraPreview.t);
                rect3.inset(iMin, iMin);
                if (rect3.height() > rect3.width()) {
                    rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                }
            }
            cameraPreview.q = rect3;
            Rect rect4 = new Rect(cameraPreview.q);
            Rect rect5 = cameraPreview.o;
            rect4.offset(-rect5.left, -rect5.top);
            Rect rect6 = new Rect((rect4.left * i3) / cameraPreview.o.width(), (rect4.top * i4) / cameraPreview.o.height(), (rect4.right * i3) / cameraPreview.o.width(), (rect4.bottom * i4) / cameraPreview.o.height());
            cameraPreview.r = rect6;
            if (rect6.width() <= 0 || cameraPreview.r.height() <= 0) {
                cameraPreview.r = null;
                cameraPreview.q = null;
            } else {
                cVar.previewSized();
            }
        }
        cameraPreview.requestLayout();
        cameraPreview.h();
        return true;
    }
}
