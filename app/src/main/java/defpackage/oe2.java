package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcql;
import com.google.android.gms.internal.ads.zzebb;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oe2 implements zzcql {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ oe2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzcql
    public final void zza(Map map) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gn2 gn2Var = (gn2) obj;
                String str = (String) map.get("gesture");
                if (!TextUtils.isEmpty(str)) {
                    int iHashCode = str.hashCode();
                    if (iHashCode == 97520651) {
                        if (str.equals("flick")) {
                            gn2Var.i(zzebb.FLICK, true);
                        }
                    } else if (iHashCode == 109399814 && str.equals("shake")) {
                        gn2Var.i(zzebb.SHAKE, true);
                    }
                    gn2Var.i(zzebb.NONE, true);
                    break;
                }
                break;
            case 1:
                String str2 = (String) map.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    ((gn2) obj).b(str2.equals("true"));
                    break;
                }
                break;
            default:
                if (((Boolean) zzbd.zzc().a(p32.Rb)).booleanValue()) {
                    z.R(q33.q(((ip2) obj).a(true)), Throwable.class, ww1.c, g3.a);
                    break;
                }
                break;
        }
    }
}
