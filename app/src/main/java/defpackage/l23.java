package defpackage;

import com.google.android.gms.internal.ads.zzgwy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l23 extends n23 {
    public final char[] g;

    public l23(k23 k23Var) {
        super(k23Var, (Character) null);
        this.g = new char[512];
        n8.S(k23Var.b.length == 16);
        for (int i = 0; i < 256; i++) {
            char[] cArr = this.g;
            char[] cArr2 = k23Var.b;
            cArr[i] = cArr2[i >>> 4];
            cArr[i | 256] = cArr2[i & 15];
        }
    }

    @Override // defpackage.n23
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        n8.I0(0, i, bArr.length);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = bArr[i2] & 255;
            char[] cArr = this.g;
            sb.append(cArr[i3]);
            sb.append(cArr[i3 | 256]);
        }
    }

    @Override // defpackage.n23
    public final int b(byte[] bArr, CharSequence charSequence) throws zzgwy {
        if (charSequence.length() % 2 == 1) {
            int length = charSequence.length();
            throw new zzgwy(vh.i(length, "Invalid input length ", new StringBuilder(String.valueOf(length).length() + 21)));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            k23 k23Var = this.a;
            bArr[i2] = (byte) ((k23Var.a(cCharAt) << 4) | k23Var.a(charSequence.charAt(i + 1)));
            i += 2;
            i2++;
        }
        return i2;
    }

    @Override // defpackage.n23
    public final n23 c(k23 k23Var, Character ch) {
        return new l23(k23Var);
    }
}
