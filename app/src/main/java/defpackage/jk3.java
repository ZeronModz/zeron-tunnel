package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.vd;
import com.google.android.gms.internal.ads.zzmk;
import com.google.android.gms.internal.ads.zzqa;
import com.google.android.gms.internal.ads.zzrb;
import com.google.android.gms.internal.ads.zzrd;
import com.google.android.gms.internal.ads.zzrg;
import com.google.android.gms.internal.ads.zzsd;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jk3 implements zzqa {
    public final pj3 a;
    public final /* synthetic */ vd b;

    public /* synthetic */ jk3(vd vdVar, pj3 pj3Var) {
        this.b = vdVar;
        this.a = pj3Var;
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zza(long j) {
        zzrg zzrgVar;
        zzrb zzrbVar;
        Handler handler;
        vd vdVar = this.b;
        if (this != vdVar.h || (zzrgVar = vdVar.l) == null || (handler = (zzrbVar = ((nk3) zzrgVar).a.C0).a) == null) {
            return;
        }
        handler.post(new h92(zzrbVar, j, 4));
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzb() {
        zzrg zzrgVar;
        zzmk zzmkVar;
        vd vdVar = this.b;
        if (this == vdVar.h && (zzrgVar = vdVar.l) != null && vdVar.M && (zzmkVar = ((nk3) zzrgVar).a.H) != null) {
            zzmkVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzc() {
        vd vdVar = this.b;
        if (this != vdVar.h) {
            return;
        }
        vdVar.L = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzd() {
        long jT;
        vd vdVar = this.b;
        if (this == vdVar.h && vdVar.l != null) {
            kk3 kk3Var = vdVar.n;
            int i = kk3Var.d;
            if (i != -1) {
                long j = kk3Var.e.d / i;
                zzsd zzsdVar = vdVar.r;
                zzsdVar.getClass();
                jT = wt2.t(zzsdVar.a.getSampleRate(), j);
            } else {
                jT = -9223372036854775807L;
            }
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - vdVar.S;
            zzrg zzrgVar = vdVar.l;
            final int i2 = vdVar.n.e.d;
            final zzrb zzrbVar = ((nk3) zzrgVar).a.C0;
            final long jR = wt2.r(jT);
            Handler handler = zzrbVar.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: sj3
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzrb zzrbVar2 = zzrbVar;
                        zzrbVar2.getClass();
                        String str = wt2.a;
                        zzrbVar2.b.zzp(i2, jR, jElapsedRealtime);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zze() {
        vd.X.getAndDecrement();
        vd vdVar = this.b;
        if (vdVar.l != null) {
            pj3 pj3Var = this.a;
            zzrd zzrdVar = new zzrd(pj3Var.a, pj3Var.b, pj3Var.c, false, false, pj3Var.d);
            zzrb zzrbVar = ((nk3) vdVar.l).a.C0;
            Handler handler = zzrbVar.a;
            if (handler != null) {
                handler.post(new qj3(zzrbVar, zzrdVar, 0));
            }
        }
    }
}
