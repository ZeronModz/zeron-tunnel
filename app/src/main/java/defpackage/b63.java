package defpackage;

import com.google.android.gms.internal.ads.zzhqy;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b63 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a = new m73(z43.class, o53.z);
        b = new l73(hc3VarA, o53.w);
        c = new a73(x43.class, o53.x);
        d = new z63(hc3VarA, o53.y);
    }

    public static zzhqy a(q43 q43Var) throws GeneralSecurityException {
        if (q43.h == q43Var) {
            return zzhqy.TINK;
        }
        if (q43.i == q43Var) {
            return zzhqy.CRUNCHY;
        }
        if (q43.j == q43Var) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(q43Var)));
    }

    public static q43 b(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return q43.h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return q43.j;
            }
            if (iOrdinal != 4) {
                int iZza = zzhqyVar.zza();
                throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return q43.i;
    }
}
