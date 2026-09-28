package defpackage;

import android.graphics.Matrix;
import androidx.camera.core.ImmutableImageInfo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ob extends ImmutableImageInfo {
    public final rd1 a;
    public final long b;
    public final int c;
    public final Matrix d;

    public ob(rd1 rd1Var, long j, int i, Matrix matrix) {
        if (rd1Var == null) {
            io0.e("Null tagBundle");
            throw null;
        }
        this.a = rd1Var;
        this.b = j;
        this.c = i;
        if (matrix != null) {
            this.d = matrix;
        } else {
            io0.e("Null sensorToBufferTransformMatrix");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableImageInfo) {
            ImmutableImageInfo immutableImageInfo = (ImmutableImageInfo) obj;
            if (this.a.equals(immutableImageInfo.getTagBundle()) && this.b == immutableImageInfo.getTimestamp() && this.c == immutableImageInfo.getRotationDegrees() && this.d.equals(immutableImageInfo.getSensorToBufferTransformMatrix())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.ImageInfo
    public final int getRotationDegrees() {
        return this.c;
    }

    @Override // androidx.camera.core.ImageInfo
    public final Matrix getSensorToBufferTransformMatrix() {
        return this.d;
    }

    @Override // androidx.camera.core.ImageInfo
    public final rd1 getTagBundle() {
        return this.a;
    }

    @Override // androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return this.d.hashCode() ^ ((((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
