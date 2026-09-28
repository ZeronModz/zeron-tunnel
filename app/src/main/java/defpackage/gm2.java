package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzdye;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gm2 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public gm2() {
        this.a = 1;
        this.b = new JSONObject();
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zzdye zzdyeVar = (zzdye) obj;
                String str2 = (String) this.c;
                zzdyeVar.j.set(zzac.zzb(zzdyeVar.b, str2));
                break;
            default:
                if (str != null && ((List) this.c).contains(str)) {
                    try {
                        Object obj2 = sharedPreferences.getAll().get(str);
                        JSONObject jSONObject = (JSONObject) obj;
                        if (obj2 == null) {
                            jSONObject.remove(str);
                        } else {
                            jSONObject.put(str, obj2);
                        }
                    } catch (JSONException e) {
                        zzt.zzh().g(e, "InspectorSharedPreferenceCollector.onSharedPreferenceChanged");
                        return;
                    }
                }
                break;
        }
    }

    public /* synthetic */ gm2(String str, zzdye zzdyeVar) {
        this.a = 0;
        this.b = zzdyeVar;
        this.c = str;
    }
}
