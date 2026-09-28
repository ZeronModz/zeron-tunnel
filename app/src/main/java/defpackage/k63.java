package defpackage;

import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.zzhas;
import com.google.android.gms.internal.ads.zzhnp;
import java.util.Objects;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k63 implements zzhas {
    public final byte[] a;
    public final int b;
    public final zzhnp c;

    public k63(byte[] bArr, hc3 hc3Var, int i) {
        this.c = j03.D(r83.c(s83.b(bArr.length), new ic3(hc3.a(bArr), 0)));
        this.a = hc3Var.b();
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            io0.e("ciphertext is null");
            return null;
        }
        int length = bArr.length;
        byte[] bArr3 = this.a;
        int length2 = bArr3.length;
        int i = this.b + length2;
        int i2 = i + 28;
        if (length < i2) {
            zg1.m("ciphertext too short");
            return null;
        }
        if (!z73.c(bArr3, bArr)) {
            zg1.m("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            zg1.m("invalid salt size");
            return null;
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        byte[] bArr6 = new byte[32];
        zzhnp zzhnpVar = this.c;
        System.arraycopy(zzhnpVar.zza(bArr4, 16), 0, bArr6, 0, 16);
        System.arraycopy(zzhnpVar.zza(bArr5, 16), 0, bArr6, 16, 16);
        if (!dn0.N(2)) {
            zg1.m("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return null;
        }
        q7 q7Var = a63.a;
        n8.O(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i3 = i + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i, i3);
        if (bArrCopyOfRange2.length != 12) {
            zg1.m("iv is wrong size");
            return null;
        }
        if (length < i2) {
            zg1.m("ciphertext too short");
            return null;
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrCopyOfRange2, 0, 12);
        Cipher cipher = (Cipher) a63.a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i3, length - i3);
    }
}
