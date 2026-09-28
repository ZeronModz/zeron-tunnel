package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zo extends bp {
    @Override // defpackage.bp
    public final bp a(Comparable comparable, Comparable comparable2) {
        int iCompareTo = comparable.compareTo(comparable2);
        return iCompareTo < 0 ? bp.b : iCompareTo > 0 ? bp.c : bp.a;
    }

    @Override // defpackage.bp
    public final int b() {
        return 0;
    }
}
