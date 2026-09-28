package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.f3;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzcdx;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzdvu;
import com.google.android.gms.internal.ads.zzevr;
import com.google.android.gms.internal.ads.zzeyx;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class rg2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzikp b;
    public final rh2 c;
    public final zzikp d;

    public rg2(rh2 rh2Var, se3 se3Var, oc2 oc2Var) {
        this.a = 3;
        this.c = rh2Var;
        this.b = se3Var;
        this.d = oc2Var;
    }

    public zzevr a() {
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        return new zzevr(ta2Var, (zzdvu) this.b.zzb(), this.c.a(), (String) this.d.zzb());
    }

    public gs2 b() {
        Context contextA = ((sc2) this.b).a();
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        return new gs2(contextA, ta2Var, this.c.a(), ((yc2) this.d).a());
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        String string;
        switch (this.a) {
            case 0:
                Clock clock = (Clock) this.b.zzb();
                zzcdz zzcdzVarZzb = ((zc2) this.d).zzb();
                String str = this.c.a().g;
                zzcdx zzcdxVar = zzcdzVarZzb.c;
                synchronized (zzcdxVar) {
                    string = zzcdxVar.a.toString();
                    zzcdxVar.a = zzcdxVar.a.add(BigInteger.ONE);
                    zzcdxVar.b = string;
                }
                return new f3(clock, zzcdzVarZzb, string, str);
            case 1:
                return new gr2((Clock) this.b.zzb(), this.c.a(), ((Long) this.d.zzb()).longValue());
            case 2:
                return a();
            case 3:
                ta2 ta2Var = g3.a;
                k02.J(ta2Var);
                return new zzeyx(ta2Var, this.c.a(), (PackageInfo) this.b.zzb(), ((oc2) this.d).zzb());
            default:
                return b();
        }
    }

    public /* synthetic */ rg2(zzikp zzikpVar, rh2 rh2Var, zzikp zzikpVar2, int i) {
        this.a = i;
        this.b = zzikpVar;
        this.c = rh2Var;
        this.d = zzikpVar2;
    }

    public rg2(se3 se3Var, zc2 zc2Var, rh2 rh2Var) {
        this.a = 0;
        this.b = se3Var;
        this.d = zc2Var;
        this.c = rh2Var;
    }
}
