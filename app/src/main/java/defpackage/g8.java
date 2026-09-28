package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g8 extends r0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;

    public g8(h8 h8Var, int i) {
        this.b = h8Var;
        this.a = i;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.b.a.keySet().asList().get(this.a);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b.c(this.a);
    }

    @Override // defpackage.r0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        return this.b.d(this.a, obj);
    }
}
