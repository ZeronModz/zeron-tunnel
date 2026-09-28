package defpackage;

import com.google.android.gms.measurement.internal.r;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hx2 extends ks2 {
    public boolean b;

    public hx2(r rVar) {
        super(rVar);
        this.a.A++;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        u7.p("Not initialized");
    }

    public final void c() {
        if (this.b) {
            u7.p("Can't initialize twice");
        } else {
            if (d()) {
                return;
            }
            this.a.C.incrementAndGet();
            this.b = true;
        }
    }

    public abstract boolean d();
}
