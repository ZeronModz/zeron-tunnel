package defpackage;

import com.google.zxing.common.BitArray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h81 extends df1 {
    public final short c;
    public final short d;

    public h81(df1 df1Var, int i, int i2) {
        super(df1Var);
        this.c = (short) i;
        this.d = (short) i2;
    }

    @Override // defpackage.df1
    public final void a(BitArray bitArray, byte[] bArr) {
        bitArray.b(this.c, this.d);
    }

    public final String toString() {
        short s = this.d;
        return "<" + Integer.toBinaryString((this.c & ((1 << s) - 1)) | (1 << s) | (1 << s)).substring(1) + '>';
    }
}
