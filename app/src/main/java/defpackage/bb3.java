package defpackage;

import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhuw;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bb3 extends zzhuw {
    public final ya3 a;
    public final hc3 b;
    public final hc3 c;
    public final Integer d;

    public bb3(ya3 ya3Var, hc3 hc3Var, hc3 hc3Var2, Integer num) {
        this.a = ya3Var;
        this.b = hc3Var;
        this.c = hc3Var2;
        this.d = num;
    }

    public static bb3 d(xa3 xa3Var, hc3 hc3Var, Integer num) throws GeneralSecurityException {
        hc3 hc3VarA;
        byte[] bArr = hc3Var.a;
        ya3 ya3Var = new ya3(xa3Var);
        xa3 xa3Var2 = xa3.e;
        if (!xa3Var.equals(xa3Var2) && num == null) {
            String str = xa3Var.a;
            throw new GeneralSecurityException(vh.t(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (xa3Var == xa3Var2 && num != null) {
            zg1.m("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(vh.i(length, "Ed25519 key must be constructed with key of length 32 bytes, not ", new StringBuilder(String.valueOf(length).length() + 65)));
        }
        xa3 xa3Var3 = ya3Var.a;
        if (xa3Var3 == xa3Var2) {
            hc3VarA = k73.a;
        } else if (xa3Var3 == xa3.c || xa3Var3 == xa3.d) {
            hc3VarA = k73.a(num.intValue());
        } else {
            if (xa3Var3 != xa3.b) {
                u7.p("Unknown Variant: ".concat(xa3Var3.a));
                return null;
            }
            hc3VarA = k73.b(num.intValue());
        }
        return new bb3(ya3Var, hc3Var, hc3VarA, num);
    }

    @Override // com.google.android.gms.internal.ads.zzhuw, com.google.android.gms.internal.ads.zzhaz
    public final /* synthetic */ zzhbp a() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    public final Integer b() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzhuw
    public final hc3 c() {
        return this.c;
    }
}
