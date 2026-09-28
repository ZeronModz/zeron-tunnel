package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzdah;
import com.google.android.gms.internal.ads.zzfav;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lr2 implements zzfav {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ lr2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* synthetic */ void zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((zzdah) obj).a.putStringArrayList("ad_types", (ArrayList) obj2);
                break;
            case 1:
                Bundle bundle = (Bundle) obj2;
                zzdah zzdahVar = (zzdah) obj;
                if (!bundle.isEmpty()) {
                    zzdahVar.a.putBundle("installed_adapter_data", bundle);
                }
                break;
            case 2:
                n8.q0("key_schema", ((zzdah) obj).a, (String) obj2);
                break;
            default:
                try {
                    ((JSONObject) obj).put("gms_sdk_env", ((dt2) obj2).a);
                } catch (JSONException unused) {
                    zze.zza("Failed putting version constants.");
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final void zzb(Object obj) {
        switch (this.a) {
            case 0:
                ((zzdah) obj).b.putStringArrayList("ad_types", (ArrayList) this.b);
                break;
        }
    }

    private final void a(Object obj) {
    }

    private final void b(Object obj) {
    }

    private final void c(Object obj) {
    }
}
