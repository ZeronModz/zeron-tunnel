package defpackage;

import com.google.android.gms.measurement.internal.g0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class oi3 extends hi3 {
    public boolean c;

    public oi3(g0 g0Var) {
        super(g0Var);
        this.b.r++;
    }

    public final void b() {
        if (this.c) {
            return;
        }
        u7.p("Not initialized");
    }

    public final void c() {
        if (this.c) {
            u7.p("Can't initialize twice");
            return;
        }
        d();
        this.b.s++;
        this.c = true;
    }

    public abstract void d();
}
