package defpackage;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ImageOutputConfig;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dc1 {
    public final int a;
    public final int b;
    public final Rational c;
    public final boolean d;

    public dc1(CameraInfoInternal cameraInfoInternal, Rational rational) {
        this.a = cameraInfoInternal.getSensorRotationDegrees();
        this.b = cameraInfoInternal.getLensFacing();
        this.c = rational;
        boolean z = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z = false;
        }
        this.d = z;
    }

    public final Size a(ImageOutputConfig imageOutputConfig) {
        int targetRotation = imageOutputConfig.getTargetRotation(0);
        Size targetResolution = imageOutputConfig.getTargetResolution(null);
        if (targetResolution != null) {
            int iT = dn0.t(dn0.F(targetRotation), this.a, 1 == this.b);
            if (iT == 90 || iT == 270) {
                return new Size(targetResolution.getHeight(), targetResolution.getWidth());
            }
        }
        return targetResolution;
    }
}
