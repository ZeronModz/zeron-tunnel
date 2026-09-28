package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzdag;
import com.google.android.gms.internal.ads.zzdan;
import com.google.android.gms.internal.ads.zzekl;
import com.google.android.gms.internal.ads.zzeng;
import com.google.android.gms.internal.ads.zzenr;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfnb;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dq2 extends zzeng {
    public final zzcma a;
    public final zzdan b;
    public final ji2 c;
    public final zzenr d;
    public final zzekl e;

    public dq2(zzcma zzcmaVar, zzdan zzdanVar, ji2 ji2Var, zzenr zzenrVar, zzekl zzeklVar) {
        this.a = zzcmaVar;
        this.b = zzdanVar;
        this.c = ji2Var;
        this.d = zzenrVar;
        this.e = zzeklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeng
    public final zzfnb a(cu2 cu2Var, Bundle bundle, tt2 tt2Var, zzfjc zzfjcVar) {
        zzdan zzdanVar = this.b;
        zzdanVar.b = cu2Var;
        zzdanVar.c = bundle;
        zzdanVar.e = new zzdag(zzfjcVar, tt2Var, this.d);
        if (((Boolean) zzbd.zzc().a(p32.v4)).booleanValue()) {
            zzdanVar.f = this.e;
        }
        id2 id2VarI = this.a.i();
        id2VarI.f = new oh2(zzdanVar);
        id2VarI.e = this.c;
        pg2 pg2VarZza = ((jd2) id2VarI.zza()).zza();
        return pg2VarZza.c(pg2VarZza.b());
    }
}
