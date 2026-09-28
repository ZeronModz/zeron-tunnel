package io.ktor.http;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final List a = kotlin.collections.c.z(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);

    public static final int a(int i, int i2, String str) {
        boolean z = false;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ':') {
                if (cCharAt == '[') {
                    z = true;
                } else if (cCharAt == ']') {
                    z = false;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void b(URLBuilder uRLBuilder, String str) {
        uRLBuilder.getClass();
        str.getClass();
        if (g.B(str)) {
            return;
        }
        try {
            c(uRLBuilder, str);
        } catch (Throwable th) {
            throw new URLParserException(str, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(io.ktor.http.URLBuilder r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.f.c(io.ktor.http.URLBuilder, java.lang.String):void");
    }
}
