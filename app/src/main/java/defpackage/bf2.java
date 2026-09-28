package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bf2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ df2 b;

    public /* synthetic */ bf2(df2 df2Var, int i) {
        this.a = i;
        this.b = df2Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        df2 df2Var = this.b;
        switch (i) {
            case 0:
                df2Var.b.execute(new bf2(df2Var, 1));
                break;
            default:
                df2Var.c();
                break;
        }
    }
}
