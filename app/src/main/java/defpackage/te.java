package defpackage;

import com.google.zxing.common.BitArray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class te extends df1 {
    public final int c;
    public final int d;

    public te(df1 df1Var, int i, int i2) {
        super(df1Var);
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.df1
    public final void a(BitArray bitArray, byte[] bArr) {
        int i = 0;
        while (true) {
            int i2 = this.d;
            if (i >= i2) {
                return;
            }
            if (i == 0 || (i == 31 && i2 <= 62)) {
                bitArray.b(31, 5);
                if (i2 > 62) {
                    bitArray.b(i2 - 31, 16);
                } else if (i == 0) {
                    bitArray.b(Math.min(i2, 31), 5);
                } else {
                    bitArray.b(i2 - 31, 5);
                }
            }
            bitArray.b(bArr[this.c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.c);
        sb.append("::");
        sb.append((r1 + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
