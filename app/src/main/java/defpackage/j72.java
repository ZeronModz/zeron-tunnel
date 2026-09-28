package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.d0;
import com.google.android.gms.internal.ads.h6;
import com.google.android.gms.internal.ads.y3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzboh;
import com.google.android.gms.internal.ads.zzbqs;
import com.google.android.gms.internal.ads.zzbsm;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdam;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzefe;
import com.google.android.gms.internal.ads.zzefh;
import com.google.android.gms.internal.ads.zzefr;
import com.google.android.gms.internal.ads.zzems;
import com.google.android.gms.internal.ads.zzenv;
import com.google.android.gms.internal.ads.zzfba;
import com.google.android.gms.internal.ads.zzfbz;
import com.google.android.gms.internal.ads.zzffv;
import com.google.android.gms.internal.ads.zzffw;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfkj;
import com.google.android.gms.internal.ads.zzfkz;
import com.google.android.gms.internal.ads.zzflg;
import com.google.android.gms.internal.ads.zzfli;
import com.google.android.gms.internal.ads.zzflj;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzgdv;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzikv;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.io2;
import defpackage.jo2;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j72 implements zzgyw {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j72(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final /* synthetic */ ListenableFuture a(Object obj) {
        zzfmb zzfmbVar = (zzfmb) this.b;
        Exception exc = (Exception) obj;
        synchronized (zzfmbVar) {
            zzfmbVar.d = true;
            throw exc;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) throws JSONException, zzbso {
        zzenv zzenvVar;
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        switch (this.a) {
            case 0:
                zzbsm zzbsmVar = (zzbsm) obj;
                zzbsmVar.zzm((String) this.b, (zzboh) this.c);
                return z.j(zzbsmVar);
            case 1:
                ve2 ve2Var = (ve2) this.b;
                Uri.Builder builder = (Uri.Builder) this.c;
                ve2Var.e.zza(new s33(23, ve2Var, (Throwable) obj));
                builder.appendQueryParameter((String) zzbd.zzc().a(p32.Hb), "9");
                return z.j(builder.toString());
            case 2:
                pg2 pg2Var = (pg2) this.b;
                zzbzu zzbzuVar = (zzbzu) obj;
                zzbzuVar.i = (zzflg) this.c;
                final zzefr zzefrVar = pg2Var.h;
                int i4 = 3;
                y12 y12Var = new y12(zzbzuVar, i4);
                jo2 jo2Var = zzefrVar.b;
                Objects.requireNonNull(jo2Var);
                return zzefrVar.a(zzbzuVar, new d0(jo2Var, i4), new zzefh() { // from class: com.google.android.gms.internal.ads.a4
                    @Override // com.google.android.gms.internal.ads.zzefh
                    public final ListenableFuture zza(zzbzu zzbzuVar2) {
                        int i5 = i3;
                        zzefr zzefrVar2 = zzefrVar;
                        switch (i5) {
                            case 0:
                                return ((zzegw) zzefrVar2.c.zzb()).b(zzbzuVar2, Binder.getCallingUid());
                            case 1:
                                jo2 jo2Var2 = zzefrVar2.b;
                                String str = zzbzuVar2.h;
                                synchronized (jo2Var2.b) {
                                    try {
                                        int i6 = jo2Var2.h;
                                        if (i6 != 1 && i6 != 3) {
                                            return z.v(new zzeff(2));
                                        }
                                        if (jo2Var2.c) {
                                            return jo2Var2.a;
                                        }
                                        jo2Var2.h = 3;
                                        jo2Var2.c = true;
                                        jo2Var2.g = str;
                                        jo2Var2.f.checkAvailabilityAndConnect();
                                        zzcen zzcenVar = jo2Var2.a;
                                        zzcenVar.a.addListener(new io2(jo2Var2, 0), g3.g);
                                        return zzcenVar;
                                    } finally {
                                    }
                                }
                            default:
                                return ((zzegw) zzefrVar2.c.zzb()).c(zzbzuVar2.h);
                        }
                    }
                }, y12Var);
            case 3:
                zzdsh zzdshVar = (zzdsh) this.b;
                JSONObject jSONObject = (JSONObject) this.c;
                zzcjl zzcjlVar = (zzcjl) obj;
                zzbqs zzbqsVar = zzdshVar.a.b;
                w12 w12Var = new w12(zzcjlVar);
                if (zzbqsVar != null) {
                    zzcjlVar.zzaf(new jc2(5, 0, 0));
                } else {
                    zzcjlVar.zzaf(new jc2(4, 0, 0));
                }
                zzcjlVar.zzP().zzG(new tk2(zzdshVar, zzcjlVar, w12Var, i2));
                zzcjlVar.zzb("google.afma.nativeAds.renderVideo", jSONObject);
                return w12Var;
            case 4:
                y3 y3Var = (y3) this.b;
                i72 i72Var = (i72) this.c;
                JSONObject jSONObject2 = (JSONObject) obj;
                if (((Boolean) zzbd.zzc().a(p32.M2)).booleanValue()) {
                    ec1.R(zzdxh.SCAR_PRELOADER_PROCESSING_DONE.zza(), y3Var.i.e);
                }
                return i72Var.zzb(jSONObject2);
            case 5:
                y3 y3Var2 = (y3) this.b;
                List list = (List) this.c;
                Exception exc = (Exception) obj;
                zzt.zzh().g(exc, "PreloadedLoader.getTypeTwoAdResponseString");
                if (exc instanceof TimeoutException) {
                    zzenvVar = new zzenv(1, "Timed out waiting for ad response.");
                } else if (exc instanceof zzenv) {
                    zzenvVar = (zzenv) exc;
                } else {
                    zzenvVar = new zzenv(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                String message = zzenvVar.getMessage() == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzenvVar.getMessage();
                if (list != null && !list.isEmpty()) {
                    String str = "0.6.0.0";
                    if (!TextUtils.isEmpty(message)) {
                        if (message.contains("Timed out waiting for ad response.")) {
                            message = "timeout";
                            str = "0.2.0.0";
                        } else if (message.contains("Received HTTP error code from ad server:")) {
                            List listB = h6.a(new h13(':')).b(message);
                            if (listB.size() == 2) {
                                message = (String) listB.get(1);
                            }
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(zzfqg.c(zzfqg.c((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
                    }
                    y3Var2.j.a(arrayList, null);
                }
                return z.v(zzenvVar);
            case 6:
                return ((zzefe) ((zzikv) this.b).zzb()).zza((zzbzu) this.c);
            case 7:
                return ((zzfbz) this.b).a().a(zzbb.zza().zzm((Bundle) obj), ((zzbzu) this.c).m, false);
            case 8:
                return ((zzfba) this.b).a(zzbb.zza().zzm((Bundle) obj), ((zzbzu) this.c).m, false);
            case 9:
                zzems zzemsVar = (zzems) this.b;
                yk2 yk2Var = (yk2) this.c;
                JSONObject jSONObject3 = (JSONObject) obj;
                zzfkj zzfkjVar = zzemsVar.d;
                u33 u33VarJ = z.j(yk2Var);
                synchronized (zzfkjVar) {
                    zzfkjVar.a.addFirst(u33VarJ);
                }
                if (!jSONObject3.optBoolean("success")) {
                    throw new zzbso("process json failed");
                }
                if (((Boolean) zzbd.zzc().a(p32.M2)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_END.zza(), zzemsVar.f.e);
                }
                return z.j(jSONObject3.getJSONObject("json").getJSONArray("ads"));
            case 10:
                zzems zzemsVar2 = (zzems) this.b;
                tt2 tt2Var = (tt2) this.c;
                yk2 yk2Var2 = (yk2) obj;
                if (((Boolean) zzbd.zzc().a(p32.M2)).booleanValue()) {
                    ec1.R(zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_START.zza(), zzemsVar2.f.e);
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("isNonagon", true);
                if (((Boolean) zzbd.zzc().a(p32.X9)).booleanValue() && j03.o()) {
                    jSONObject4.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("response", tt2Var.s.c);
                jSONObject5.put("sdk_params", jSONObject4);
                return z.Z(yk2Var2.a("google.afma.nativeAds.preProcessJson", jSONObject5), new j72(9, zzemsVar2, yk2Var2), zzemsVar2.b);
            case 11:
                zzfjc zzfjcVar = (zzfjc) obj;
                ((zzfli) this.b).b = zzfjcVar;
                Iterator it2 = zzfjcVar.b.a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Iterator it3 = ((tt2) it2.next()).a.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()).contains("FirstPartyRenderer")) {
                                i3 = 1;
                            }
                        }
                    } else if (i3 != 0) {
                        return ((pg2) this.c).c(z.j(zzfjcVar));
                    }
                }
                return u33.b;
            case 12:
                zzffw zzffwVar = (zzffw) this.b;
                zzdam zzdamVar = (zzdam) this.c;
                lt2 lt2Var = (lt2) obj;
                zzfkz zzfkzVar = zzffwVar.a;
                zzflj zzfljVar = lt2Var.b;
                zzbzu zzbzuVar2 = lt2Var.a;
                zzfli zzfliVarZza = zzfkzVar.zza(zzfljVar);
                if (zzfliVarZza != null && zzbzuVar2 != null) {
                    pg2 pg2VarZza = zzdamVar.zza();
                    final zzefr zzefrVar2 = pg2VarZza.h;
                    zzfnb zzfnbVarK = pg2VarZza.c.a(zzefrVar2.a(zzbzuVar2, new zzefh() { // from class: com.google.android.gms.internal.ads.a4
                        @Override // com.google.android.gms.internal.ads.zzefh
                        public final ListenableFuture zza(zzbzu zzbzuVar22) {
                            int i5 = i2;
                            zzefr zzefrVar22 = zzefrVar2;
                            switch (i5) {
                                case 0:
                                    return ((zzegw) zzefrVar22.c.zzb()).b(zzbzuVar22, Binder.getCallingUid());
                                case 1:
                                    jo2 jo2Var2 = zzefrVar22.b;
                                    String str2 = zzbzuVar22.h;
                                    synchronized (jo2Var2.b) {
                                        try {
                                            int i6 = jo2Var2.h;
                                            if (i6 != 1 && i6 != 3) {
                                                return z.v(new zzeff(2));
                                            }
                                            if (jo2Var2.c) {
                                                return jo2Var2.a;
                                            }
                                            jo2Var2.h = 3;
                                            jo2Var2.c = true;
                                            jo2Var2.g = str2;
                                            jo2Var2.f.checkAvailabilityAndConnect();
                                            zzcen zzcenVar = jo2Var2.a;
                                            zzcenVar.a.addListener(new io2(jo2Var2, 0), g3.g);
                                            return zzcenVar;
                                        } finally {
                                        }
                                    }
                                default:
                                    return ((zzegw) zzefrVar22.c.zzb()).c(zzbzuVar22.h);
                            }
                        }
                    }, new zzefh() { // from class: com.google.android.gms.internal.ads.a4
                        @Override // com.google.android.gms.internal.ads.zzefh
                        public final ListenableFuture zza(zzbzu zzbzuVar22) {
                            int i5 = i;
                            zzefr zzefrVar22 = zzefrVar2;
                            switch (i5) {
                                case 0:
                                    return ((zzegw) zzefrVar22.c.zzb()).b(zzbzuVar22, Binder.getCallingUid());
                                case 1:
                                    jo2 jo2Var2 = zzefrVar22.b;
                                    String str2 = zzbzuVar22.h;
                                    synchronized (jo2Var2.b) {
                                        try {
                                            int i6 = jo2Var2.h;
                                            if (i6 != 1 && i6 != 3) {
                                                return z.v(new zzeff(2));
                                            }
                                            if (jo2Var2.c) {
                                                return jo2Var2.a;
                                            }
                                            jo2Var2.h = 3;
                                            jo2Var2.c = true;
                                            jo2Var2.g = str2;
                                            jo2Var2.f.checkAvailabilityAndConnect();
                                            zzcen zzcenVar = jo2Var2.a;
                                            zzcenVar.a.addListener(new io2(jo2Var2, 0), g3.g);
                                            return zzcenVar;
                                        } finally {
                                        }
                                    }
                                default:
                                    return ((zzegw) zzefrVar22.c.zzb()).c(zzbzuVar22.h);
                            }
                        }
                    }, ww1.g), zzfno.NOTIFY_CACHE_HIT).k();
                    zzfnbVarK.addListener(new s33(i3, zzfnbVarK, new nx2(pg2VarZza, 26)), pg2VarZza.j);
                    zzfnbVarK.addListener(new s33(i3, zzfnbVarK, zzffwVar.c), zzffwVar.b);
                }
                return z.j(new zzffv(zzfljVar, zzbzuVar2, zzfliVarZza));
            case 13:
                return a(obj);
            default:
                return ((zzgdv) ((rx2) this.b).b.f.get()).zzc((Context) this.c);
        }
    }
}
