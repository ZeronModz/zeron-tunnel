package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.v3;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzdbd;
import com.google.android.gms.internal.ads.zzdcm;
import com.google.android.gms.internal.ads.zzddq;
import com.google.android.gms.internal.ads.zzdgj;
import com.google.android.gms.internal.ads.zzdoe;
import com.google.android.gms.internal.ads.zzdoh;
import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzdpg;
import com.google.android.gms.internal.ads.zzdpu;
import com.google.android.gms.internal.ads.zzdqc;
import com.google.android.gms.internal.ads.zzdtf;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfie;
import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfjd;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class xj2 implements zzikg {
    public final /* synthetic */ int a = 0;
    public final se3 b;
    public final zzikp c;
    public final zzikp d;
    public final zzikp e;
    public final zzikp f;
    public final zzikp g;
    public final zzikp h;
    public final zzikp i;

    public xj2(oc2 oc2Var, rh2 rh2Var, zzikp zzikpVar, pe2 pe2Var, zzikg zzikgVar, zzikg zzikgVar2, se3 se3Var, se3 se3Var2) {
        this.c = oc2Var;
        this.d = rh2Var;
        this.e = zzikpVar;
        this.g = pe2Var;
        this.h = zzikgVar;
        this.i = zzikgVar2;
        this.f = se3Var;
        this.b = se3Var2;
    }

    public zzdpg a() {
        zzj zzjVarZzb = ((oc2) this.c).zzb();
        cu2 cu2VarA = ((rh2) this.d).a();
        zzdom zzdomVar = (zzdom) this.e.zzb();
        zzdoh zzdohVarA = ((pe2) this.g).a();
        zzdpu zzdpuVar = (zzdpu) ((zzikg) this.h).zzb();
        zzdqc zzdqcVar = (zzdqc) ((zzikg) this.i).zzb();
        Executor executor = (Executor) this.f.zzb();
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        return new zzdpg(zzjVarZzb, cu2VarA, zzdomVar, zzdohVarA, zzdpuVar, zzdqcVar, executor, ta2Var, (zzdoe) this.b.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.e;
        zzikp zzikpVar2 = this.d;
        zzikp zzikpVar3 = this.c;
        zzikp zzikpVar4 = this.i;
        zzikp zzikpVar5 = this.h;
        zzikp zzikpVar6 = this.g;
        se3 se3Var = this.b;
        zzikp zzikpVar7 = this.f;
        switch (i) {
            case 0:
                return a();
            case 1:
                return new zzdtf((zzdbd) se3Var.zzb(), (zzdcm) ((se3) zzikpVar).zzb(), (yh2) zzikpVar3.zzb(), (zzddq) ((se3) zzikpVar7).zzb(), (zzdgj) zzikpVar2.zzb(), ((ng2) zzikpVar6).b(), ((ng2) zzikpVar5).b.a(), (ve2) ((se3) zzikpVar4).zzb());
            case 2:
                return new gn2((jn2) se3Var.zzb(), (tn2) ((se3) zzikpVar3).zzb(), (an2) ((se3) zzikpVar2).zzb(), ((sc2) zzikpVar).a(), ((yc2) zzikpVar7).a(), (v3) ((se3) zzikpVar6).zzb(), (qn2) ((se3) zzikpVar5).zzb(), new gm2(), new gm2(), ((tc2) zzikpVar4).zzb());
            default:
                return new zzfii((String) ((te3) zzikpVar7).a, (zzfie) se3Var.zzb(), (Context) ((te3) zzikpVar6).a, (zzfhv) ((se3) zzikpVar5).zzb(), (zzfjd) ((se3) zzikpVar4).zzb(), ((yc2) zzikpVar3).a(), (zzazh) zzikpVar2.zzb(), (zzdxz) zzikpVar.zzb());
        }
    }

    public xj2(se3 se3Var, se3 se3Var2, se3 se3Var3, sc2 sc2Var, yc2 yc2Var, se3 se3Var4, se3 se3Var5, tc2 tc2Var) {
        this.b = se3Var;
        this.c = se3Var2;
        this.d = se3Var3;
        this.e = sc2Var;
        this.f = yc2Var;
        this.g = se3Var4;
        this.h = se3Var5;
        this.i = tc2Var;
    }

    public xj2(se3 se3Var, se3 se3Var2, se3 se3Var3, se3 se3Var4, se3 se3Var5, ng2 ng2Var, ng2 ng2Var2, se3 se3Var6) {
        this.b = se3Var;
        this.e = se3Var2;
        this.c = se3Var3;
        this.f = se3Var4;
        this.d = se3Var5;
        this.g = ng2Var;
        this.h = ng2Var2;
        this.i = se3Var6;
    }

    public xj2(te3 te3Var, se3 se3Var, te3 te3Var2, se3 se3Var2, se3 se3Var3, yc2 yc2Var, se3 se3Var4, se3 se3Var5) {
        this.f = te3Var;
        this.b = se3Var;
        this.g = te3Var2;
        this.h = se3Var2;
        this.i = se3Var3;
        this.c = yc2Var;
        this.d = se3Var4;
        this.e = se3Var5;
    }
}
