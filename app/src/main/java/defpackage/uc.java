package defpackage;

import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class uc extends fc1 {
    public final SurfaceConfig$ConfigType a;
    public final SurfaceConfig$ConfigSize b;
    public final long c;

    public uc(SurfaceConfig$ConfigType surfaceConfig$ConfigType, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize, long j) {
        if (surfaceConfig$ConfigType == null) {
            io0.e("Null configType");
            throw null;
        }
        this.a = surfaceConfig$ConfigType;
        if (surfaceConfig$ConfigSize == null) {
            io0.e("Null configSize");
            throw null;
        }
        this.b = surfaceConfig$ConfigSize;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fc1) {
            uc ucVar = (uc) ((fc1) obj);
            if (this.a.equals(ucVar.a) && this.b.equals(ucVar.b) && this.c == ucVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        sb.append(this.a);
        sb.append(", configSize=");
        sb.append(this.b);
        sb.append(", streamUseCase=");
        return vh.p(sb, this.c, "}");
    }
}
