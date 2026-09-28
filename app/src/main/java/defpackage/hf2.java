package defpackage;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzguf;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hf2 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zzcjl b;
    public final /* synthetic */ JSONObject c;

    public /* synthetic */ hf2(zzcjl zzcjlVar, JSONObject jSONObject) {
        this.b = zzcjlVar;
        this.c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        JSONObject jSONObject = this.c;
        zzcjl zzcjlVar = this.b;
        switch (i) {
            case 0:
                String string = jSONObject.toString();
                StringBuilder sb = new StringBuilder(string.length() + 31);
                sb.append("Calling AFMA_updateActiveView(");
                sb.append(string);
                sb.append(")");
                zzo.zzd(sb.toString());
                zzcjlVar.zzb("AFMA_updateActiveView", jSONObject);
                break;
            default:
                zzguf zzgufVar = zzdoc.J;
                zzcjlVar.zzd("onVideoEvent", jSONObject);
                break;
        }
    }

    public /* synthetic */ hf2(JSONObject jSONObject, zzcjl zzcjlVar) {
        this.c = jSONObject;
        this.b = zzcjlVar;
    }
}
