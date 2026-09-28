package defpackage;

import com.google.android.gms.internal.ads.zzhnr;
import java.util.Objects;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s83 extends zzhnr {
    public final int a;

    public s83(int i) {
        this.a = i;
    }

    public static s83 b(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            return new s83(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof s83) && ((s83) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(s83.class, Integer.valueOf(this.a));
    }

    public final String toString() {
        int i = this.a;
        return vh.r(new StringBuilder(String.valueOf(i).length() + 34), "AesCmac PRF Parameters (", i, "-byte key)");
    }
}
