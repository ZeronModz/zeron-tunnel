package defpackage;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.internal.a;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sb extends bk0 {
    public final LifecycleOwner a;
    public final CameraUseCaseAdapter.CameraId b;

    public sb(LifecycleOwner lifecycleOwner, a aVar) {
        if (lifecycleOwner == null) {
            io0.e("Null lifecycleOwner");
            throw null;
        }
        this.a = lifecycleOwner;
        if (aVar != null) {
            this.b = aVar;
        } else {
            io0.e("Null cameraId");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bk0)) {
            return false;
        }
        sb sbVar = (sb) ((bk0) obj);
        return this.a.equals(sbVar.a) && this.b.equals(sbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.a + ", cameraId=" + this.b + "}";
    }
}
