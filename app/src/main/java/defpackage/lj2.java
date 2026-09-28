package defpackage;

import com.google.android.gms.internal.ads.zzdnd;
import com.google.android.gms.internal.ads.zzikg;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lj2 implements zzikg {
    public final /* synthetic */ int a;
    public final zzdnd b;

    public /* synthetic */ lj2(zzdnd zzdndVar, int i) {
        this.a = i;
        this.b = zzdndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    public final Object zzb() {
        int i = this.a;
        zzdnd zzdndVar = this.b;
        switch (i) {
            case 0:
                JSONObject jSONObject = zzdndVar.a;
                k02.J(jSONObject);
                return jSONObject;
            case 1:
                yk2 yk2Var = zzdndVar.b;
                k02.J(yk2Var);
                return yk2Var;
            case 2:
                return zzdndVar.c;
            default:
                return zzdndVar.d;
        }
    }
}
