package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ys implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ dt d;

    public /* synthetic */ ys(dt dtVar, String str, Bundle bundle, int i) {
        this.a = i;
        this.d = dtVar;
        this.b = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Bundle bundle = this.c;
        String str = this.b;
        dt dtVar = this.d;
        switch (i) {
            case 0:
                dtVar.b.a(str, bundle);
                break;
            default:
                dtVar.b.h(str, bundle);
                break;
        }
    }
}
