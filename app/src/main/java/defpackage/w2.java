package defpackage;

import android.app.Activity;
import android.app.Application;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentDialog;
import androidx.camera.camera2.internal.SynchronizedCaptureSession;
import androidx.camera.camera2.internal.j;
import androidx.camera.camera2.internal.k;
import androidx.camera.camera2.internal.m;
import androidx.camera.camera2.internal.o;
import androidx.camera.camera2.internal.z;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.core.ImageCapture$ScreenFlash;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.camera.video.internal.encoder.f;
import androidx.concurrent.futures.b;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.lifecycle.ComputableLiveData;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.common.util.concurrent.q;
import com.iphunt.sandoki.services.AutoTaskService;
import com.journeyapps.barcodescanner.CameraPreview;
import com.journeyapps.barcodescanner.camera.AutoFocusManager;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        AtomicBoolean atomicBoolean;
        boolean z;
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                Handler handler = b3.g;
                Method method = b3.f;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 28) {
                    activity.recreate();
                    return;
                }
                if (((i4 != 26 && i4 != 27) || method != null) && (b3.e != null || b3.d != null)) {
                    try {
                        Object obj3 = b3.c.get(activity);
                        if (obj3 != null && (obj = b3.b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            a3 a3Var = new a3(activity);
                            application.registerActivityLifecycleCallbacks(a3Var);
                            handler.post(new db0(i3, a3Var, obj3));
                            try {
                                if (i4 == 26 || i4 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new s33(i3, application, a3Var));
                                return;
                            } catch (Throwable th) {
                                handler.post(new s33(i3, application, a3Var));
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                activity.recreate();
                return;
            case 1:
                Process.setThreadPriority(-16);
                ((Runnable) obj2).run();
                return;
            case 2:
                AutoFocusManager autoFocusManager = ((n9) obj2).a;
                autoFocusManager.b = false;
                autoFocusManager.a();
                return;
            case 3:
                AutoTaskService autoTaskService = (AutoTaskService) ((ja) obj2).d;
                ii2.u(autoTaskService, false);
                ii2.m(autoTaskService);
                return;
            case 4:
                Camera2CameraControl camera2CameraControl = (Camera2CameraControl) obj2;
                b bVar = camera2CameraControl.g;
                if (bVar != null) {
                    bVar.b(null);
                    camera2CameraControl.g = null;
                    return;
                }
                return;
            case 5:
                ((CameraDevice) obj2).close();
                return;
            case 6:
                tj1 tj1Var = (tj1) obj2;
                if (((AtomicBoolean) tj1Var.c).getAndSet(true)) {
                    return;
                }
                ((o) ((y6) tj1Var.d).c).c.execute(new m(tj1Var, i2));
                return;
            case 7:
                ((ti) obj2).i.postCapture();
                return;
            case 8:
                ((ImageCapture$ScreenFlash) obj2).clear();
                return;
            case 9:
                k5.x(((hk) obj2).b);
                return;
            case 10:
                CameraPreview cameraPreview = (CameraPreview) ((rb0) obj2).b;
                int i5 = CameraPreview.A;
                cameraPreview.f();
                return;
            case 11:
                ((j) obj2).onOpenAvailable();
                return;
            case 12:
                ((k) obj2).onConfigureAvailable();
                return;
            case 13:
                gz0 gz0Var = ((ml) ((kl) obj2).b).a;
                if (gz0Var != null) {
                    gz0Var.f.onCaptureStarted();
                    return;
                }
                return;
            case 14:
                z zVar = (z) obj2;
                synchronized (zVar.a) {
                    if (zVar.b.isEmpty()) {
                        return;
                    }
                    try {
                        zVar.g(zVar.b);
                        return;
                    } finally {
                        zVar.b.clear();
                    }
                }
            case 15:
                for (SynchronizedCaptureSession synchronizedCaptureSession : (LinkedHashSet) obj2) {
                    synchronizedCaptureSession.getStateCallback().c(synchronizedCaptureSession);
                }
                return;
            case 16:
                Carousel carousel = (Carousel) obj2;
                int i6 = Carousel.G;
                MotionLayout motionLayout = carousel.r;
                int i7 = carousel.E;
                motionLayout.setTransitionDuration(i7);
                int i8 = carousel.D;
                int i9 = carousel.q;
                MotionLayout motionLayout2 = carousel.r;
                if (i8 < i9) {
                    int i10 = carousel.w;
                    if (motionLayout2.isAttachedToWindow()) {
                        motionLayout2.B(i10, i7);
                        return;
                    }
                    androidx.constraintlayout.motion.widget.b bVar2 = motionLayout2.v0;
                    if (bVar2 == null) {
                        bVar2 = new androidx.constraintlayout.motion.widget.b(motionLayout2);
                        motionLayout2.v0 = bVar2;
                    }
                    bVar2.d = i10;
                    return;
                }
                int i11 = carousel.x;
                if (motionLayout2.isAttachedToWindow()) {
                    motionLayout2.B(i11, i7);
                    return;
                }
                androidx.constraintlayout.motion.widget.b bVar3 = motionLayout2.v0;
                if (bVar3 == null) {
                    bVar3 = new androidx.constraintlayout.motion.widget.b(motionLayout2);
                    motionLayout2.v0 = bVar3;
                }
                bVar3.d = i11;
                return;
            case 17:
                ((CarouselLayoutManager) obj2).X0();
                return;
            case 18:
                ((qn) obj2).s(true);
                return;
            case 19:
                try {
                    ((Closeable) obj2).close();
                    return;
                } catch (IOException | RuntimeException e) {
                    q.a.log(Level.WARNING, "thrown by close()", e);
                    return;
                }
            case 20:
                int i12 = ComponentActivity.a;
                ((ComponentActivity) obj2).invalidateMenu();
                return;
            case 21:
                ComponentDialog.b((ComponentDialog) obj2);
                return;
            case 22:
                ComputableLiveData computableLiveData = (ComputableLiveData) obj2;
                do {
                    AtomicBoolean atomicBoolean2 = computableLiveData.d;
                    atomicBoolean = computableLiveData.c;
                    if (atomicBoolean2.compareAndSet(false, true)) {
                        Object objA = null;
                        z = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                objA = computableLiveData.a();
                                z = true;
                            } finally {
                                atomicBoolean2.set(false);
                            }
                            break;
                        }
                        if (z) {
                            computableLiveData.b.i(objA);
                        }
                        atomicBoolean2.set(false);
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            case 23:
                ((SurfaceOutput) obj2).close();
                return;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                tv tvVar = (tv) obj2;
                tvVar.j = true;
                tvVar.a();
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                ((oh) obj2).cancel(true);
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                b00 b00Var = (b00) obj2;
                boolean zIsPopupShowing = b00Var.h.isPopupShowing();
                b00Var.s(zIsPopupShowing);
                b00Var.m = zIsPopupShowing;
                return;
            case 27:
                d00 d00Var = (d00) obj2;
                d00Var.f = true;
                d00Var.a();
                return;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                DualSurfaceProcessorNode.Out out = ((DualSurfaceProcessorNode) obj2).d;
                if (out != null) {
                    Iterator<SurfaceEdge> it = out.values().iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                    return;
                }
                return;
            default:
                ((f) obj2).b();
                return;
        }
    }
}
