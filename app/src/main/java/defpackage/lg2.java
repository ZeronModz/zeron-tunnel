package defpackage;

import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcwn;
import com.google.android.gms.internal.ads.zzcwu;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lg2 implements zzgzl {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl0 b;
    public final /* synthetic */ zzcwu c;

    public /* synthetic */ lg2(zzcwu zzcwuVar, wl0 wl0Var, int i) {
        this.a = i;
        this.b = wl0Var;
        this.c = zzcwuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th) {
        int i = this.a;
        wl0 wl0Var = this.b;
        int i2 = 4;
        zzcwu zzcwuVar = this.c;
        switch (i) {
            case 0:
                wl0Var.zza(th);
                g3.f.execute(new kc2(zzcwuVar, i2));
                break;
            default:
                g3.f.execute(new kc2(zzcwuVar, i2));
                wl0Var.zza(th);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public final void mo5zzb(Object obj) {
        int i = this.a;
        wl0 wl0Var = this.b;
        zzcwu zzcwuVar = this.c;
        switch (i) {
            case 0:
                List list = ((zzcwn) obj).a;
                Executor executor = zzcwuVar.a;
                int i2 = 0;
                if (list == null || list.isEmpty()) {
                    executor.execute(new mg2(wl0Var, i2));
                } else {
                    ListenableFuture listenableFutureZ = u33.b;
                    Iterator it = list.iterator();
                    while (true) {
                        int i3 = 1;
                        if (!it.hasNext()) {
                            listenableFutureZ.addListener(new s33(i2, listenableFutureZ, new lg2(zzcwuVar, wl0Var, i3)), executor);
                        } else {
                            listenableFutureZ = z.Z(z.R(listenableFutureZ, Throwable.class, new t62(wl0Var, 3), executor), new ty1(zzcwuVar, i3, wl0Var, (ListenableFuture) it.next()), executor);
                        }
                    }
                }
                break;
            default:
                g3.f.execute(new kc2(zzcwuVar, 4));
                wl0Var.mo5zzb((jg2) obj);
                break;
        }
    }
}
