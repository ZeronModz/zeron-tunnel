package defpackage;

import com.google.android.gms.internal.ads.zzhas;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c63 implements zzhas {
    public static final byte[] c = ay2.E("7a806c");
    public static final byte[] d = ay2.E("46bb91c3c5");
    public static final byte[] e = ay2.E("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] f = ay2.E("bae8e37fc83441b16034566b");
    public static final byte[] g = ay2.E("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public final SecretKeySpec a;
    public final byte[] b;

    public c63(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.b = bArr2;
        n8.O(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public static boolean a(Cipher cipher) {
        try {
            byte[] bArr = f;
            cipher.init(2, new SecretKeySpec(e, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(d);
            byte[] bArr2 = g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.b;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            zg1.m("ciphertext too short");
            return null;
        }
        if (!z73.c(bArr3, bArr)) {
            zg1.m("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        try {
            Cipher cipher = (Cipher) o63.a.get();
            if (cipher == null) {
                throw new GeneralSecurityException("AES GCM SIV cipher is invalid.");
            }
            cipher.init(2, this.a, new GCMParameterSpec(128, bArr, length2, 12));
            if (bArr2 != null && bArr2.length != 0) {
                cipher.updateAAD(bArr2);
            }
            return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
        } catch (IllegalStateException e2) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.", e2);
        }
    }
}
