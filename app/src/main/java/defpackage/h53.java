package defpackage;

import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.zzhas;
import com.google.android.gms.internal.ads.zzhkg;
import com.google.android.gms.internal.ads.zzhqb;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import java.util.DesugarCollections;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class h53 implements zzhas {
    public static final byte[] c = new byte[0];
    public static final Set d;
    public final String a;
    public final zzhas b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        d = DesugarCollections.unmodifiableSet(hashSet);
    }

    public h53(x8 x8Var, zzhas zzhasVar) throws GeneralSecurityException {
        if (!d.contains(x8Var.v())) {
            String strV = x8Var.v();
            u7.r(vh.t(new StringBuilder(String.valueOf(strV).length() + 67), "Unsupported DEK key type: ", strV, ". Only Tink AEAD key types are supported."));
            throw null;
        }
        this.a = x8Var.v();
        w93 w93VarA = x8.A(x8Var);
        w93VarA.i(zzhqy.RAW);
        yg0.V(((x8) w93VarA.e()).a());
        this.b = zzhasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhas
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > 4096 || i > bArr.length - 4) {
                throw new GeneralSecurityException("length of encrypted DEK too large");
            }
            byte[] bArr3 = new byte[i];
            byteBufferWrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            byte[] bArrZza = this.b.zza(bArr3, c);
            String str = this.a;
            zzian zzianVar = zzian.zza;
            try {
                return ((zzhas) ((r73) j73.b.a.get()).a(zzhkg.b.e(s73.a(str, zzian.zzs(bArrZza, 0, bArrZza.length), zzhqb.SYMMETRIC, zzhqy.RAW, null)), zzhas.class)).zza(bArr4, bArr2);
            } catch (NegativeArraySizeException e) {
                e = e;
                throw new GeneralSecurityException("invalid ciphertext", e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new GeneralSecurityException("invalid ciphertext", e);
            }
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e3) {
            e = e3;
        }
    }
}
