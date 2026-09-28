package defpackage;

import com.google.android.gms.internal.ads.zzhqy;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h63 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = new m73(f53.class, e63.d);
        b = new l73(hc3VarA, o53.E);
        c = new a73(d53.class, e63.b);
        d = new z63(hc3VarA, e63.c);
    }

    public static zzhqy a(e43 e43Var) throws GeneralSecurityException {
        if (e43.i == e43Var) {
            return zzhqy.TINK;
        }
        if (e43.j == e43Var) {
            return zzhqy.CRUNCHY;
        }
        if (e43.k == e43Var) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(e43Var.b));
    }

    public static e43 b(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return e43.i;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return e43.k;
            }
            if (iOrdinal != 4) {
                int iZza = zzhqyVar.zza();
                throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return e43.j;
    }
}
