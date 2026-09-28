package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.internal.ads.zzftk;
import com.google.android.gms.internal.ads.zzfts;
import com.google.android.gms.internal.ads.zzftt;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfuk;
import com.google.android.gms.internal.ads.zzful;
import com.google.android.gms.internal.ads.zzfuu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hw2 implements zzfts {
    public static final hw2 f = new hw2();
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static Handler h = null;
    public static final g10 i = new g10(11);
    public static final g10 j = new g10(12);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final zzfuk d = new zzfuk();
    public final zzftu c = new zzftu();
    public final zzful e = new zzful(new zzfuu());

    public static void a() {
        if (h == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            h = handler;
            handler.post(i);
            h.postDelayed(j, 200L);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    public final void zza(View view, zzftt zzfttVar, JSONObject jSONObject, boolean z) {
        Object obj;
        boolean z2;
        if (k02.B(view) == null) {
            zzfuk zzfukVar = this.d;
            char c = zzfukVar.d.contains(view) ? (char) 1 : zzfukVar.j ? (char) 2 : (char) 3;
            if (c == 3) {
                return;
            }
            JSONObject jSONObjectZza = zzfttVar.zza(view);
            fw2.c(jSONObject, jSONObjectZza);
            HashMap map = zzfukVar.a;
            if (map.size() == 0) {
                obj = null;
            } else {
                Object obj2 = (String) map.get(view);
                if (obj2 != null) {
                    map.remove(view);
                }
                obj = obj2;
            }
            boolean z3 = false;
            if (obj != null) {
                try {
                    jSONObjectZza.put("adSessionId", obj);
                } catch (JSONException unused) {
                }
                WeakHashMap weakHashMap = zzfukVar.i;
                if (weakHashMap.containsKey(view)) {
                    weakHashMap.put(view, Boolean.TRUE);
                } else {
                    z3 = true;
                }
                try {
                    jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(z3));
                } catch (JSONException unused2) {
                }
                boolean zContains = zzfukVar.h.contains(obj);
                Object objValueOf = Boolean.valueOf(zContains);
                if (zContains) {
                    try {
                        jSONObjectZza.put("isPipActive", objValueOf);
                    } catch (JSONException unused3) {
                    }
                }
                zzfukVar.j = true;
                return;
            }
            HashMap map2 = zzfukVar.b;
            zzfuj zzfujVar = (zzfuj) map2.get(view);
            if (zzfujVar != null) {
                map2.remove(view);
            }
            if (zzfujVar != null) {
                zzftk zzftkVar = zzfujVar.a;
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList = zzfujVar.b;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    jSONArray.put((String) arrayList.get(i2));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzftkVar.b);
                    jSONObjectZza.put("friendlyObstructionPurpose", zzftkVar.c);
                    jSONObjectZza.put("friendlyObstructionReason", zzftkVar.d);
                } catch (JSONException unused4) {
                }
                z2 = true;
            } else {
                z2 = false;
            }
            zzfttVar.zzb(view, jSONObjectZza, this, c == 1, z || z2);
        }
    }
}
