package defpackage;

import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.g7;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class f33 extends j03 {
    @Override // defpackage.j03
    public final void C(h33 h33Var, Thread thread) {
        h33Var.a = thread;
    }

    @Override // defpackage.j03
    public final void F(h33 h33Var, h33 h33Var2) {
        h33Var.b = h33Var2;
    }

    @Override // defpackage.j03
    public final boolean I(g7 g7Var, h33 h33Var, h33 h33Var2) {
        synchronized (g7Var) {
            try {
                if (g7Var.c != h33Var) {
                    return false;
                }
                g7Var.c = h33Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.j03
    public final boolean K(f7 f7Var, d33 d33Var, d33 d33Var2) {
        synchronized (f7Var) {
            try {
                if (f7Var.b != d33Var) {
                    return false;
                }
                f7Var.b = d33Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.j03
    public final h33 O(f7 f7Var) {
        h33 h33Var;
        h33 h33Var2 = h33.c;
        synchronized (f7Var) {
            try {
                h33Var = f7Var.c;
                if (h33Var != h33Var2) {
                    f7Var.c = h33Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h33Var;
    }

    @Override // defpackage.j03
    public final d33 Q(f7 f7Var) {
        d33 d33Var;
        d33 d33Var2 = d33.d;
        synchronized (f7Var) {
            try {
                d33Var = f7Var.b;
                if (d33Var != d33Var2) {
                    f7Var.b = d33Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d33Var;
    }

    @Override // defpackage.j03
    public final boolean S(g7 g7Var, Object obj, Object obj2) {
        synchronized (g7Var) {
            try {
                if (g7Var.a != obj) {
                    return false;
                }
                g7Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
