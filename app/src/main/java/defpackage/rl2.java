package defpackage;

import com.google.android.gms.internal.ads.zzdvu;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rl2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzdvu b;

    public /* synthetic */ rl2(zzdvu zzdvuVar, int i) {
        this.a = i;
        this.b = zzdvuVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzdvu zzdvuVar = this.b;
        switch (i) {
            case 0:
                zzdvuVar.c.execute(new rl2(zzdvuVar, 1));
                break;
            case 1:
                zzdvuVar.a();
                break;
            default:
                zzdvuVar.a();
                break;
        }
    }
}
