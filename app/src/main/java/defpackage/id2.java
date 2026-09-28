package defpackage;

import com.google.android.gms.internal.ads.zzctk;
import com.google.android.gms.internal.ads.zzctl;
import com.google.android.gms.internal.ads.zzcxl;
import com.google.android.gms.internal.ads.zzczm;
import com.google.android.gms.internal.ads.zzdal;
import com.google.android.gms.internal.ads.zzdud;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzdyo;
import com.google.android.gms.internal.ads.zzffr;
import com.google.android.gms.internal.ads.zzfgn;
import com.google.android.gms.internal.ads.zzfkq;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class id2 implements zzctk, zzdud {
    public final /* synthetic */ int a;
    public final gd2 b;
    public zzfgn c;
    public zzffr d;
    public ji2 e;
    public oh2 f;

    public /* synthetic */ id2(gd2 gd2Var, int i) {
        this.a = i;
        this.b = gd2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public zzctl zza() {
        k02.M(ji2.class, this.e);
        k02.M(oh2.class, this.f);
        new zzcxl();
        new zzfkq();
        new zzczm();
        return new jd2(this.b, new zzdyo(), this.e, this.f, new jq2(), this.c, this.d);
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public /* synthetic */ zzctk zzb(zzffr zzffrVar) {
        this.d = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public /* synthetic */ zzctk zzc(zzfgn zzfgnVar) {
        this.c = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public /* bridge */ /* synthetic */ zzctk zzd(oh2 oh2Var) {
        this.f = oh2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk
    public /* bridge */ /* synthetic */ zzctk zze(ji2 ji2Var) {
        this.e = ji2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk, com.google.android.gms.internal.ads.zzdal
    public final /* bridge */ /* synthetic */ Object zzh() {
        switch (this.a) {
            case 0:
                return zza();
            default:
                return mo22zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzctk, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzi(zzffr zzffrVar) {
        switch (this.a) {
            case 0:
                this.d = zzffrVar;
                break;
            default:
                this.d = zzffrVar;
                break;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzctk, com.google.android.gms.internal.ads.zzdal
    public final /* synthetic */ zzdal zzj(zzfgn zzfgnVar) {
        switch (this.a) {
            case 0:
                this.c = zzfgnVar;
                break;
            default:
                this.c = zzfgnVar;
                break;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    /* JADX INFO: renamed from: zzb, reason: collision with other method in class */
    public /* synthetic */ zzdud mo23zzb(zzffr zzffrVar) {
        this.d = zzffrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    /* JADX INFO: renamed from: zzc, reason: collision with other method in class */
    public /* synthetic */ zzdud mo24zzc(zzfgn zzfgnVar) {
        this.c = zzfgnVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    /* JADX INFO: renamed from: zzd, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ zzdud mo25zzd(oh2 oh2Var) {
        this.f = oh2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    /* JADX INFO: renamed from: zze, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ zzdud mo26zze(ji2 ji2Var) {
        this.e = ji2Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdud
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public zzdue mo22zza() {
        k02.M(ji2.class, this.e);
        k02.M(oh2.class, this.f);
        new zzcxl();
        new zzfkq();
        new zzczm();
        return new vd2(this.b, new zzdyo(), this.e, this.f, new jq2(), this.c, this.d);
    }
}
