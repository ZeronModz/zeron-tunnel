package defpackage;

import com.google.android.gms.internal.ads.zzdom;
import com.google.android.gms.internal.ads.zzikg;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lf2 implements zzikg {
    public final /* synthetic */ int a;
    public final ng2 b;

    public /* synthetic */ lf2(ng2 ng2Var, int i) {
        this.a = i;
        this.b = ng2Var;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final /* bridge */ /* synthetic */ Object zzb() {
        int i = this.a;
        ng2 ng2Var = this.b;
        switch (i) {
            case 0:
                try {
                    return new JSONObject(ng2Var.b().z);
                } catch (JSONException unused) {
                    return null;
                }
            default:
                return new zzdom(ng2Var.b());
        }
    }
}
