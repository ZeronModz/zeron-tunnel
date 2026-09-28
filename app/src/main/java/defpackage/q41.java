package defpackage;

import androidx.arch.core.internal.b;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class q41 extends b {
    public final /* synthetic */ int c;

    public q41(r41 r41Var, r41 r41Var2, int i) {
        this.c = i;
        this.a = r41Var2;
        this.b = r41Var;
    }

    @Override // androidx.arch.core.internal.b
    public final r41 b(r41 r41Var) {
        switch (this.c) {
            case 0:
                return r41Var.d;
            default:
                return r41Var.c;
        }
    }

    @Override // androidx.arch.core.internal.b
    public final r41 c(r41 r41Var) {
        switch (this.c) {
            case 0:
                return r41Var.c;
            default:
                return r41Var.d;
        }
    }
}
