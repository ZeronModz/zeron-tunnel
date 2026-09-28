package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzfjc;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ko2 implements zzdel {
    public final Context a;
    public final zzccq b;

    public ko2(Context context, zzccq zzccqVar) {
        this.a = context;
        this.b = zzccqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
        String str = zzfjcVar.b.b.e;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzccq zzccqVar = this.b;
        Context context = this.a;
        zzm zzmVar = zzfjcVar.a.a.d;
        zzccqVar.getClass();
        if (((Boolean) zzbd.zzc().a(p32.Y0)).booleanValue() && zzccqVar.a(context) && zzccq.g(context)) {
            synchronized (zzccqVar.i) {
            }
        }
        zzccqVar.h(context, "_aq", str, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
    }
}
