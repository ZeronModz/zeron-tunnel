package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public static final i1 c;
    public static final i1 d;
    public final boolean a;
    public final Throwable b;

    static {
        if (n1.d) {
            d = null;
            c = null;
        } else {
            d = new i1(null, false);
            c = new i1(null, true);
        }
    }

    public i1(Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
