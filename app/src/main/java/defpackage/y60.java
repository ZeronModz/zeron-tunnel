package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.l0;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzeiw;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class y60 implements zzgzl, Continuation, zzdy {
    public int a;
    public Object b;

    public y60(int i, l01 l01Var) {
        this.a = i;
        this.b = new l01[]{l01Var};
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.m()) {
            return Boolean.FALSE;
        }
        int i = this.a;
        qz1 qz1Var = (qz1) this.b;
        rw2 rw2Var = (rw2) task.i();
        byte[] bArrA = ((l0) qz1Var.e()).a();
        rw2Var.getClass();
        try {
            if (rw2Var.b) {
                zzfxg zzfxgVar = rw2Var.a;
                zzfxgVar.zzg(bArrA);
                zzfxgVar.zzh(0);
                zzfxgVar.zzi(i);
                zzfxgVar.zzf(null);
                zzfxgVar.zze();
            }
        } catch (RemoteException unused) {
        }
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo9zza(Object obj) {
        ((zzna) obj).zze((zzmy) this.b, this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
        zzfjx zzfjxVar = (zzfjx) this.b;
        String str = (String) obj;
        int i = this.a;
        tt2 tt2Var = zzfjxVar.a;
        if (!tt2Var.i0) {
            zzfjxVar.c.b(str, tt2Var.x0, zzfjxVar.e, null);
            return;
        }
        lv2 lv2Var = zzfjxVar.d;
        String str2 = zzfjxVar.b.b;
        lv2Var.getClass();
        zzeiw zzeiwVar = new zzeiw(zzt.zzk().currentTimeMillis(), str2, str, i);
        zzeiu zzeiuVar = lv2Var.a;
        zzeiuVar.getClass();
        zzeiuVar.a(new mo2(2, zzeiuVar, zzeiwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        zzt.zzh().f("BufferingUrlPinger.attributionReportingManager", th);
    }

    public /* synthetic */ y60(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public y60(int i, l01... l01VarArr) {
        this.a = i;
        this.b = l01VarArr;
    }
}
