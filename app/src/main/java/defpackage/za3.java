package defpackage;

import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhuv;
import com.google.android.gms.internal.ads.zzhuw;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class za3 extends zzhuv {
    public final bb3 a;
    public final ic3 b;

    public za3(bb3 bb3Var, ic3 ic3Var) {
        this.a = bb3Var;
        this.b = ic3Var;
    }

    public static za3 d(bb3 bb3Var, ic3 ic3Var) throws GeneralSecurityException {
        hc3 hc3Var = (hc3) ic3Var.b;
        if (hc3Var.a.length != 32) {
            int length = hc3Var.a.length;
            throw new GeneralSecurityException(vh.i(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        if (Arrays.equals(bb3Var.b.b(), z.k(z.q(hc3Var.b())))) {
            return new za3(bb3Var, ic3Var);
        }
        zg1.m("Ed25519 keys mismatch");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhuv, com.google.android.gms.internal.ads.zzhaz
    public final zzhbp a() {
        return this.a.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhuv
    public final /* synthetic */ zzhuw c() {
        return this.a;
    }
}
