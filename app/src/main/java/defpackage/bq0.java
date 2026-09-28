package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bq0 {
    public final SparseArray a;
    public nj1 b;

    public bq0(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(nj1 nj1Var, int i, int i2) {
        int iA = nj1Var.a(i);
        SparseArray sparseArray = this.a;
        bq0 bq0Var = (bq0) sparseArray.get(iA);
        if (bq0Var == null) {
            bq0Var = new bq0(1);
            sparseArray.put(nj1Var.a(i), bq0Var);
        }
        if (i2 > i) {
            bq0Var.a(nj1Var, i + 1, i2);
        } else {
            bq0Var.b = nj1Var;
        }
    }
}
