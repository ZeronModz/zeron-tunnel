package defpackage;

import android.graphics.Matrix;
import androidx.camera.core.ImageInfo;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x31 implements ImageInfo {
    public final /* synthetic */ long a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Matrix c;

    public x31(long j, int i, Matrix matrix) {
        this.a = j;
        this.b = i;
        this.c = matrix;
    }

    @Override // androidx.camera.core.ImageInfo
    public final int getRotationDegrees() {
        return this.b;
    }

    @Override // androidx.camera.core.ImageInfo
    public final Matrix getSensorToBufferTransformMatrix() {
        return new Matrix(this.c);
    }

    @Override // androidx.camera.core.ImageInfo
    public final rd1 getTagBundle() {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
    }

    @Override // androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        return this.a;
    }

    @Override // androidx.camera.core.ImageInfo
    public final void populateExifData(b40 b40Var) {
        throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
    }
}
