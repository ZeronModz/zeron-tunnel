package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class us0 {
    public static final ts0 b;
    public static final ts0 c;
    public static final ts0 d;
    public static final ts0 e;
    public static final ts0 f;
    public static final ts0 g;
    public static final ts0 h;
    public static final ts0 i;
    public static final ts0 j;
    public static final ts0 k;
    public static final ts0 l;
    public final boolean a;

    static {
        boolean z = false;
        b = new ts0(z, 2);
        c = new ts0(z, 3);
        boolean z2 = true;
        d = new ts0(z2, 4);
        e = new ts0(z, 5);
        f = new ts0(z2, 6);
        g = new ts0(z, 7);
        h = new ts0(z2, 8);
        i = new ts0(z, 9);
        j = new ts0(z2, 10);
        k = new ts0(z2, 0);
        l = new ts0(z2, 1);
    }

    public us0(boolean z) {
        this.a = z;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public abstract Object c(String str);

    public abstract void d(Bundle bundle, String str, Object obj);

    public final String toString() {
        return b();
    }
}
