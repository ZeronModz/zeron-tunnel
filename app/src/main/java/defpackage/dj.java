package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.CaptureConfig$Builder;
import androidx.camera.core.impl.PreviewConfig;
import androidx.camera.core.impl.SessionConfig$Builder;
import androidx.camera.core.impl.SessionConfig$OptionUnpacker;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dj implements SessionConfig$OptionUnpacker {
    public static final dj a = new dj();

    @Override // androidx.camera.core.impl.SessionConfig$OptionUnpacker
    public final void unpack(Size size, UseCaseConfig useCaseConfig, SessionConfig$Builder sessionConfig$Builder) {
        v61 defaultSessionConfig = useCaseConfig.getDefaultSessionConfig(null);
        l lVar = l.c;
        int i = v61.a().g.c;
        if (defaultSessionConfig != null) {
            i = defaultSessionConfig.g.c;
            List<CameraDevice.StateCallback> list = defaultSessionConfig.c;
            sessionConfig$Builder.getClass();
            for (CameraDevice.StateCallback stateCallback : list) {
                ArrayList arrayList = sessionConfig$Builder.c;
                if (!arrayList.contains(stateCallback)) {
                    arrayList.add(stateCallback);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback2 : defaultSessionConfig.d) {
                ArrayList arrayList2 = sessionConfig$Builder.d;
                if (!arrayList2.contains(stateCallback2)) {
                    arrayList2.add(stateCallback2);
                }
            }
            sessionConfig$Builder.b.a(defaultSessionConfig.g.e);
            lVar = defaultSessionConfig.g.b;
        }
        sessionConfig$Builder.b.b = k.c(lVar);
        if (useCaseConfig instanceof PreviewConfig) {
            Rational rational = fy0.a;
            if (((PreviewPixelHDRnetQuirk) px.a.b(PreviewPixelHDRnetQuirk.class)) != null && !fy0.a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
                builder.b(CaptureRequest.TONEMAP_MODE, 2);
                sessionConfig$Builder.b.c(builder.build());
            }
        }
        Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(useCaseConfig);
        sessionConfig$Builder.b.c = ((Integer) camera2ImplConfig.a.retrieveOption(Camera2ImplConfig.b, Integer.valueOf(i))).intValue();
        CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) camera2ImplConfig.a.retrieveOption(Camera2ImplConfig.d, new bk());
        ArrayList arrayList3 = sessionConfig$Builder.c;
        if (!arrayList3.contains(stateCallback3)) {
            arrayList3.add(stateCallback3);
        }
        CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) camera2ImplConfig.a.retrieveOption(Camera2ImplConfig.e, new pj());
        ArrayList arrayList4 = sessionConfig$Builder.d;
        if (!arrayList4.contains(stateCallback4)) {
            arrayList4.add(stateCallback4);
        }
        sessionConfig$Builder.a(new dl((CameraCaptureSession.CaptureCallback) camera2ImplConfig.a.retrieveOption(Camera2ImplConfig.f, new mi())));
        int videoStabilizationMode = useCaseConfig.getVideoStabilizationMode();
        if (videoStabilizationMode != 0) {
            CaptureConfig$Builder captureConfig$Builder = sessionConfig$Builder.b;
            if (videoStabilizationMode != 0) {
                captureConfig$Builder.b.insertOption(UseCaseConfig.OPTION_VIDEO_STABILIZATION_MODE, Integer.valueOf(videoStabilizationMode));
            }
        }
        int previewStabilizationMode = useCaseConfig.getPreviewStabilizationMode();
        if (previewStabilizationMode != 0) {
            CaptureConfig$Builder captureConfig$Builder2 = sessionConfig$Builder.b;
            if (previewStabilizationMode != 0) {
                captureConfig$Builder2.b.insertOption(UseCaseConfig.OPTION_PREVIEW_STABILIZATION_MODE, Integer.valueOf(previewStabilizationMode));
            }
        }
        k kVarB = k.b();
        xa xaVar = Camera2ImplConfig.g;
        kVarB.insertOption(xaVar, (String) camera2ImplConfig.a.retrieveOption(xaVar, null));
        xa xaVar2 = Camera2ImplConfig.c;
        Long l = (Long) camera2ImplConfig.a.retrieveOption(xaVar2, -1L);
        l.getClass();
        kVarB.insertOption(xaVar2, l);
        sessionConfig$Builder.b.c(kVarB);
        sessionConfig$Builder.b.c(CaptureRequestOptions.Builder.b(camera2ImplConfig.a).build());
    }
}
