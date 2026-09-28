package defpackage;

import androidx.camera.core.ZoomState;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bs1 implements ZoomState {
    public float a;
    public final float b;
    public final float c;
    public float d;

    public bs1(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final void a(float f) {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
        }
        this.d = f;
        float f2 = this.b;
        if (f != 1.0f) {
            float f3 = this.c;
            if (f == 0.0f) {
                f2 = f3;
            } else {
                double d = 1.0f / f3;
                double d2 = 1.0d / (((((double) (1.0f / f2)) - d) * ((double) f)) + d);
                double d3 = f3;
                double d4 = f2;
                if (d2 < d3) {
                    d2 = d3;
                } else if (d2 > d4) {
                    d2 = d4;
                }
                f2 = (float) d2;
            }
        }
        this.a = f2;
    }

    public final void b(float f) {
        float f2 = this.b;
        float f3 = this.c;
        if (f > f2 || f < f3) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + f3 + " , " + f2 + "]");
        }
        this.a = f;
        float f4 = 0.0f;
        if (f2 != f3) {
            if (f == f2) {
                f4 = 1.0f;
            } else if (f != f3) {
                float f5 = 1.0f / f3;
                f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
            }
        }
        this.d = f4;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getLinearZoom() {
        return this.d;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getMaxZoomRatio() {
        return this.b;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getMinZoomRatio() {
        return this.c;
    }

    @Override // androidx.camera.core.ZoomState
    public final float getZoomRatio() {
        return this.a;
    }
}
