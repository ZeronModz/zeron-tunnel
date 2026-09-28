package defpackage;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.ScaleGestureDetector;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.ImageAnalysis$Builder;
import androidx.camera.core.ImageCapture$OnImageCapturedCallback;
import androidx.camera.core.ImageCapture$OnImageSavedCallback;
import androidx.camera.core.ImageCapture$OutputFileResults;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Preview$Builder;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.imagecapture.TakePictureRequest;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.core.impl.l;
import androidx.camera.core.resolutionselector.ResolutionSelector$Builder;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.camera.lifecycle.b;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.d;
import androidx.camera.video.h;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.j;
import androidx.camera.view.PreviewView;
import androidx.camera.view.f;
import androidx.camera.view.n;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.core.util.Consumer;
import androidx.room.TransactionExecutor;
import androidx.window.layout.SidecarWindowBackend;
import androidx.window.layout.WindowLayoutInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.background.greedy.TimeLimiter;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import com.blacksquircle.ui.editorkit.utils.StylingTask;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.Transport;
import com.google.common.util.concurrent.ListenableFuture;
import com.iphunt.sandoki.ui.TransparentActivity;
import com.sandok.tunnel.core.VpnProfile;
import com.trilead.ssh2.sftp.ErrorCodes;
import io.github.g00fy2.quickie.QRCodeAnalyzer;
import io.github.g00fy2.quickie.QROverlayView;
import io.github.g00fy2.quickie.QRScannerActivity;
import java.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ez0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ez0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        am amVar = (am) this.b;
        QRScannerActivity qRScannerActivity = (QRScannerActivity) this.c;
        int i = QRScannerActivity.j;
        try {
            b bVar = (b) amVar.get();
            ey0 ey0VarA = new Preview$Builder().build();
            tj1 tj1Var = qRScannerActivity.c;
            if (tj1Var == null) {
                yg0.N("binding");
                throw null;
            }
            ey0VarA.E(((PreviewView) tj1Var.d).getSurfaceProvider());
            ImageAnalysis$Builder imageAnalysis$Builder = new ImageAnalysis$Builder();
            int i2 = 0;
            imageAnalysis$Builder.a.insertOption(ImageAnalysisConfig.b, 0);
            ResolutionSelector$Builder resolutionSelector$Builder = new ResolutionSelector$Builder();
            int i3 = 1;
            resolutionSelector$Builder.b = new ResolutionStrategy(new Size(VpnProfile.DEFAULT_MSSFIX_SIZE, 720), 1);
            imageAnalysis$Builder.a.insertOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector$Builder.a());
            ImageAnalysisConfig imageAnalysisConfig = new ImageAnalysisConfig(l.a(imageAnalysis$Builder.a));
            lf0.h(imageAnalysisConfig);
            we0 we0Var = new we0(imageAnalysisConfig);
            ExecutorService executorService = qRScannerActivity.d;
            if (executorService == null) {
                yg0.N("analysisExecutor");
                throw null;
            }
            int i4 = 4;
            QRCodeAnalyzer qRCodeAnalyzer = new QRCodeAnalyzer(qRScannerActivity.e, new ng(i4, we0Var, qRScannerActivity), new zz0(qRScannerActivity, 3), new zz0(qRScannerActivity, i4));
            synchronized (we0Var.p) {
                try {
                    we0Var.o.h(executorService, new b1(qRCodeAnalyzer, 21));
                    if (we0Var.q == null) {
                        we0Var.m();
                    }
                    we0Var.q = qRCodeAnalyzer;
                } finally {
                }
            }
            bVar.unbindAll();
            qk qkVar = qRScannerActivity.i ? qk.b : qk.c;
            qkVar.getClass();
            try {
                ak0 ak0VarA = bVar.a(qRScannerActivity, qkVar, ey0VarA, we0Var);
                ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(qRScannerActivity, new a01(ak0VarA));
                tj1 tj1Var2 = qRScannerActivity.c;
                if (tj1Var2 == null) {
                    yg0.N("binding");
                    throw null;
                }
                ((QROverlayView) tj1Var2.c).setOnTouchListener(new zz(scaleGestureDetector, i3));
                tj1 tj1Var3 = qRScannerActivity.c;
                if (tj1Var3 == null) {
                    yg0.N("binding");
                    throw null;
                }
                ((QROverlayView) tj1Var3.c).setVisibility(0);
                tj1 tj1Var4 = qRScannerActivity.c;
                if (tj1Var4 == null) {
                    yg0.N("binding");
                    throw null;
                }
                ((QROverlayView) tj1Var4.c).b(qRScannerActivity.h, new l8(qRScannerActivity, 14));
                if (qRScannerActivity.g && ak0VarA.c.r.hasFlashUnit()) {
                    tj1 tj1Var5 = qRScannerActivity.c;
                    if (tj1Var5 == null) {
                        yg0.N("binding");
                        throw null;
                    }
                    ((QROverlayView) tj1Var5.c).d(true, new t(ak0VarA, 23));
                    ak0VarA.c.r.getTorchState().e(qRScannerActivity, new yr(i3, new zz0(qRScannerActivity, i2)));
                } else {
                    tj1 tj1Var6 = qRScannerActivity.c;
                    if (tj1Var6 == null) {
                        yg0.N("binding");
                        throw null;
                    }
                    ((QROverlayView) tj1Var6.c).d(false, new z3(27));
                }
                tj1 tj1Var7 = qRScannerActivity.c;
                if (tj1Var7 != null) {
                    ((QROverlayView) tj1Var7.c).c(new zz0(qRScannerActivity, i3));
                } else {
                    yg0.N("binding");
                    throw null;
                }
            } catch (Exception e) {
                tj1 tj1Var8 = qRScannerActivity.c;
                if (tj1Var8 == null) {
                    yg0.N("binding");
                    throw null;
                }
                ((QROverlayView) tj1Var8.c).setVisibility(4);
                qRScannerActivity.g(e);
            }
        } catch (Exception e2) {
            qRScannerActivity.g(e2);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        Encoder encoder;
        CountDownLatch countDownLatch;
        int i = 1;
        switch (this.a) {
            case 0:
                ((gz0) this.b).f.onProcessFailure((ImageCaptureException) this.c);
                return;
            case 1:
                Processor processor = (Processor) this.b;
                WorkGenerationalId workGenerationalId = (WorkGenerationalId) this.c;
                int i2 = Processor.l;
                synchronized (processor.k) {
                    try {
                        Iterator it = processor.j.iterator();
                        while (it.hasNext()) {
                            ((ExecutionListener) it.next()).onExecuted(workGenerationalId, false);
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 2:
                a();
                return;
            case 3:
                d dVar = (d) this.b;
                VideoOutput.SourceState sourceState = (VideoOutput.SourceState) this.c;
                VideoOutput.SourceState sourceState2 = dVar.z;
                dVar.z = sourceState;
                if (sourceState2 == sourceState) {
                    Objects.toString(sourceState);
                    km0.a("Recorder");
                    return;
                }
                Objects.toString(sourceState);
                km0.a("Recorder");
                if (sourceState != VideoOutput.SourceState.INACTIVE) {
                    if (sourceState != VideoOutput.SourceState.ACTIVE_NON_STREAMING || (scheduledFuture = dVar.A) == null || !scheduledFuture.cancel(false) || (encoder = dVar.t) == null) {
                        return;
                    }
                    d.d(encoder);
                    return;
                }
                if (dVar.r == null) {
                    v11 v11Var = dVar.D;
                    if (v11Var != null) {
                        if (!v11Var.d) {
                            v11Var.d = true;
                            ScheduledFuture scheduledFuture2 = v11Var.f;
                            if (scheduledFuture2 != null) {
                                scheduledFuture2.cancel(false);
                                v11Var.f = null;
                            }
                        }
                        dVar.D = null;
                    }
                    dVar.f();
                    return;
                }
                return;
            case 4:
                ((Executor) this.b).execute((Runnable) this.c);
                return;
            case 5:
                RemoteWorkManagerClient remoteWorkManagerClient = (RemoteWorkManagerClient) this.b;
                ListenableFuture listenableFuture = (ListenableFuture) this.c;
                oi oiVar = RemoteWorkManagerClient.i;
                try {
                    listenableFuture.get();
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    remoteWorkManagerClient.b();
                    return;
                }
            case 6:
                g31 g31Var = (g31) this.b;
                countDownLatch = (CountDownLatch) this.c;
                try {
                    Transport transport = g31Var.h;
                    Priority priority = Priority.HIGHEST;
                    if (transport instanceof qg1) {
                        com.google.android.datatransport.runtime.d.a().d.a(((qg1) transport).a.e(priority), 1);
                    } else if (Log.isLoggable(if3.x("ForcedSender"), 5)) {
                        String.format("Expected instance of `TransportImpl`, got `%s`.", transport);
                    }
                    break;
                } catch (Exception unused2) {
                }
                return;
            case 7:
                ((ResourcesCompat$FontCallback) this.b).c((Typeface) this.c);
                return;
            case 8:
                ((SidecarWindowBackend.WindowLayoutChangeCallbackWrapper) this.b).c.accept((WindowLayoutInfo) this.c);
                return;
            case 9:
                StylingTask stylingTask = (StylingTask) this.b;
                List list = (List) this.c;
                int i3 = StylingTask.e;
                list.getClass();
                if (stylingTask.d.isShutdown()) {
                    return;
                }
                stylingTask.b.invoke(list);
                return;
            case 10:
                ((Consumer) ((AtomicReference) this.c).get()).accept(new vc((mc1) this.b));
                return;
            case 11:
                SurfaceRequest.TransformationInfoListener transformationInfoListener = (SurfaceRequest.TransformationInfoListener) this.b;
                xc xcVar = (xc) this.c;
                Range range = SurfaceRequest.p;
                transformationInfoListener.onTransformationInfoUpdate(xcVar);
                return;
            case 12:
                SurfaceRequest.TransformationInfoListener transformationInfoListener2 = (SurfaceRequest.TransformationInfoListener) this.b;
                qc1 qc1Var = (qc1) this.c;
                Range range2 = SurfaceRequest.p;
                transformationInfoListener2.onTransformationInfoUpdate(qc1Var);
                return;
            case 13:
                ((TakePictureManager) this.b).e.remove((androidx.camera.core.imagecapture.b) this.c);
                return;
            case 14:
                TakePictureRequest takePictureRequest = (TakePictureRequest) this.b;
                ImageProxy imageProxy = (ImageProxy) this.c;
                ImageCapture$OnImageCapturedCallback imageCapture$OnImageCapturedCallbackD = takePictureRequest.d();
                Objects.requireNonNull(imageCapture$OnImageCapturedCallbackD);
                Objects.requireNonNull(imageProxy);
                imageCapture$OnImageCapturedCallbackD.c(imageProxy);
                return;
            case 15:
                TakePictureRequest takePictureRequest2 = (TakePictureRequest) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                if (takePictureRequest2.f() != null) {
                    takePictureRequest2.f().onPostviewBitmapAvailable(bitmap);
                    return;
                } else {
                    if (takePictureRequest2.d() != null) {
                        takePictureRequest2.d().e(bitmap);
                        return;
                    }
                    return;
                }
            case 16:
                TakePictureRequest takePictureRequest3 = (TakePictureRequest) this.b;
                ImageCapture$OutputFileResults imageCapture$OutputFileResults = (ImageCapture$OutputFileResults) this.c;
                ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallbackF = takePictureRequest3.f();
                Objects.requireNonNull(imageCapture$OnImageSavedCallbackF);
                Objects.requireNonNull(imageCapture$OutputFileResults);
                imageCapture$OnImageSavedCallbackF.onImageSaved(imageCapture$OutputFileResults);
                return;
            case 17:
                TakePictureRequest takePictureRequest4 = (TakePictureRequest) this.b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.c;
                boolean z = takePictureRequest4.d() != null;
                i = takePictureRequest4.f() != null ? 1 : 0;
                if (z && i == 0) {
                    ImageCapture$OnImageCapturedCallback imageCapture$OnImageCapturedCallbackD2 = takePictureRequest4.d();
                    Objects.requireNonNull(imageCapture$OnImageCapturedCallbackD2);
                    imageCapture$OnImageCapturedCallbackD2.d(imageCaptureException);
                    return;
                } else {
                    if (i == 0 || z) {
                        u7.p("One and only one callback is allowed.");
                        return;
                    }
                    ImageCapture$OnImageSavedCallback imageCapture$OnImageSavedCallbackF2 = takePictureRequest4.f();
                    Objects.requireNonNull(imageCapture$OnImageSavedCallbackF2);
                    imageCapture$OnImageSavedCallbackF2.onError(imageCaptureException);
                    return;
                }
            case 18:
                n nVar = (n) this.b;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.c;
                SurfaceRequest surfaceRequest2 = nVar.h;
                if (surfaceRequest2 != null && surfaceRequest2 == surfaceRequest) {
                    nVar.h = null;
                    nVar.g = null;
                }
                f fVar = nVar.l;
                if (fVar != null) {
                    fVar.onSurfaceNotInUse();
                    nVar.l = null;
                    return;
                }
                return;
            case 19:
                j60 j60Var = (j60) this.b;
                countDownLatch = (CountDownLatch) this.c;
                try {
                    j60Var.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 20:
                ((TimeLimiter) this.b).b.stopWork((StartStopToken) this.c, 3);
                return;
            case 21:
                Runnable runnable = (Runnable) this.b;
                TransactionExecutor transactionExecutor = (TransactionExecutor) this.c;
                try {
                    runnable.run();
                    return;
                } finally {
                    transactionExecutor.a();
                }
            case 22:
                TransparentActivity transparentActivity = (TransparentActivity) this.b;
                Bundle bundle = (Bundle) this.c;
                int i4 = TransparentActivity.c;
                if (transparentActivity.isFinishing() || transparentActivity.isDestroyed()) {
                    return;
                }
                transparentActivity.showAssist(bundle);
                transparentActivity.a.postDelayed(new he1(transparentActivity, i), 2000L);
                return;
            case 23:
                h hVar = (h) this.b;
                if (((DeferrableSurface) this.c) == hVar.o) {
                    hVar.G();
                    return;
                }
                return;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                nm1 nm1Var = (nm1) this.b;
                SessionConfig$Builder sessionConfig$Builder = (SessionConfig$Builder) this.c;
                sessionConfig$Builder.b.e.remove(nm1Var);
                sessionConfig$Builder.e.remove(nm1Var);
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                ((j) this.b).h.onSurfaceUpdate((Surface) this.c);
                return;
            default:
                androidx.constraintlayout.motion.widget.d dVar2 = (androidx.constraintlayout.motion.widget.d) this.b;
                View[] viewArr = (View[]) this.c;
                if (dVar2.p != -1) {
                    for (View view : viewArr) {
                        view.setTag(dVar2.p, Long.valueOf(System.nanoTime()));
                    }
                }
                if (dVar2.q != -1) {
                    int length = viewArr.length;
                    while (i < length) {
                        viewArr[i].setTag(dVar2.q, null);
                        i++;
                    }
                    return;
                }
                return;
        }
    }
}
