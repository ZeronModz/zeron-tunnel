package defpackage;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzday;
import com.google.android.gms.internal.ads.zzdbi;
import com.google.android.gms.internal.ads.zzdcx;
import com.google.android.gms.internal.ads.zzdel;
import com.google.android.gms.internal.ads.zzeas;
import com.google.android.gms.internal.ads.zzfjc;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bn2 implements zzdbi, zzdel, zzdcx {
    public final gn2 a;
    public final String b;
    public final String c;
    public zzday f;
    public zze g;
    public JSONObject k;
    public JSONObject l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String h = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String i = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public String j = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    public int d = 0;
    public zzeas e = zzeas.AD_REQUESTED;

    public bn2(gn2 gn2Var, cu2 cu2Var, String str) {
        this.a = gn2Var;
        this.c = str;
        this.b = cu2Var.g;
    }

    public static JSONObject c(zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : c(zzeVar2));
        return jSONObject;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectB;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.e);
        jSONObject.put("format", tt2.a(this.d));
        if (((Boolean) zzbd.zzc().a(p32.Oa)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.m);
            if (this.m) {
                jSONObject.put("shown", this.n);
            }
        }
        zzday zzdayVar = this.f;
        if (zzdayVar != null) {
            jSONObjectB = b(zzdayVar);
        } else {
            zze zzeVar = this.g;
            JSONObject jSONObjectB2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzday zzdayVar2 = (zzday) iBinder;
                jSONObjectB2 = b(zzdayVar2);
                if (zzdayVar2.e.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(c(this.g));
                    jSONObjectB2.put("errors", jSONArray);
                }
            }
            jSONObjectB = jSONObjectB2;
        }
        jSONObject.put("responseInfo", jSONObjectB);
        return jSONObject;
    }

    public final JSONObject b(zzday zzdayVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzdayVar.a);
        jSONObject.put("responseSecsSinceEpoch", zzdayVar.f);
        jSONObject.put("responseId", zzdayVar.b);
        if (((Boolean) zzbd.zzc().a(p32.Ha)).booleanValue()) {
            String str = zzdayVar.g;
            if (!TextUtils.isEmpty(str)) {
                zzo.zzd("Bidding data: ".concat(String.valueOf(str)));
                jSONObject.put("biddingData", new JSONObject(str));
            }
        }
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("adRequestUrl", this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            jSONObject.put("postBody", this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            jSONObject.put("adResponseBody", this.j);
        }
        Object obj = this.k;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.l;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) zzbd.zzc().a(p32.Ka)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.o);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzv zzvVar : zzdayVar.e) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.zza);
            jSONObject2.put("latencyMillis", zzvVar.zzb);
            if (((Boolean) zzbd.zzc().a(p32.Ia)).booleanValue()) {
                jSONObject2.put("credentials", zzbb.zza().zzm(zzvVar.zzd));
            }
            zze zzeVar = zzvVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : c(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdcx
    public final void zza(jg2 jg2Var) {
        gn2 gn2Var = this.a;
        if (gn2Var.g()) {
            this.f = jg2Var.f;
            this.e = zzeas.AD_LOADED;
            if (((Boolean) zzbd.zzc().a(p32.Oa)).booleanValue()) {
                gn2Var.d(this.b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbi
    public final void zzdI(zze zzeVar) {
        gn2 gn2Var = this.a;
        if (gn2Var.g()) {
            this.e = zzeas.AD_LOAD_FAILED;
            this.g = zzeVar;
            if (((Boolean) zzbd.zzc().a(p32.Oa)).booleanValue()) {
                gn2Var.d(this.b, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdO(zzbzu zzbzuVar) {
        if (((Boolean) zzbd.zzc().a(p32.Oa)).booleanValue()) {
            return;
        }
        gn2 gn2Var = this.a;
        if (gn2Var.g()) {
            gn2Var.d(this.b, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdel
    public final void zzdP(zzfjc zzfjcVar) {
        gn2 gn2Var = this.a;
        if (gn2Var.g()) {
            zt2 zt2Var = zzfjcVar.b;
            List list = zt2Var.a;
            if (!list.isEmpty()) {
                this.d = ((tt2) list.get(0)).b;
            }
            ut2 ut2Var = zt2Var.b;
            String str = ut2Var.l;
            if (!TextUtils.isEmpty(str)) {
                this.h = str;
            }
            String str2 = ut2Var.m;
            if (!TextUtils.isEmpty(str2)) {
                this.i = str2;
            }
            JSONObject jSONObject = ut2Var.p;
            if (jSONObject.length() > 0) {
                this.l = jSONObject;
            }
            if (((Boolean) zzbd.zzc().a(p32.Ka)).booleanValue()) {
                if (gn2Var.w >= ((Long) zzbd.zzc().a(p32.La)).longValue()) {
                    this.o = true;
                    return;
                }
                String str3 = ut2Var.n;
                if (!TextUtils.isEmpty(str3)) {
                    this.j = str3;
                }
                JSONObject jSONObject2 = ut2Var.o;
                if (jSONObject2.length() > 0) {
                    this.k = jSONObject2;
                }
                JSONObject jSONObject3 = this.k;
                int length = jSONObject3 != null ? jSONObject3.toString().length() : 0;
                if (!TextUtils.isEmpty(this.j)) {
                    length += this.j.length();
                }
                long j = length;
                synchronized (gn2Var) {
                    gn2Var.w += j;
                }
            }
        }
    }
}
