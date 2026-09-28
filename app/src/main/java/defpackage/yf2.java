package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzbl;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzcyj;
import com.google.android.gms.internal.ads.zzdqv;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdym;
import com.google.android.gms.internal.ads.zzdyy;
import com.google.android.gms.internal.ads.zzevl;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzfah;
import com.google.android.gms.internal.ads.zzfcz;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yf2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzikp b;
    public final zzikp c;

    public /* synthetic */ yf2(zzikp zzikpVar, zzikp zzikpVar2, int i) {
        this.a = i;
        this.b = zzikpVar;
        this.c = zzikpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.c;
        zzikp zzikpVar2 = this.b;
        switch (i) {
            case 0:
                return new zzccn(((sc2) zzikpVar2).a(), ((rh2) zzikpVar).a().g);
            case 1:
                return new tg2((zzcyj) zzikpVar2.zzb(), ((rh2) zzikpVar).a());
            case 2:
                return new zzccn(((sc2) zzikpVar2).a(), ((rh2) zzikpVar).a().g);
            case 3:
                return new zzccn(((sc2) zzikpVar2).a(), ((rh2) zzikpVar).a().g);
            case 4:
                zzbl zzblVar = (zzbl) zzikpVar2.zzb();
                Clock clock = (Clock) zzikpVar.zzb();
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new zzdqv(zzblVar, clock, ta2Var);
            case 5:
                return new zzdyy((zzdym) zzikpVar2.zzb(), (zzcma) zzikpVar.zzb());
            case 6:
                return new xn2(((sc2) zzikpVar2).a(), (zzdxz) zzikpVar.zzb());
            case 7:
                return new ko2(((sc2) zzikpVar2).a(), (zzccq) zzikpVar.zzb());
            case 8:
                return new zzezj((zzevl) zzikpVar2.zzb(), ((Integer) zzbd.zzc().a(p32.Ld)).intValue(), (ScheduledExecutorService) zzikpVar.zzb());
            case 9:
                return new zzezj((zzevl) zzikpVar2.zzb(), ((Integer) zzbd.zzc().a(p32.yd)).intValue(), (ScheduledExecutorService) zzikpVar.zzb());
            case 10:
                zzccq zzccqVar = (zzccq) zzikpVar2.zzb();
                ta2 ta2Var2 = g3.a;
                k02.J(ta2Var2);
                return new zzfah(zzccqVar, ta2Var2, ((sc2) zzikpVar).a());
            case 11:
                return new zzfcz(new zzbxw(), (ScheduledExecutorService) zzikpVar2.zzb(), ((sc2) zzikpVar).a());
            case 12:
                return new zzfks(((sc2) zzikpVar2).a(), ((zc2) zzikpVar).zzb());
            default:
                return new yu2(((sc2) zzikpVar2).a(), (bv2) zzikpVar.zzb());
        }
    }
}
