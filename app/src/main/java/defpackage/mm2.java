package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzeqd;
import com.google.android.gms.internal.ads.zzgdc;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.android.gms.internal.ads.zzikg;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mm2 implements zzikg {
    public final /* synthetic */ int a;
    public final te3 b;

    public /* synthetic */ mm2(te3 te3Var, int i) {
        this.a = i;
        this.b = te3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        te3 te3Var = this.b;
        switch (i) {
            case 0:
                return new ci2((zzbph) te3Var.a, 3);
            case 1:
                return new zzeqd((zzdlu) te3Var.a);
            case 2:
                File dir = ((Context) te3Var.a).getDir("yqzdkcache", 0);
                k02.J(dir);
                return dir;
            case 3:
                ExecutorService executorService = (ExecutorService) te3Var.a;
                if (executorService instanceof zzgzy) {
                    return (zzgzy) executorService;
                }
                return executorService instanceof ScheduledExecutorService ? new a43((ScheduledExecutorService) executorService) : new ta2(executorService);
            case 4:
                return new zzgdc((ExecutorService) te3Var.a);
            default:
                DisplayMetrics displayMetrics = ((Context) te3Var.a).getResources().getDisplayMetrics();
                k02.J(displayMetrics);
                return displayMetrics;
        }
    }
}
