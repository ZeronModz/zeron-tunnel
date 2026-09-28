package defpackage;

import com.google.gson.JsonElement;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ki1 {
    public static final zh1 A;
    public static final b30 B;
    public static final zh1 a;
    public static final zh1 b;
    public static final ei1 c;
    public static final bi1 d;
    public static final bi1 e;
    public static final bi1 f;
    public static final bi1 g;
    public static final zh1 h;
    public static final zh1 i;
    public static final zh1 j;
    public static final hh1 k;
    public static final bi1 l;
    public static final mh1 m;
    public static final nh1 n;
    public static final oh1 o;
    public static final zh1 p;
    public static final zh1 q;
    public static final zh1 r;
    public static final zh1 s;
    public static final zh1 t;
    public static final zh1 u;
    public static final zh1 v;
    public static final zh1 w;
    public static final hu0 x;
    public static final zh1 y;
    public static final ni0 z;

    static {
        int i2 = 0;
        a = new zh1(Class.class, new qh1().a(), i2);
        b = new zh1(BitSet.class, new ai1().a(), i2);
        di1 di1Var = new di1();
        c = new ei1();
        d = new bi1(Boolean.TYPE, Boolean.class, di1Var);
        e = new bi1(Byte.TYPE, Byte.class, new fi1());
        f = new bi1(Short.TYPE, Short.class, new gi1());
        g = new bi1(Integer.TYPE, Integer.class, new hi1());
        h = new zh1(AtomicInteger.class, new ii1().a(), i2);
        i = new zh1(AtomicBoolean.class, new ji1().a(), i2);
        j = new zh1(AtomicIntegerArray.class, new gh1().a(), i2);
        k = new hh1();
        new ih1();
        new jh1();
        l = new bi1(Character.TYPE, Character.class, new kh1());
        lh1 lh1Var = new lh1();
        m = new mh1();
        n = new nh1();
        o = new oh1();
        p = new zh1(String.class, lh1Var, i2);
        q = new zh1(StringBuilder.class, new ph1(), i2);
        r = new zh1(StringBuffer.class, new rh1(), i2);
        s = new zh1(URL.class, new sh1(), i2);
        t = new zh1(URI.class, new th1(), i2);
        int i3 = 1;
        u = new zh1(InetAddress.class, new uh1(), i3);
        v = new zh1(UUID.class, new vh1(), i2);
        w = new zh1(Currency.class, new wh1().a(), i2);
        x = new hu0(new xh1(), 2);
        y = new zh1(Locale.class, new yh1(), i2);
        ni0 ni0Var = ni0.a;
        z = ni0Var;
        A = new zh1(JsonElement.class, ni0Var, i3);
        B = c30.d;
    }
}
