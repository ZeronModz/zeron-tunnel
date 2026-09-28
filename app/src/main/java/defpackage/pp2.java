package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzbtz;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzctj;
import com.google.android.gms.internal.ads.zzctl;
import com.google.android.gms.internal.ads.zzcwv;
import com.google.android.gms.internal.ads.zzdbd;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdbx;
import com.google.android.gms.internal.ads.zzdcm;
import com.google.android.gms.internal.ads.zzdcr;
import com.google.android.gms.internal.ads.zzddq;
import com.google.android.gms.internal.ads.zzdgf;
import com.google.android.gms.internal.ads.zzdgj;
import com.google.android.gms.internal.ads.zzdkr;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzekm;
import com.google.android.gms.internal.ads.zzelv;
import com.google.android.gms.internal.ads.zzepe;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjr;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pp2 implements zzekm {
    public final Context a;
    public final zzctl b;

    public pp2(Context context, zzctl zzctlVar) {
        this.a = context;
        this.b = zzctlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final void zza(zzfjc zzfjcVar, tt2 tt2Var, zzekj zzekjVar) throws zzfjr {
        try {
            zzbvs zzbvsVar = (zzbvs) zzekjVar.b;
            zzbvsVar.zzo(tt2Var.Z);
            zzbvsVar.zzs(tt2Var.U, tt2Var.v.toString(), zzfjcVar.a.a.d, new a(this.a), new op2(zzekjVar), (zzbtz) zzekjVar.c);
        } catch (RemoteException e) {
            zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfjr(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzekm
    public final Object zzb(zzfjc zzfjcVar, tt2 tt2Var, zzekj zzekjVar) {
        t61 t61Var = new t61(tt2Var, (zzbvs) zzekjVar.b, AdFormat.APP_OPEN_AD);
        hd2 hd2VarA = this.b.a(new zzcwv(zzfjcVar, tt2Var, zzekjVar.a), new zzdkr(t61Var, null), new zzctj(tt2Var.a0));
        t61Var.e = hd2VarA.b();
        ((zzelv) zzekjVar.c).b(new zzepe((zzdbd) hd2VarA.n.zzb(), (ri2) hd2VarA.p.zzb(), (zzdbx) hd2VarA.j.zzb(), (zzdcm) hd2VarA.m.zzb(), (zzdcr) hd2VarA.q.zzb(), (zzdgj) hd2VarA.e.S.zzb(), (zzddq) hd2VarA.r.zzb(), (ui2) hd2VarA.s.zzb(), (zzdgf) hd2VarA.t.zzb(), (zzdbs) hd2VarA.v.zzb()));
        return hd2VarA.d();
    }
}
