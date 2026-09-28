package defpackage;

import com.google.android.gms.internal.ads.q7;
import com.google.android.gms.internal.ads.zzhas;
import java.util.Objects;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class j63 implements zzhas {
    public final /* synthetic */ int a = 0;
    public final byte[] b;
    public final Object c;

    public j63(byte[] bArr, hc3 hc3Var) throws GeneralSecurityException {
        if (!dn0.N(2)) {
            zg1.m("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        q7 q7Var = a63.a;
        n8.O(bArr.length);
        this.c = new SecretKeySpec(bArr, "AES");
        this.b = hc3Var.b();
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        Object obj = this.c;
        byte[] bArr3 = this.b;
        switch (i) {
            case 0:
                zzhas zzhasVar = (zzhas) obj;
                if (bArr3.length != 0) {
                    if (!z73.c(bArr3, bArr)) {
                        zg1.m("wrong prefix");
                    }
                }
                break;
            default:
                if (bArr == null) {
                    io0.e("ciphertext is null");
                } else {
                    int length = bArr.length;
                    int length2 = bArr3.length;
                    if (length < length2 + 28) {
                        zg1.m("ciphertext too short");
                    } else if (!z73.c(bArr3, bArr)) {
                        zg1.m("Decryption failed (OutputPrefix mismatch).");
                    } else {
                        q7 q7Var = a63.a;
                        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
                        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
                        Cipher cipher = (Cipher) a63.a.get();
                        cipher.init(2, (SecretKeySpec) obj, gCMParameterSpec);
                        if (bArr2 != null && bArr2.length != 0) {
                            cipher.updateAAD(bArr2);
                        }
                    }
                }
                break;
        }
        return null;
    }

    public j63(zzhas zzhasVar, byte[] bArr) {
        this.c = zzhasVar;
        int length = bArr.length;
        if (length == 0 || length == 5) {
            this.b = bArr;
        } else {
            u7.r("identifier has an invalid length");
            throw null;
        }
    }
}
