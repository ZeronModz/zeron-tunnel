package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends qj1 {
    public final AtomicReferenceFieldUpdater e;
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;

    public d0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.e = atomicReferenceFieldUpdater;
        this.f = atomicReferenceFieldUpdater2;
        this.g = atomicReferenceFieldUpdater3;
        this.h = atomicReferenceFieldUpdater4;
        this.i = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.qj1
    public final boolean l(l0 l0Var, b0 b0Var, b0 b0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(l0Var, b0Var, b0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l0Var) == b0Var);
        return false;
    }

    @Override // defpackage.qj1
    public final boolean m(l0 l0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(l0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l0Var) == obj);
        return false;
    }

    @Override // defpackage.qj1
    public final boolean n(l0 l0Var, k0 k0Var, k0 k0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.g;
            if (atomicReferenceFieldUpdater.compareAndSet(l0Var, k0Var, k0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(l0Var) == k0Var);
        return false;
    }

    @Override // defpackage.qj1
    public final void y(k0 k0Var, k0 k0Var2) {
        this.f.lazySet(k0Var, k0Var2);
    }

    @Override // defpackage.qj1
    public final void z(k0 k0Var, Thread thread) {
        this.e.lazySet(k0Var, thread);
    }
}
