package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.impl.CaptureConfig$Builder;
import androidx.camera.core.impl.CaptureConfig$OptionUnpacker;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.k;
import androidx.camera.core.impl.l;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ni implements CaptureConfig$OptionUnpacker {
    public static final ni a = new ni();

    @Override // androidx.camera.core.impl.CaptureConfig$OptionUnpacker
    public void unpack(UseCaseConfig useCaseConfig, CaptureConfig$Builder captureConfig$Builder) {
        el defaultCaptureConfig = useCaseConfig.getDefaultCaptureConfig(null);
        l lVar = l.c;
        xa xaVar = el.i;
        int i = new CaptureConfig$Builder().d().c;
        if (defaultCaptureConfig != null) {
            i = defaultCaptureConfig.c;
            captureConfig$Builder.a(defaultCaptureConfig.e);
            lVar = defaultCaptureConfig.b;
        }
        captureConfig$Builder.getClass();
        captureConfig$Builder.b = k.c(lVar);
        Camera2ImplConfig camera2ImplConfig = new Camera2ImplConfig(useCaseConfig);
        xa xaVar2 = Camera2ImplConfig.b;
        Integer numValueOf = Integer.valueOf(i);
        Config config = camera2ImplConfig.a;
        captureConfig$Builder.c = ((Integer) config.retrieveOption(xaVar2, numValueOf)).intValue();
        captureConfig$Builder.b(new dl((CameraCaptureSession.CaptureCallback) config.retrieveOption(Camera2ImplConfig.f, new mi())));
        captureConfig$Builder.c(CaptureRequestOptions.Builder.b(config).build());
    }
}
