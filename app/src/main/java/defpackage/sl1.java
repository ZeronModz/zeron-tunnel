package defpackage;

import java.util.DesugarCollections;
import java.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.c;
import kotlin.jvm.internal.a;
import kotlin.text.Regex;
import kotlin.text.g;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.d;
import okhttp3.e;
import okhttp3.internal.http2.Header;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Options;
import okio.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sl1 {
    public static final byte[] a;
    public static final Headers b;
    public static final e c;
    public static final Options d;
    public static final TimeZone e;
    public static final Regex f;
    public static final String g;

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        Headers.b.getClass();
        b = Headers.Companion.c(new String[0]);
        ResponseBody.a.getClass();
        Buffer buffer = new Buffer();
        buffer.m68write(bArr, 0, 0);
        c = new e(buffer, 0L);
        RequestBody.a.getClass();
        new d(null, 0, bArr);
        Options.Companion companion = Options.c;
        ByteString.INSTANCE.getClass();
        ByteString[] byteStringArr = {ByteString.Companion.b("efbbbf"), ByteString.Companion.b("feff"), ByteString.Companion.b("fffe"), ByteString.Companion.b("0000ffff"), ByteString.Companion.b("ffff0000")};
        companion.getClass();
        d = Options.Companion.b(byteStringArr);
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        e = timeZone;
        f = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        g = g.J(g.I(OkHttpClient.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(HttpUrl httpUrl, HttpUrl httpUrl2) {
        httpUrl.getClass();
        httpUrl2.getClass();
        return httpUrl.d.equals(httpUrl2.d) && httpUrl.e == httpUrl2.e && httpUrl.a.equals(httpUrl2.a);
    }

    public static final int b(String str, long j, TimeUnit timeUnit) {
        if (j < 0) {
            zg1.l(str.concat(" < 0"));
            return 0;
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            zu0.e(str.concat(" too large."));
            return 0;
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        zu0.e(str.concat(" too small."));
        return 0;
    }

    public static final void c(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!yg0.a(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (g.p(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c2, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return f(str, c2, i, i2);
    }

    public static final String h(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        comparator.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator itA = a.a(strArr2);
                while (itA.hasNext()) {
                    if (comparator.compare(str, (String) itA.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(Response response) {
        String strA = response.f.a("Content-Length");
        if (strA == null) {
            return -1L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List k(Object... objArr) {
        Object[] objArr2 = (Object[]) objArr.clone();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(c.A(Arrays.copyOf(objArr2, objArr2.length)));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (yg0.q(cCharAt, 31) <= 0 || yg0.q(cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int n(int i, int i2, String str) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
        comparator.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        str.getClass();
        return str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie");
    }

    public static final int q(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' > c2 || c2 >= 'G') {
            return -1;
        }
        return c2 - '7';
    }

    public static final Object r(Object obj, Class cls, String str) throws IllegalAccessException {
        Object objCast;
        Object objR;
        cls.getClass();
        Class<?> superclass = obj.getClass();
        while (true) {
            objCast = null;
            if (superclass.equals(Object.class)) {
                if (str.equals("delegate") || (objR = r(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return r(objR, cls, str);
            }
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    break;
                }
                objCast = cls.cast(obj2);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                superclass.getClass();
            }
        }
        return objCast;
    }

    public static final int s(BufferedSource bufferedSource) {
        return (bufferedSource.readByte() & 255) | ((bufferedSource.readByte() & 255) << 16) | ((bufferedSource.readByte() & 255) << 8);
    }

    public static final int t(Buffer buffer) {
        int i = 0;
        while (!buffer.exhausted() && buffer.e(0L) == 61) {
            i++;
            buffer.readByte();
        }
        return i;
    }

    public static final boolean u(Source source, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long jNanoTime = System.nanoTime();
        long jD = source.timeout().getA() ? source.timeout().d() - jNanoTime : Long.MAX_VALUE;
        source.timeout().e(Math.min(jD, timeUnit.toNanos(i)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.a();
            }
            if (jD == Long.MAX_VALUE) {
                source.timeout().b();
                return true;
            }
            source.timeout().e(jNanoTime + jD);
            return true;
        } catch (InterruptedIOException unused) {
            if (jD == Long.MAX_VALUE) {
                source.timeout().b();
                return false;
            }
            source.timeout().e(jNanoTime + jD);
            return false;
        } catch (Throwable th) {
            if (jD == Long.MAX_VALUE) {
                source.timeout().b();
            } else {
                source.timeout().e(jNanoTime + jD);
            }
            throw th;
        }
    }

    public static final Headers v(List list) {
        Headers.Builder builder = new Headers.Builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Header header = (Header) it.next();
            builder.c(header.a.utf8(), header.b.utf8());
        }
        return builder.d();
    }

    public static final String w(HttpUrl httpUrl, boolean z) {
        httpUrl.getClass();
        int i = httpUrl.e;
        String strF = httpUrl.d;
        if (g.o(strF, ":", false)) {
            strF = vh.f(']', "[", strF);
        }
        if (!z) {
            HttpUrl.Companion companion = HttpUrl.k;
            String str = httpUrl.a;
            companion.getClass();
            if (i == HttpUrl.Companion.b(str)) {
                return strF;
            }
        }
        return strF + ':' + i;
    }

    public static final List x(List list) {
        list.getClass();
        List listUnmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        listUnmodifiableList.getClass();
        return listUnmodifiableList;
    }

    public static final int y(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long j = Long.parseLong(str);
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j < 0) {
                return 0;
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
