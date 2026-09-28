package defpackage;

import com.google.android.gms.internal.ads.zzgwy;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class m23 extends n23 {
    public m23(String str, String str2) {
        this(new k23(str2.toCharArray(), str), (Character) '=');
    }

    @Override // defpackage.n23
    public final void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        n8.I0(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16) | (bArr[i2 + 2] & 255);
            char[] cArr = this.a.b;
            sb.append(cArr[i4 >>> 18]);
            sb.append(cArr[(i4 >>> 12) & 63]);
            sb.append(cArr[(i4 >>> 6) & 63]);
            sb.append(cArr[i4 & 63]);
            i2 += 3;
        }
        if (i2 < i) {
            d(i2, i - i2, sb, bArr);
        }
    }

    @Override // defpackage.n23
    public final int b(byte[] bArr, CharSequence charSequence) throws zzgwy {
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        k23 k23Var = this.a;
        if (!k23Var.h[length % k23Var.e]) {
            int length2 = charSequenceE.length();
            throw new zzgwy(vh.i(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceE.length()) {
            int i3 = i2 + 1;
            int iA = (k23Var.a(charSequenceE.charAt(i + 1)) << 12) | (k23Var.a(charSequenceE.charAt(i)) << 18);
            bArr[i2] = (byte) (iA >>> 16);
            int i4 = i + 2;
            if (i4 < charSequenceE.length()) {
                int i5 = i + 3;
                int iA2 = iA | (k23Var.a(charSequenceE.charAt(i4)) << 6);
                int i6 = i2 + 2;
                bArr[i3] = (byte) ((iA2 >>> 8) & 255);
                if (i5 < charSequenceE.length()) {
                    i += 4;
                    i2 += 3;
                    bArr[i6] = (byte) ((iA2 | k23Var.a(charSequenceE.charAt(i5))) & 255);
                } else {
                    i2 = i6;
                    i = i5;
                }
            } else {
                i = i4;
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // defpackage.n23
    public final n23 c(k23 k23Var, Character ch) {
        return new m23(k23Var, ch);
    }

    public m23(k23 k23Var, Character ch) {
        super(k23Var, ch);
        n8.S(k23Var.b.length == 64);
    }
}
