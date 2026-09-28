package defpackage;

import io.ktor.http.CookieEncoding;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class pr {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CookieEncoding.values().length];
        try {
            iArr[CookieEncoding.RAW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CookieEncoding.DQUOTES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CookieEncoding.BASE64_ENCODING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[CookieEncoding.URI_ENCODING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
