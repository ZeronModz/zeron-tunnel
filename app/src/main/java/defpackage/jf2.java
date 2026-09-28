package defpackage;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.b6;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzcsn;
import com.google.android.gms.internal.ads.zzcso;
import com.google.android.gms.internal.ads.zzcss;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfxa;
import com.google.android.gms.internal.ads.zzfxb;
import com.google.android.gms.internal.ads.zzgky;
import com.google.android.gms.internal.ads.zzgmu;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class jf2 implements zzikg {
    public final /* synthetic */ int a = 0;
    public final zzikp b;
    public final se3 c;
    public final se3 d;
    public final se3 e;
    public final zzikp f;

    public jf2(se3 se3Var, se3 se3Var2, se3 se3Var3, se3 se3Var4, se3 se3Var5) {
        this.c = se3Var;
        this.d = se3Var2;
        this.b = se3Var3;
        this.e = se3Var4;
        this.f = se3Var5;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.f;
        zzikp zzikpVar2 = this.b;
        se3 se3Var = this.e;
        se3 se3Var2 = this.d;
        se3 se3Var3 = this.c;
        switch (i) {
            case 0:
                return new zzcss((l72) se3Var3.zzb(), (zzcso) se3Var2.zzb(), (Executor) zzikpVar2.zzb(), (zzcsn) se3Var.zzb(), (Clock) zzikpVar.zzb());
            case 1:
                return new zzfxa((Context) zzikpVar2.zzb(), (zzfxb) se3Var3.zzb(), (zzfvh) se3Var2.zzb(), (zzfvc) se3Var.zzb(), ((k5) zzikpVar.zzb()).zzr());
            default:
                return new b6((zzfxa) se3Var3.zzb(), (zzgky) se3Var2.zzb(), (zzgmu) se3Var.zzb(), (f6) zzikpVar2.zzb(), (ExecutorService) zzikpVar.zzb());
        }
    }

    public jf2(se3 se3Var, se3 se3Var2, se3 se3Var3, se3 se3Var4, te3 te3Var) {
        this.c = se3Var;
        this.d = se3Var2;
        this.e = se3Var3;
        this.b = se3Var4;
        this.f = te3Var;
    }

    public jf2(te3 te3Var, se3 se3Var, se3 se3Var2, te3 te3Var2, se3 se3Var3) {
        this.b = te3Var;
        this.c = se3Var;
        this.d = se3Var2;
        this.e = se3Var3;
        this.f = te3Var2;
    }
}
