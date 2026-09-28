package defpackage;

import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.n4;
import com.google.android.gms.internal.ads.x4;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzfjc;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mh2 implements zzr {
    public final zzfjc b;
    public final tt2 c;
    public final Clock d;
    public final zzdxz e;
    public final ScheduledExecutorService f;
    public final Object a = new Object();
    public final hv2 g = x4.v();
    public boolean h = false;
    public boolean i = false;

    public mh2(zzfjc zzfjcVar, tt2 tt2Var, Clock clock, zzdxz zzdxzVar, ScheduledExecutorService scheduledExecutorService) {
        this.b = zzfjcVar;
        this.c = tt2Var;
        this.d = clock;
        this.e = zzdxzVar;
        this.f = scheduledExecutorService;
    }

    public final void a() {
        synchronized (this.a) {
            try {
                zzdxz zzdxzVar = this.e;
                String str = this.b.b.b.b;
                String strEncodeToString = Base64.encodeToString(((x4) this.g.e()).a(), 1);
                if (((Boolean) zzbd.zzc().a(p32.pe)).booleanValue()) {
                    i31 i31VarA = zzdxzVar.a();
                    i31VarA.c("action", "pclma");
                    i31VarA.c("pclmd", strEncodeToString);
                    i31VarA.c("gqi", str);
                    i31VarA.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        synchronized (this.a) {
            try {
                if (!this.i && this.h) {
                    hv2 hv2Var = this.g;
                    zu2 zu2VarV = n4.v();
                    zu2VarV.d();
                    ((n4) zu2VarV.b).x(i);
                    long jCurrentTimeMillis = this.d.currentTimeMillis();
                    zu2VarV.d();
                    ((n4) zu2VarV.b).w(jCurrentTimeMillis);
                    n4 n4Var = (n4) zu2VarV.e();
                    hv2Var.d();
                    ((x4) hv2Var.b).w(n4Var);
                    if (i == 10) {
                        a();
                        this.i = true;
                    }
                }
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        b(3);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        b(5);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
        b(4);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        b(7);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
        b(8);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
        b(6);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
        b(9);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
        b(10);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdS() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT(int i) {
    }
}
