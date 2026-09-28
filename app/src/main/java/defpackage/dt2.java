package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzfax;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class dt2 implements zzfax {
    public final JSONObject a;

    public dt2(Context context) {
        this.a = zzbzq.b(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        return ((Boolean) zzbd.zzc().a(p32.td)).booleanValue() ? z.j(ct2.a) : z.j(new lr2(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 46;
    }
}
