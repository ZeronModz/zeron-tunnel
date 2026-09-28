package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.b;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.internal.q0;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CaptureConfig$Builder;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qi implements AsyncFunction, SynchronizationGuard.CriticalSection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qi(int i, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = i;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        ImageProxy imageProxyDequeueImageFromBuffer;
        ti tiVar = (ti) this.b;
        List<el> list = (List) this.c;
        b bVar = tiVar.d;
        q0 q0Var = bVar.k;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (el elVar : list) {
            CaptureConfig$Builder captureConfig$Builder = new CaptureConfig$Builder(elVar);
            int i = elVar.c;
            CameraCaptureResult cameraCaptureResult = null;
            if (i == 5 && !q0Var.d && !q0Var.c && (imageProxyDequeueImageFromBuffer = q0Var.dequeueImageFromBuffer()) != null && q0Var.enqueueImageToImageWriter(imageProxyDequeueImageFromBuffer)) {
                ImageInfo imageInfo = imageProxyDequeueImageFromBuffer.getImageInfo();
                if (imageInfo instanceof CameraCaptureResultImageInfo) {
                    cameraCaptureResult = ((CameraCaptureResultImageInfo) imageInfo).a;
                }
            }
            if (cameraCaptureResult != null) {
                captureConfig$Builder.h = cameraCaptureResult;
            } else {
                int i2 = (tiVar.a != 3 || tiVar.f) ? (i == -1 || i == 5) ? 2 : -1 : 4;
                if (i2 != -1) {
                    captureConfig$Builder.c = i2;
                }
            }
            OverrideAeModeForStillCapture overrideAeModeForStillCapture = tiVar.e;
            if (overrideAeModeForStillCapture.b && this.a == 0 && overrideAeModeForStillCapture.a) {
                Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
                builder.b(CaptureRequest.CONTROL_AE_MODE, 3);
                captureConfig$Builder.c(builder.build());
            }
            androidx.concurrent.futures.b bVar2 = new androidx.concurrent.futures.b();
            bVar2.c = new n31();
            oh ohVar = new oh(bVar2);
            bVar2.b = ohVar;
            bVar2.a = vh.class;
            try {
                captureConfig$Builder.b(new si(bVar2));
                bVar2.a = "submitStillCapture";
            } catch (Exception e) {
                ohVar.a(e);
            }
            arrayList.add(ohVar);
            arrayList2.add(captureConfig$Builder.d());
        }
        bVar.e.onCameraControlCaptureRequests(arrayList2);
        return xg0.b(arrayList);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        Uploader uploader = (Uploader) this.b;
        uploader.d.schedule((TransportContext) this.c, this.a + 1);
        return null;
    }
}
