package defpackage;

import android.util.Size;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pc1 extends DeferrableSurface {
    public final /* synthetic */ SurfaceRequest o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc1(SurfaceRequest surfaceRequest, Size size) {
        super(size, 34);
        this.o = surfaceRequest;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final ListenableFuture f() {
        return this.o.g;
    }
}
