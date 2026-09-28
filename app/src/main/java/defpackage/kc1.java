package defpackage;

import android.util.Size;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.concurrent.futures.b;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kc1 extends DeferrableSurface {
    public final oh o;
    public final b p;
    public DeferrableSurface q;
    public mc1 r;

    public kc1(Size size, int i) {
        super(size, i);
        b bVar = new b();
        bVar.c = new n31();
        oh ohVar = new oh(bVar);
        bVar.b = ohVar;
        bVar.a = vh.class;
        try {
            this.p = bVar;
            bVar.a = "SettableFuture hashCode: " + hashCode();
        } catch (Exception e) {
            ohVar.a(e);
        }
        this.o = ohVar;
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final void a() {
        super.a();
        w91.A(new hc1(this, 2));
    }

    @Override // androidx.camera.core.impl.DeferrableSurface
    public final ListenableFuture f() {
        return this.o;
    }

    public final boolean g(DeferrableSurface deferrableSurface, Runnable runnable) {
        boolean z;
        Size size = this.h;
        w91.i();
        deferrableSurface.getClass();
        int i = deferrableSurface.i;
        Size size2 = deferrableSurface.h;
        DeferrableSurface deferrableSurface2 = this.q;
        if (deferrableSurface2 == deferrableSurface) {
            return false;
        }
        jx0.g("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", deferrableSurface2 == null);
        jx0.b(size.equals(size2), "The provider's size(" + size + ") must match the parent(" + size2 + ")");
        int i2 = this.i;
        jx0.b(i2 == i, vh.h(i2, "The provider's format(", i, ") must match the parent(", ")"));
        synchronized (this.a) {
            z = this.c;
        }
        jx0.g("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.q = deferrableSurface;
        xg0.r(deferrableSurface.c(), this.p);
        deferrableSurface.d();
        xg0.p(this.e).addListener(new bw(deferrableSurface, 3), fy.b());
        xg0.p(deferrableSurface.g).addListener(runnable, dn0.r());
        return true;
    }
}
