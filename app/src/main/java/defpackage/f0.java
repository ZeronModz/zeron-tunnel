package defpackage;

import com.google.common.util.concurrent.c;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends w91 {
    @Override // defpackage.w91
    public final boolean e(c cVar, a0 a0Var, a0 a0Var2) {
        synchronized (cVar) {
            try {
                if (cVar.b != a0Var) {
                    return false;
                }
                cVar.b = a0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w91
    public final boolean f(c cVar, Object obj, Object obj2) {
        synchronized (cVar) {
            try {
                if (cVar.a != obj) {
                    return false;
                }
                cVar.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w91
    public final boolean g(c cVar, j0 j0Var, j0 j0Var2) {
        synchronized (cVar) {
            try {
                if (cVar.c != j0Var) {
                    return false;
                }
                cVar.c = j0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.w91
    public final a0 p(c cVar) {
        a0 a0Var;
        a0 a0Var2 = a0.d;
        synchronized (cVar) {
            try {
                a0Var = cVar.b;
                if (a0Var != a0Var2) {
                    cVar.b = a0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a0Var;
    }

    @Override // defpackage.w91
    public final j0 q(c cVar) {
        j0 j0Var;
        j0 j0Var2 = j0.c;
        synchronized (cVar) {
            try {
                j0Var = cVar.c;
                if (j0Var != j0Var2) {
                    cVar.c = j0Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j0Var;
    }

    @Override // defpackage.w91
    public final void w(j0 j0Var, j0 j0Var2) {
        j0Var.b = j0Var2;
    }

    @Override // defpackage.w91
    public final void x(j0 j0Var, Thread thread) {
        j0Var.a = thread;
    }
}
