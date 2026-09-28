package defpackage;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.f;
import androidx.camera.view.l;
import androidx.core.util.Consumer;
import defpackage.km0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tc1 implements SurfaceHolder.Callback {
    public Size a;
    public SurfaceRequest b;
    public SurfaceRequest c;
    public f d;
    public Size e;
    public boolean f = false;
    public boolean g = false;
    public final /* synthetic */ l h;

    public tc1(l lVar) {
        this.h = lVar;
    }

    public final void a() {
        SurfaceRequest surfaceRequest = this.b;
        if (surfaceRequest != null) {
            Objects.toString(surfaceRequest);
            km0.a("SurfaceViewImpl");
            this.b.d();
        }
    }

    public final boolean b() {
        l lVar = this.h;
        Surface surface = lVar.e.getHolder().getSurface();
        if (this.f || this.b == null || !Objects.equals(this.a, this.e)) {
            return false;
        }
        km0.a("SurfaceViewImpl");
        final f fVar = this.d;
        SurfaceRequest surfaceRequest = this.b;
        Objects.requireNonNull(surfaceRequest);
        surfaceRequest.b(surface, k5.n(lVar.e.getContext()), new Consumer() { // from class: androidx.camera.view.k
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                km0.a("SurfaceViewImpl");
                PreviewViewImplementation$OnSurfaceNotInUseListener previewViewImplementation$OnSurfaceNotInUseListener = fVar;
                if (previewViewImplementation$OnSurfaceNotInUseListener != null) {
                    previewViewImplementation$OnSurfaceNotInUseListener.onSurfaceNotInUse();
                }
            }
        });
        this.f = true;
        lVar.d = true;
        lVar.f();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        km0.a("SurfaceViewImpl");
        this.e = new Size(i2, i3);
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceRequest surfaceRequest;
        km0.a("SurfaceViewImpl");
        if (!this.g || (surfaceRequest = this.c) == null) {
            return;
        }
        surfaceRequest.d();
        surfaceRequest.j.b(null);
        this.c = null;
        this.g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        km0.a("SurfaceViewImpl");
        if (this.f) {
            SurfaceRequest surfaceRequest = this.b;
            if (surfaceRequest != null) {
                Objects.toString(surfaceRequest);
                km0.a("SurfaceViewImpl");
                this.b.l.a();
            }
        } else {
            a();
        }
        this.g = true;
        SurfaceRequest surfaceRequest2 = this.b;
        if (surfaceRequest2 != null) {
            this.c = surfaceRequest2;
        }
        this.f = false;
        this.b = null;
        this.d = null;
        this.e = null;
        this.a = null;
    }
}
