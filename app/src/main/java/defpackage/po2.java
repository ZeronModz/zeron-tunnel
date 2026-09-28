package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class po2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo2 b;

    public /* synthetic */ po2(qo2 qo2Var, int i) {
        this.a = i;
        this.b = qo2Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
