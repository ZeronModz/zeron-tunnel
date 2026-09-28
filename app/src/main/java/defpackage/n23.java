package defpackage;

import com.google.android.gms.internal.ads.zzgwy;
import java.util.Objects;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class n23 {
    public static final m23 d = new m23("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
    public static final m23 e = new m23("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
    public static final l23 f;
    public final k23 a;
    public final Character b;
    public volatile n23 c;

    static {
        new n23("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new n23("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f = new l23(new k23(new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}, "base16()"));
    }

    public n23(k23 k23Var, Character ch) {
        this.a = k23Var;
        boolean z = true;
        if (ch != null) {
            byte[] bArr = k23Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                z = false;
            }
        }
        n8.s0(z, "Padding character %s was already in alphabet", ch);
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        n8.I0(0, i, bArr.length);
        while (i2 < i) {
            int i3 = this.a.f;
            d(i2, Math.min(i3, i - i2), sb, bArr);
            i2 += i3;
        }
    }

    public int b(byte[] bArr, CharSequence charSequence) throws zzgwy {
        int i;
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        k23 k23Var = this.a;
        boolean z = k23Var.h[length % k23Var.e];
        int i2 = k23Var.d;
        if (!z) {
            int length2 = charSequenceE.length();
            throw new zzgwy(vh.i(length2, "Invalid input length ", new StringBuilder(String.valueOf(length2).length() + 21)));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < charSequenceE.length()) {
            long jA = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = k23Var.e;
                if (i5 >= i) {
                    break;
                }
                jA <<= i2;
                if (i3 + i5 < charSequenceE.length()) {
                    jA |= (long) k23Var.a(charSequenceE.charAt(i6 + i3));
                    i6++;
                }
                i5++;
            }
            int i7 = k23Var.f;
            int i8 = i6 * i2;
            int i9 = (i7 - 1) * 8;
            while (i9 >= (i7 * 8) - i8) {
                bArr[i4] = (byte) ((jA >>> i9) & 255);
                i9 -= 8;
                i4++;
            }
            i3 += i;
        }
        return i4;
    }

    public n23 c(k23 k23Var, Character ch) {
        return new n23(k23Var, ch);
    }

    public final void d(int i, int i2, StringBuilder sb, byte[] bArr) {
        n8.I0(i, i + i2, bArr.length);
        k23 k23Var = this.a;
        int i3 = k23Var.f;
        int i4 = 0;
        n8.S(i2 <= i3);
        long j = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            j = (j | ((long) (bArr[i + i5] & 255))) << 8;
        }
        int i6 = (i2 + 1) * 8;
        int i7 = k23Var.d;
        while (i4 < i2 * 8) {
            sb.append(k23Var.b[k23Var.c & ((int) (j >>> ((i6 - i7) - i4)))]);
            i4 += i7;
        }
        if (this.b != null) {
            while (i4 < i3 * 8) {
                sb.append('=');
                i4 += i7;
            }
        }
    }

    public final CharSequence e(CharSequence charSequence) {
        charSequence.getClass();
        if (this.b == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n23) {
            n23 n23Var = (n23) obj;
            if (this.a.equals(n23Var.a) && Objects.equals(this.b, n23Var.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final n23 f() {
        k23 k23Var;
        boolean z;
        n23 n23VarC = this.c;
        if (n23VarC == null) {
            k23 k23Var2 = this.a;
            int i = 0;
            while (true) {
                char[] cArr = k23Var2.b;
                int length = cArr.length;
                if (i >= length) {
                    k23Var = k23Var2;
                    break;
                }
                if (ay2.I(cArr[i])) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        }
                        char c = cArr[i2];
                        if (c >= 'a' && c <= 'z') {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                    n8.C0("Cannot call lowerCase() on a mixed-case alphabet", !z);
                    char[] cArr2 = new char[cArr.length];
                    for (int i3 = 0; i3 < cArr.length; i3++) {
                        char c2 = cArr[i3];
                        if (ay2.I(c2)) {
                            c2 ^= 32;
                        }
                        cArr2[i3] = (char) c2;
                    }
                    k23Var = new k23(cArr2, k23Var2.a.concat(".lowerCase()"));
                    if (k23Var2.i && !k23Var.i) {
                        byte[] bArr = k23Var.g;
                        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                        for (int i4 = 65; i4 <= 90; i4++) {
                            int i5 = i4 | 32;
                            byte b = bArr[i4];
                            byte b2 = bArr[i5];
                            if (b == -1) {
                                bArrCopyOf[i4] = b2;
                            } else {
                                char c3 = (char) i4;
                                char c4 = (char) i5;
                                if (b2 != -1) {
                                    u7.p(mu.F("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c3), Character.valueOf(c4)));
                                    return null;
                                }
                                bArrCopyOf[i5] = b;
                            }
                        }
                        k23Var = new k23(k23Var.a.concat(".ignoreCase()"), k23Var.b, bArrCopyOf, true);
                    }
                } else {
                    i++;
                }
            }
            n23VarC = k23Var == k23Var2 ? this : c(k23Var, this.b);
            this.c = n23VarC;
        }
        return n23VarC;
    }

    public final String g(int i, byte[] bArr) {
        n8.I0(0, i, bArr.length);
        k23 k23Var = this.a;
        int i2 = k23Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(k23Var.e * sb2.F(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e2) {
            u7.g(e2);
            return null;
        }
    }

    public final byte[] h(String str) {
        try {
            CharSequence charSequenceE = e(str);
            int length = (int) (((((long) this.a.d) * ((long) charSequenceE.length())) + 7) / 8);
            byte[] bArr = new byte[length];
            int iB = b(bArr, charSequenceE);
            if (iB == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[iB];
            System.arraycopy(bArr, 0, bArr2, 0, iB);
            return bArr2;
        } catch (zzgwy e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        k23 k23Var = this.a;
        sb.append(k23Var);
        if (8 % k23Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public n23(String str, String str2) {
        this(new k23(str2.toCharArray(), str), (Character) '=');
    }
}
