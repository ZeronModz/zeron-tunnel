package defpackage;

import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhcg;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class m53 extends zzhcg {
    public final n53 a;
    public final hc3 b;
    public final Integer c;

    public m53(n53 n53Var, hc3 hc3Var, Integer num) {
        this.a = n53Var;
        this.b = hc3Var;
        this.c = num;
    }

    public static m53 d(n53 n53Var, Integer num) throws GeneralSecurityException {
        hc3 hc3VarB;
        e43 e43Var = n53Var.a;
        if (e43Var == e43.m) {
            if (num != null) {
                zg1.m("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
            hc3VarB = k73.a;
        } else {
            if (e43Var != e43.l) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(n53Var.a)));
            }
            if (num == null) {
                zg1.m("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
            hc3VarB = k73.b(num.intValue());
        }
        return new m53(n53Var, hc3VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhcg, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer b() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final hc3 c() {
        return this.b;
    }
}
