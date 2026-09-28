package defpackage;

import android.app.Application;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzac;
import com.google.android.gms.internal.consent_sdk.zzan;
import com.google.android.gms.internal.consent_sdk.zzap;
import com.google.android.gms.internal.consent_sdk.zzar;
import com.google.android.gms.internal.consent_sdk.zzav;
import com.google.android.gms.internal.consent_sdk.zzbp;
import com.google.android.gms.internal.consent_sdk.zzf;
import com.google.android.gms.internal.consent_sdk.zzj;
import com.google.android.gms.internal.consent_sdk.zzk;
import com.google.android.gms.internal.consent_sdk.zzm;
import com.google.android.gms.internal.consent_sdk.zzq;
import com.google.android.gms.internal.consent_sdk.zzx;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class yw1 extends zza {
    public final yw1 b = this;
    public final x1 c;
    public final ij2 d;
    public final ij2 e;
    public final ij2 f;
    public final ij2 g;
    public final zzap h;
    public final ij2 i;

    public yw1(Application application) {
        x1 x1Var = new x1(application);
        this.c = x1Var;
        ij2 ij2VarA = ij2.a(new zzar(x1Var));
        this.d = ij2VarA;
        ij2 ij2VarA2 = ij2.a(kw1.a);
        this.e = ij2VarA2;
        jx2 jx2Var = new jx2(this, 18);
        zzav zzavVar = dz1.a;
        ij2 ij2VarA3 = ij2.a(new zzbp(jx2Var, zzavVar));
        this.f = ij2VarA3;
        zzq zzqVar = new zzq(x1Var, ij2VarA);
        ij2 ij2VarA4 = ij2.a(new zzf(zzavVar));
        this.g = ij2VarA4;
        zzap zzapVar = new zzap(x1Var, ij2VarA, ij2.a(new zzm(x1Var, ij2.a(new zzan(x1Var)))), zzavVar);
        this.h = zzapVar;
        this.i = ij2.a(new zzk(ij2VarA, new zzx(x1Var, ij2VarA2, uy1.a, zzavVar, ij2VarA, ij2VarA3, zzqVar, new zzac(ij2VarA4, zzapVar, ij2VarA), ij2VarA4), ij2VarA3));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zza
    public final zzj b() {
        return (zzj) this.i.zza();
    }
}
