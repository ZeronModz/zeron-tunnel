package defpackage;

import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzesm;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mg2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl0 b;

    public /* synthetic */ mg2(wl0 wl0Var, int i) {
        this.a = i;
        this.b = wl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        wl0 wl0Var = this.b;
        switch (i) {
            case 0:
                wl0Var.zza(new zzecr(3));
                break;
            default:
                ((zzesm) wl0Var.f).d.b.zzg();
                break;
        }
    }
}
