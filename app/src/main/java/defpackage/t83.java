package defpackage;

import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.zzhnp;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t83 implements zzhnp {
    public static final q7 d = new q7(2);
    public final SecretKeySpec a;
    public final byte[] b;
    public final byte[] c;

    public t83(byte[] bArr) throws GeneralSecurityException {
        n8.O(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        if (!dn0.N(1)) {
            zg1.m("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
        Cipher cipher = (Cipher) d.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrE = sb2.E(cipher.doFinal(new byte[16]));
        this.b = bArrE;
        this.c = sb2.E(bArrE);
    }

    @Override // com.google.android.gms.internal.ads.zzhnp
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArrK;
        if (i > 16) {
            zu0.p("outputLength too large, max is 16 bytes");
            return null;
        }
        if (!dn0.N(1)) {
            zg1.m("Can not use AES-CMAC in FIPS-mode.");
            return null;
        }
        Cipher cipher = (Cipher) d.get();
        cipher.init(1, this.a);
        int length = bArr.length;
        int i2 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i3 = i2 - 1;
        int i4 = i3 * 16;
        if (i2 * 16 == length) {
            bArrK = kf2.K(bArr, i4, this.b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                u7.r("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            if (bArrCopyOf.length != 16) {
                u7.r("The lengths of x and y should match.");
                return null;
            }
            bArrK = kf2.K(bArrCopyOf, 0, this.c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = i5 * 16;
            for (int i7 = 0; i7 < 16; i7++) {
                bArr3[i7] = (byte) (bArr2[i7] ^ bArr[i7 + i6]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                u7.p("Cipher didn't write full block");
                return null;
            }
        }
        for (int i8 = 0; i8 < 16; i8++) {
            bArr3[i8] = (byte) (bArr2[i8] ^ bArrK[i8]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i == 16 ? bArr2 : Arrays.copyOf(bArr2, i);
        }
        u7.p("Cipher didn't write full block");
        return null;
    }
}
