package defpackage;

import android.util.Size;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.impl.DeferrableSurface;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DeferrableSurface b;

    public /* synthetic */ bw(String str, DeferrableSurface deferrableSurface) {
        this.a = 0;
        this.b = deferrableSurface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        DeferrableSurface deferrableSurface = this.b;
        switch (i) {
            case 0:
                Size size = DeferrableSurface.k;
                try {
                    deferrableSurface.e.get();
                    deferrableSurface.e(DeferrableSurface.n.decrementAndGet(), DeferrableSurface.m.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    deferrableSurface.toString();
                    km0.b("DeferrableSurface");
                    synchronized (deferrableSurface.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", deferrableSurface, Boolean.valueOf(deferrableSurface.c), Integer.valueOf(deferrableSurface.b)), e);
                    }
                }
            case 1:
                h0.o.remove(deferrableSurface);
                return;
            case 2:
                deferrableSurface.a();
                return;
            default:
                deferrableSurface.b();
                return;
        }
    }

    public /* synthetic */ bw(DeferrableSurface deferrableSurface, int i) {
        this.a = i;
        this.b = deferrableSurface;
    }
}
