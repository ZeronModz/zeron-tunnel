package defpackage;

import com.google.android.gms.internal.ads.v8;
import com.google.android.gms.internal.ads.zzhpt;
import com.google.android.gms.internal.ads.zzhqy;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y53 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a = new m73(s43.class, o53.r);
        b = new l73(hc3VarA, o53.o);
        c = new a73(m43.class, o53.p);
        d = new z63(hc3VarA, o53.q);
    }

    public static zzhqy a(r43 r43Var) throws GeneralSecurityException {
        if (r43.c == r43Var) {
            return zzhqy.TINK;
        }
        if (r43.d == r43Var) {
            return zzhqy.CRUNCHY;
        }
        if (r43.e == r43Var) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(r43Var)));
    }

    public static r43 b(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return r43.c;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return r43.e;
            }
            if (iOrdinal != 4) {
                int iZza = zzhqyVar.zza();
                throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return r43.d;
    }

    public static q43 c(zzhpt zzhptVar) throws GeneralSecurityException {
        int iOrdinal = zzhptVar.ordinal();
        if (iOrdinal == 1) {
            return q43.c;
        }
        if (iOrdinal == 2) {
            return q43.f;
        }
        if (iOrdinal == 3) {
            return q43.e;
        }
        if (iOrdinal == 4) {
            return q43.g;
        }
        if (iOrdinal == 5) {
            return q43.d;
        }
        int iZza = zzhptVar.zza();
        throw new GeneralSecurityException(vh.i(iZza, "Unable to parse HashType: ", new StringBuilder(String.valueOf(iZza).length() + 26)));
    }

    public static v8 d(s43 s43Var) throws GeneralSecurityException {
        zzhpt zzhptVar;
        u93 u93VarW = v8.w();
        int i = s43Var.d;
        u93VarW.d();
        ((v8) u93VarW.b).z(i);
        q43 q43Var = s43Var.f;
        if (q43.c == q43Var) {
            zzhptVar = zzhpt.SHA1;
        } else if (q43.d == q43Var) {
            zzhptVar = zzhpt.SHA224;
        } else if (q43.e == q43Var) {
            zzhptVar = zzhpt.SHA256;
        } else if (q43.f == q43Var) {
            zzhptVar = zzhpt.SHA384;
        } else {
            if (q43.g != q43Var) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(q43Var)));
            }
            zzhptVar = zzhpt.SHA512;
        }
        u93VarW.d();
        ((v8) u93VarW.b).y(zzhptVar);
        return (v8) u93VarW.e();
    }
}
