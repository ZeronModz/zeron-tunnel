package defpackage;

import android.util.Size;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.PreviewView;
import androidx.camera.view.e;
import androidx.camera.view.g;
import androidx.camera.view.h;
import androidx.camera.view.l;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.b;
import androidx.work.DirectExecutor;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ls implements Continuation, SynchronizationGuard.CriticalSection, CallbackToFutureAdapter$Resolver, SurfaceRequest.TransformationInfoListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ls(Object obj, int i, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(b bVar) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 2:
                oh ohVar = (oh) obj3;
                Executor executor = (Executor) obj2;
                bVar.a(new w2(ohVar, 25), executor);
                xg0.a(ohVar, new jx2(bVar, 6), executor);
                return "surfaceList[" + ((Collection) obj) + "]";
            default:
                String str = (String) obj2;
                bVar.getClass();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                bVar.a(new hl0(atomicBoolean, 0), DirectExecutor.INSTANCE);
                ((Executor) obj3).execute(new il0(atomicBoolean, bVar, (Function0) obj, 0));
                return str;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        DefaultScheduler defaultScheduler = (DefaultScheduler) this.b;
        TransportContext transportContext = (TransportContext) this.c;
        EventInternal eventInternal = (EventInternal) this.d;
        Logger logger = DefaultScheduler.f;
        defaultScheduler.d.persist(transportContext, eventInternal);
        defaultScheduler.a.schedule(transportContext, 1);
        return null;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(qc1 qc1Var) {
        h hVar;
        g gVar = (g) this.b;
        CameraInternal cameraInternal = (CameraInternal) this.c;
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.d;
        PreviewView previewView = gVar.a;
        Objects.toString(qc1Var);
        km0.a("PreviewView");
        boolean z = cameraInternal.getCameraInfoInternal().getLensFacing() == 0;
        e eVar = previewView.d;
        Size size = surfaceRequest.b;
        eVar.getClass();
        Objects.toString(qc1Var);
        Objects.toString(size);
        km0.a("PreviewTransform");
        eVar.b = ((xc) qc1Var).a;
        xc xcVar = (xc) qc1Var;
        eVar.c = xcVar.b;
        eVar.e = xcVar.c;
        eVar.a = size;
        eVar.f = z;
        eVar.g = xcVar.d;
        eVar.d = xcVar.e;
        if (((xc) qc1Var).c == -1 || ((hVar = previewView.b) != null && (hVar instanceof l))) {
            previewView.e = true;
        } else {
            previewView.e = false;
        }
        previewView.b();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) this.d;
        if (task.m()) {
            taskCompletionSource.d(task.i());
        } else if (task.h() != null) {
            taskCompletionSource.c(task.h());
        } else if (atomicBoolean.getAndSet(true)) {
            cancellationTokenSource.a.a.t(null);
        }
        return com.google.android.gms.tasks.b.e(null);
    }
}
