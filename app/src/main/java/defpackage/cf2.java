package defpackage;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cf2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ df2 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ cf2(df2 df2Var, int i, int i2, int i3) {
        this.a = i3;
        this.b = df2Var;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.c;
        df2 df2Var = this.b;
        switch (i) {
            case 0:
                df2Var.b.execute(new cf2(df2Var, i3, i2, 1));
                break;
            default:
                df2Var.b(i3 - 1, i2);
                break;
        }
    }
}
