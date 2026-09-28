package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzctl;
import com.google.android.gms.internal.ads.zzdlu;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzduv;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzejf;
import com.google.android.gms.internal.ads.zzekr;
import com.google.android.gms.internal.ads.zzemc;
import com.google.android.gms.internal.ads.zzeot;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kp2 implements zzikg {
    public final /* synthetic */ int a;
    public final se3 b;
    public final zzikp c;
    public final rh2 d;
    public final zzikp e;
    public final te3 f;
    public final se3 g;
    public final zzikp h;
    public final se3 i;
    public final zzikp j;

    public kp2(te3 te3Var, se3 se3Var, se3 se3Var2, se3 se3Var3, rh2 rh2Var, yc2 yc2Var, se3 se3Var4, se3 se3Var5, se3 se3Var6) {
        this.a = 0;
        this.f = te3Var;
        this.b = se3Var;
        this.c = se3Var2;
        this.g = se3Var3;
        this.d = rh2Var;
        this.e = yc2Var;
        this.h = se3Var4;
        this.i = se3Var5;
        this.j = se3Var6;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzikp zzikpVar = this.j;
        se3 se3Var = this.i;
        zzikp zzikpVar2 = this.h;
        se3 se3Var2 = this.g;
        te3 te3Var = this.f;
        zzikp zzikpVar3 = this.e;
        rh2 rh2Var = this.d;
        zzikp zzikpVar4 = this.c;
        se3 se3Var3 = this.b;
        switch (i) {
            case 0:
                return new zzekr((zzctl) te3Var.a, (Context) se3Var3.zzb(), (Executor) zzikpVar4.zzb(), (zzduv) se3Var2.zzb(), rh2Var.a(), ((yc2) zzikpVar3).a(), new zzbok(), (zzejf) zzikpVar2.zzb(), (zzdxt) se3Var.zzb(), (zzdxz) zzikpVar.zzb());
            case 1:
                return new zzemc((Context) se3Var3.zzb(), ((yc2) zzikpVar4).a(), rh2Var.a(), (Executor) zzikpVar3.zzb(), (zzdlu) te3Var.a, (zzduv) se3Var2.zzb(), new zzbok(), (zzejf) zzikpVar2.zzb(), (zzdxt) se3Var.zzb(), (zzdxz) zzikpVar.zzb());
            default:
                return new zzeot((Context) se3Var3.zzb(), ((yc2) zzikpVar4).a(), rh2Var.a(), (Executor) zzikpVar3.zzb(), (zzdue) te3Var.a, (zzduv) se3Var2.zzb(), new zzbok(), (zzejf) zzikpVar2.zzb(), (zzdxt) se3Var.zzb(), (zzdxz) zzikpVar.zzb());
        }
    }

    public /* synthetic */ kp2(se3 se3Var, yc2 yc2Var, rh2 rh2Var, se3 se3Var2, te3 te3Var, se3 se3Var3, se3 se3Var4, se3 se3Var5, se3 se3Var6, int i) {
        this.a = i;
        this.b = se3Var;
        this.c = yc2Var;
        this.d = rh2Var;
        this.e = se3Var2;
        this.f = te3Var;
        this.g = se3Var3;
        this.h = se3Var4;
        this.i = se3Var5;
        this.j = se3Var6;
    }
}
