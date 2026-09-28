package defpackage;

import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhnq;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class r83 extends zzhnq {
    public final s83 a;
    public final ic3 b;

    public r83(s83 s83Var, ic3 ic3Var) {
        this.a = s83Var;
        this.b = ic3Var;
    }

    public static r83 c(s83 s83Var, ic3 ic3Var) throws GeneralSecurityException {
        if (s83Var.a == ((hc3) ic3Var.b).a.length) {
            return new r83(s83Var, ic3Var);
        }
        zg1.m("Key size mismatch");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzhnq, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer b() {
        return null;
    }
}
