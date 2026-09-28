package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.util.GLUtils$SamplerShaderProgram;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Triple;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class tv implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    public final OpenGlRenderer a;
    public final HandlerThread b;
    public final jc0 c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final LinkedHashMap h;
    public int i;
    public boolean j;
    public final ArrayList k;

    public tv(DynamicRange dynamicRange) {
        Map map = Collections.EMPTY_MAP;
        this.e = new AtomicBoolean(false);
        this.f = new float[16];
        this.g = new float[16];
        this.h = new LinkedHashMap();
        this.i = 0;
        this.j = false;
        this.k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new jc0(handler);
        this.a = new OpenGlRenderer();
        try {
            e(dynamicRange);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    public final void a() {
        if (this.j && this.i == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceOutput) it.next()).close();
            }
            Iterator it2 = this.k.iterator();
            while (it2.hasNext()) {
                ((ab) it2.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            OpenGlRenderer openGlRenderer = this.a;
            if (openGlRenderer.a.getAndSet(false)) {
                hb0.c(openGlRenderer.c);
                openGlRenderer.h();
            }
            this.b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new vf(this, 5, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            km0.h("DefaultSurfaceProcessor");
            runnable2.run();
        }
    }

    public final void c(Exception exc) {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ab) it.next()).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap d(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        k02.t(i, fArr2);
        k02.u(fArr2);
        Size sizeF = cg1.f(size, i);
        OpenGlRenderer openGlRenderer = this.a;
        openGlRenderer.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeF.getHeight() * sizeF.getWidth() * 4);
        jx0.b(byteBufferAllocateDirect.capacity() == (sizeF.getHeight() * sizeF.getWidth()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        jx0.b(byteBufferAllocateDirect.isDirect(), "ByteBuffer is not direct.");
        int[] iArr = hb0.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        hb0.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        hb0.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        hb0.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeF.getWidth(), sizeF.getHeight(), 0, 6407, 5121, null);
        hb0.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        hb0.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        hb0.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        hb0.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        hb0.b("glActiveTexture");
        GLES20.glBindTexture(36197, openGlRenderer.m);
        hb0.b("glBindTexture");
        openGlRenderer.i = null;
        GLES20.glViewport(0, 0, sizeF.getWidth(), sizeF.getHeight());
        GLES20.glScissor(0, 0, sizeF.getWidth(), sizeF.getHeight());
        gb0 gb0Var = openGlRenderer.k;
        gb0Var.getClass();
        if (gb0Var instanceof GLUtils$SamplerShaderProgram) {
            GLES20.glUniformMatrix4fv(((GLUtils$SamplerShaderProgram) gb0Var).f, 1, false, fArr2, 0);
            hb0.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        hb0.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeF.getWidth(), sizeF.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        hb0.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        hb0.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        hb0.b("glDeleteFramebuffers");
        int i4 = openGlRenderer.m;
        GLES20.glActiveTexture(33984);
        hb0.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        hb0.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeF.getWidth(), sizeF.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.f(bitmapCreateBitmap, byteBufferAllocateDirect, sizeF.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void e(DynamicRange dynamicRange) {
        Map map = Collections.EMPTY_MAP;
        b bVar = new b();
        bVar.c = new n31();
        oh ohVar = new oh(bVar);
        bVar.b = ohVar;
        bVar.a = vh.class;
        try {
            b(new hj(this, dynamicRange, bVar), new j4(1));
            bVar.a = "Init GlRenderer";
        } catch (Exception e) {
            ohVar.a(e);
        }
        try {
            ohVar.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            p60.k("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    public final void f(Triple triple) {
        ArrayList arrayList = this.k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (triple == null) {
            c(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmapD = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    ab abVar = (ab) it.next();
                    int i3 = abVar.b;
                    int i4 = abVar.a;
                    if (i != i3 || bitmapD == null) {
                        if (bitmapD != null) {
                            bitmapD.recycle();
                        }
                        bitmapD = d((Size) triple.getSecond(), (float[]) triple.getThird(), i3);
                        i2 = -1;
                        i = i3;
                    }
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmapD.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Surface surface = (Surface) triple.getFirst();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.i(byteArray, surface);
                    abVar.c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            c(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f;
        surfaceTexture.getTransformMatrix(fArr);
        Triple triple = null;
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            float[] fArr2 = this.g;
            surfaceOutput.updateTransformMatrix(fArr2, fArr);
            if (surfaceOutput.getFormat() == 34) {
                try {
                    this.a.j(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException unused) {
                    km0.c("DefaultSurfaceProcessor");
                }
            } else {
                jx0.g("Unsupported format: " + surfaceOutput.getFormat(), surfaceOutput.getFormat() == 256);
                jx0.g("Only one JPEG output is supported.", triple == null);
                triple = new Triple(surface, surfaceOutput.getSize(), (float[]) fArr2.clone());
            }
        }
        try {
            f(triple);
        } catch (RuntimeException e) {
            c(e);
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onInputSurface(SurfaceRequest surfaceRequest) {
        if (this.e.get()) {
            surfaceRequest.d();
            return;
        }
        r4 r4Var = new r4(24, this, surfaceRequest);
        Objects.requireNonNull(surfaceRequest);
        b(r4Var, new qv(surfaceRequest, 0));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onOutputSurface(SurfaceOutput surfaceOutput) {
        if (this.e.get()) {
            surfaceOutput.close();
            return;
        }
        r4 r4Var = new r4(23, this, surfaceOutput);
        Objects.requireNonNull(surfaceOutput);
        b(r4Var, new w2(surfaceOutput, 23));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final void release() {
        if (this.e.getAndSet(true)) {
            return;
        }
        b(new w2(this, 24), new j4(1));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final ListenableFuture snapshot(int i, int i2) {
        b bVar = new b();
        bVar.c = new n31();
        oh ohVar = new oh(bVar);
        bVar.b = ohVar;
        bVar.a = vh.class;
        try {
            b(new r4(25, this, new ab(i, i2, bVar)), new rv(0, bVar));
            bVar.a = "DefaultSurfaceProcessor#snapshot";
        } catch (Exception e) {
            ohVar.a(e);
        }
        return xg0.p(ohVar);
    }
}
