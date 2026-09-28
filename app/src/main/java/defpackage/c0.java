package defpackage;

import com.google.common.util.concurrent.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends w91 {
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;

    public c0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.k = atomicReferenceFieldUpdater;
        this.l = atomicReferenceFieldUpdater2;
        this.m = atomicReferenceFieldUpdater3;
        this.n = atomicReferenceFieldUpdater4;
        this.o = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.w91
    public final boolean e(c cVar, a0 a0Var, a0 a0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, a0Var, a0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == a0Var);
        return false;
    }

    @Override // defpackage.w91
    public final boolean f(c cVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == obj);
        return false;
    }

    @Override // defpackage.w91
    public final boolean g(c cVar, j0 j0Var, j0 j0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.m;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, j0Var, j0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == j0Var);
        return false;
    }

    @Override // defpackage.w91
    public final a0 p(c cVar) {
        return (a0) this.n.getAndSet(cVar, a0.d);
    }

    @Override // defpackage.w91
    public final j0 q(c cVar) {
        return (j0) this.m.getAndSet(cVar, j0.c);
    }

    @Override // defpackage.w91
    public final void w(j0 j0Var, j0 j0Var2) {
        this.l.lazySet(j0Var, j0Var2);
    }

    @Override // defpackage.w91
    public final void x(j0 j0Var, Thread thread) {
        this.k.lazySet(j0Var, thread);
    }
}
