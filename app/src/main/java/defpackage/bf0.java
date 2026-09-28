package defpackage;

import androidx.camera.core.ImageProxy;
import androidx.camera.core.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bf0 extends g {
    public final /* synthetic */ int d = 1;
    public final Object e;

    public bf0(ImageProxy imageProxy, cf0 cf0Var) {
        super(imageProxy);
        this.e = new WeakReference(cf0Var);
        a(new af0(this, 0));
    }

    @Override // androidx.camera.core.g, androidx.camera.core.ImageProxy, java.lang.AutoCloseable
    public void close() {
        switch (this.d) {
            case 1:
                if (!((AtomicBoolean) this.e).getAndSet(true)) {
                    super.close();
                }
                break;
            default:
                super.close();
                break;
        }
    }

    public bf0(ImageProxy imageProxy) {
        super(imageProxy);
        this.e = new AtomicBoolean(false);
    }
}
