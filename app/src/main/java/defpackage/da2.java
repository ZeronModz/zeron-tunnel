package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.zzcd;
import com.google.common.collect.t3;
import com.google.common.collect.u3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class da2 implements SharedPreferences.Editor {
    public boolean a = false;
    public final HashSet b = new HashSet();
    public final HashMap c = new HashMap();
    public final /* synthetic */ zzcd d;

    public final void a(Object obj, String str) {
        if (obj != null) {
            this.c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        zzcd zzcdVar = this.d;
        HashMap map = zzcdVar.a;
        if (this.a) {
            map.clear();
        }
        Set setKeySet = map.keySet();
        HashSet hashSet = this.b;
        setKeySet.removeAll(hashSet);
        HashMap map2 = this.c;
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : zzcdVar.b) {
            Set setKeySet2 = map2.keySet();
            cn0.n(setKeySet2, "set2");
            t3 t3Var = new t3(new u3(hashSet, setKeySet2));
            while (t3Var.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(zzcdVar, (String) t3Var.next());
            }
        }
        return (!this.a && hashSet.isEmpty() && map2.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        a(Boolean.valueOf(z), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        a(Float.valueOf(f), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        a(Integer.valueOf(i), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        a(Long.valueOf(j), str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str2, str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(set, str);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.b.add(str);
        return this;
    }
}
