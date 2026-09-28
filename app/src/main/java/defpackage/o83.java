package defpackage;

import com.google.android.gms.internal.ads.zzhqy;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o83 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = new m73(c83.class, e63.B);
        b = new l73(hc3VarA, e63.y);
        c = new a73(a83.class, e63.z);
        d = new z63(hc3VarA, e63.A);
    }

    public static zzhqy a(e43 e43Var) throws GeneralSecurityException {
        if (e43.n == e43Var) {
            return zzhqy.TINK;
        }
        if (e43.o == e43Var) {
            return zzhqy.CRUNCHY;
        }
        if (e43.q == e43Var) {
            return zzhqy.RAW;
        }
        if (e43.p == e43Var) {
            return zzhqy.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(e43Var)));
    }

    public static e43 b(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return e43.n;
        }
        if (iOrdinal == 2) {
            return e43.p;
        }
        if (iOrdinal == 3) {
            return e43.q;
        }
        if (iOrdinal == 4) {
            return e43.o;
        }
        int iZza = zzhqyVar.zza();
        throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }
}
