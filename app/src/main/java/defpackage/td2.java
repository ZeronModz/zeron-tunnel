package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzeek;
import com.google.android.gms.internal.ads.zzegd;
import com.google.android.gms.internal.ads.zzege;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class td2 implements zzegd, zzege {
    public zzeek a;
    public final gd2 b;

    public td2(gd2 gd2Var, zzeek zzeekVar) {
        this.b = gd2Var;
        this.a = zzeekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzege
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public eo2 mo76zza() {
        nc2 nc2Var = this.b.b;
        Context context = (Context) nc2Var.c;
        k02.J(context);
        VersionInfoParcel versionInfoParcel = (VersionInfoParcel) nc2Var.b;
        k02.J(versionInfoParcel);
        return new eo2(context, versionInfoParcel, this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzegd
    public /* bridge */ /* synthetic */ zzegd zzb(zzeek zzeekVar) {
        this.a = zzeekVar;
        return this;
    }

    public /* synthetic */ td2(gd2 gd2Var, tj1 tj1Var) {
        this.b = gd2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzegd
    public zzege zza() {
        k02.M(zzeek.class, this.a);
        return new td2(this.b, this.a);
    }
}
