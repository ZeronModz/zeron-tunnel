package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcwd;
import com.google.android.gms.internal.ads.zzcwe;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzfis;
import com.google.android.gms.internal.ads.zzika;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class sf2 extends rf2 {
    public final Context l;
    public final View m;
    public final zzcjl n;
    public final zzfis o;
    public final zzcwd p;
    public final tj2 q;
    public final zzdjo r;
    public final zzika s;
    public final Executor t;
    public zzr u;

    public sf2(zzcwe zzcweVar, Context context, zzfis zzfisVar, View view, zzcjl zzcjlVar, zzcwd zzcwdVar, tj2 tj2Var, zzdjo zzdjoVar, zzika zzikaVar, Executor executor) {
        super(zzcweVar);
        this.l = context;
        this.m = view;
        this.n = zzcjlVar;
        this.o = zzfisVar;
        this.p = zzcwdVar;
        this.q = tj2Var;
        this.r = zzdjoVar;
        this.s = zzikaVar;
        this.t = executor;
    }

    @Override // defpackage.jg2
    public final void a() {
        this.t.execute(new kc2(this, 3));
        super.a();
    }

    @Override // defpackage.rf2
    public final zzfis c() {
        zzr zzrVar = this.u;
        if (zzrVar != null) {
            return zzrVar.zzi ? new zzfis(-3, 0, true) : new zzfis(zzrVar.zze, zzrVar.zzb, false);
        }
        tt2 tt2Var = this.b;
        if (tt2Var.c0) {
            for (String str : tt2Var.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.m;
            return new zzfis(view.getWidth(), view.getHeight(), false);
        }
        return (zzfis) tt2Var.r.get(0);
    }

    @Override // defpackage.rf2
    public final int d() {
        if (((Boolean) zzbd.zzc().a(p32.d9)).booleanValue() && this.b.g0) {
            if (!((Boolean) zzbd.zzc().a(p32.e9)).booleanValue()) {
                return 0;
            }
        }
        return this.a.b.b.c;
    }

    @Override // defpackage.rf2
    public final void e() {
        zzdjo zzdjoVar = this.r;
        synchronized (zzdjoVar) {
            zzdjoVar.i(pi2.e);
        }
    }
}
