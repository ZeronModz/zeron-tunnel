package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzna;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pa1 implements zzdy {
    public final long a;
    public final Object b;
    public final Object c;

    public /* synthetic */ pa1(Object obj, Object obj2, long j) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    public static pa1 a(String str) {
        Object obj = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new pa1(str, obj, 0L);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new pa1(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            e.toString();
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo9zza(Object obj) {
        ((zzna) obj).zzo((zzmy) this.b, this.c, this.a);
    }
}
