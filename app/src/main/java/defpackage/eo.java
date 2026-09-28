package defpackage;

import io.ktor.http.URLDecodeException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.b;
import kotlin.collections.c;
import kotlin.collections.h;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.CharRange;
import kotlin.text.g;
import kotlinx.io.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class eo {
    public static final Set a;
    public static final Set b;
    public static final ArrayList c;
    public static final Set d;
    public static final ArrayList e;

    static {
        ArrayList arrayListC = c.C(new CharRange('0', '9'), c.E(new CharRange('a', 'z'), new CharRange('A', 'Z')));
        ArrayList arrayList = new ArrayList(c.l(arrayListC, 10));
        Iterator it = arrayListC.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        a = c.U(arrayList);
        b = c.U(c.C(new CharRange('0', '9'), c.E(new CharRange('a', 'z'), new CharRange('A', 'Z'))));
        c.U(c.C(new CharRange('0', '9'), c.E(new CharRange('a', 'f'), new CharRange('A', 'F'))));
        Set setY = b.y(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(c.l(setY, 10));
        Iterator it2 = setY.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        c = arrayList2;
        d = b.y(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        h.a(b, b.y(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listA = c.A('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(c.l(listA, 10));
        Iterator it3 = listA.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        e = arrayList3;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        if ('a' > c2 || c2 >= 'g') {
            return -1;
        }
        return c2 - 'W';
    }

    public static final String b(String str, int i, int i2, boolean z) throws URLDecodeException {
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '%' || (z && cCharAt == '+')) {
                int i4 = i2 - i;
                if (i4 > 255) {
                    i4 /= 3;
                }
                StringBuilder sb = new StringBuilder(i4);
                if (i3 > i) {
                    sb.append((CharSequence) str, i, i3);
                }
                byte[] bArr = null;
                while (i3 < i2) {
                    char cCharAt2 = str.charAt(i3);
                    if (z && cCharAt2 == '+') {
                        sb.append(' ');
                    } else if (cCharAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i3) / 3];
                        }
                        int i5 = 0;
                        while (i3 < i2 && str.charAt(i3) == '%') {
                            int i6 = i3 + 2;
                            if (i6 >= i2) {
                                StringBuilder sb2 = new StringBuilder("Incomplete trailing HEX escape: ");
                                sb2.append(str.subSequence(i3, str.length()).toString());
                                sb2.append(", in ");
                                sb2.append((Object) str);
                                throw new URLDecodeException(vh.i(i3, " at ", sb2));
                            }
                            int i7 = i3 + 1;
                            int iA = a(str.charAt(i7));
                            int iA2 = a(str.charAt(i6));
                            if (iA == -1 || iA2 == -1) {
                                throw new URLDecodeException("Wrong HEX escape: %" + str.charAt(i7) + str.charAt(i6) + ", in " + ((Object) str) + ", at " + i3);
                            }
                            bArr[i5] = (byte) ((iA * 16) + iA2);
                            i3 += 3;
                            i5++;
                        }
                        sb.append(g.r(i5, 4, bArr));
                    } else {
                        sb.append(cCharAt2);
                    }
                    i3++;
                }
                return sb.toString();
            }
            i3++;
        }
        return (i == 0 && i2 == str.length()) ? str.toString() : str.substring(i, i2);
    }

    public static String c(String str) {
        int length = str.length();
        Charset charset = xm.a;
        str.getClass();
        charset.getClass();
        return b(str, 0, length, false);
    }

    public static String d(int i, int i2, String str, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Charset charset = xm.a;
        str.getClass();
        charset.getClass();
        return b(str, i, i2, z);
    }

    public static final String e(String str, final boolean z) {
        str.getClass();
        final StringBuilder sb = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = xm.a.newEncoder();
        charsetEncoderNewEncoder.getClass();
        int length = str.length();
        Buffer buffer = new Buffer();
        ii2.g(charsetEncoderNewEncoder, buffer, str, 0, length);
        f(buffer, new Function1() { // from class: co
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Byte b2 = (Byte) obj;
                byte bByteValue = b2.byteValue();
                boolean zContains = eo.a.contains(b2);
                StringBuilder sb2 = sb;
                if (zContains || eo.e.contains(b2)) {
                    sb2.append((char) bByteValue);
                } else if (z && bByteValue == 32) {
                    sb2.append('+');
                } else {
                    sb2.append(eo.g(bByteValue));
                }
                return mk1.a;
            }
        });
        return sb.toString();
    }

    public static final void f(Buffer buffer, Function1 function1) {
        int i = sg.a;
        while (!buffer.exhausted()) {
            while (!buffer.exhausted()) {
                function1.invoke(Byte.valueOf(buffer.readByte()));
            }
        }
    }

    public static final String g(byte b2) {
        int i = (b2 & 255) >> 4;
        int i2 = b2 & 15;
        return new String(new char[]{'%', (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48), (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }
}
