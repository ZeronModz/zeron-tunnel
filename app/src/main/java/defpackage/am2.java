package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbj;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzdbi;
import com.google.android.gms.internal.ads.zzdct;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzdxi;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzguf;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import org.chromium.support_lib_boundary.util.Features;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class am2 implements zzdel, zzdct, zzdbi, zzdjy {
    public final zzdxt a;
    public final zzdye b;
    public final int c;

    public am2(zzdxt zzdxtVar, zzdye zzdyeVar, int i) {
        this.a = zzdxtVar;
        this.b = zzdyeVar;
        this.c = i;
    }

    public final void a(Bundle bundle, zzguf zzgufVar) {
        if (!((Boolean) zzbd.zzc().a(p32.K2)).booleanValue() || bundle == null) {
            return;
        }
        ec1.R(zzdxh.PUBLIC_API_CALLBACK.zza(), bundle);
        zzdxt zzdxtVar = this.a;
        zzdxtVar.getClass();
        if (((Boolean) zzbd.zzc().a(p32.Le)).booleanValue()) {
            zzdxtVar.b("brr", true != zzdxtVar.c.q ? "0" : "1");
        }
        if (bundle.containsKey("ls")) {
            zzdxtVar.b("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgufVar.size();
        for (int i = 0; i < size; i++) {
            zzdxi zzdxiVar = (zzdxi) zzgufVar.get(i);
            long j = bundle.getLong(zzdxiVar.b.zza(), -1L);
            long j2 = bundle.getLong(zzdxiVar.c.zza(), -1L);
            if (j > 0 && j2 > 0) {
                zzdxtVar.b(zzdxiVar.a, String.valueOf(j2 - j));
            }
        }
        b(bundle.getBundle("client_sig_latency_key"));
        b(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) zzbd.zzc().a(p32.y8)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdxtVar.b("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdxtVar.b("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    public final void b(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.a.b(str, String.valueOf(j));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zzd(zzbj zzbjVar) {
        String str;
        if (((Boolean) zzbd.zzc().a(p32.R7)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.y8)).booleanValue();
            zzdxt zzdxtVar = this.a;
            if (zBooleanValue) {
                zzdxtVar.a.put("sgw", String.valueOf(this.c));
            }
            zzdye zzdyeVar = this.b;
            if (zzbjVar == null) {
                ConcurrentHashMap concurrentHashMap = zzdxtVar.a;
                concurrentHashMap.put("action", "sgs");
                concurrentHashMap.put("request_id", "-1");
                zzdyeVar.a(concurrentHashMap, false);
                return;
            }
            zzbzu zzbzuVar = zzbjVar.zzd;
            Bundle bundle = zzbjVar.zze;
            if (zzbzuVar != null) {
                a(zzbzuVar.m, zzdxi.d);
            } else if (bundle != null && !bundle.isEmpty()) {
                a(bundle, zzdxi.d);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(zzbjVar.zzc) ? zzbjVar.zzb : zzbjVar.zzc);
                ConcurrentHashMap concurrentHashMap2 = zzdxtVar.a;
                ConcurrentHashMap concurrentHashMap3 = zzdxtVar.a;
                concurrentHashMap2.put("action", "sgs");
                if (((Boolean) zzbd.zzc().a(p32.eb)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        zzo.zzg("Error retrieving JSONObject from the requestJson, ", e);
                        str = "na";
                    }
                } else {
                    str = "na";
                }
                concurrentHashMap3.put("tpc", str);
                zzbzu zzbzuVar2 = zzbjVar.zzd;
                if (zzbzuVar2 != null) {
                    zzdxtVar.a(zzbzuVar2.a);
                }
                zzdxtVar.c();
                zzdyeVar.a(concurrentHashMap3, false);
            } catch (JSONException unused) {
                ConcurrentHashMap concurrentHashMap4 = zzdxtVar.a;
                concurrentHashMap4.put("action", "sgf");
                concurrentHashMap4.put("sgf_reason", "request_invalid");
                zzdyeVar.a(concurrentHashMap4, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(zze zzeVar) {
        zzdxt zzdxtVar = this.a;
        zzdxtVar.a.put("action", "ftl");
        zzdxtVar.b("ftl", String.valueOf(zzeVar.zza));
        zzdxtVar.b("ed", zzeVar.zzc);
        if (((Boolean) zzbd.zzc().a(p32.g8)).booleanValue()) {
            zzdxtVar.b("emsg", zzeVar.zzb);
        }
        zzdxtVar.c();
        this.b.a(zzdxtVar.a, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        this.a.a(zzbzuVar.a);
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
        zzdxt zzdxtVar = this.a;
        zzdxtVar.getClass();
        zt2 zt2Var = zzfjcVar.b;
        List list = zt2Var.a;
        if (!list.isEmpty()) {
            int i = ((tt2) list.get(0)).b;
            zzdxtVar.b("ad_format", tt2.a(i));
            if (i == 6) {
                zzdxtVar.a.put("as", true != zzdxtVar.b.g ? "0" : "1");
            }
        }
        if (((Boolean) zzbd.zzc().a(p32.M2)).booleanValue()) {
            zzdxtVar.b("mwl", Integer.toString(list.size()));
        }
        zzdxtVar.b("gqi", zt2Var.b.b);
    }

    @Override // com.google.android.gms.internal.ads.zzdjy
    public final void zze(String str) {
        if (((Boolean) zzbd.zzc().a(p32.R7)).booleanValue()) {
            boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.y8)).booleanValue();
            zzdxt zzdxtVar = this.a;
            if (zBooleanValue) {
                zzdxtVar.a.put("sgw", String.valueOf(this.c));
            }
            zzdxtVar.a.put("action", "sgf");
            zzdxtVar.b("sgf_reason", str);
            zzdxtVar.c();
            this.b.a(zzdxtVar.a, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final void zzg() {
        zzdxt zzdxtVar = this.a;
        ConcurrentHashMap concurrentHashMap = zzdxtVar.a;
        concurrentHashMap.put("action", "loaded");
        a(zzdxtVar.e, zzdxi.e);
        if (((Boolean) zzbd.zzc().a(p32.ce)).booleanValue()) {
            concurrentHashMap.put("mafe", true != vp1.b(Features.MUTE_AUDIO) ? "0" : "1");
        }
        zzdxtVar.c();
        this.b.a(concurrentHashMap, false);
    }
}
