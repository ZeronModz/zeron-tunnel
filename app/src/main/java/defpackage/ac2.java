package defpackage;

import com.google.android.gms.internal.ads.j3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ac2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j3 b;

    public /* synthetic */ ac2(j3 j3Var, int i) {
        this.a = i;
        this.b = j3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        j3 j3Var = this.b;
        switch (i) {
            case 0:
                super/*android.webkit.WebView*/.destroy();
                break;
            default:
                j3Var.j();
                break;
        }
    }
}
