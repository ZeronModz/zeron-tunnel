package defpackage;

import com.google.zxing.aztec.encoder.HighLevelEncoder;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class da1 {
    public static final da1 f = new da1(df1.b, 0, 0, 0);
    public final int a;
    public final df1 b;
    public final int c;
    public final int d;
    public final int e;

    public da1(df1 df1Var, int i, int i2, int i3) {
        this.b = df1Var;
        this.a = i;
        this.c = i2;
        this.d = i3;
        this.e = i2 > 62 ? 21 : i2 > 31 ? 20 : i2 > 0 ? 10 : 0;
    }

    public final da1 a(int i) {
        df1 h81Var = this.b;
        int i2 = this.a;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int[] iArr = HighLevelEncoder.d[i2];
            i2 = 0;
            int i4 = iArr[0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            h81Var.getClass();
            i3 += i6;
            h81Var = new h81(h81Var, i5, i6);
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        int i9 = i7 + 1;
        da1 da1Var = new da1(h81Var, i2, i9, i3 + i8);
        return i9 == 2078 ? da1Var.b(i + 1) : da1Var;
    }

    public final da1 b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        df1 df1Var = this.b;
        df1Var.getClass();
        return new da1(new te(df1Var, i - i2, i2), this.a, 0, this.d);
    }

    public final boolean c(da1 da1Var) {
        int i = this.d + (HighLevelEncoder.d[this.a][da1Var.a] >> 16);
        int i2 = da1Var.c;
        int i3 = this.c;
        if (i3 < i2) {
            i += da1Var.e - this.e;
        } else if (i3 > i2 && i2 > 0) {
            i += 10;
        }
        return i <= da1Var.d;
    }

    public final da1 d(int i, int i2) {
        int i3 = this.d;
        df1 h81Var = this.b;
        int i4 = this.a;
        if (i != i4) {
            int i5 = HighLevelEncoder.d[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            h81Var.getClass();
            i3 += i7;
            h81Var = new h81(h81Var, i6, i7);
        }
        int i8 = i == 2 ? 4 : 5;
        h81Var.getClass();
        return new da1(new h81(h81Var, i2, i8), i, 0, i3 + i8);
    }

    public final da1 e(int i, int i2) {
        int i3 = this.a;
        int i4 = i3 == 2 ? 4 : 5;
        int i5 = HighLevelEncoder.f[i3][i];
        df1 df1Var = this.b;
        df1Var.getClass();
        return new da1(new h81(new h81(df1Var, i5, i4), i2, 5), i3, 0, this.d + i4 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.c[this.a], Integer.valueOf(this.d), Integer.valueOf(this.c));
    }
}
