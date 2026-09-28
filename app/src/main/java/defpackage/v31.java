package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v31 {
    public static final v31 d = new v31(0, false, false);
    public static final v31 e = new v31(500, true, false);
    public static final v31 f;
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new v31(100L, true, false);
        f = new v31(0L, false, true);
    }

    public v31(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            jx0.b(!z, "shouldRetry must be false when completeWithoutFailure is set to true");
        }
        this.c = z2;
    }
}
