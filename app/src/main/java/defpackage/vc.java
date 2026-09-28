package defpackage;

import androidx.camera.core.SurfaceOutput;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vc extends lc1 {
    public final SurfaceOutput a;

    public vc(SurfaceOutput surfaceOutput) {
        this.a = surfaceOutput;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof lc1) && this.a.equals(((vc) ((lc1) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.a + "}";
    }
}
