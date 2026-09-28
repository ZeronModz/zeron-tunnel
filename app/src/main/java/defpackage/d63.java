package defpackage;

import com.google.android.gms.internal.ads.zzhqy;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d63 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a = new m73(c53.class, o53.D);
        b = new l73(hc3VarA, o53.A);
        c = new a73(a53.class, o53.B);
        d = new z63(hc3VarA, o53.C);
    }

    public static zzhqy a(r43 r43Var) throws GeneralSecurityException {
        if (r43.f == r43Var) {
            return zzhqy.TINK;
        }
        if (r43.g == r43Var) {
            return zzhqy.CRUNCHY;
        }
        if (r43.h == r43Var) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(r43Var)));
    }

    public static r43 b(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return r43.f;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return r43.h;
            }
            if (iOrdinal != 4) {
                int iZza = zzhqyVar.zza();
                throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return r43.g;
    }
}
