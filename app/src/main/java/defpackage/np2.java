package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzcrl;
import com.google.android.gms.internal.ads.zzctj;
import com.google.android.gms.internal.ads.zzctl;
import com.google.android.gms.internal.ads.zzcwv;
import com.google.android.gms.internal.ads.zzdbd;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdbx;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzdcm;
import com.google.android.gms.internal.ads.zzdcr;
import com.google.android.gms.internal.ads.zzddq;
import com.google.android.gms.internal.ads.zzdgf;
import com.google.android.gms.internal.ads.zzdgj;
import com.google.android.gms.internal.ads.zzdkr;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzekm;
import com.google.android.gms.internal.ads.zzelv;
import com.google.android.gms.internal.ads.zzepk;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzfki;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class np2 implements zzekm {
    public final Context a;
    public final zzctl b;
    public final ta2 c;

    public np2(Context context, zzctl zzctlVar, ta2 ta2Var) {
        this.a = context;
        this.b = zzctlVar;
        this.c = ta2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, tt2 tt2Var, zzekj zzekjVar) throws zzfjr {
        zzfki zzfkiVar = (zzfki) zzekjVar.b;
        cu2 cu2Var = zzfjcVar.a.a;
        String string = tt2Var.v.toString();
        Context context = this.a;
        zzbtz zzbtzVar = (zzbtz) zzekjVar.c;
        zzm zzmVar = cu2Var.d;
        zzfkiVar.getClass();
        try {
            zzfkiVar.a.zzM(new a(context), zzmVar, string, zzbtzVar);
        } catch (Throwable th) {
            throw new zzfjr(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final Object zzb(zzfjc zzfjcVar, tt2 tt2Var, zzekj zzekjVar) {
        hd2 hd2VarA = this.b.a(new zzcwv(zzfjcVar, tt2Var, zzekjVar.a), new zzdkr(new mp2(this, zzekjVar, tt2Var, 0), null), new zzctj(tt2Var.a0));
        ((zzdce) hd2VarA.f.zzb()).h(new zzcrl((zzfki) zzekjVar.b), this.c);
        ((zzelv) zzekjVar.c).b(new zzepk((zzdbd) hd2VarA.n.zzb(), (ri2) hd2VarA.p.zzb(), (zzdbx) hd2VarA.j.zzb(), (zzdcm) hd2VarA.m.zzb(), (zzdcr) hd2VarA.q.zzb(), (zzdgj) hd2VarA.e.S.zzb(), (zzddq) hd2VarA.r.zzb(), (ui2) hd2VarA.s.zzb(), (zzdgf) hd2VarA.t.zzb(), (zzdbs) hd2VarA.v.zzb()));
        return hd2VarA.d();
    }
}
