package defpackage;

import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.l;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.video.VideoOutput;
import androidx.camera.video.h;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.concurrent.futures.b;
import androidx.lifecycle.MutableLiveData;
import androidx.work.Operation;
import androidx.work.Tracer;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ev0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ev0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                Tracer tracer = (Tracer) obj5;
                String str = (String) obj4;
                Function0 function0 = (Function0) obj3;
                MutableLiveData mutableLiveData = (MutableLiveData) obj2;
                b bVar = (b) obj;
                boolean zIsEnabled = tracer.isEnabled();
                if (zIsEnabled) {
                    try {
                        tracer.beginSection(str);
                    } finally {
                        if (zIsEnabled) {
                            tracer.endSection();
                        }
                    }
                }
                try {
                    function0.invoke();
                    cv0 cv0Var = Operation.SUCCESS;
                    mutableLiveData.i(cv0Var);
                    bVar.b(cv0Var);
                } catch (Throwable th) {
                    mutableLiveData.i(new dv0(th) { // from class: androidx.work.Operation$State$FAILURE
                        public final Throwable a;

                        {
                            this.a = th;
                        }

                        public final String toString() {
                            return "FAILURE (" + this.a.getMessage() + ")";
                        }
                    });
                    bVar.d(th);
                }
                if (zIsEnabled) {
                    return;
                } else {
                    return;
                }
            default:
                h hVar = (h) obj5;
                SurfaceEdge surfaceEdge = (SurfaceEdge) obj4;
                CameraInternal cameraInternal = (CameraInternal) obj3;
                VideoCaptureConfig videoCaptureConfig = (VideoCaptureConfig) obj2;
                Timebase timebase = (Timebase) obj;
                if (cameraInternal == hVar.b()) {
                    hVar.t = surfaceEdge.d(cameraInternal, true);
                    VideoOutput videoOutput = (VideoOutput) ((l) videoCaptureConfig.getConfig()).retrieveOption(VideoCaptureConfig.b);
                    Objects.requireNonNull(videoOutput);
                    videoOutput.onSurfaceRequested(hVar.t, timebase);
                    hVar.N();
                    return;
                }
                return;
        }
    }
}
