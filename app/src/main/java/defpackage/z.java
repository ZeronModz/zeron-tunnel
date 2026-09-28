package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z {
    public static final z b;
    public static final z c;
    public final Throwable a;

    static {
        if (l0.d) {
            c = null;
            b = null;
        } else {
            c = new z(null, false);
            b = new z(null, true);
        }
    }

    public z(Throwable th, boolean z) {
        this.a = th;
    }
}
