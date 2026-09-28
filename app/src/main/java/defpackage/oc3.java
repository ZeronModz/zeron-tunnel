package defpackage;

import com.google.android.gms.internal.ads.zzhyk;
import com.google.android.gms.internal.ads.zzhyl;
import com.google.android.gms.internal.ads.zzhym;
import com.google.android.gms.internal.ads.zzhyn;
import com.google.android.gms.internal.ads.zzhyp;
import com.google.android.gms.internal.ads.zzhyq;
import com.google.android.gms.internal.ads.zzhys;
import com.google.android.gms.internal.ads.zzhzs;
import java.util.Objects;
import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oc3 extends zzhys {
    public static final oc3 a = new oc3();

    public static void b(zzhzs zzhzsVar, zzhyl zzhylVar) throws IOException {
        Writer writer = zzhzsVar.a;
        if (zzhylVar == null || (zzhylVar instanceof zzhym)) {
            if (zzhzsVar.i != null) {
                zzhzsVar.c();
            }
            zzhzsVar.f();
            writer.write("null");
            return;
        }
        if (zzhylVar instanceof zzhyp) {
            zzhyp zzhypVarC = zzhylVar.c();
            Serializable serializable = zzhypVarC.a;
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    boolean zBooleanValue = ((Boolean) serializable).booleanValue();
                    zzhzsVar.c();
                    zzhzsVar.f();
                    writer.write(true != zBooleanValue ? "false" : "true");
                    return;
                }
                String strA = zzhypVarC.a();
                if (strA != null) {
                    zzhzsVar.c();
                    zzhzsVar.f();
                    zzhzsVar.d(strA);
                    return;
                } else {
                    if (zzhzsVar.i != null) {
                        zzhzsVar.c();
                    }
                    zzhzsVar.f();
                    writer.write("null");
                    return;
                }
            }
            Number numberD = zzhypVarC.d();
            zzhzsVar.c();
            String string = numberD.toString();
            Class<?> cls = numberD.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    if (zzhzsVar.h != zzhyq.LENIENT) {
                        u7.r("Numeric values must be finite, but was ".concat(string));
                        return;
                    }
                } else if (cls != Float.class && cls != Double.class && !zzhzs.j.matcher(string).matches()) {
                    String strValueOf = String.valueOf(cls);
                    u7.r(hz.x(new StringBuilder(strValueOf.length() + 47 + string.length()), "String created by ", strValueOf, " is not a valid JSON number: ", string));
                    return;
                }
            }
            zzhzsVar.f();
            writer.append((CharSequence) string);
            return;
        }
        if (zzhylVar instanceof zzhyk) {
            zzhzsVar.c();
            zzhzsVar.f();
            int i = zzhzsVar.c;
            int[] iArrCopyOf = zzhzsVar.b;
            if (i == iArrCopyOf.length) {
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i + i);
                zzhzsVar.b = iArrCopyOf;
            }
            int i2 = zzhzsVar.c;
            zzhzsVar.c = i2 + 1;
            iArrCopyOf[i2] = 1;
            writer.write(91);
            Iterator it = ((zzhyk) zzhylVar).a.iterator();
            while (it.hasNext()) {
                b(zzhzsVar, (zzhyl) it.next());
            }
            zzhzsVar.a(1, 2, ']');
            return;
        }
        if (!(zzhylVar instanceof zzhyn)) {
            u7.r("Couldn't write ".concat(String.valueOf(zzhylVar.getClass())));
            return;
        }
        zzhzsVar.c();
        zzhzsVar.f();
        int i3 = zzhzsVar.c;
        int[] iArrCopyOf2 = zzhzsVar.b;
        if (i3 == iArrCopyOf2.length) {
            iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i3 + i3);
            zzhzsVar.b = iArrCopyOf2;
        }
        int i4 = zzhzsVar.c;
        zzhzsVar.c = i4 + 1;
        iArrCopyOf2[i4] = 3;
        writer.write(123);
        for (Map.Entry entry : zzhylVar.b().a.entrySet()) {
            String str = (String) entry.getKey();
            Objects.requireNonNull(str, "name == null");
            if (zzhzsVar.i != null) {
                u7.p("Already wrote a name, expecting a value.");
                return;
            }
            int iB = zzhzsVar.b();
            if (iB != 3 && iB != 5) {
                u7.p("Please begin an object before writing a name.");
                return;
            } else {
                zzhzsVar.i = str;
                b(zzhzsVar, (zzhyl) entry.getValue());
            }
        }
        zzhzsVar.a(3, 5, '}');
    }
}
