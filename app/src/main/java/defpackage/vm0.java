package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vm0 {
    public final int a;
    public final int b;

    public vm0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public abstract vm0 a(int i, int i2, int i3, int i4);

    public abstract byte[] b();

    public abstract byte[] c(int i, byte[] bArr);

    public boolean d() {
        return false;
    }

    public vm0 e() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public final String toString() {
        int i = this.a;
        byte[] bArrC = new byte[i];
        int i2 = this.b;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            bArrC = c(i3, bArrC);
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = bArrC[i4] & 255;
                sb.append(i5 < 64 ? '#' : i5 < 128 ? '+' : i5 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
