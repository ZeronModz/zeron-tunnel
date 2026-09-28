package defpackage;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class jc3 {
    public static final jc3 d = new jc3(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new jc3("\n", "  ", true);
    }

    public jc3(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            u7.r("Only combinations of \\n and \\r are allowed in newline.");
            throw null;
        }
        if (!str2.matches("[ \t]*")) {
            u7.r("Only combinations of spaces and tabs are allowed in indent.");
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = z;
    }
}
