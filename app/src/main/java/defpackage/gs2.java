package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzgzy;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gs2 implements zzfax {
    public final /* synthetic */ int a = 0;
    public final zzgzy b;
    public final Context c;
    public final VersionInfoParcel d;
    public final Object e;

    public gs2(Context context, zzgzy zzgzyVar, cu2 cu2Var, VersionInfoParcel versionInfoParcel) {
        this.c = context;
        this.b = zzgzyVar;
        this.e = cu2Var;
        this.d = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        int i = this.a;
        zzgzy zzgzyVar = this.b;
        switch (i) {
            case 0:
                return zzgzyVar.zzc(new hc0(this, 26));
            default:
                return zzgzyVar.zzc(new hc0(this, 28));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        switch (this.a) {
            case 0:
                return 53;
            default:
                return 35;
        }
    }

    public gs2(zzgzy zzgzyVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.b = zzgzyVar;
        this.c = context;
        this.d = versionInfoParcel;
        this.e = str;
    }
}
