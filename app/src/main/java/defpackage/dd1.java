package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.a0;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseCaptureSession;
import androidx.camera.camera2.internal.compat.workaround.ForceCloseDeferrableSurface;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.camera2.internal.compat.workaround.SessionResetPolicy;
import androidx.camera.camera2.internal.l0;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.b;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dd1 extends l0 {
    public final jc0 o;
    public final Object p;
    public List q;
    public zk0 r;
    public final ForceCloseDeferrableSurface s;
    public final ForceCloseCaptureSession t;
    public final RequestMonitor u;
    public final SessionResetPolicy v;
    public final AtomicBoolean w;

    public dd1(jc0 jc0Var, Handler handler, a0 a0Var, Quirks quirks, Quirks quirks2, b bVar) {
        super(a0Var, bVar, jc0Var, handler);
        this.p = new Object();
        this.w = new AtomicBoolean(false);
        this.s = new ForceCloseDeferrableSurface(quirks, quirks2);
        this.u = new RequestMonitor(quirks.a(CaptureSessionStuckQuirk.class) || quirks.a(IncorrectCaptureStateQuirk.class));
        this.t = new ForceCloseCaptureSession(quirks2);
        this.v = new SessionResetPolicy(quirks2);
        this.o = jc0Var;
    }

    @Override // androidx.camera.camera2.internal.l0, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void c(SynchronizedCaptureSession synchronizedCaptureSession) {
        synchronized (this.p) {
            this.s.a(this.q);
        }
        m("onClosed()");
        super.c(synchronizedCaptureSession);
    }

    @Override // androidx.camera.camera2.internal.l0, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int captureBurstRequests(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.captureBurstRequests(list, this.u.a(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.l0, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void close() {
        if (!this.w.compareAndSet(false, true)) {
            m("close() has been called. Skip this invocation.");
            return;
        }
        if (this.v.a) {
            try {
                m("Call abortCaptures() before closing session.");
                abortCaptures();
            } catch (Exception e) {
                m("Exception when calling abortCaptures()" + e);
            }
        }
        m("Session call close()");
        this.u.b().addListener(new j60(this, 26), this.d);
    }

    @Override // androidx.camera.camera2.internal.l0, androidx.camera.camera2.internal.SynchronizedCaptureSession.StateCallback
    public final void e(SynchronizedCaptureSession synchronizedCaptureSession) {
        SynchronizedCaptureSession synchronizedCaptureSession2;
        SynchronizedCaptureSession synchronizedCaptureSession3;
        m("Session onConfigured()");
        ForceCloseCaptureSession forceCloseCaptureSession = this.t;
        ArrayList arrayListC = this.b.c();
        ArrayList arrayListB = this.b.b();
        if (forceCloseCaptureSession.a != null) {
            LinkedHashSet<SynchronizedCaptureSession> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayListC.iterator();
            while (it.hasNext() && (synchronizedCaptureSession3 = (SynchronizedCaptureSession) it.next()) != synchronizedCaptureSession) {
                linkedHashSet.add(synchronizedCaptureSession3);
            }
            for (SynchronizedCaptureSession synchronizedCaptureSession4 : linkedHashSet) {
                synchronizedCaptureSession4.getStateCallback().d(synchronizedCaptureSession4);
            }
        }
        Objects.requireNonNull(this.f);
        a0 a0Var = this.b;
        synchronized (a0Var.b) {
            a0Var.c.add(this);
            a0Var.e.remove(this);
        }
        a0Var.a(this);
        this.f.e(synchronizedCaptureSession);
        if (forceCloseCaptureSession.a != null) {
            LinkedHashSet<SynchronizedCaptureSession> linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = arrayListB.iterator();
            while (it2.hasNext() && (synchronizedCaptureSession2 = (SynchronizedCaptureSession) it2.next()) != synchronizedCaptureSession) {
                linkedHashSet2.add(synchronizedCaptureSession2);
            }
            for (SynchronizedCaptureSession synchronizedCaptureSession5 : linkedHashSet2) {
                synchronizedCaptureSession5.getStateCallback().c(synchronizedCaptureSession5);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.l0, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void finishClose() {
        l();
        this.u.c();
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final ListenableFuture getOpeningBlocker() {
        return yg0.x(new ya0(this.u.b(), this.o, 1500L, 0));
    }

    public final void m(String str) {
        km0.a("SyncCaptureSessionImpl");
    }

    public final /* synthetic */ void n() {
        m("Session call super.close()");
        super.close();
    }

    public final ListenableFuture o(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        if (this.v.a) {
            Iterator it = this.b.b().iterator();
            while (it.hasNext()) {
                ((SynchronizedCaptureSession) it.next()).close();
            }
        }
        m("start openCaptureSession");
        return super.openCaptureSession(cameraDevice, sessionConfigurationCompat, list);
    }

    @Override // androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final void onCameraDeviceError(int i) {
        if (i == 5) {
            synchronized (this.p) {
                try {
                    if (k() && this.q != null) {
                        m("Close DeferrableSurfaces for CameraDevice error.");
                        Iterator it = this.q.iterator();
                        while (it.hasNext()) {
                            ((DeferrableSurface) it.next()).a();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // androidx.camera.camera2.internal.l0, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public final ListenableFuture openCaptureSession(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        ListenableFuture listenableFutureP;
        synchronized (this.p) {
            try {
                ArrayList arrayListB = this.b.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    arrayList.add(((SynchronizedCaptureSession) it.next()).getOpeningBlocker());
                }
                zk0 zk0VarU = xg0.u(arrayList);
                this.r = zk0VarU;
                listenableFutureP = xg0.p(xg0.z(xa0.a(zk0VarU), new cd1(this, cameraDevice, sessionConfigurationCompat, list), this.d));
            } catch (Throwable th) {
                throw th;
            }
        }
        return listenableFutureP;
    }

    @Override // androidx.camera.camera2.internal.l0, androidx.camera.camera2.internal.SynchronizedCaptureSession
    public final int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.setSingleRepeatingRequest(captureRequest, this.u.a(captureCallback));
    }

    @Override // androidx.camera.camera2.internal.l0, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public final ListenableFuture startWithDeferrableSurface(List list, long j) {
        ListenableFuture listenableFutureStartWithDeferrableSurface;
        synchronized (this.p) {
            this.q = list;
            listenableFutureStartWithDeferrableSurface = super.startWithDeferrableSurface(list, j);
        }
        return listenableFutureStartWithDeferrableSurface;
    }

    @Override // androidx.camera.camera2.internal.l0, androidx.camera.camera2.internal.SynchronizedCaptureSession.Opener
    public final boolean stop() {
        boolean zStop;
        synchronized (this.p) {
            try {
                if (k()) {
                    this.s.a(this.q);
                } else {
                    zk0 zk0Var = this.r;
                    if (zk0Var != null) {
                        zk0Var.cancel(true);
                    }
                }
                zStop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zStop;
    }
}
