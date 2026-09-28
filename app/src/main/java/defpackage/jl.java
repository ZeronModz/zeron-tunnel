package defpackage;

import androidx.camera.core.SafeCloseImageReaderProxy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SafeCloseImageReaderProxy b;

    public /* synthetic */ jl(SafeCloseImageReaderProxy safeCloseImageReaderProxy, int i) {
        this.a = i;
        this.b = safeCloseImageReaderProxy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SafeCloseImageReaderProxy safeCloseImageReaderProxy = this.b;
        switch (i) {
            case 0:
                safeCloseImageReaderProxy.a();
                break;
            case 1:
                if (safeCloseImageReaderProxy != null) {
                    safeCloseImageReaderProxy.a();
                }
                break;
            default:
                safeCloseImageReaderProxy.a();
                break;
        }
    }
}
