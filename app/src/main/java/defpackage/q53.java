package defpackage;

import com.google.android.gms.internal.ads.g9;
import com.google.android.gms.internal.ads.x8;
import com.google.android.gms.internal.ads.zzhbp;
import com.google.android.gms.internal.ads.zzhch;
import com.google.android.gms.internal.ads.zzhkg;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzicg;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q53 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        a = new m73(n53.class, o53.c);
        b = new l73(hc3VarA, ot2.A);
        c = new a73(m53.class, ot2.B);
        d = new z63(hc3VarA, o53.b);
    }

    public static g9 a(n53 n53Var) {
        byte[] bArrA = ((t73) zzhkg.b.h(n53Var.d)).b.a();
        try {
            gd3 gd3Var = gd3.b;
            int i = wc3.a;
            x8 x8VarY = x8.y(bArrA, gd3.c);
            ea3 ea3VarY = g9.y();
            String str = n53Var.b;
            ea3VarY.d();
            ((g9) ea3VarY.b).A(str);
            ea3VarY.d();
            ((g9) ea3VarY.b).B(x8VarY);
            return (g9) ea3VarY.e();
        } catch (zzicg e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    public static n53 b(g9 g9Var, zzhqy zzhqyVar) throws GeneralSecurityException {
        r43 r43Var;
        e43 e43Var = e43.m;
        r43 r43Var2 = r43.n;
        r43 r43Var3 = r43.m;
        r43 r43Var4 = r43.l;
        r43 r43Var5 = r43.j;
        r43 r43Var6 = r43.k;
        r43 r43Var7 = r43.i;
        w93 w93VarZ = x8.z();
        w93VarZ.g(g9Var.w().v());
        w93VarZ.h(g9Var.w().w());
        w93VarZ.i(zzhqy.RAW);
        zzhbp zzhbpVarV = yg0.V(((x8) w93VarZ.e()).a());
        if (zzhbpVarV instanceof z43) {
            r43Var = r43Var7;
        } else if (zzhbpVarV instanceof f53) {
            r43Var = r43Var6;
        } else if (zzhbpVarV instanceof x53) {
            r43Var = r43Var5;
        } else if (zzhbpVarV instanceof s43) {
            r43Var = r43Var4;
        } else if (zzhbpVarV instanceof w43) {
            r43Var = r43Var3;
        } else {
            if (!(zzhbpVarV instanceof c53)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zzhbpVarV.toString()));
            }
            r43Var = r43Var2;
        }
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            e43Var = e43.l;
        } else if (iOrdinal != 3) {
            int iZza = zzhqyVar.zza();
            throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
        }
        String strV = g9Var.v();
        zzhch zzhchVar = (zzhch) zzhbpVarV;
        if (strV == null) {
            zg1.m("kekUri must be set");
            return null;
        }
        if (zzhchVar == null) {
            zg1.m("dekParametersForNewKeys must be set");
            return null;
        }
        if (zzhchVar.a()) {
            zg1.m("dekParametersForNewKeys must not have ID Requirements");
            return null;
        }
        if ((r43Var == r43Var7 && (zzhchVar instanceof z43)) || ((r43Var == r43Var6 && (zzhchVar instanceof f53)) || ((r43Var == r43Var5 && (zzhchVar instanceof x53)) || ((r43Var == r43Var4 && (zzhchVar instanceof s43)) || ((r43Var == r43Var3 && (zzhchVar instanceof w43)) || (r43Var == r43Var2 && (zzhchVar instanceof c53))))))) {
            return new n53(e43Var, strV, r43Var, zzhchVar);
        }
        String str = r43Var.b;
        String strValueOf = String.valueOf(zzhchVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + str.length() + 67 + 1);
        hz.H(sb, "Cannot use parsing strategy ", str, " when new keys are picked according to ", strValueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
