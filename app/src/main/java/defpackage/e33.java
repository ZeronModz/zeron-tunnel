package defpackage;

import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.g7;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e33 extends j03 {
    public static final AtomicReferenceFieldUpdater q = AtomicReferenceFieldUpdater.newUpdater(h33.class, Thread.class, "a");
    public static final AtomicReferenceFieldUpdater r = AtomicReferenceFieldUpdater.newUpdater(h33.class, h33.class, "b");
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(g7.class, h33.class, "c");
    public static final AtomicReferenceFieldUpdater t = AtomicReferenceFieldUpdater.newUpdater(g7.class, d33.class, "b");
    public static final AtomicReferenceFieldUpdater u = AtomicReferenceFieldUpdater.newUpdater(g7.class, Object.class, "a");

    @Override // defpackage.j03
    public final void C(h33 h33Var, Thread thread) {
        q.lazySet(h33Var, thread);
    }

    @Override // defpackage.j03
    public final void F(h33 h33Var, h33 h33Var2) {
        r.lazySet(h33Var, h33Var2);
    }

    @Override // defpackage.j03
    public final boolean I(g7 g7Var, h33 h33Var, h33 h33Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = s;
            if (atomicReferenceFieldUpdater.compareAndSet(g7Var, h33Var, h33Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g7Var) == h33Var);
        return false;
    }

    @Override // defpackage.j03
    public final boolean K(f7 f7Var, d33 d33Var, d33 d33Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = t;
            if (atomicReferenceFieldUpdater.compareAndSet(f7Var, d33Var, d33Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(f7Var) == d33Var);
        return false;
    }

    @Override // defpackage.j03
    public final h33 O(f7 f7Var) {
        return (h33) s.getAndSet(f7Var, h33.c);
    }

    @Override // defpackage.j03
    public final d33 Q(f7 f7Var) {
        return (d33) t.getAndSet(f7Var, d33.d);
    }

    @Override // defpackage.j03
    public final boolean S(g7 g7Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = u;
            if (atomicReferenceFieldUpdater.compareAndSet(g7Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(g7Var) == obj);
        return false;
    }
}
