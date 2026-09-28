package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ dt c;

    public /* synthetic */ xs(dt dtVar, Bundle bundle, int i) {
        this.a = i;
        this.c = dtVar;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.b;
        dt dtVar = this.c;
        switch (i) {
            case 0:
                dtVar.b.j(bundle);
                break;
            default:
                dtVar.b.k(bundle);
                break;
        }
    }
}
