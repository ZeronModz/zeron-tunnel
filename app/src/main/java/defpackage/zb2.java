package defpackage;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.j3;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzdqc;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zb2 implements zzboh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzboh
    public final /* synthetic */ void zza(Object obj, Map map) {
        switch (this.a) {
            case 0:
                if (map != null) {
                    String str = (String) map.get("height");
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        int i = Integer.parseInt(str);
                        j3 j3Var = (j3) this.b;
                        synchronized (j3Var) {
                            try {
                                if (j3Var.H != i) {
                                    j3Var.H = i;
                                    j3Var.requestLayout();
                                }
                            } finally {
                            }
                            break;
                        }
                        return;
                    } catch (Exception e) {
                        zzo.zzj("Exception occurred while getting webview content height", e);
                        return;
                    }
                }
                return;
            default:
                ((zzdqc) this.b).b.d(map);
                return;
        }
    }
}
