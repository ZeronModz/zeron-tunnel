package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzbin;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzddu;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ef2 implements zzikg {
    public final zzikp a;
    public final zzikp b;
    public final zzikp c;
    public final ng2 d;
    public final ng2 e;
    public final zzikp f;
    public final se3 g;
    public final zzikg h;
    public final zzikg i;
    public final zzikp j;
    public final zzikp k;
    public final zzikp l;
    public final zzikp m;
    public final se3 n;
    public final se3 o;
    public final zzikp p;

    public ef2(sc2 sc2Var, se3 se3Var, se3 se3Var2, ng2 ng2Var, ng2 ng2Var2, se3 se3Var3, se3 se3Var4, zzikg zzikgVar, zzikg zzikgVar2, se3 se3Var5, se3 se3Var6, se3 se3Var7, qh2 qh2Var, se3 se3Var8, se3 se3Var9, we3 we3Var) {
        this.a = sc2Var;
        this.b = se3Var;
        this.c = se3Var2;
        this.d = ng2Var;
        this.e = ng2Var2;
        this.f = se3Var3;
        this.g = se3Var4;
        this.h = zzikgVar;
        this.i = zzikgVar2;
        this.j = se3Var5;
        this.k = se3Var6;
        this.l = se3Var7;
        this.m = qh2Var;
        this.n = se3Var8;
        this.o = se3Var9;
        this.p = we3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        Context contextA = ((sc2) this.a).a();
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        Executor executor = (Executor) this.b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.zzb();
        zzfjc zzfjcVarA = this.d.a();
        tt2 tt2VarB = this.e.b();
        zzfqg zzfqgVar = (zzfqg) this.f.zzb();
        zzfjx zzfjxVar = (zzfjx) this.g.zzb();
        View view = (View) this.h.zzb();
        zzcjl zzcjlVar = (zzcjl) this.i.zzb();
        zzazh zzazhVar = (zzazh) this.j.zzb();
        zzbil zzbilVar = (zzbil) this.k.zzb();
        new zzbin();
        return new df2(contextA, ta2Var, executor, scheduledExecutorService, zzfjcVarA, tt2VarB, zzfqgVar, zzfjxVar, view, zzcjlVar, zzazhVar, zzbilVar, ((qh2) this.m).a.e, (zzddu) this.n.zzb(), (dh2) this.o.zzb(), ((we3) this.p).zzb());
    }
}
