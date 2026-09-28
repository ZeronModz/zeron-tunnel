package defpackage;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbij;
import java.util.Objects;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class u32 extends QueryInfoGenerationCallback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public u32(zzbij zzbijVar, String str) {
        this.b = str;
        Objects.requireNonNull(zzbijVar);
        this.c = zzbijVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i = this.a;
        String str2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                zzo.zzi("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    zzbij zzbijVar = (zzbij) obj;
                    zzbijVar.g.a(zzbijVar.b(str2, str).toString());
                } catch (JSONException e) {
                    zzo.zzg("Error creating PACT Error Response JSON: ", e);
                    return;
                }
                break;
            default:
                TaggingLibraryJsInterface taggingLibraryJsInterface = (TaggingLibraryJsInterface) obj;
                zzo.zzi("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
                String strConcat = ((Boolean) p42.c.g()).booleanValue() ? ",\"as\":".concat(taggingLibraryJsInterface.zze().zzb().toString()) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                Locale locale = Locale.getDefault();
                x40 x40Var = p42.e;
                String str3 = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"error\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, str, Long.valueOf(((Boolean) x40Var.g()).booleanValue() ? ((Long) p42.h.g()).longValue() : 0L), strConcat);
                if (((Boolean) x40Var.g()).booleanValue()) {
                    try {
                        taggingLibraryJsInterface.zzd().execute(new db0(16, this, str3));
                    } catch (RuntimeException e2) {
                        zzt.zzh().g(e2, "TaggingLibraryJsInterface.getQueryInfo.onFailure");
                    }
                } else {
                    taggingLibraryJsInterface.zzc().evaluateJavascript(str3, null);
                }
                if (((Boolean) p42.c.g()).booleanValue() && ((Boolean) p42.d.g()).booleanValue()) {
                    taggingLibraryJsInterface.zzf().zza();
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        x40 x40Var;
        String str;
        int i = this.a;
        Object obj = this.c;
        String str2 = this.b;
        switch (i) {
            case 0:
                try {
                    zzbij zzbijVar = (zzbij) obj;
                    zzbijVar.g.a(zzbijVar.c(str2, queryInfo.getQuery()).toString());
                } catch (JSONException e) {
                    zzo.zzg("Error creating PACT Signal Response JSON: ", e);
                    return;
                }
                break;
            default:
                TaggingLibraryJsInterface taggingLibraryJsInterface = (TaggingLibraryJsInterface) obj;
                String query = queryInfo.getQuery();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("paw_id", str2);
                    if (((Boolean) p42.c.g()).booleanValue()) {
                        jSONObject.put("as", taggingLibraryJsInterface.zze().zzb());
                    }
                    x40Var = p42.e;
                    jSONObject.put("sdk_ttl_ms", ((Boolean) x40Var.g()).booleanValue() ? ((Long) p42.h.g()).longValue() : 0L);
                    jSONObject.put("signal", query);
                    str = String.format(Locale.getDefault(), "window.postMessage(%1$s, '*');", jSONObject);
                } catch (JSONException unused) {
                    String strConcat = ((Boolean) p42.c.g()).booleanValue() ? ",\"as\":".concat(taggingLibraryJsInterface.zze().zzb().toString()) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    Locale locale = Locale.getDefault();
                    String query2 = queryInfo.getQuery();
                    x40Var = p42.e;
                    str = String.format(locale, "window.postMessage({\"paw_id\":\"%1$s\",\"signal\":\"%2$s\",\"sdk_ttl_ms\":%3$d%4$s}, '*');", str2, query2, Long.valueOf(((Boolean) x40Var.g()).booleanValue() ? ((Long) p42.h.g()).longValue() : 0L), strConcat);
                }
                if (((Boolean) x40Var.g()).booleanValue()) {
                    try {
                        taggingLibraryJsInterface.zzd().execute(new s33(14, this, str));
                    } catch (RuntimeException e2) {
                        zzt.zzh().g(e2, "TaggingLibraryJsInterface.getQueryInfo.onSuccess");
                    }
                } else {
                    taggingLibraryJsInterface.zzc().evaluateJavascript(str, null);
                }
                if (((Boolean) p42.c.g()).booleanValue() && ((Boolean) p42.d.g()).booleanValue()) {
                    taggingLibraryJsInterface.zzf().zza();
                    break;
                }
                break;
        }
    }

    public u32(TaggingLibraryJsInterface taggingLibraryJsInterface, String str) {
        this.b = str;
        this.c = taggingLibraryJsInterface;
    }
}
