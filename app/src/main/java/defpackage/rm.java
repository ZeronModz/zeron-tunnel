package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rm extends pm {
    public final char a;

    public rm(char c) {
        this.a = c;
    }

    @Override // defpackage.sm
    public final boolean a(char c) {
        return c == this.a;
    }

    public final String toString() {
        return "CharMatcher.is('" + sm.b(this.a) + "')";
    }
}
