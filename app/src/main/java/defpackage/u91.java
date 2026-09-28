package defpackage;

import defpackage.p91;
import defpackage.q91;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u91 {
    public static final boolean a;
    public static final t91 b;
    public static final t91 c;
    public static final p91.a d;
    public static final q91.a e;
    public static final r91 f;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            b = new t91(0, Date.class);
            c = new t91(1, Timestamp.class);
            d = p91.b;
            e = q91.b;
            f = s91.b;
            return;
        }
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }
}
