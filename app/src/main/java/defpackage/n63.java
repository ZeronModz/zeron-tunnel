package defpackage;

import com.google.android.gms.internal.ads.zzhqy;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n63 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        a = new m73(x53.class, e63.l);
        b = new l73(hc3VarA, e63.i);
        c = new a73(v53.class, e63.j);
        d = new z63(hc3VarA, e63.k);
    }

    public static zzhqy a(r43 r43Var) throws GeneralSecurityException {
        if (r43.o == r43Var) {
            return zzhqy.TINK;
        }
        if (r43.p == r43Var) {
            return zzhqy.CRUNCHY;
        }
        if (r43.q == r43Var) {
            return zzhqy.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(r43Var.b));
    }

    public static r43 b(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return r43.o;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return r43.q;
            }
            if (iOrdinal != 4) {
                int iZza = zzhqyVar.zza();
                throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
            }
        }
        return r43.p;
    }
}
