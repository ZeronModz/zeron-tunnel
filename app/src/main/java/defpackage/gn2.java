package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.v3;
import com.google.android.gms.internal.ads.zzboi;
import com.google.android.gms.internal.ads.zzbov;
import com.google.android.gms.internal.ads.zzbpc;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzeap;
import com.google.android.gms.internal.ads.zzeaq;
import com.google.android.gms.internal.ads.zzeas;
import com.google.android.gms.internal.ads.zzebb;
import com.google.android.gms.internal.ads.zzebe;
import com.google.android.gms.internal.ads.zzech;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gn2 implements zzech, zzeaq {
    public final jn2 a;
    public final tn2 b;
    public final an2 c;
    public final v3 d;
    public final zzeap e;
    public final qn2 f;
    public final gm2 g;
    public final gm2 h;
    public final String i;
    public final Context j;
    public final String k;
    public JSONObject p;
    public boolean s;
    public int t;
    public boolean u;
    public final HashMap l = new HashMap();
    public final HashMap m = new HashMap();
    public final HashMap n = new HashMap();
    public String o = "{}";
    public long q = Long.MAX_VALUE;
    public zzebb r = zzebb.NONE;
    public zzebe v = zzebe.UNKNOWN;
    public long w = 0;
    public String x = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    public gn2(jn2 jn2Var, tn2 tn2Var, an2 an2Var, Context context, VersionInfoParcel versionInfoParcel, v3 v3Var, qn2 qn2Var, gm2 gm2Var, gm2 gm2Var2, String str) {
        this.a = jn2Var;
        this.b = tn2Var;
        this.c = an2Var;
        this.e = new zzeap(context);
        this.i = versionInfoParcel.afmaVersion;
        this.k = str;
        this.d = v3Var;
        this.f = qn2Var;
        this.g = gm2Var;
        this.h = gm2Var2;
        this.j = context;
        zzt.zzo().zza(this);
    }

    public final void a() {
        if (((Boolean) zzbd.zzc().a(p32.qa)).booleanValue()) {
            if (((Boolean) zzbd.zzc().a(p32.Fa)).booleanValue() && zzt.zzh().i().zzJ()) {
                k();
                return;
            }
            String strZzH = zzt.zzh().i().zzH();
            if (TextUtils.isEmpty(strZzH)) {
                return;
            }
            try {
                if (new JSONObject(strZzH).optBoolean("isTestMode", false)) {
                    k();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(boolean z) {
        if (!this.u && z) {
            k();
        }
        h(z, true);
    }

    public final synchronized boolean c() {
        return this.s;
    }

    public final synchronized void d(String str, bn2 bn2Var) {
        if (((Boolean) zzbd.zzc().a(p32.qa)).booleanValue() && g()) {
            if (this.t >= ((Integer) zzbd.zzc().a(p32.sa)).intValue()) {
                zzo.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            HashMap map = this.l;
            if (!map.containsKey(str)) {
                map.put(str, new ArrayList());
            }
            this.t++;
            ((List) map.get(str)).add(bn2Var);
            if (((Boolean) zzbd.zzc().a(p32.Oa)).booleanValue()) {
                String str2 = bn2Var.c;
                this.m.put(str2, bn2Var);
                HashMap map2 = this.n;
                if (map2.containsKey(str2)) {
                    List list = (List) map2.get(str2);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzcen) it.next()).a(bn2Var);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized zzcen e(String str) {
        zzcen zzcenVar;
        try {
            zzcenVar = new zzcen();
            HashMap map = this.m;
            if (map.containsKey(str)) {
                zzcenVar.a((bn2) map.get(str));
            } else {
                HashMap map2 = this.n;
                if (!map2.containsKey(str)) {
                    map2.put(str, new ArrayList());
                }
                ((List) map2.get(str)).add(zzcenVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzcenVar;
    }

    public final synchronized void f(zzdn zzdnVar, zzebe zzebeVar) {
        if (!g()) {
            try {
                zzdnVar.zze(xg0.P(18, null, null));
                return;
            } catch (RemoteException unused) {
                zzo.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) zzbd.zzc().a(p32.qa)).booleanValue()) {
            this.v = zzebeVar;
            this.a.a(zzdnVar, new zzbpc(this), new zzbov(this.f), new zzboi(this));
            return;
        } else {
            try {
                zzdnVar.zze(xg0.P(1, null, null));
                return;
            } catch (RemoteException unused2) {
                zzo.zzi("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized boolean g() {
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.Fa)).booleanValue();
        boolean z = this.s;
        if (!zBooleanValue) {
            return z;
        }
        if (!z) {
            if (!zzt.zzo().zzk()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            l32 r2 = defpackage.p32.Fa     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.zzbhc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            com.google.android.gms.ads.internal.util.zzax r2 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.zzk()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.l()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.g()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.m()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.n()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn2.h(boolean, boolean):void");
    }

    public final synchronized void i(zzebb zzebbVar, boolean z) {
        try {
            if (this.r != zzebbVar) {
                if (g()) {
                    m();
                }
                this.r = zzebbVar;
                if (g()) {
                    l();
                }
                if (z) {
                    n();
                }
            }
        } finally {
        }
    }

    public final synchronized JSONObject j() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (bn2 bn2Var : (List) entry.getValue()) {
                    if (bn2Var.e != zzeas.AD_REQUESTED) {
                        jSONArray.put(bn2Var.a());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final void k() {
        this.u = true;
        v3 v3Var = this.d;
        v3Var.getClass();
        dn2 dn2Var = new dn2(v3Var, 0);
        zzeak zzeakVar = v3Var.a;
        zzeakVar.getClass();
        zzeakVar.e.a.addListener(new qj2(4, zzeakVar, dn2Var), zzeakVar.j);
        this.a.c = this;
        this.b.f = this;
        this.c.i = this;
        this.f.f = this;
        l32 l32Var = p32.Ua;
        if (!TextUtils.isEmpty((CharSequence) zzbd.zzc().a(l32Var))) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.j);
            List listAsList = Arrays.asList(((String) zzbd.zzc().a(l32Var)).split(","));
            gm2 gm2Var = this.g;
            gm2Var.c = listAsList;
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(gm2Var);
            Iterator it = listAsList.iterator();
            while (it.hasNext()) {
                gm2Var.onSharedPreferenceChanged(defaultSharedPreferences, (String) it.next());
            }
        }
        l32 l32Var2 = p32.Va;
        if (!TextUtils.isEmpty((CharSequence) zzbd.zzc().a(l32Var2))) {
            SharedPreferences sharedPreferences = this.j.getSharedPreferences("admob", 0);
            List listAsList2 = Arrays.asList(((String) zzbd.zzc().a(l32Var2)).split(","));
            gm2 gm2Var2 = this.h;
            gm2Var2.c = listAsList2;
            sharedPreferences.registerOnSharedPreferenceChangeListener(gm2Var2);
            Iterator it2 = listAsList2.iterator();
            while (it2.hasNext()) {
                gm2Var2.onSharedPreferenceChanged(sharedPreferences, (String) it2.next());
            }
        }
        String strZzH = zzt.zzh().i().zzH();
        synchronized (this) {
            if (!TextUtils.isEmpty(strZzH)) {
                try {
                    JSONObject jSONObject = new JSONObject(strZzH);
                    h(jSONObject.optBoolean("isTestMode", false), false);
                    i((zzebb) Enum.valueOf(zzebb.class, jSONObject.optString("gesture", "NONE")), false);
                    this.o = jSONObject.optString("networkExtras", "{}");
                    this.q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
        this.x = zzt.zzh().i().zzN();
    }

    public final synchronized void l() {
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 1) {
            this.b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.c.b();
        }
    }

    public final synchronized void m() {
        int iOrdinal = this.r.ordinal();
        if (iOrdinal == 1) {
            this.b.c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.c.c();
        }
    }

    public final void n() {
        String string;
        zzj zzjVarI = zzt.zzh().i();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.s);
                jSONObject.put("gesture", this.r);
                if (this.q > zzt.zzk().currentTimeMillis() / 1000) {
                    jSONObject.put("networkExtras", this.o);
                    jSONObject.put("networkExtrasExpirationSecs", this.q);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        zzjVarI.zzI(string);
    }
}
