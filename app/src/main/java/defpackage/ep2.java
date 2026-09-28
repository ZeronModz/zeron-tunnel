package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzfsj;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ep2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfsj b;

    public /* synthetic */ ep2(zzfsj zzfsjVar, int i) {
        this.a = i;
        this.b = zzfsjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzfsj zzfsjVar = this.b;
        switch (i) {
            case 0:
                zzfsjVar.a();
                break;
            default:
                if (((Boolean) zzbd.zzc().a(p32.j6)).booleanValue() && yv2.a.a) {
                    zzfsjVar.c();
                    break;
                }
                break;
        }
    }
}
