package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzdm;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzax;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class cz1 extends zzdm {
    public final /* synthetic */ Context a;
    public final /* synthetic */ zzax b;

    public cz1(zzax zzaxVar, Context context) {
        this.a = context;
        this.b = zzaxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final void zze(zze zzeVar) {
        if (zzeVar == null) {
            return;
        }
        this.b.zzn(this.a, zzeVar.zzb, true, true);
    }
}
