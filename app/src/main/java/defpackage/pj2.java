package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzblj;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzblq;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmm;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdoh;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pj2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzdoc b;

    public /* synthetic */ pj2(zzdoc zzdocVar, int i) {
        this.a = i;
        this.b = zzdocVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzblz zzblzVar = null;
        zzdoc zzdocVar = this.b;
        switch (i) {
            case 0:
                zzdocVar.n.zzA();
                zzdoh zzdohVar = zzdocVar.m;
                synchronized (zzdohVar) {
                    try {
                        zzcjl zzcjlVar = zzdohVar.i;
                        if (zzcjlVar != null) {
                            zzcjlVar.destroy();
                            zzdohVar.i = null;
                        }
                        zzcjl zzcjlVar2 = zzdohVar.j;
                        if (zzcjlVar2 != null) {
                            zzcjlVar2.destroy();
                            zzdohVar.j = null;
                        }
                        zzcjl zzcjlVar3 = zzdohVar.k;
                        if (zzcjlVar3 != null) {
                            zzcjlVar3.destroy();
                            zzdohVar.k = null;
                        }
                        ListenableFuture listenableFuture = zzdohVar.m;
                        if (listenableFuture != null) {
                            listenableFuture.cancel(false);
                            zzdohVar.m = null;
                        }
                        zzcen zzcenVar = zzdohVar.n;
                        if (zzcenVar != null) {
                            zzcenVar.cancel(false);
                            zzdohVar.n = null;
                        }
                        zzdohVar.l = null;
                        zzdohVar.v.clear();
                        zzdohVar.w.clear();
                        zzdohVar.b = null;
                        zzdohVar.c = null;
                        zzdohVar.d = null;
                        zzdohVar.e = null;
                        zzdohVar.h = null;
                        zzdohVar.o = null;
                        zzdohVar.p = null;
                        zzdohVar.q = null;
                        zzdohVar.s = null;
                        zzdohVar.t = null;
                        zzdohVar.u = null;
                    } finally {
                    }
                }
                return;
            default:
                tj2 tj2Var = zzdocVar.q;
                try {
                    zzdoh zzdohVar2 = zzdocVar.m;
                    int iM = zzdohVar2.M();
                    if (iM == 1) {
                        zzblt zzbltVar = tj2Var.a;
                        if (zzbltVar != null) {
                            zzdocVar.o();
                            zzbltVar.zze((zzblj) zzdocVar.r.zzb());
                            return;
                        }
                        return;
                    }
                    if (iM == 2) {
                        zzblq zzblqVar = tj2Var.b;
                        if (zzblqVar != null) {
                            zzdocVar.o();
                            zzblqVar.zze((zzblh) zzdocVar.s.zzb());
                            return;
                        }
                        return;
                    }
                    if (iM == 3) {
                        String strH = zzdohVar2.h();
                        if (strH == null) {
                            tj2Var.getClass();
                        } else {
                            zzblzVar = (zzblz) tj2Var.f.get(strH);
                        }
                        if (zzblzVar != null) {
                            if (zzdohVar2.i() != null) {
                                zzdocVar.g("Google", true);
                            }
                            zzblzVar.zze((zzblm) zzdocVar.v.zzb());
                            return;
                        }
                        return;
                    }
                    if (iM == 6) {
                        zzbmg zzbmgVar = tj2Var.c;
                        if (zzbmgVar != null) {
                            zzdocVar.o();
                            zzbmgVar.zze((zzbmm) zzdocVar.t.zzb());
                            return;
                        }
                        return;
                    }
                    if (iM != 7) {
                        zzo.zzf("Wrong native template id!");
                        return;
                    }
                    zzbrb zzbrbVar = tj2Var.e;
                    if (zzbrbVar != null) {
                        zzbrbVar.zze((zzbqv) zzdocVar.u.zzb());
                        return;
                    }
                    return;
                } catch (RemoteException e) {
                    zzo.zzg("RemoteException when notifyAdLoad is called", e);
                    return;
                }
        }
    }
}
