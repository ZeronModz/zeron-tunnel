package defpackage;

import okhttp3.Response;
import okio.Buffer;
import okio.ByteString;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ke0 {
    public static final ByteString a;
    public static final ByteString b;

    static {
        ByteString.INSTANCE.getClass();
        a = ByteString.Companion.c("\"\\");
        b = ByteString.Companion.c("\t ,=");
    }

    public static final boolean a(Response response) {
        if (response.a.b.equals("HEAD")) {
            return false;
        }
        int i = response.d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && sl1.j(response) == -1 && !"chunked".equalsIgnoreCase(Response.b("Transfer-Encoding", response))) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0105, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0105, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(okio.Buffer r17, java.util.ArrayList r18) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke0.b(okio.Buffer, java.util.ArrayList):void");
    }

    public static final String c(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(b);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.b;
        }
        if (jIndexOfElement != 0) {
            return buffer.readString(jIndexOfElement, xm.a);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(okhttp3.CookieJar r36, okhttp3.HttpUrl r37, okhttp3.Headers r38) {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke0.d(okhttp3.CookieJar, okhttp3.HttpUrl, okhttp3.Headers):void");
    }

    public static final boolean e(Buffer buffer) {
        boolean z = false;
        while (!buffer.exhausted()) {
            byte bE = buffer.e(0L);
            if (bE == 44) {
                buffer.readByte();
                z = true;
            } else {
                if (bE != 32 && bE != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z;
    }
}
