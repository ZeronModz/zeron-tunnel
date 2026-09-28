package defpackage;

import com.google.android.gms.internal.ads.zzhqy;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l63 {
    public static final m73 a;
    public static final l73 b;
    public static final a73 c;
    public static final z63 d;

    static {
        hc3 hc3VarA = z73.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        a = new m73(u53.class, e63.h);
        b = new l73(hc3VarA, e63.e);
        c = new a73(s53.class, e63.f);
        d = new z63(hc3VarA, e63.g);
    }

    public static q43 a(zzhqy zzhqyVar) {
        int iOrdinal = zzhqyVar.ordinal();
        if (iOrdinal == 1) {
            return q43.m;
        }
        if (iOrdinal == 3) {
            return q43.n;
        }
        int iZza = zzhqyVar.zza();
        throw new GeneralSecurityException(vh.i(iZza, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iZza).length() + 34)));
    }
}
