package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vq2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wq2 b;

    public /* synthetic */ vq2(wq2 wq2Var, int i) {
        this.a = i;
        this.b = wq2Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        wq2 wq2Var = this.b;
        switch (i) {
            case 0:
                wq2Var.e();
                break;
            case 1:
                wq2Var.e();
                break;
            default:
                wq2Var.getClass();
                wq2Var.f.execute(new vq2(wq2Var, 1));
                break;
        }
    }
}
