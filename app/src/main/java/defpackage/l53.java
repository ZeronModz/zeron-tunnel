package defpackage;

import com.google.android.gms.internal.ads.zzhqy;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l53 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        a = new m73(k53.class, ot2.z);
        b = new l73(hc3VarA, ot2.w);
        c = new a73(j53.class, ot2.x);
        d = new z63(hc3VarA, ot2.y);
    }

    public static q43 a(zzhqy zzhqyVar) throws GeneralSecurityException {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return q43.k;
        }
        if (iOrdinal == 3) {
            return q43.l;
        }
        int iZza = zzhqyVar.zza();
        throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }
}
