package defpackage;

import com.google.android.gms.internal.ads.zzhqy;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z53 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a = new m73(w43.class, o53.v);
        b = new l73(hc3VarA, o53.s);
        c = new a73(t43.class, o53.t);
        d = new z63(hc3VarA, o53.u);
    }

    public static zzhqy a(e43 e43Var) throws GeneralSecurityException {
        if (e43.f == e43Var) {
            return zzhqy.TINK;
        }
        if (e43.g == e43Var) {
            return zzhqy.CRUNCHY;
        }
        if (e43.h == e43Var) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(e43Var)));
    }

    public static e43 b(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return e43.f;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return e43.h;
            }
            if (iOrdinal != 4) {
                int iZza = zzhqyVar.zza();
                throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return e43.g;
    }
}
