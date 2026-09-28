package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k70 extends l70 {
    public final /* synthetic */ int e;
    public final /* synthetic */ n70 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k70(n70 n70Var, int i) {
        super(n70Var);
        this.e = i;
        this.f = n70Var;
    }

    @Override // defpackage.l70
    public final float a() {
        float f;
        float f2;
        int i = this.e;
        n70 n70Var = this.f;
        switch (i) {
            case 0:
                f = n70Var.h;
                f2 = n70Var.i;
                break;
            case 1:
                f = n70Var.h;
                f2 = n70Var.j;
                break;
            default:
                return n70Var.h;
        }
        return f + f2;
    }
}
