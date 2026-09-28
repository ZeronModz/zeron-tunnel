package defpackage;

import com.google.android.gms.internal.ads.s3;
import com.google.android.gms.internal.ads.t3;
import com.google.android.gms.internal.ads.zzdzj;
import com.google.android.gms.internal.ads.zzdzk;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class od2 implements zzdzj, zzdzk {
    public Long a;
    public String b;
    public final gd2 c;
    public final pd2 d;

    public od2(gd2 gd2Var, pd2 pd2Var, Long l, String str) {
        this.c = gd2Var;
        this.d = pd2Var;
        this.a = l;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public zzdzk mo65zza() {
        k02.M(Long.class, this.a);
        k02.M(String.class, this.b);
        return new od2(this.c, this.d, this.a, this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzdzk
    public t3 zzb() {
        long jLongValue = this.a.longValue();
        pd2 pd2Var = this.d;
        return new t3(jLongValue, pd2Var.a, new ci2(pd2Var.b, 3), this.c, this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public /* bridge */ /* synthetic */ zzdzj zzc(long j) {
        this.a = Long.valueOf(j);
        return this;
    }

    public /* synthetic */ od2(gd2 gd2Var, pd2 pd2Var) {
        this.c = gd2Var;
        this.d = pd2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzdzk
    public s3 zza() {
        long jLongValue = this.a.longValue();
        pd2 pd2Var = this.d;
        return new s3(jLongValue, pd2Var.a, new ci2(pd2Var.b, 3), this.c, this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzdzj
    public /* bridge */ /* synthetic */ zzdzj zzb(String str) {
        str.getClass();
        this.b = str;
        return this;
    }
}
