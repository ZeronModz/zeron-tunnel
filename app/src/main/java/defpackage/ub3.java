package defpackage;

import com.google.android.gms.internal.ads.n8;
import com.google.android.gms.internal.ads.p8;
import com.google.android.gms.internal.ads.zzhpt;
import com.google.android.gms.internal.ads.zzhqy;
import com.google.android.gms.internal.ads.zzian;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ub3 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;
    public static final a73 e;
    public static final z63 f;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        hc3 hc3VarA2 = z73.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        a = new m73(ta3.class, p83.B);
        b = new l73(hc3VarA, p83.w);
        c = new a73(va3.class, p83.x);
        d = new z63(hc3VarA2, p83.y);
        e = new a73(ua3.class, p83.z);
        f = new z63(hc3VarA, p83.A);
    }

    public static zzhqy a(e43 e43Var) throws GeneralSecurityException {
        if (e43.r == e43Var) {
            return zzhqy.TINK;
        }
        if (e43.s == e43Var) {
            return zzhqy.CRUNCHY;
        }
        if (e43.u == e43Var) {
            return zzhqy.RAW;
        }
        if (e43.t == e43Var) {
            return zzhqy.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(e43Var.b));
    }

    public static q43 b(zzhpt zzhptVar) throws GeneralSecurityException {
        int iOrdinal = zzhptVar.ordinal();
        if (iOrdinal == 2) {
            return q43.p;
        }
        if (iOrdinal == 3) {
            return q43.o;
        }
        if (iOrdinal == 4) {
            return q43.q;
        }
        int iZza = zzhptVar.zza();
        throw new GeneralSecurityException(vh.i(iZza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iZza).length() + 26)));
    }

    public static e43 c(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return e43.r;
        }
        if (iOrdinal == 2) {
            return e43.t;
        }
        if (iOrdinal == 3) {
            return e43.u;
        }
        if (iOrdinal == 4) {
            return e43.s;
        }
        int iZza = zzhqyVar.zza();
        throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }

    public static int d(sa3 sa3Var) throws GeneralSecurityException {
        if (sa3.c.equals(sa3Var)) {
            return 33;
        }
        if (sa3.d.equals(sa3Var)) {
            return 49;
        }
        if (sa3.e.equals(sa3Var)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(sa3Var.a));
    }

    public static n8 e(ta3 ta3Var) throws GeneralSecurityException {
        zzhpt zzhptVar;
        int i;
        n93 n93VarW = n8.w();
        q43 q43Var = ta3Var.c;
        if (q43.o == q43Var) {
            zzhptVar = zzhpt.SHA256;
        } else if (q43.p == q43Var) {
            zzhptVar = zzhpt.SHA384;
        } else {
            if (q43.q != q43Var) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(q43Var.b));
            }
            zzhptVar = zzhpt.SHA512;
        }
        n93VarW.d();
        ((n8) n93VarW.b).y(zzhptVar);
        sa3 sa3Var = ta3Var.b;
        int i2 = 4;
        if (sa3.c.equals(sa3Var)) {
            i = 4;
        } else if (sa3.d.equals(sa3Var)) {
            i = 5;
        } else {
            if (!sa3.e.equals(sa3Var)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(sa3Var.a));
            }
            i = 6;
        }
        n93VarW.d();
        ((n8) n93VarW.b).A(i);
        r43 r43Var = ta3Var.a;
        if (r43.r == r43Var) {
            i2 = 3;
        } else if (r43.s != r43Var) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(r43Var.b));
        }
        n93VarW.d();
        ((n8) n93VarW.b).B(i2);
        return (n8) n93VarW.e();
    }

    public static p8 f(va3 va3Var) throws GeneralSecurityException {
        int iD = d(va3Var.a.b);
        ECPoint eCPoint = va3Var.b;
        p93 p93VarZ = p8.z();
        n8 n8VarE = e(va3Var.a);
        p93VarZ.d();
        ((p8) p93VarZ.b).C(n8VarE);
        byte[] bArrM = qj1.M(eCPoint.getAffineX(), iD);
        zzian zzianVar = zzian.zza;
        zzian zzianVarZzs = zzian.zzs(bArrM, 0, bArrM.length);
        p93VarZ.d();
        ((p8) p93VarZ.b).D(zzianVarZzs);
        byte[] bArrM2 = qj1.M(eCPoint.getAffineY(), iD);
        zzian zzianVarZzs2 = zzian.zzs(bArrM2, 0, bArrM2.length);
        p93VarZ.d();
        ((p8) p93VarZ.b).E(zzianVarZzs2);
        return (p8) p93VarZ.e();
    }

    public static sa3 g(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 2) {
            return sa3.c;
        }
        if (i2 == 3) {
            return sa3.d;
        }
        if (i2 == 4) {
            return sa3.e;
        }
        if (i != 1) {
            throw new GeneralSecurityException(vh.i(i2, "Unable to parse EllipticCurveType: ", new StringBuilder(String.valueOf(i2).length() + 35)));
        }
        u7.r("Can't get the number of an unknown enum value.");
        return null;
    }

    public static r43 h(int i) throws GeneralSecurityException {
        int i2 = i - 2;
        if (i2 == 1) {
            return r43.r;
        }
        if (i2 == 2) {
            return r43.s;
        }
        if (i != 1) {
            throw new GeneralSecurityException(vh.i(i2, "Unable to parse EcdsaSignatureEncoding: ", new StringBuilder(String.valueOf(i2).length() + 40)));
        }
        u7.r("Can't get the number of an unknown enum value.");
        return null;
    }
}
