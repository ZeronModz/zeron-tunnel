package defpackage;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbp;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vt2 {
    public final String a;
    public final String b;
    public final JSONObject c;
    public final JSONObject d;

    public vt2(JsonReader jsonReader) throws JSONException, IOException {
        JSONObject jSONObjectZzd = zzbp.zzd(jsonReader);
        this.d = jSONObjectZzd;
        this.a = jSONObjectZzd.optString("ad_html", null);
        this.b = jSONObjectZzd.optString("ad_base_url", null);
        this.c = jSONObjectZzd.optJSONObject("ad_json");
    }
}
