package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzdct;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf2 implements zzdct {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ VersionInfoParcel c;
    public final /* synthetic */ tt2 d;
    public final /* synthetic */ cu2 e;

    public /* synthetic */ vf2(Context context, VersionInfoParcel versionInfoParcel, tt2 tt2Var, cu2 cu2Var, int i) {
        this.a = i;
        this.b = context;
        this.c = versionInfoParcel;
        this.d = tt2Var;
        this.e = cu2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final /* synthetic */ void zzg() {
        int i = this.a;
        Context context = this.b;
        VersionInfoParcel versionInfoParcel = this.c;
        tt2 tt2Var = this.d;
        cu2 cu2Var = this.e;
        switch (i) {
            case 0:
                zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, tt2Var.C.toString(), cu2Var.g);
                break;
            default:
                zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, tt2Var.C.toString(), cu2Var.g);
                break;
        }
    }
}
