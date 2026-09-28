package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.processing.SurfaceProcessorInternal;
import androidx.camera.core.processing.concurrent.DualOpenGlRenderer;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d00 implements SurfaceProcessorInternal, SurfaceTexture.OnFrameAvailableListener {
    public final DualOpenGlRenderer a;
    public final HandlerThread b;
    public final jc0 c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean g;
    public final LinkedHashMap h;
    public SurfaceTexture i;
    public SurfaceTexture j;

    public d00(DynamicRange dynamicRange, qj0 qj0Var, qj0 qj0Var2) {
        Map map = Collections.EMPTY_MAP;
        this.e = 0;
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new jc0(handler);
        this.a = new DualOpenGlRenderer(qj0Var, qj0Var2);
        try {
            c(dynamicRange);
        } catch (RuntimeException e) {
            release();
            throw e;
        }
    }

    public final void a() {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.h;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((SurfaceOutput) it.next()).close();
            }
            linkedHashMap.clear();
            DualOpenGlRenderer dualOpenGlRenderer = this.a;
            if (dualOpenGlRenderer.a.getAndSet(false)) {
                hb0.c(dualOpenGlRenderer.c);
                dualOpenGlRenderer.h();
            }
            dualOpenGlRenderer.n = -1;
            dualOpenGlRenderer.o = -1;
            this.b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new vf(this, 6, runnable2, runnable));
        } catch (RejectedExecutionException unused) {
            km0.h("DualSurfaceProcessor");
            runnable2.run();
        }
    }

    public final void c(DynamicRange dynamicRange) {
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

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.g.get() || (surfaceTexture2 = this.i) == null || this.j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.j.updateTexImage();
        for (Map.Entry entry : this.h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            SurfaceOutput surfaceOutput = (SurfaceOutput) entry.getKey();
            if (surfaceOutput.getFormat() == 34) {
                try {
                    this.a.l(surfaceTexture.getTimestamp(), surface, surfaceOutput, this.i, this.j);
                } catch (RuntimeException unused) {
                    km0.c("DualSurfaceProcessor");
                }
            }
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onInputSurface(SurfaceRequest surfaceRequest) {
        if (this.g.get()) {
            surfaceRequest.d();
            return;
        }
        r4 r4Var = new r4(27, this, surfaceRequest);
        Objects.requireNonNull(surfaceRequest);
        b(r4Var, new qv(surfaceRequest, 0));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public final void onOutputSurface(SurfaceOutput surfaceOutput) {
        if (this.g.get()) {
            surfaceOutput.close();
            return;
        }
        r4 r4Var = new r4(28, this, surfaceOutput);
        Objects.requireNonNull(surfaceOutput);
        b(r4Var, new w2(surfaceOutput, 23));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final void release() {
        if (this.g.getAndSet(true)) {
            return;
        }
        b(new w2(this, 27), new j4(1));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public final /* synthetic */ ListenableFuture snapshot(int i, int i2) {
        return rf0.c;
    }
}
