package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzcsn;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ff2 implements zzboh {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcsn b;

    public /* synthetic */ ff2(zzcsn zzcsnVar, int i) {
        this.a = i;
        this.b = zzcsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final void zza(Object obj, Map map) {
        int i = this.a;
        zzcsn zzcsnVar = this.b;
        switch (i) {
            case 0:
                if (map != null) {
                    String str = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str) && str.equals(zzcsnVar.a)) {
                        zzcsnVar.c.execute(new kc2(this, 1));
                        break;
                    }
                }
                break;
            default:
                if (map != null) {
                    String str2 = (String) map.get("hashCode");
                    if (!TextUtils.isEmpty(str2) && str2.equals(zzcsnVar.a)) {
                        zzcsnVar.c.execute(new kc2(this, 2));
                        break;
                    }
                }
                break;
        }
    }
}
