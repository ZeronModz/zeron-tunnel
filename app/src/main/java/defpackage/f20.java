package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import android.view.Surface;
import android.widget.ListView;
import androidx.arch.core.internal.b;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.Preview$SurfaceProvider;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.j;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.e;
import androidx.camera.view.g;
import androidx.fragment.app.strictmode.FragmentStrictMode$Policy;
import androidx.fragment.app.strictmode.Violation;
import androidx.room.InvalidationTracker;
import androidx.room.MultiInstanceInvalidationClient;
import androidx.room.f;
import androidx.window.embedding.ExtensionEmbeddingBackend;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.trilead.ssh2.sftp.ErrorCodes;
import com.v2ray.ang.ui.LogsFragment;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.android.HandlerContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f20(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = (MultiInstanceInvalidationClient) this.b;
        String[] strArr = (String[]) this.c;
        InvalidationTracker invalidationTracker = multiInstanceInvalidationClient.b;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        synchronized (invalidationTracker.l) {
            Iterator it = invalidationTracker.l.iterator();
            while (true) {
                b bVar = (b) it;
                if (bVar.hasNext()) {
                    Map.Entry entry = (Map.Entry) bVar.next();
                    entry.getClass();
                    InvalidationTracker.Observer observer = (InvalidationTracker.Observer) entry.getKey();
                    InvalidationTracker.ObserverWrapper observerWrapper = (InvalidationTracker.ObserverWrapper) entry.getValue();
                    observer.getClass();
                    if (!(observer instanceof f)) {
                        observerWrapper.b(strArr2);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncoderCallback encoderCallback;
        Executor executor;
        switch (this.a) {
            case 0:
                Executor executor2 = (Executor) this.b;
                androidx.camera.video.internal.encoder.f fVar = (androidx.camera.video.internal.encoder.f) this.c;
                Range range = EncoderImpl.E;
                Objects.requireNonNull(fVar);
                executor2.execute(new w2(fVar, 29));
                return;
            case 1:
                EncoderImpl encoderImpl = (EncoderImpl) this.b;
                androidx.concurrent.futures.b bVar = (androidx.concurrent.futures.b) this.c;
                Range range2 = EncoderImpl.E;
                encoderImpl.l.remove(bVar);
                return;
            case 2:
                ((Observable.Observer) ((Map.Entry) this.b).getKey()).onNewData((BufferProvider.State) this.c);
                return;
            case 3:
                e eVar = (e) this.b;
                Observable.Observer observer = (Observable.Observer) this.c;
                LinkedHashMap linkedHashMap = eVar.a;
                observer.getClass();
                linkedHashMap.remove(observer);
                return;
            case 4:
                ((Observable.Observer) this.b).onNewData((BufferProvider.State) this.c);
                return;
            case 5:
                androidx.camera.video.internal.encoder.f fVar2 = (androidx.camera.video.internal.encoder.f) this.c;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.b;
                EncoderImpl encoderImpl2 = fVar2.k;
                switch (encoderImpl2.t) {
                    case CONFIGURED:
                    case ERROR:
                    case RELEASED:
                        return;
                    case STARTED:
                    case PAUSED:
                    case STOPPING:
                    case PENDING_START:
                    case PENDING_START_PAUSED:
                    case PENDING_RELEASE:
                        encoderImpl2.b(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        s31.e(encoderImpl2.t, "Unknown state: ");
                        return;
                }
            case 6:
                androidx.camera.video.internal.encoder.f fVar3 = (androidx.camera.video.internal.encoder.f) this.c;
                MediaFormat mediaFormat = (MediaFormat) this.b;
                boolean z = fVar3.j;
                EncoderImpl encoderImpl3 = fVar3.k;
                if (z) {
                    km0.g(encoderImpl3.a);
                    return;
                }
                switch (encoderImpl3.t) {
                    case CONFIGURED:
                    case ERROR:
                    case RELEASED:
                        return;
                    case STARTED:
                    case PAUSED:
                    case STOPPING:
                    case PENDING_START:
                    case PENDING_START_PAUSED:
                    case PENDING_RELEASE:
                        synchronized (fVar3.k.b) {
                            EncoderImpl encoderImpl4 = fVar3.k;
                            encoderCallback = encoderImpl4.r;
                            executor = encoderImpl4.s;
                            break;
                        }
                        try {
                            executor.execute(new f20(7, encoderCallback, mediaFormat));
                            return;
                        } catch (RejectedExecutionException unused) {
                            km0.c(fVar3.k.a);
                            return;
                        }
                    default:
                        s31.e(fVar3.k.t, "Unknown state: ");
                        return;
                }
            case 7:
                ((EncoderCallback) this.b).onOutputConfigUpdate(new b1((MediaFormat) this.c, 17));
                return;
            case 8:
                ((EncoderCallback) this.b).onEncodedData((b20) this.c);
                return;
            case 9:
                ((Encoder.SurfaceInput.OnSurfaceUpdateListener) this.b).onSurfaceUpdate((Surface) this.c);
                return;
            case 10:
                ((EventHandler) ((Map.Entry) this.b).getKey()).handle((Event) this.c);
                return;
            case 11:
                ((ExtensionEmbeddingBackend.SplitListenerWrapper) this.b).c.accept((ArrayList) this.c);
                return;
            case 12:
                ((r50) this.b).a((Intent) this.c);
                return;
            case 13:
                ((FragmentStrictMode$Policy) this.b).b.onViolation((Violation) this.c);
                return;
            case 14:
                androidx.concurrent.futures.b bVar2 = (androidx.concurrent.futures.b) this.b;
                oh ohVar = (oh) this.c;
                bVar2.b(null);
                ohVar.cancel(true);
                return;
            case 15:
                CancellableContinuation cancellableContinuation = (CancellableContinuation) this.b;
                HandlerContext handlerContext = (HandlerContext) this.c;
                int i = HandlerContext.g;
                cancellableContinuation.resumeUndispatched(handlerContext, mk1.a);
                return;
            case 16:
                SafeCloseImageReaderProxy safeCloseImageReaderProxy = (SafeCloseImageReaderProxy) this.b;
                SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = (SafeCloseImageReaderProxy) this.c;
                safeCloseImageReaderProxy.a();
                if (safeCloseImageReaderProxy2 != null) {
                    safeCloseImageReaderProxy2.a();
                    return;
                }
                return;
            case 17:
                gf0 gf0Var = (gf0) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                try {
                    taskCompletionSource.b(gf0Var.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.a(e);
                    return;
                }
            case 18:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.b;
                JobParameters jobParameters = (JobParameters) this.c;
                int i2 = JobInfoSchedulerService.a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 19:
                ((LiveDataObservable) this.b).a.j((j) this.c);
                return;
            case 20:
                LiveDataObservable liveDataObservable = (LiveDataObservable) this.b;
                androidx.concurrent.futures.b bVar3 = (androidx.concurrent.futures.b) this.c;
                rl0 rl0Var = (rl0) liveDataObservable.a.d();
                if (rl0Var == null) {
                    bVar3.d(new IllegalStateException("Observable has not yet been initialized with a value."));
                    return;
                } else {
                    bVar3.b(rl0Var.a);
                    return;
                }
            case 21:
                j jVar = (j) this.b;
                rl0 rl0Var2 = (rl0) this.c;
                if (jVar.a.get()) {
                    rl0Var2.getClass();
                    jVar.b.onNewData(rl0Var2.a);
                    return;
                }
                return;
            case 22:
                LogsFragment logsFragment = (LogsFragment) this.b;
                String str = (String) this.c;
                ArrayList arrayList = logsFragment.a0;
                arrayList.add(str);
                if (arrayList.size() > 500) {
                    arrayList.remove(0);
                }
                om0 om0Var = logsFragment.Z;
                if (om0Var == null) {
                    yg0.N("adapter");
                    throw null;
                }
                om0Var.notifyDataSetChanged();
                ListView listView = logsFragment.Y;
                if (listView == null) {
                    yg0.N("listView");
                    throw null;
                }
                listView.smoothScrollToPosition(arrayList.size() - 1);
                ListView listView2 = logsFragment.Y;
                if (listView2 != null) {
                    listView2.post(new j60(logsFragment, 8));
                    return;
                } else {
                    yg0.N("listView");
                    throw null;
                }
            case 23:
                ((ImageReaderProxy.OnImageAvailableListener) this.c).onImageAvailable((MetadataImageReader) this.b);
                return;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                a();
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                ((Preview$SurfaceProvider) this.b).onSurfaceRequested((SurfaceRequest) this.c);
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                ((g) this.b).a.o.onSurfaceRequested((SurfaceRequest) this.c);
                return;
            case 27:
                h0 h0Var = (h0) this.b;
                DeferrableSurface deferrableSurface = (DeferrableSurface) this.c;
                i.a(h0Var.f);
                if (deferrableSurface != null) {
                    deferrableSurface.b();
                    return;
                }
                return;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ((gz0) this.b).f.onFinalResult((ImageProxy) this.c);
                return;
            default:
                ((gz0) this.b).f.onPostviewBitmapAvailable((Bitmap) this.c);
                return;
        }
    }

    public /* synthetic */ f20(androidx.camera.video.internal.encoder.f fVar, Object obj, int i) {
        this.a = i;
        this.c = fVar;
        this.b = obj;
    }
}
