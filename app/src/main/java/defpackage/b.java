package defpackage;

import okio.Buffer;
import okio.ByteString;
import okio.Path;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final ByteString a;
    public static final ByteString b;
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;

    static {
        ByteString.INSTANCE.getClass();
        a = ByteString.Companion.c("/");
        b = ByteString.Companion.c("\\");
        c = ByteString.Companion.c("/\\");
        d = ByteString.Companion.c(".");
        e = ByteString.Companion.c("..");
    }

    public static final Path a(Path path, Path path2, boolean z) {
        path2.getClass();
        if (c(path2) != -1 || path2.g() != null) {
            return path2;
        }
        ByteString byteStringB = b(path);
        if (byteStringB == null && (byteStringB = b(path2)) == null) {
            byteStringB = f(Path.c);
        }
        Buffer buffer = new Buffer();
        buffer.i(path.a);
        if (buffer.b > 0) {
            buffer.i(byteStringB);
        }
        buffer.i(path2.a);
        return d(buffer, z);
    }

    public static final ByteString b(Path path) {
        ByteString byteString = path.a;
        ByteString byteString2 = a;
        if (ByteString.indexOf$default(byteString, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        ByteString byteString3 = path.a;
        ByteString byteString4 = b;
        if (ByteString.indexOf$default(byteString3, byteString4, 0, 2, (Object) null) != -1) {
            return byteString4;
        }
        return null;
    }

    public static final int c(Path path) {
        ByteString byteString = path.a;
        if (byteString.size() != 0) {
            if (byteString.getByte(0) != 47) {
                if (byteString.getByte(0) == 92) {
                    if (byteString.size() > 2 && byteString.getByte(1) == 92) {
                        int iIndexOf = byteString.indexOf(b, 2);
                        return iIndexOf == -1 ? byteString.size() : iIndexOf;
                    }
                } else if (byteString.size() > 2 && byteString.getByte(1) == 58 && byteString.getByte(2) == 92) {
                    char c2 = (char) byteString.getByte(0);
                    if ('a' <= c2 && c2 < '{') {
                        return 3;
                    }
                    if ('A' <= c2 && c2 < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011c A[EDGE_INSN: B:101:0x011c->B:84:0x011c BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okio.Path d(okio.Buffer r17, boolean r18) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b.d(okio.Buffer, boolean):okio.Path");
    }

    public static final ByteString e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        u7.r(hz.o(b2, "not a directory separator: "));
        return null;
    }

    public static final ByteString f(String str) {
        if (yg0.a(str, "/")) {
            return a;
        }
        if (yg0.a(str, "\\")) {
            return b;
        }
        u7.r(vh.l("not a directory separator: ", str));
        return null;
    }
}
