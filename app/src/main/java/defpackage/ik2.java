package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.b6;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.r5;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdoh;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzegt;
import com.google.android.gms.internal.ads.zzegz;
import com.google.android.gms.internal.ads.zzenv;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfnb;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ik2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ik2(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws zzenv {
        Bundle bundle;
        switch (this.a) {
            case 0:
                kk2 kk2Var = (kk2) this.b;
                zzfjc zzfjcVar = (zzfjc) this.c;
                tt2 tt2Var = (tt2) this.d;
                JSONObject jSONObject = (JSONObject) this.e;
                kk2Var.getClass();
                if (((Boolean) zzbd.zzc().a(p32.R2)).booleanValue()) {
                    ec1.R(zzdxh.NATIVE_ASSETS_LOADING_BASIC_START.zza(), kk2Var.d.e);
                }
                zzdoh zzdohVar = new zzdoh();
                int iOptInt = jSONObject.optInt("template_id", -1);
                synchronized (zzdohVar) {
                    zzdohVar.a = iOptInt;
                }
                zzdohVar.C(jSONObject.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
                zzdohVar.K(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
                cu2 cu2Var = zzfjcVar.a.a;
                if (!cu2Var.h.contains(Integer.toString(zzdohVar.M()))) {
                    int iM = zzdohVar.M();
                    throw new zzenv(1, vh.i(iM, "Invalid template ID: ", new StringBuilder(String.valueOf(iM).length() + 21)));
                }
                if (zzdohVar.M() == 3) {
                    if (zzdohVar.h() == null) {
                        throw new zzenv(1, "No custom template id for custom template ad response.");
                    }
                    if (!cu2Var.i.contains(zzdohVar.h())) {
                        throw new zzenv(1, "Unexpected custom template id in the response.");
                    }
                }
                zzdohVar.z(jSONObject.optDouble("rating", -1.0d));
                String strOptString = jSONObject.optString("headline", null);
                if (tt2Var.M) {
                    zzt.zzc();
                    String strZzD = zzs.zzD();
                    strOptString = vh.t(new StringBuilder(String.valueOf(strZzD).length() + 3 + String.valueOf(strOptString).length()), strZzD, " : ", strOptString);
                }
                zzdohVar.I("headline", strOptString);
                zzdohVar.I("body", jSONObject.optString("body", null));
                zzdohVar.I("call_to_action", jSONObject.optString("call_to_action", null));
                zzdohVar.I("store", jSONObject.optString("store", null));
                zzdohVar.I("price", jSONObject.optString("price", null));
                zzdohVar.I("advertiser", jSONObject.optString("advertiser", null));
                return zzdohVar;
            case 1:
                if (((Boolean) zzbd.zzc().a(p32.K2)).booleanValue() && (bundle = ((zzbzu) this.b).m) != null) {
                    ec1.R(zzdxh.HTTP_RESPONSE_READY.zza(), bundle);
                }
                return new zzegt((zzegz) ((zzfnb) this.c).c.get(), (JSONObject) ((zzfnb) this.d).c.get(), (zzbzw) ((zzfnb) this.e).c.get());
            case 2:
                View view = (View) this.d;
                Activity activity = (Activity) this.e;
                b6 b6Var = (b6) this.b;
                Context context = (Context) this.c;
                f6 f6Var = b6Var.d;
                to2 to2VarB = b6Var.a.b();
                if (to2VarB == null) {
                    f6Var.b(15004);
                    return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                String strZzb = to2VarB.zzb(context, null, view, activity);
                if (strZzb != null) {
                    return strZzb;
                }
                f6Var.b(15007);
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            case 3:
                b6 b6Var2 = (b6) this.b;
                Context context2 = (Context) this.c;
                String str = (String) this.d;
                View view2 = (View) this.e;
                f6 f6Var2 = b6Var2.d;
                to2 to2VarB2 = b6Var2.a.b();
                if (to2VarB2 == null) {
                    f6Var2.b(15004);
                    return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                String strZzc = to2VarB2.zzc(context2, null, str, view2, null);
                if (strZzc != null) {
                    return strZzc;
                }
                f6Var2.b(15008);
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            case 4:
                View view3 = (View) this.d;
                Activity activity2 = (Activity) this.e;
                vz2 vz2Var = (vz2) this.b;
                Context context3 = (Context) this.c;
                HashMap map = new HashMap();
                vz2Var.e.f(new lu1(vz2Var, map, context3, view3, activity2), 20106);
                String strB = vz2Var.b(map);
                map.clear();
                return strB;
            case 5:
                vz2 vz2Var2 = (vz2) this.b;
                Context context4 = (Context) this.c;
                String str2 = (String) this.d;
                View view4 = (View) this.e;
                HashMap map2 = new HashMap();
                vz2Var2.e.f(new lu1(vz2Var2, map2, context4, view4, str2), 20106);
                String strB2 = vz2Var2.b(map2);
                map2.clear();
                return strB2;
            default:
                ((e03) this.b).a.a((r5) this.c, (byte[]) this.d, (byte[]) this.e);
                return null;
        }
    }
}
