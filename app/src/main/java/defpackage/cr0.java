package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cr0 {
    public static final cr0 e = new cr0();
    public final int[] a = new int[929];
    public final int[] b = new int[929];
    public final y6 c;
    public final y6 d;

    public cr0() {
        int i = 1;
        for (int i2 = 0; i2 < 929; i2++) {
            this.a[i2] = i;
            i = (i * 3) % 929;
        }
        for (int i3 = 0; i3 < 928; i3++) {
            this.b[this.a[i3]] = i3;
        }
        this.c = new y6(this, new int[]{0});
        this.d = new y6(this, new int[]{1});
    }

    public final int a(int i, int i2) {
        return (i + i2) % 929;
    }

    public final int b(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.a[928 - this.b[i]];
    }

    public final int c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.a[(iArr[i] + iArr[i2]) % 928];
    }
}
