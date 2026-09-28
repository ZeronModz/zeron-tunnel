package defpackage;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzfiv;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class zt2 {
    public final List a;
    public final ut2 b;
    public final ArrayList c;
    public final Bundle d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public zt2(JsonReader jsonReader, Bundle bundle) throws JSONException, IOException {
        this.d = bundle;
        if (((Boolean) zzbd.zzc().a(p32.K2)).booleanValue() && bundle != null) {
            ec1.R(zzdxh.SERVER_RESPONSE_PARSE_START.zza(), bundle);
        }
        ?? arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        ut2 ut2Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new tt2(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        ut2Var = new ut2(jsonReader);
                        if (((Boolean) zzbd.zzc().a(p32.L2)).booleanValue() && bundle != null) {
                            bundle.putLong(zzdxh.NORMALIZATION_AD_RESPONSE_START.zza(), ut2Var.s);
                            bundle.putLong(zzdxh.NORMALIZATION_AD_RESPONSE_END.zza(), ut2Var.t);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectZzd = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if ("name".equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if ("info".equals(strNextName3)) {
                            jSONObjectZzd = zzbp.zzd(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new yt2(strNextString, jSONObjectZzd));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.c = arrayList2;
        this.a = arrayList;
        this.b = ut2Var == null ? new ut2(new JsonReader(new StringReader("{}"))) : ut2Var;
    }

    public static zt2 a(Reader reader, Bundle bundle) {
        try {
            try {
                return new zt2(new JsonReader(reader), bundle);
            } finally {
                mc2.i(reader);
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfiv("unable to parse ServerResponse", e);
        }
    }
}
