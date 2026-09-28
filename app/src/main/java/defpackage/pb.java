package defpackage;

import androidx.camera.core.internal.ImmutableZoomState;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pb extends ImmutableZoomState {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pb(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableZoomState) {
            ImmutableZoomState immutableZoomState = (ImmutableZoomState) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(immutableZoomState.getZoomRatio()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(immutableZoomState.getMaxZoomRatio()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(immutableZoomState.getMinZoomRatio()) && Float.floatToIntBits(this.d) == Float.floatToIntBits(immutableZoomState.getLinearZoom())) {
                return true;
            }
        }
        return false;
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

    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
