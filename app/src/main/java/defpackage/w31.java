package defpackage;

import androidx.camera.core.ImageProxy;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w31 implements ImageProxy.PlaneProxy {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ByteBuffer c;

    public w31(ByteBuffer byteBuffer, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = byteBuffer;
    }

    @Override // androidx.camera.core.ImageProxy.PlaneProxy
    public final ByteBuffer getBuffer() {
        return this.c;
    }

    @Override // androidx.camera.core.ImageProxy.PlaneProxy
    public final int getPixelStride() {
        return this.b;
    }

    @Override // androidx.camera.core.ImageProxy.PlaneProxy
    public final int getRowStride() {
        return this.a;
    }
}
