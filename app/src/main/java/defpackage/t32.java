package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzdye;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t32 extends CustomTabsCallback {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final List b = Arrays.asList(((String) zzbd.zzc().a(p32.qb)).split(","));
    public final zzbij c;
    public final CustomTabsCallback d;
    public final zzdye e;

    public t32(zzbij zzbijVar, CustomTabsCallback customTabsCallback, zzdye zzdyeVar) {
        this.d = customTabsCallback;
        this.c = zzbijVar;
        this.e = zzdyeVar;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void a(String str, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.d;
        if (customTabsCallback != null) {
            customTabsCallback.a(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final Bundle b(String str, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.d;
        if (customTabsCallback != null) {
            return customTabsCallback.b(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void d(int i, int i2, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.d;
        if (customTabsCallback != null) {
            customTabsCallback.d(i, i2, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void e(Bundle bundle) {
        this.a.set(false);
        CustomTabsCallback customTabsCallback = this.d;
        if (customTabsCallback != null) {
            customTabsCallback.e(bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void g(int i, Bundle bundle) {
        this.a.set(false);
        CustomTabsCallback customTabsCallback = this.d;
        if (customTabsCallback != null) {
            customTabsCallback.g(i, bundle);
        }
        long jCurrentTimeMillis = zzt.zzk().currentTimeMillis();
        zzbij zzbijVar = this.c;
        zzbijVar.j = jCurrentTimeMillis;
        List list = this.b;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        zzbijVar.i = zzt.zzk().elapsedRealtime() + ((long) ((Integer) zzbd.zzc().a(p32.nb)).intValue());
        if (zzbijVar.e == null) {
            zzbijVar.e = new vn1(zzbijVar, 17);
        }
        zzbijVar.d();
        zzaa.zze(this.e, null, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void h(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.a.set(true);
                zzaa.zze(this.e, null, "pact_action", new Pair("pe", "pact_con"));
                this.c.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            zze.zzb("Message is not in JSON format: ", e);
        }
        CustomTabsCallback customTabsCallback = this.d;
        if (customTabsCallback != null) {
            customTabsCallback.h(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.CustomTabsCallback
    public final void i(int i, Uri uri, boolean z, Bundle bundle) {
        CustomTabsCallback customTabsCallback = this.d;
        if (customTabsCallback != null) {
            customTabsCallback.i(i, uri, z, bundle);
        }
    }
}
