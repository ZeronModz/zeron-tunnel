package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.e;
import androidx.camera.core.impl.CameraInternal;
import androidx.concurrent.futures.b;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mc1 implements SurfaceOutput {
    public final Surface b;
    public final int c;
    public final int d;
    public final Size e;
    public final float[] f;
    public final float[] g;
    public Consumer h;
    public Executor i;
    public final oh l;
    public final b m;
    public final Matrix n;
    public final Object a = new Object();
    public boolean j = false;
    public boolean k = false;

    public mc1(Surface surface, int i, int i2, Size size, e eVar, SurfaceOutput.CameraInputInfo cameraInputInfo, Matrix matrix) {
        float[] fArr = new float[16];
        this.f = fArr;
        float[] fArr2 = new float[16];
        this.g = fArr2;
        this.b = surface;
        this.c = i;
        this.d = i2;
        this.e = size;
        this.n = matrix;
        a(fArr, new float[16], eVar);
        a(fArr2, new float[16], cameraInputInfo);
        b bVar = new b();
        bVar.c = new n31();
        oh ohVar = new oh(bVar);
        bVar.b = ohVar;
        try {
            this.m = bVar;
            bVar.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            ohVar.a(e);
        }
        this.l = ohVar;
    }

    public static void a(float[] fArr, float[] fArr2, SurfaceOutput.CameraInputInfo cameraInputInfo) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (cameraInputInfo == null) {
            return;
        }
        k02.u(fArr);
        k02.t(cameraInputInfo.e(), fArr);
        if (cameraInputInfo.d()) {
            android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeF = cg1.f(cameraInputInfo.c(), cameraInputInfo.e());
        Size sizeC = cameraInputInfo.c();
        Matrix matrixA = cg1.a(new RectF(0.0f, 0.0f, sizeC.getWidth(), sizeC.getHeight()), new RectF(0.0f, 0.0f, sizeF.getWidth(), sizeF.getHeight()), cameraInputInfo.e(), cameraInputInfo.d());
        RectF rectF = new RectF(cameraInputInfo.b());
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeF.getWidth();
        float height = ((sizeF.getHeight() - rectF.height()) - rectF.top) / sizeF.getHeight();
        float fWidth = rectF.width() / sizeF.getWidth();
        float fHeight = rectF.height() / sizeF.getHeight();
        android.opengl.Matrix.translateM(fArr, 0, width, height, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        CameraInternal cameraInternalA = cameraInputInfo.a();
        android.opengl.Matrix.setIdentityM(fArr2, 0);
        k02.u(fArr2);
        if (cameraInternalA != null) {
            jx0.g("Camera has no transform.", cameraInternalA.getHasTransform());
            k02.t(cameraInternalA.getCameraInfo().getSensorRotationDegrees(), fArr2);
            if (cameraInternalA.isFrontFacing()) {
                android.opengl.Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr2, 0, fArr2, 0);
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    public final void b() {
        Executor executor;
        Consumer consumer;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.i == null || (consumer = this.h) == null) {
                    this.j = true;
                } else if (!this.k) {
                    atomicReference.set(consumer);
                    executor = this.i;
                    this.j = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new ez0(10, this, atomicReference));
            } catch (RejectedExecutionException unused) {
                km0.e(3, km0.f("SurfaceOutputImpl"));
            }
        }
    }

    @Override // androidx.camera.core.SurfaceOutput, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.k) {
                    this.k = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.m.b(null);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final int getFormat() {
        return this.d;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final Matrix getSensorToBufferTransform() {
        return new Matrix(this.n);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final Size getSize() {
        return this.e;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final Surface getSurface(Executor executor, Consumer consumer) {
        boolean z;
        synchronized (this.a) {
            this.i = executor;
            this.h = consumer;
            z = this.j;
        }
        if (z) {
            b();
        }
        return this.b;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final int getTargets() {
        return this.c;
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final void updateTransformMatrix(float[] fArr, float[] fArr2, boolean z) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z ? this.f : this.g, 0);
    }

    @Override // androidx.camera.core.SurfaceOutput
    public final void updateTransformMatrix(float[] fArr, float[] fArr2) {
        updateTransformMatrix(fArr, fArr2, true);
    }
}
