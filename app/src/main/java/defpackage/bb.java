package defpackage;

import androidx.camera.core.processing.concurrent.DualOutConfig;
import androidx.camera.core.processing.util.OutConfig;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bb extends DualOutConfig {
    public final yb a;
    public final yb b;

    public bb(yb ybVar, yb ybVar2) {
        this.a = ybVar;
        this.b = ybVar2;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public final OutConfig a() {
        return this.a;
    }

    @Override // androidx.camera.core.processing.concurrent.DualOutConfig
    public final OutConfig b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DualOutConfig)) {
            return false;
        }
        DualOutConfig dualOutConfig = (DualOutConfig) obj;
        return this.a.equals(dualOutConfig.a()) && this.b.equals(dualOutConfig.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
