package defpackage;

import androidx.camera.core.impl.ImageOutputConfig;
import java.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class lf0 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = ImageOutputConfig.INVALID_ROTATION;
    }

    public static int a(ImageOutputConfig imageOutputConfig, int i) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_APP_TARGET_ROTATION, Integer.valueOf(i))).intValue();
    }

    public static ArrayList b(ImageOutputConfig imageOutputConfig) {
        List list = (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS);
        Objects.requireNonNull(list);
        return new ArrayList(list);
    }

    public static ArrayList c(ImageOutputConfig imageOutputConfig, List list) {
        List list2 = (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    public static int d(ImageOutputConfig imageOutputConfig, int i) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_MIRROR_MODE, Integer.valueOf(i))).intValue();
    }

    public static int e(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO)).intValue();
    }

    public static int f(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION)).intValue();
    }

    public static int g(ImageOutputConfig imageOutputConfig, int i) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i))).intValue();
    }

    public static void h(ImageOutputConfig imageOutputConfig) {
        boolean zHasTargetAspectRatio = imageOutputConfig.hasTargetAspectRatio();
        boolean z = imageOutputConfig.getTargetResolution(null) != null;
        if (zHasTargetAspectRatio && z) {
            u7.r("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (imageOutputConfig.getResolutionSelector(null) != null) {
            if (zHasTargetAspectRatio || z) {
                u7.r("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
