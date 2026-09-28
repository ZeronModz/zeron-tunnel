package defpackage;

import android.content.Intent;
import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.b;
import androidx.camera.camera2.internal.compat.workaround.RequestMonitor;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.ImageCapture$ScreenFlashListener;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.LiveDataObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.j;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.camera.video.internal.encoder.e;
import androidx.camera.view.f;
import androidx.camera.view.l;
import androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.emoji2.text.d;
import androidx.lifecycle.MutableLiveData;
import androidx.room.QueryInterceptorDatabase;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.c;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.messaging.EnhancedIntentService;
import java.util.Objects;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vf(b bVar, Executor executor, CameraCaptureCallback cameraCaptureCallback) {
        this.a = 1;
        this.c = bVar;
        this.b = executor;
        this.d = cameraCaptureCallback;
    }

    private final void a() {
        boolean zBooleanValue;
        Processor processor = (Processor) this.c;
        oh ohVar = (oh) this.d;
        WorkerWrapper workerWrapper = (WorkerWrapper) this.b;
        int i = Processor.l;
        try {
            zBooleanValue = ((Boolean) ohVar.b.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        synchronized (processor.k) {
            try {
                WorkGenerationalId workGenerationalIdW = if3.w(workerWrapper.a);
                String str = workGenerationalIdW.a;
                if (processor.d(str) == workerWrapper) {
                    processor.b(str);
                }
                Logger loggerA = Logger.a();
                int i2 = Processor.l;
                loggerA.getClass();
                Iterator it = processor.j.iterator();
                while (it.hasNext()) {
                    ((ExecutionListener) it.next()).onExecuted(workGenerationalIdW, zBooleanValue);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                BufferedAudioStream bufferedAudioStream = (BufferedAudioStream) this.c;
                bufferedAudioStream.g.setCallback((AudioStream.AudioStreamCallback) this.d, (Executor) this.b);
                return;
            case 1:
                b bVar = (b) this.c;
                Executor executor = (Executor) this.b;
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) this.d;
                yh yhVar = bVar.y;
                ((HashSet) yhVar.b).add(cameraCaptureCallback);
                ((ArrayMap) yhVar.c).put(cameraCaptureCallback, executor);
                return;
            case 2:
                u uVar = (u) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                androidx.concurrent.futures.b bVar2 = (androidx.concurrent.futures.b) this.b;
                km0.a("Camera2CapturePipeline");
                uVar.d.apply(System.currentTimeMillis() + 3000, (ImageCapture$ScreenFlashListener) atomicReference.get());
                bVar2.b(null);
                return;
            case 3:
                lj ljVar = (lj) this.c;
                ljVar.a.onSurfacePrepared((CameraCaptureSession) this.d, (Surface) this.b);
                return;
            case 4:
                WorkDatabase workDatabase = (WorkDatabase) this.c;
                String str = (String) this.d;
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) this.b;
                Iterator<String> it = workDatabase.w().getUnfinishedWorkWithName(str).iterator();
                while (it.hasNext()) {
                    c.a(workManagerImpl, it.next());
                }
                return;
            case 5:
                tv tvVar = (tv) this.c;
                Runnable runnable = (Runnable) this.d;
                Runnable runnable2 = (Runnable) this.b;
                if (tvVar.j) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 6:
                d00 d00Var = (d00) this.c;
                Runnable runnable3 = (Runnable) this.d;
                Runnable runnable4 = (Runnable) this.b;
                if (d00Var.f) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case 7:
                f10 f10Var = (f10) this.c;
                EmojiCompat$MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback = (EmojiCompat$MetadataRepoLoaderCallback) this.d;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.b;
                try {
                    FontRequestEmojiCompatConfig fontRequestEmojiCompatConfigI = mu.i(f10Var.b);
                    if (fontRequestEmojiCompatConfigI == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    d dVar = (d) fontRequestEmojiCompatConfigI.a;
                    synchronized (dVar.d) {
                        dVar.f = threadPoolExecutor;
                        break;
                    }
                    fontRequestEmojiCompatConfigI.a.load(new e10(emojiCompat$MetadataRepoLoaderCallback, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    emojiCompat$MetadataRepoLoaderCallback.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 8:
                e eVar = (e) this.c;
                Observable.Observer observer = (Observable.Observer) this.d;
                Executor executor2 = (Executor) this.b;
                LinkedHashMap linkedHashMap = eVar.a;
                observer.getClass();
                executor2.getClass();
                linkedHashMap.put(observer, executor2);
                executor2.execute(new f20(4, observer, eVar.b));
                return;
            case 9:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.c;
                Intent intent = (Intent) this.d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
                int i = EnhancedIntentService.f;
                try {
                    enhancedIntentService.c(intent);
                    return;
                } finally {
                    taskCompletionSource.b(null);
                }
            case 10:
                LiveDataObservable liveDataObservable = (LiveDataObservable) this.c;
                j jVar = (j) this.d;
                j jVar2 = (j) this.b;
                MutableLiveData mutableLiveData = liveDataObservable.a;
                if (jVar != null) {
                    mutableLiveData.j(jVar);
                }
                mutableLiveData.f(jVar2);
                return;
            case 11:
                a();
                return;
            case 12:
                QueryInterceptorDatabase queryInterceptorDatabase = (QueryInterceptorDatabase) this.c;
                queryInterceptorDatabase.c.onQuery((String) this.d, kotlin.collections.b.w((Object[]) this.b));
                return;
            case 13:
                QueryInterceptorDatabase queryInterceptorDatabase2 = (QueryInterceptorDatabase) this.c;
                String str2 = (String) this.d;
                List<? extends Object> list = (List) this.b;
                list.getClass();
                queryInterceptorDatabase2.c.onQuery(str2, list);
                return;
            case 14:
                androidx.camera.video.d dVar2 = (androidx.camera.video.d) this.c;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.d;
                Timebase timebase = (Timebase) this.b;
                SurfaceRequest surfaceRequest2 = dVar2.o;
                if (surfaceRequest2 != null && !surfaceRequest2.a()) {
                    dVar2.o.d();
                }
                dVar2.o = surfaceRequest;
                dVar2.p = timebase;
                dVar2.a(surfaceRequest, timebase, true);
                return;
            case 15:
                RequestMonitor requestMonitor = (RequestMonitor) this.c;
                zh zhVar = (zh) this.d;
                ListenableFuture listenableFuture = (ListenableFuture) this.b;
                Objects.toString(zhVar);
                requestMonitor.toString();
                requestMonitor.b.remove(listenableFuture);
                return;
            case 16:
                ((SurfaceProcessorNode) this.c).a((SurfaceEdge) this.d, (Map.Entry) this.b);
                return;
            case 17:
                l lVar = (l) this.c;
                SurfaceRequest surfaceRequest3 = (SurfaceRequest) this.d;
                f fVar = (f) this.b;
                tc1 tc1Var = lVar.f;
                tc1Var.a();
                if (tc1Var.g) {
                    tc1Var.g = false;
                    surfaceRequest3.d();
                    surfaceRequest3.j.b(null);
                    return;
                }
                tc1Var.b = surfaceRequest3;
                tc1Var.d = fVar;
                Size size = surfaceRequest3.b;
                tc1Var.a = size;
                tc1Var.f = false;
                if (tc1Var.b()) {
                    return;
                }
                km0.a("SurfaceViewImpl");
                tc1Var.h.e.getHolder().setFixedSize(size.getWidth(), size.getHeight());
                return;
            case 18:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                SessionConfig$Builder sessionConfig$Builder = (SessionConfig$Builder) this.d;
                nm1 nm1Var = (nm1) this.b;
                jx0.g("Surface update cancellation should only occur on main thread.", w91.v());
                atomicBoolean.set(true);
                sessionConfig$Builder.b.e.remove(nm1Var);
                sessionConfig$Builder.e.remove(nm1Var);
                return;
            default:
                WorkLauncherImpl workLauncherImpl = (WorkLauncherImpl) this.c;
                workLauncherImpl.a.h((StartStopToken) this.d, (WorkerParameters.RuntimeExtras) this.b);
                return;
        }
    }

    public /* synthetic */ vf(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
