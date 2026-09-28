package defpackage;

import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.zzhas;
import com.google.android.gms.internal.ads.zzhnp;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ec3 implements zzhas {
    public static final q7 e = new q7(4);
    public final byte[] a;
    public final zzhnp b;
    public final SecretKeySpec c;
    public final int d;

    public ec3(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (!dn0.N(1)) {
            zg1.m("Can not use AES-EAX in FIPS-mode.");
            throw null;
        }
        if (i != 12 && i != 16) {
            u7.r("IV size should be either 12 or 16 bytes");
            throw null;
        }
        this.d = i;
        int length = bArr.length;
        n8.O(length);
        this.c = new SecretKeySpec(bArr, "AES");
        this.b = j03.D(r83.c(s83.b(length), new ic3(hc3.a(bArr), 0)));
        this.a = bArr2;
    }

    public static ec3 a(t43 t43Var) throws GeneralSecurityException {
        if (dn0.N(1)) {
            w43 w43Var = t43Var.a;
            return new ec3(((hc3) t43Var.b.b).b(), t43Var.a.b, t43Var.c.b());
        }
        zg1.m("Can not use AES-EAX in FIPS-mode.");
        return null;
    }

    public final byte[] b(int i, byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3 + 16];
        bArr2[15] = (byte) i;
        System.arraycopy(bArr, i2, bArr2, 16, i3);
        return this.b.zza(bArr2, 16);
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = bArr3.length;
        int i = this.d;
        int i2 = ((length - length2) - i) - 16;
        if (i2 < 0) {
            zg1.m("ciphertext too short");
            return null;
        }
        if (!z73.c(bArr3, bArr)) {
            zg1.m("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArrB = b(0, bArr, length2, i);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrB2 = b(1, bArr2, 0, bArr2.length);
        byte[] bArrB3 = b(2, bArr, length2 + i, i2);
        int i3 = length - 16;
        byte b = 0;
        for (int i4 = 0; i4 < 16; i4++) {
            b = (byte) (b | (((bArr[i3 + i4] ^ bArrB2[i4]) ^ bArrB[i4]) ^ bArrB3[i4]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) e.get();
        cipher.init(1, this.c, new IvParameterSpec(bArrB));
        return cipher.doFinal(bArr, bArr3.length + i, i2);
    }
}
