package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzeej;
import com.google.android.gms.internal.ads.zzehp;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzgfe;
import com.google.android.gms.internal.ads.zzgnt;
import com.google.android.gms.internal.ads.zzikg;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cn2 implements zzikg {
    public final /* synthetic */ int a;
    public final se3 b;

    public /* synthetic */ cn2(se3 se3Var, int i) {
        this.a = i;
        this.b = se3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        se3 se3Var = this.b;
        switch (i) {
            case 0:
                bn2 bn2Var = (bn2) se3Var.zzb();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new zzdje(bn2Var, ta2Var);
            case 1:
                return new zzdje((xn2) se3Var.zzb(), g3.g);
            case 2:
                return new zzdje((xn2) se3Var.zzb(), g3.g);
            case 3:
                return new zzdje((xn2) se3Var.zzb(), g3.g);
            case 4:
                Context context = (Context) se3Var.zzb();
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                return new zzeej(context, ta2Var2);
            case 5:
                zzehp zzehpVar = (zzehp) se3Var.zzb();
                ta2 ta2Var3 = g3.a;
                k02.J(ta2Var3);
                return new zzdje(zzehpVar, ta2Var3);
            case 6:
                zzehp zzehpVar2 = (zzehp) se3Var.zzb();
                ta2 ta2Var4 = g3.a;
                k02.J(ta2Var4);
                return new zzdje(zzehpVar2, ta2Var4);
            case 7:
                return new zzfjo((zzazh) se3Var.zzb());
            case 8:
                return new zzdje((zzfks) se3Var.zzb(), g3.g);
            case 9:
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) se3Var.zzb()));
                k02.J(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
                return scheduledExecutorServiceUnconfigurableScheduledExecutorService;
            case 10:
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) se3Var.zzb();
                ta2 ta2Var5 = g3.a;
                k02.J(ta2Var5);
                return new vu2(scheduledExecutorService, ta2Var5);
            case 11:
                return new lv2((zzeiu) se3Var.zzb());
            case 12:
                return new zzgfe((f6) se3Var.zzb());
            default:
                return new zzgnt((ox2) se3Var.zzb());
        }
    }
}
