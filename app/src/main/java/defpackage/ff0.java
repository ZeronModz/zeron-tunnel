package defpackage;

import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.workaround.ImageCapturePixelHDRPlus;
import androidx.camera.core.impl.CaptureConfig$Builder;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.l;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ff0 extends ni {
    public static final ff0 b;

    static {
        new ImageCapturePixelHDRPlus();
        b = new ff0();
    }

    @Override // defpackage.ni, androidx.camera.core.impl.CaptureConfig$OptionUnpacker
    public final void unpack(UseCaseConfig useCaseConfig, CaptureConfig$Builder captureConfig$Builder) {
        super.unpack(useCaseConfig, captureConfig$Builder);
        if (!(useCaseConfig instanceof ImageCaptureConfig)) {
            u7.r("config is not ImageCaptureConfig");
            return;
        }
        ImageCaptureConfig imageCaptureConfig = (ImageCaptureConfig) useCaseConfig;
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        xa xaVar = ImageCaptureConfig.b;
        if (imageCaptureConfig.containsOption(xaVar)) {
            ImageCapturePixelHDRPlus.a(((Integer) ((l) imageCaptureConfig.getConfig()).retrieveOption(xaVar)).intValue(), builder);
        }
        captureConfig$Builder.c(builder.build());
    }
}
