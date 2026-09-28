package defpackage;

import com.google.zxing.common.reedsolomon.GenericGF;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class kb0 {
    public final GenericGF a;
    public final int[] b;

    public kb0(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            s31.c();
            throw null;
        }
        this.a = genericGF;
        int length = iArr.length;
        int i = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.b = iArr;
            return;
        }
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    public final kb0 a(kb0 kb0Var) {
        GenericGF genericGF = kb0Var.a;
        GenericGF genericGF2 = this.a;
        if (!genericGF2.equals(genericGF)) {
            u7.r("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (e()) {
            return kb0Var;
        }
        if (kb0Var.e()) {
            return this;
        }
        int[] iArr = kb0Var.b;
        int[] iArr2 = this.b;
        if (iArr2.length > iArr.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new kb0(genericGF2, iArr3);
    }

    public final int b(int i) {
        if (i == 0) {
            return c(0);
        }
        int[] iArr = this.b;
        if (i != 1) {
            int iC = iArr[0];
            int length = iArr.length;
            for (int i2 = 1; i2 < length; i2++) {
                iC = this.a.c(i, iC) ^ iArr[i2];
            }
            return iC;
        }
        int i3 = 0;
        for (int i4 : iArr) {
            GenericGF genericGF = GenericGF.h;
            i3 ^= i4;
        }
        return i3;
    }

    public final int c(int i) {
        return this.b[(r1.length - 1) - i];
    }

    public final int d() {
        return this.b.length - 1;
    }

    public final boolean e() {
        return this.b[0] == 0;
    }

    public final kb0 f(int i) {
        GenericGF genericGF = this.a;
        if (i == 0) {
            return genericGF.c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr2[i2] = genericGF.c(iArr[i2], i);
        }
        return new kb0(genericGF, iArr2);
    }

    public final kb0 g(kb0 kb0Var) {
        GenericGF genericGF = kb0Var.a;
        GenericGF genericGF2 = this.a;
        if (!genericGF2.equals(genericGF)) {
            u7.r("GenericGFPolys do not have same GenericGF field");
            return null;
        }
        if (e() || kb0Var.e()) {
            return genericGF2.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = kb0Var.b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = iArr3[i4] ^ genericGF2.c(i2, iArr2[i3]);
            }
        }
        return new kb0(genericGF2, iArr3);
    }

    public final kb0 h(int i, int i2) {
        if (i < 0) {
            s31.c();
            return null;
        }
        GenericGF genericGF = this.a;
        if (i2 == 0) {
            return genericGF.c;
        }
        int[] iArr = this.b;
        int length = iArr.length;
        int[] iArr2 = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = genericGF.c(iArr[i3], i2);
        }
        return new kb0(genericGF, iArr2);
    }

    public final String toString() {
        if (e()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    if (iD == d()) {
                        sb.append("-");
                    } else {
                        sb.append(" - ");
                    }
                    iC = -iC;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    GenericGF genericGF = this.a;
                    if (iC == 0) {
                        genericGF.getClass();
                        s31.c();
                        return null;
                    }
                    int i = genericGF.b[iC];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iD);
                    }
                }
            }
        }
        return sb.toString();
    }
}
