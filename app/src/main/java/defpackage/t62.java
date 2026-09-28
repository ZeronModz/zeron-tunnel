package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbl;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.a6;
import com.google.android.gms.internal.ads.b6;
import com.google.android.gms.internal.ads.c6;
import com.google.android.gms.internal.ads.ec;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.q5;
import com.google.android.gms.internal.ads.y3;
import com.google.android.gms.internal.ads.yb;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzefc;
import com.google.android.gms.internal.ads.zzefg;
import com.google.android.gms.internal.ads.zzenv;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzfcc;
import com.google.android.gms.internal.ads.zzfcd;
import com.google.android.gms.internal.ads.zzfiz;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzgkx;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.DesugarCollections;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t62 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public t62(zzbqf zzbqfVar, p62 p62Var) {
        this.a = 0;
        this.b = p62Var;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) throws JSONException, RemoteException {
        int length;
        je3 je3Var;
        j33 j33VarB0;
        switch (this.a) {
            case 0:
                r62 r62Var = (r62) obj;
                zzcen zzcenVar = new zzcen();
                s62 s62Var = new s62(this, zzcenVar);
                p62 p62Var = (p62) this.b;
                Parcel parcelZza = r62Var.zza();
                e12.c(parcelZza, p62Var);
                e12.e(parcelZza, s62Var);
                r62Var.zzdb(2, parcelZza);
                return zzcenVar;
            case 1:
                zzcbz zzcbzVar = (zzcbz) this.b;
                Map map = (Map) obj;
                if (map != null) {
                    try {
                        for (String str : map.keySet()) {
                            JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                            if (jSONArrayOptJSONArray != null) {
                                Object obj2 = zzcbzVar.h;
                                synchronized (obj2) {
                                    try {
                                        length = jSONArrayOptJSONArray.length();
                                        synchronized (obj2) {
                                            je3Var = (je3) zzcbzVar.b.get(str);
                                        }
                                    } finally {
                                    }
                                    break;
                                }
                                if (je3Var == null) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                                    sb.append("Cannot find the corresponding resource object for ");
                                    sb.append(str);
                                    xg0.I(sb.toString());
                                } else {
                                    for (int i = 0; i < length; i++) {
                                        String string = jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type");
                                        je3Var.d();
                                        ((yb) je3Var.b).B(string);
                                    }
                                    zzcbzVar.f |= length > 0;
                                }
                            }
                        }
                    } catch (JSONException e) {
                        if (((Boolean) s42.a.g()).booleanValue()) {
                            zzo.zze("Failed to get SafeBrowsing metadata", e);
                        }
                        return z.v(new Exception("Safebrowsing report transmission failed."));
                    }
                }
                if (zzcbzVar.f) {
                    synchronized (zzcbzVar.h) {
                        ce3 ce3Var = zzcbzVar.a;
                        ce3Var.d();
                        ((ec) ce3Var.b).J(10);
                        break;
                    }
                }
                boolean z = zzcbzVar.f;
                if (!(z && zzcbzVar.g.g) && (!(zzcbzVar.k && zzcbzVar.g.f) && (z || !zzcbzVar.g.d))) {
                    return u33.b;
                }
                synchronized (zzcbzVar.h) {
                    try {
                        for (je3 je3Var2 : zzcbzVar.b.values()) {
                            ce3 ce3Var2 = zzcbzVar.a;
                            yb ybVar = (yb) je3Var2.e();
                            ce3Var2.d();
                            ((ec) ce3Var2.b).C(ybVar);
                        }
                        ce3 ce3Var3 = zzcbzVar.a;
                        ArrayList arrayList = zzcbzVar.c;
                        ce3Var3.d();
                        ((ec) ce3Var3.b).H(arrayList);
                        ArrayList arrayList2 = zzcbzVar.d;
                        ce3Var3.d();
                        ((ec) ce3Var3.b).I(arrayList2);
                        if (((Boolean) s42.a.g()).booleanValue()) {
                            String strV = ((ec) ce3Var3.b).v();
                            String strX = ((ec) ce3Var3.b).x();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(strV).length() + 38 + String.valueOf(strX).length() + 15);
                            sb2.append("Sending SB report\n  url: ");
                            sb2.append(strV);
                            sb2.append("\n  clickUrl: ");
                            sb2.append(strX);
                            sb2.append("\n  resources: \n");
                            StringBuilder sb3 = new StringBuilder(sb2.toString());
                            for (yb ybVar2 : DesugarCollections.unmodifiableList(((ec) ce3Var3.b).w())) {
                                sb3.append("    [");
                                sb3.append(ybVar2.w());
                                sb3.append("] ");
                                sb3.append(ybVar2.v());
                            }
                            xg0.I(sb3.toString());
                        }
                        ListenableFuture listenableFutureZzb = new zzbl(zzcbzVar.e).zzb(1, zzcbzVar.g.b, null, ((ec) ce3Var3.e()).a());
                        if (((Boolean) s42.a.g()).booleanValue()) {
                            listenableFutureZzb.addListener(g10.b, g3.a);
                        }
                        j33VarB0 = z.b0(listenableFutureZzb, ox1.f, g3.g);
                    } finally {
                    }
                    break;
                }
                return j33VarB0;
            case 2:
                String str2 = (String) zzbd.zzc().a(p32.Hb);
                Uri.Builder builder = (Uri.Builder) this.b;
                builder.appendQueryParameter(str2, "12");
                return z.j(builder.toString());
            case 3:
                ((wl0) this.b).zza((Throwable) obj);
                return u33.b;
            case 4:
                return ((zzefc) this.b).zza((zzbzu) obj);
            case 5:
                return obj != null ? (j33) this.b : z.v(new zzenv(1, "Retrieve required value in native ad response failed."));
            case 6:
                zzefg zzefgVar = (zzefg) obj;
                return z.j(new zzfjc(new zzfiz(((do2) this.b).c), zt2.a(new InputStreamReader(zzefgVar.a), zzefgVar.b.m)));
            case 7:
                y3 y3Var = (y3) this.b;
                return z.j(new zzfjc(new zzfiz(y3Var.d), zt2.a(new StringReader(((JSONObject) obj).toString()), y3Var.o)));
            case 8:
                String str3 = (String) obj;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                String str4 = (String) this.b;
                try {
                    jSONObject3.put("headers", new JSONObject());
                    jSONObject3.put("body", str3);
                    jSONObject2.put("base_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    jSONObject2.put("signals", new JSONObject(str4));
                    jSONObject.put("request", jSONObject2);
                    jSONObject.put("response", jSONObject3);
                    jSONObject.put("flags", new JSONObject());
                    return z.j(jSONObject);
                } catch (JSONException e2) {
                    throw new JSONException("Preloaded loader: ".concat(String.valueOf(e2.getCause())));
                }
            case 9:
                zzezj zzezjVar = (zzezj) this.b;
                Throwable th = (Throwable) obj;
                if (((Boolean) zzbd.zzc().a(p32.T2)).booleanValue()) {
                    zzfax zzfaxVar = zzezjVar.a;
                    zzcdu zzcduVarZzh = zzt.zzh();
                    int iZzb = zzfaxVar.zzb();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(iZzb).length() + 22);
                    sb4.append("OptionalSignalTimeout:");
                    sb4.append(iZzb);
                    zzcduVarZzh.f(sb4.toString(), th);
                }
                return u33.b;
            case 10:
                Throwable th2 = (Throwable) obj;
                ((xs2) this.b).c.zza(new kc2(th2, 24));
                return z.j(th2 instanceof SecurityException ? new ys2(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 2) : th2 instanceof IllegalStateException ? new ys2(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 3) : th2 instanceof IllegalArgumentException ? new ys2(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 4) : th2 instanceof TimeoutException ? new ys2(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 5) : new ys2(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0));
            case 11:
                return z.j(new zzfcd(((zzfcc) this.b).b));
            case 12:
                return (ListenableFuture) this.b;
            case 13:
                return z.j(((zzfmu) this.b).zza(obj));
            case 14:
                q5 q5Var = (q5) obj;
                zzgkx zzgkxVar = ((a6) this.b).c;
                if (q5Var.zzj() == 2) {
                    return zzgkxVar.zzd(q5Var.v(), q5Var.w().zzy());
                }
                if (q5Var.zzj() == 3) {
                    return zzgkxVar.zzc(q5Var.v(), q5Var.zzc().zzy(), q5Var.w().zzy());
                }
                u7.g("Unreachable");
                return null;
            case 15:
                return ((b6) this.b).b.zze();
            default:
                return ((zzgkx) ((c6) this.b).f).zzb();
        }
    }

    public /* synthetic */ t62(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
