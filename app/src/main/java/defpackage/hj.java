package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.view.f;
import androidx.camera.view.n;
import androidx.concurrent.futures.b;
import androidx.work.Configuration;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkGenerationalId;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.backends.TransportBackend;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hj(tv tvVar, DynamicRange dynamicRange, b bVar) {
        this.a = 4;
        Map map = Collections.EMPTY_MAP;
        this.b = tvVar;
        this.c = dynamicRange;
        this.d = map;
        this.e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((CameraCaptureSession.CaptureCallback) ((zh) obj4).b).onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj, (TotalCaptureResult) obj2);
                break;
            case 1:
                ((CameraCaptureSession.CaptureCallback) ((zh) obj4).b).onCaptureProgressed((CameraCaptureSession) obj3, (CaptureRequest) obj, (CaptureResult) obj2);
                break;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((zh) obj4).b).onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj, (CaptureFailure) obj2);
                break;
            case 3:
                DefaultScheduler defaultScheduler = (DefaultScheduler) obj4;
                TransportContext transportContext = (TransportContext) obj3;
                TransportScheduleCallback transportScheduleCallback = (TransportScheduleCallback) obj;
                EventInternal eventInternal = (EventInternal) obj2;
                Logger logger = DefaultScheduler.f;
                try {
                    TransportBackend transportBackend = defaultScheduler.c.get(transportContext.b());
                    if (transportBackend == null) {
                        String str = "Transport backend '" + transportContext.b() + "' is not registered";
                        logger.warning(str);
                        transportScheduleCallback.onSchedule(new IllegalArgumentException(str));
                    } else {
                        defaultScheduler.e.runCriticalSection(new ls(defaultScheduler, 1, transportContext, transportBackend.decorate(eventInternal)));
                        transportScheduleCallback.onSchedule(null);
                    }
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    transportScheduleCallback.onSchedule(e);
                    return;
                }
                break;
            case 4:
                tv tvVar = (tv) obj4;
                DynamicRange dynamicRange = (DynamicRange) obj3;
                Map map = Collections.EMPTY_MAP;
                b bVar = (b) obj2;
                try {
                    tvVar.a.e(dynamicRange);
                    bVar.b(null);
                } catch (RuntimeException e2) {
                    bVar.d(e2);
                    return;
                }
                break;
            case 5:
                d00 d00Var = (d00) obj4;
                DynamicRange dynamicRange2 = (DynamicRange) obj3;
                Map map2 = Collections.EMPTY_MAP;
                b bVar2 = (b) obj2;
                try {
                    d00Var.a.e(dynamicRange2);
                    bVar2.b(null);
                } catch (RuntimeException e3) {
                    bVar2.d(e3);
                    return;
                }
                break;
            case 6:
                List list = (List) obj4;
                WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj3;
                Configuration configuration = (Configuration) obj;
                WorkDatabase workDatabase = (WorkDatabase) obj2;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Scheduler) it.next()).cancel(workGenerationalId.a);
                }
                e51.b(configuration, workDatabase, list);
                break;
            default:
                n nVar = (n) obj4;
                Surface surface = (Surface) obj3;
                oh ohVar = (oh) obj;
                SurfaceRequest surfaceRequest = (SurfaceRequest) obj2;
                km0.a("TextureViewImpl");
                f fVar = nVar.l;
                if (fVar != null) {
                    fVar.onSurfaceNotInUse();
                    nVar.l = null;
                }
                surface.release();
                if (nVar.g == ohVar) {
                    nVar.g = null;
                }
                if (nVar.h == surfaceRequest) {
                    nVar.h = null;
                }
                break;
        }
    }

    public /* synthetic */ hj(d00 d00Var, DynamicRange dynamicRange, b bVar) {
        this.a = 5;
        Map map = Collections.EMPTY_MAP;
        this.b = d00Var;
        this.c = dynamicRange;
        this.d = map;
        this.e = bVar;
    }

    public /* synthetic */ hj(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
