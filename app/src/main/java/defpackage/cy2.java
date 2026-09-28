package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cy2 implements Comparable {
    public final Runnable a;
    public final long b;

    public cy2(long j, Runnable runnable) {
        this.a = runnable;
        this.b = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.b, ((cy2) obj).b);
    }
}
