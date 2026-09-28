package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends mc2 {
    @Override // defpackage.mc2
    public final void A(m1 m1Var, Thread thread) {
        m1Var.a = thread;
    }

    @Override // defpackage.mc2
    public final boolean f(n1 n1Var, j1 j1Var, j1 j1Var2) {
        synchronized (n1Var) {
            try {
                if (n1Var.b != j1Var) {
                    return false;
                }
                n1Var.b = j1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mc2
    public final boolean g(n1 n1Var, Object obj, Object obj2) {
        synchronized (n1Var) {
            try {
                if (n1Var.a != obj) {
                    return false;
                }
                n1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mc2
    public final boolean h(n1 n1Var, m1 m1Var, m1 m1Var2) {
        synchronized (n1Var) {
            try {
                if (n1Var.c != m1Var) {
                    return false;
                }
                n1Var.c = m1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mc2
    public final void z(m1 m1Var, m1 m1Var2) {
        m1Var.b = m1Var2;
    }
}
