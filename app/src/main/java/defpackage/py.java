package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import androidx.camera.camera2.internal.compat.workaround.DisplaySizeCorrector;
import androidx.camera.camera2.internal.compat.workaround.MaxPreviewSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class py {
    public static final Size e = new Size(1920, 1080);
    public static final Size f = new Size(320, 240);
    public static final Size g = new Size(640, 480);
    public static final Object h = new Object();
    public static volatile py i;
    public final DisplayManager a;
    public volatile Size b = null;
    public final MaxPreviewSize c = new MaxPreviewSize();
    public final DisplaySizeCorrector d = new DisplaySizeCorrector();

    public py(Context context) {
        this.a = (DisplayManager) context.getSystemService(Constants$ScionAnalytics$MessageType.DISPLAY_NOTIFICATION);
    }

    public static py b(Context context) {
        if (i == null) {
            synchronized (h) {
                try {
                    if (i == null) {
                        i = new py(context);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public static Display d(Display[] displayArr, boolean z) {
        Display display = null;
        int i2 = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i3 = point.x * point.y;
                if (i3 > i2) {
                    display = display2;
                    i2 = i3;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size sizeA;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = p81.a;
        if (size.getHeight() * size.getWidth() < p81.a(f)) {
            size = this.d.a != null ? (Size) SmallDisplaySizeQuirk.a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (this.c.a != null && (sizeA = ExtraCroppingQuirk.a(SurfaceConfig$ConfigType.PRIV)) != null) {
            if (sizeA.getHeight() * sizeA.getWidth() > size.getHeight() * size.getWidth()) {
                return sizeA;
            }
        }
        return size;
    }

    public final Display c(boolean z) {
        Display[] displays = this.a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display displayD = d(displays, z);
        if (displayD == null && z) {
            displayD = d(displays, false);
        }
        if (displayD != null) {
            return displayD;
        }
        u7.r("No display can be found from the input display manager!");
        return null;
    }

    public final Size e() {
        if (this.b != null) {
            return this.b;
        }
        this.b = a();
        return this.b;
    }
}
