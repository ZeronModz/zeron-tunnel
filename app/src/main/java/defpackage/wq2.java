package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzeqm;
import com.google.android.gms.internal.ads.zzeqo;
import com.google.android.gms.internal.ads.zzgui;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wq2 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final ta2 f;
    public JSONObject g;

    public wq2(ta2 ta2Var) {
        this.f = ta2Var;
    }

    public static final Bundle l(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED));
            }
        }
        return bundle;
    }

    public final synchronized zzgui a() {
        if (TextUtils.isEmpty(zzt.zzh().i().zzi().e)) {
            return zzgui.zza();
        }
        return zzgui.zzc(this.b);
    }

    public final synchronized zzgui b(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(zzt.zzh().i().zzi().e) && (map = (Map) this.c.get(str)) != null) {
                List<zzeqm> list = (List) map.get(str2);
                if (list == null) {
                    String strJ = mc2.J(this.g, str2, str);
                    if (((Boolean) zzbd.zzc().a(p32.rc)).booleanValue()) {
                        strJ = strJ.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strJ);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (zzeqm zzeqmVar : list) {
                        String str3 = zzeqmVar.a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(zzeqmVar.b);
                    }
                    return zzgui.zzc(map2);
                }
            }
            return zzgui.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized HashMap c(String str, String str2) {
        HashMap map;
        try {
            zzgui zzguiVarB = b(str, str2);
            zzgui zzguiVarK = k(str2);
            map = new HashMap();
            Iterator it = zzguiVarB.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                if (zzguiVarK.containsKey(str3)) {
                    zzeqo zzeqoVar = (zzeqo) zzguiVarK.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new zzeqo(str3, zzeqoVar.b, zzeqoVar.c, zzeqoVar.d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            i23 it2 = zzguiVarK.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((zzeqo) entry2.getValue()).d) {
                    map.put(str4, (zzeqo) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            HashMap map = this.a;
            if (!map.containsKey(str)) {
                map.put(str, new zzeqm(str, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new Bundle()));
            }
        }
    }

    public final synchronized void e() {
        this.b.clear();
        this.a.clear();
        this.e.clear();
        this.d.clear();
        h();
        f();
        g();
    }

    public final synchronized void f() {
        JSONObject jSONObject;
        if (!((Boolean) q42.f.g()).booleanValue()) {
            if (((Boolean) zzbd.zzc().a(p32.r2)).booleanValue() && (jSONObject = zzt.zzh().i().zzi().g) != null) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        Bundle bundleL = l(jSONObject2.optJSONObject(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject2.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject2.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.b.put(strOptString, new zzeqo(strOptString, zOptBoolean2, zOptBoolean, true, bundleL));
                        }
                    }
                } catch (JSONException e) {
                    zze.zzb("Malformed config loading JSON.", e);
                }
            }
        }
    }

    public final synchronized void g() {
        JSONObject jSONObject;
        try {
            if (!((Boolean) q42.b.g()).booleanValue()) {
                if (((Boolean) zzbd.zzc().a(p32.s2)).booleanValue() && (jSONObject = zzt.zzh().i().zzi().g) != null) {
                    JSONArray jSONArray = jSONObject.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        String strOptString = jSONObject2.optString("adapter_class_name");
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i2);
                                boolean zOptBoolean = jSONObject3.optBoolean("enable_rendering", false);
                                boolean zOptBoolean2 = jSONObject3.optBoolean("collect_secure_signals", false);
                                boolean zOptBoolean3 = jSONObject3.optBoolean("collect_secure_signals_on_full_app", false);
                                String strOptString2 = jSONObject3.optString("platform");
                                zzeqo zzeqoVar = new zzeqo(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                if (strOptString2.equals("ADMOB")) {
                                    this.d.put(strOptString, zzeqoVar);
                                } else if (strOptString2.equals("AD_MANAGER")) {
                                    this.e.put(strOptString, zzeqoVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            zze.zzb("Malformed config loading JSON.", e);
        } finally {
        }
    }

    public final synchronized void h() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObject = zzt.zzh().i().zzi().g;
            if (jSONObject != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ad_unit_id_settings");
                    this.g = jSONObject.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                            JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) zzbd.zzc().a(p32.rc)).booleanValue() ? jSONObject2.optString("ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED).toLowerCase(Locale.ROOT) : jSONObject2.optString("ad_unit_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            String strOptString = jSONObject2.optString("format", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    arrayList.addAll(i(strOptString, jSONArrayOptJSONArray.getJSONObject(i2)));
                                }
                            }
                            j(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    zze.zzb("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList i(String str, JSONObject jSONObject) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleL = l(jSONObject.optJSONObject(Constants$ScionAnalytics$MessageType.DATA_MESSAGE));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = (String) arrayList2.get(i2);
                        d(str2);
                        if (((zzeqm) this.a.get(str2)) != null) {
                            arrayList.add(new zzeqm(str2, str, bundleL));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized void j(String str, String str2, ArrayList arrayList) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap map = this.c;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List arrayList2 = (List) map2.get(str2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList2.addAll(arrayList);
            map2.put(str2, arrayList2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzgui k(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(zzt.zzh().i().zzi().e)) {
                boolean zMatches = Pattern.matches((String) zzbd.zzc().a(p32.a4), str);
                boolean zMatches2 = Pattern.matches((String) zzbd.zzc().a(p32.b4), str);
                if (zMatches) {
                    map = new HashMap(this.e);
                } else if (zMatches2) {
                    map = new HashMap(this.d);
                }
                return zzgui.zzc(map);
            }
            return zzgui.zza();
        } catch (Throwable th) {
            throw th;
        }
    }
}
