package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzcwi;
import com.google.android.gms.internal.ads.zzdbh;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzekl;
import com.google.android.gms.internal.ads.zzenr;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class iq2 implements zzikg {
    public final zzikp a;
    public final se3 b;
    public final se3 c;
    public final se3 d;
    public final se3 e;
    public final zzikp f;
    public final se3 g;
    public final zzikp h;
    public final se3 i;
    public final se3 j;
    public final cq2 k;
    public final se3 l;

    public iq2(zzikp zzikpVar, se3 se3Var, se3 se3Var2, se3 se3Var3, se3 se3Var4, zzikp zzikpVar2, se3 se3Var5, zzikp zzikpVar3, se3 se3Var6, se3 se3Var7, cq2 cq2Var, se3 se3Var8) {
        this.a = zzikpVar;
        this.b = se3Var;
        this.c = se3Var2;
        this.d = se3Var3;
        this.e = se3Var4;
        this.f = zzikpVar2;
        this.g = se3Var5;
        this.h = zzikpVar3;
        this.i = se3Var6;
        this.j = se3Var7;
        this.k = cq2Var;
        this.l = se3Var8;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hq2 zzb() {
        Context contextA = ((sc2) this.a).a();
        xu2 xu2Var = (xu2) this.b.zzb();
        zzenr zzenrVar = (zzenr) this.c.zzb();
        zzdbh zzdbhVar = (zzdbh) this.d.zzb();
        zzfqg zzfqgVar = (zzfqg) this.e.zzb();
        mv2 mv2Var = (mv2) this.f.zzb();
        zzcwi zzcwiVar = (zzcwi) this.g.zzb();
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        return new hq2(contextA, xu2Var, zzenrVar, zzdbhVar, zzfqgVar, mv2Var, zzcwiVar, ta2Var, (ScheduledExecutorService) this.h.zzb(), (zzekl) this.i.zzb(), (bv2) this.j.zzb(), this.k.a(), (zzdxt) this.l.zzb());
    }
}
