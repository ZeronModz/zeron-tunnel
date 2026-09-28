package defpackage;

import com.google.android.gms.internal.ads.zzhas;
import com.google.android.gms.internal.ads.zzhnp;
import com.google.android.gms.internal.ads.zzhwk;
import com.google.android.gms.internal.ads.zzhxt;
import com.google.android.gms.internal.ads.zzhxu;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fc3 implements zzhas {
    public final zzhwk a;
    public final zzhxu b;
    public final int c;
    public final byte[] d;

    public fc3(zzhwk zzhwkVar, zzhxu zzhxuVar, int i, byte[] bArr) {
        this.a = zzhwkVar;
        this.b = zzhxuVar;
        this.c = i;
        this.d = bArr;
    }

    public static fc3 a(m43 m43Var) {
        byte[] bArrB = ((hc3) m43Var.b.b).b();
        s43 s43Var = m43Var.a;
        zzhwk zzhwkVar = new zzhwk(bArrB, s43Var.c);
        String strValueOf = String.valueOf(s43Var.f);
        zzhxt zzhxtVar = new zzhxt("HMAC".concat(strValueOf), new SecretKeySpec(((hc3) m43Var.c.b).b(), "HMAC"));
        int i = s43Var.d;
        return new fc3(zzhwkVar, new zzhxu(zzhxtVar, i), i, m43Var.d.b());
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.d;
        int length2 = bArr3.length;
        int i = this.c;
        if (length < i + length2) {
            zg1.m("Decryption failed (ciphertext too short).");
            return null;
        }
        if (!z73.c(bArr3, bArr)) {
            zg1.m("Decryption failed (OutputPrefix mismatch).");
            return null;
        }
        int i2 = length - i;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrG = kf2.G(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8));
        zzhxu zzhxuVar = this.b;
        int i3 = zzhxuVar.b;
        zzhnp zzhnpVar = zzhxuVar.a;
        byte[] bArr4 = zzhxuVar.d;
        int length3 = bArr4.length;
        byte[] bArr5 = zzhxuVar.c;
        if (MessageDigest.isEqual(length3 > 0 ? kf2.G(bArr5, zzhnpVar.zza(kf2.G(bArrG, bArr4), i3)) : kf2.G(bArr5, zzhnpVar.zza(bArrG, i3)), bArrCopyOfRange2)) {
            return this.a.zza(bArrCopyOfRange);
        }
        zg1.m("invalid MAC");
        return null;
    }
}
