package defpackage;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzcqm;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qe2 implements zzcqm {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ qe2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [ga2] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // com.google.android.gms.internal.ads.zzcqm
    public final void zza(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                if (((Boolean) zzbd.zzc().a(p32.Ga)).booleanValue()) {
                    gn2 gn2Var = (gn2) this.b;
                    synchronized (gn2Var) {
                        gn2Var.p = jSONObject;
                    }
                    return;
                }
                return;
            default:
                ((ga2) ((i31) this.b).c).a(jSONObject.optBoolean("npa_reset") ? -1 : jSONObject.optBoolean("npa"), jSONObject.optLong("timestamp"));
                return;
        }
    }
}
