package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hc1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kc1 b;

    public /* synthetic */ hc1(kc1 kc1Var, int i) {
        this.a = i;
        this.b = kc1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        kc1 kc1Var = this.b;
        switch (i) {
            case 0:
                kc1Var.a();
                break;
            case 1:
                kc1Var.b();
                break;
            default:
                mc1 mc1Var = kc1Var.r;
                if (mc1Var != null) {
                    mc1Var.b();
                }
                if (kc1Var.q == null) {
                    kc1Var.p.c();
                }
                break;
        }
    }
}
