package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzfav;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ys2 implements zzfav {
    public final String a;
    public final int b;

    public /* synthetic */ ys2(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzdah zzdahVar = (zzdah) obj;
        if (((Boolean) zzbd.zzc().a(p32.Rb)).booleanValue()) {
            String str = this.a;
            if (!TextUtils.isEmpty(str)) {
                zzdahVar.a.putString("topics", str);
            }
            int i = this.b;
            if (i != -1) {
                zzdahVar.a.putInt("atps", i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final void zzb(Object obj) {
    }
}
