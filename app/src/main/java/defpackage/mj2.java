package defpackage;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.zzbdb;
import com.google.android.gms.internal.ads.zzcso;
import com.google.android.gms.internal.ads.zzctc;
import com.google.android.gms.internal.ads.zzika;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mj2 implements zzikg {
    public final /* synthetic */ int a;
    public final se3 b;
    public final zzikp c;
    public final zzikp d;
    public final zzikp e;

    public /* synthetic */ mj2(se3 se3Var, se3 se3Var2, se3 se3Var3, Object obj, int i) {
        this.a = i;
        this.b = se3Var;
        this.c = se3Var2;
        this.d = se3Var3;
        this.e = (zzikp) obj;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.e;
        zzikp zzikpVar2 = this.d;
        se3 se3Var = this.b;
        zzikp zzikpVar3 = this.c;
        switch (i) {
            case 0:
                zzbdb zzbdbVar = (zzbdb) se3Var.zzb();
                Executor executor = (Executor) zzikpVar3.zzb();
                Context context = (Context) zzikpVar2.zzb();
                return new zzctc(executor, new zzcso(context, zzbdbVar), (Clock) zzikpVar.zzb());
            default:
                zzika zzikaVarB = se3.b(se3Var);
                f6 f6Var = (f6) zzikpVar3.zzb();
                return new g03(zzikaVarB, f6Var, ((k5) zzikpVar.zzb()).E().zzb());
        }
    }
}
