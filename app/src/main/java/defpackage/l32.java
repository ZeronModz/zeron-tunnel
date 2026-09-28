package defpackage;

import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.zzbd;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class l32 {
    public final int a;
    public final String b;
    public final Object c;
    public final Object d;
    public final /* synthetic */ int e;

    public l32(int i, String str, Object obj, Object obj2) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        zzbd.zzb().a.add(this);
    }

    public static l32 e(int i, int i2, String str) {
        return new l32(1, str, Integer.valueOf(i), Integer.valueOf(i2), 1);
    }

    public static l32 f(long j, String str, long j2) {
        return new l32(1, str, Long.valueOf(j), Long.valueOf(j2), 2);
    }

    public static l32 g(String str, float f, float f2) {
        return new l32(1, str, Float.valueOf(f), Float.valueOf(f2), 3);
    }

    public static void h() {
        Object obj = null;
        zzbd.zzb().b.add(new l32(1, "gads:sdk_core_constants:experiment_id", obj, obj, 4));
    }

    public static void i() {
        Object obj = null;
        zzbd.zzb().c.add(new l32(1, "gads:sdk_core_constants_service:experiment_id", obj, obj, 4));
    }

    public final Object a(JSONObject jSONObject) {
        int i = this.e;
        String str = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(jSONObject.optBoolean(str, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(jSONObject.optInt(str, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(jSONObject.optLong(str, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf((float) jSONObject.optDouble(str, ((Float) c()).floatValue()));
            default:
                return jSONObject.optString(str, (String) c());
        }
    }

    public final Object b(SharedPreferences sharedPreferences) {
        int i = this.e;
        String str = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) c()).booleanValue()));
            case 1:
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) c()).intValue()));
            case 2:
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) c()).longValue()));
            case 3:
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) c()).floatValue()));
            default:
                return sharedPreferences.getString(str, (String) c());
        }
    }

    public final Object c() {
        return zzbd.zzc().i ? this.d : this.c;
    }

    public final Object d() {
        return zzbd.zzc().a(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l32(int i, String str, Object obj, Object obj2, int i2) {
        this(i, str, obj, obj2);
        this.e = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l32(String str, String str2, String str3) {
        this(1, str, str2, str3);
        this.e = 4;
    }
}
