package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends qj1 {
    @Override // defpackage.qj1
    public final boolean l(l0 l0Var, b0 b0Var, b0 b0Var2) {
        synchronized (l0Var) {
            try {
                if (l0Var.b != b0Var) {
                    return false;
                }
                l0Var.b = b0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qj1
    public final boolean m(l0 l0Var, Object obj, Object obj2) {
        synchronized (l0Var) {
            try {
                if (l0Var.a != obj) {
                    return false;
                }
                l0Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qj1
    public final boolean n(l0 l0Var, k0 k0Var, k0 k0Var2) {
        synchronized (l0Var) {
            try {
                if (l0Var.c != k0Var) {
                    return false;
                }
                l0Var.c = k0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qj1
    public final void y(k0 k0Var, k0 k0Var2) {
        k0Var.b = k0Var2;
    }

    @Override // defpackage.qj1
    public final void z(k0 k0Var, Thread thread) {
        k0Var.a = thread;
    }
}
