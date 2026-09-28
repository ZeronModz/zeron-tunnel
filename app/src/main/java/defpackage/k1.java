package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends mc2 {
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;

    public k1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(4);
        this.g = atomicReferenceFieldUpdater;
        this.h = atomicReferenceFieldUpdater2;
        this.i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.k = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.mc2
    public final void A(m1 m1Var, Thread thread) {
        this.g.lazySet(m1Var, thread);
    }

    @Override // defpackage.mc2
    public final boolean f(n1 n1Var, j1 j1Var, j1 j1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(n1Var, j1Var, j1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n1Var) == j1Var);
        return false;
    }

    @Override // defpackage.mc2
    public final boolean g(n1 n1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(n1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n1Var) == obj);
        return false;
    }

    @Override // defpackage.mc2
    public final boolean h(n1 n1Var, m1 m1Var, m1 m1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(n1Var, m1Var, m1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(n1Var) == m1Var);
        return false;
    }

    @Override // defpackage.mc2
    public final void z(m1 m1Var, m1 m1Var2) {
        this.h.lazySet(m1Var, m1Var2);
    }
}
