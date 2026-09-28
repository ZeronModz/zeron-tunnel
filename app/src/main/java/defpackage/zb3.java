package defpackage;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhqy;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zb3 implements zzhbs {
    public final zzhbs a;
    public final byte[] b;
    public final byte[] c;

    public zb3(zzhbs zzhbsVar, byte[] bArr, byte[] bArr2) {
        this.a = zzhbsVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public static byte[] a(s73 s73Var) throws GeneralSecurityException {
        zzhqy zzhqyVar = s73Var.e;
        Integer num = s73Var.f;
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return k73.b(num.intValue()).b();
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return k73.a.b();
            }
            if (iOrdinal != 4) {
                zg1.m("unknown output prefix type");
                return null;
            }
        }
        return k73.a(num.intValue()).b();
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        zzhbs zzhbsVar = this.a;
        byte[] bArr4 = this.c;
        if (length == 0 && bArr4.length == 0) {
            zzhbsVar.zza(bArr, bArr2);
        } else {
            if (!z73.c(bArr3, bArr)) {
                zg1.m("Invalid signature (output prefix mismatch)");
                return;
            }
            if (bArr4.length != 0) {
                bArr2 = kf2.G(bArr2, bArr4);
            }
            zzhbsVar.zza(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
