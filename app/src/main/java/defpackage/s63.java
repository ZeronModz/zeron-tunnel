package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s63 extends r63 {
    public final long[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public s63(t63 t63Var) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.d = jArr3;
        wp2 wp2Var = t63Var.a;
        n8.T(jArr, (long[]) wp2Var.c, (long[]) wp2Var.b);
        n8.c0(jArr2, (long[]) wp2Var.c, (long[]) wp2Var.b);
        System.arraycopy((long[]) wp2Var.d, 0, jArr3, 0, 10);
        n8.r0(jArr4, t63Var.b, u63.b);
    }

    @Override // defpackage.r63
    public final void a(long[] jArr, long[] jArr2) {
        n8.r0(jArr, jArr2, this.d);
    }
}
