package defpackage;

import com.google.android.gms.internal.ads.zzfqr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nv2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfqr b;

    public /* synthetic */ nv2(zzfqr zzfqrVar, int i) {
        this.a = i;
        this.b = zzfqrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k();
                return;
            case 1:
                this.b.k();
                return;
            case 2:
                this.b.k();
                return;
            case 3:
                this.b.k();
                return;
            default:
                zzfqr zzfqrVar = this.b;
                synchronized (zzfqrVar) {
                    zzfqrVar.b.set(false);
                    zzfqrVar.k();
                }
                return;
        }
    }
}
