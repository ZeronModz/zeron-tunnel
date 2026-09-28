package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzcag;
import com.google.android.gms.internal.ads.zzdbf;
import com.google.android.gms.internal.ads.zzdbv;
import com.google.android.gms.internal.ads.zzdbx;
import com.google.android.gms.internal.ads.zzddy;
import com.google.android.gms.internal.ads.zzdgh;
import com.google.android.gms.internal.ads.zzdir;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ch2 implements zzdbf, zzdir, zzdgh, zzdbv, zzbde {
    public final zzdbx a;
    public final zzddy b;
    public final tt2 c;
    public final ScheduledExecutorService d;
    public final ta2 e;
    public ScheduledFuture g;
    public final String i;
    public final b43 f = new b43();
    public final AtomicBoolean h = new AtomicBoolean();

    public ch2(zzdbx zzdbxVar, tt2 tt2Var, ScheduledExecutorService scheduledExecutorService, ta2 ta2Var, String str, zzddy zzddyVar) {
        this.a = zzdbxVar;
        this.c = tt2Var;
        this.d = scheduledExecutorService;
        this.e = ta2Var;
        this.i = str;
        this.b = zzddyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final synchronized void zzdG() {
        if (this.c.e == 4) {
            this.a.zza();
            return;
        }
        b43 b43Var = this.f;
        if (b43Var.isDone()) {
            return;
        }
        ScheduledFuture scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        b43Var.c(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.zzbde
    public final void zzdj(zzbdd zzbddVar) {
        if (((Boolean) zzbd.zzc().a(p32.Uc)).booleanValue() && this.i.equals("com.google.ads.mediation.admob.AdMobAdapter") && zzbddVar.j && this.h.compareAndSet(false, true) && this.c.e != 3) {
            zze.zza("Full screen 1px impression occurred");
            this.a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
        tt2 tt2Var = this.c;
        if (tt2Var.e == 3) {
            return;
        }
        int i = tt2Var.Y;
        if (i == 0 || i == 1) {
            if (((Boolean) zzbd.zzc().a(p32.Uc)).booleanValue() && this.i.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzg() {
        tt2 tt2Var = this.c;
        int i = tt2Var.e;
        if (i == 3) {
            return;
        }
        if (i == 4) {
            this.b.zza();
            return;
        }
        if (((Boolean) zzbd.zzc().a(p32.c2)).booleanValue() && tt2Var.Y == 2) {
            int i2 = tt2Var.q;
            if (i2 == 0) {
                this.a.zza();
                return;
            }
            jx2 jx2Var = new jx2(this, 29);
            b43 b43Var = this.f;
            b43Var.addListener(new s33(0, b43Var, jx2Var), this.e);
            this.g = this.d.schedule(new kc2(this, 6), i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final synchronized void zzj(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            b43 b43Var = this.f;
            if (b43Var.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            b43Var.d(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgh
    public final void zzdH() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdir
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzd(zzcag zzcagVar, String str, String str2) {
    }
}
