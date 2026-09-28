package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qm extends pm {
    @Override // defpackage.sm
    public final boolean a(char c) {
        return 'A' <= c && c <= 'Z';
    }

    public final String toString() {
        return "CharMatcher.inRange('" + sm.b('A') + "', '" + sm.b('Z') + "')";
    }
}
