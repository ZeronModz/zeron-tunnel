package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzent;
import com.google.android.gms.internal.ads.zzetp;
import com.google.android.gms.internal.ads.zzetr;
import com.google.android.gms.internal.ads.zzevl;
import com.google.android.gms.internal.ads.zzeyq;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzfkd;
import com.google.android.gms.internal.ads.zzgdh;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gq2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzikp b;
    public final zzikp c;
    public final zzikp d;

    public /* synthetic */ gq2(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, int i) {
        this.a = i;
        this.b = zzikpVar;
        this.c = zzikpVar2;
        this.d = zzikpVar3;
    }

    public zzetp a() {
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        return new zzetp(ta2Var, (ql2) this.b.zzb(), (zzeak) this.c.zzb(), (zzetr) this.d.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.d;
        zzikp zzikpVar2 = this.c;
        zzikp zzikpVar3 = this.b;
        switch (i) {
            case 0:
                return new zzent((zzfkd) zzikpVar3.zzb(), (ol2) zzikpVar2.zzb(), (zzdxz) zzikpVar.zzb());
            case 1:
                return a();
            case 2:
                Context contextA = ((sc2) zzikpVar3).a();
                zzcdu zzcduVar = (zzcdu) zzikpVar2.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzikpVar.zzb();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new rr2(contextA, zzcduVar, scheduledExecutorService, ta2Var);
            case 3:
                Object er2Var = new er2(((sc2) ((fr2) zzikpVar3).a).a(), 0);
                zzevl zzevlVar = (zzevl) zzikpVar2.zzb();
                if (true == ((List) zzikpVar.zzb()).contains("2")) {
                    er2Var = zzevlVar;
                }
                k02.J(er2Var);
                return er2Var;
            case 4:
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                zzeyq zzeyqVar = new zzeyq(ta2Var2);
                zzevl zzevlVar2 = (zzevl) zzikpVar3.zzb();
                List list = (List) zzikpVar2.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) zzikpVar.zzb();
                if (list.contains("24")) {
                    return new zzezj(zzevlVar2, ((Integer) zzbd.zzc().a(p32.Fd)).intValue(), scheduledExecutorService2);
                }
                return new zzezj(zzeyqVar, ((Integer) zzbd.zzc().a(p32.Fd)).intValue(), scheduledExecutorService2);
            case 5:
                Object objZzb = ((fs2) zzikpVar3).zzb();
                zzevl zzevlVar3 = (zzevl) zzikpVar2.zzb();
                if (true == ((List) zzikpVar.zzb()).contains("29")) {
                    objZzb = zzevlVar3;
                }
                k02.J(objZzb);
                return objZzb;
            case 6:
                return new oz2((Context) zzikpVar3.zzb(), (k5) zzikpVar2.zzb(), (i03) zzikpVar.zzb());
            case 7:
                return new nz2((Context) zzikpVar3.zzb(), (ExecutorService) zzikpVar2.zzb(), (zzgdh) zzikpVar.zzb());
            default:
                return new h03((f6) zzikpVar2.zzb(), ((k5) zzikpVar.zzb()).E().zzb());
        }
    }
}
