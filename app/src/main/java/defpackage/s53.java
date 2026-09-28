package defpackage;

import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhcg;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class s53 extends zzhcg {
    public final u53 a;
    public final ic3 b;
    public final hc3 c;
    public final Integer d;

    public s53(u53 u53Var, ic3 ic3Var, hc3 hc3Var, Integer num) {
        this.a = u53Var;
        this.b = ic3Var;
        this.c = hc3Var;
        this.d = num;
    }

    public static s53 d(u53 u53Var, ic3 ic3Var, Integer num) throws GeneralSecurityException {
        hc3 hc3VarB;
        hc3 hc3Var = (hc3) ic3Var.b;
        q43 q43Var = u53Var.a;
        q43 q43Var2 = q43.n;
        if (q43Var != q43Var2 && num == null) {
            String str = u53Var.a.b;
            throw new GeneralSecurityException(vh.t(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (q43Var == q43Var2 && num != null) {
            zg1.m("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (hc3Var.a.length != 32) {
            int length = hc3Var.a.length;
            throw new GeneralSecurityException(vh.i(length, "XAesGcmKey key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 68)));
        }
        if (q43Var == q43Var2) {
            hc3VarB = k73.a;
        } else {
            if (q43Var != q43.m) {
                u7.p("Unknown Variant: ".concat(q43Var.b));
                return null;
            }
            hc3VarB = k73.b(num.intValue());
        }
        return new s53(u53Var, ic3Var, hc3VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final hc3 c() {
        return this.c;
    }
}
