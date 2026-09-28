package defpackage;

import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcjl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class w12 extends zzcen {
    public final /* synthetic */ int b = 1;
    public final Object c;

    public w12(l00 l00Var) {
        this.c = l00Var;
    }

    public void c() {
        a(this.c);
    }

    @Override // com.google.android.gms.internal.ads.zzcen, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        switch (this.b) {
            case 0:
                ((l00) this.c).e();
                return this.a.cancel(z);
            default:
                return super.cancel(z);
        }
    }

    public w12(zzcjl zzcjlVar) {
        this.c = zzcjlVar;
    }
}
