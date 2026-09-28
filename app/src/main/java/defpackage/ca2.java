package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbj;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.g;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.t5;
import com.google.android.gms.internal.ads.td;
import com.google.android.gms.internal.ads.ud;
import com.google.android.gms.internal.ads.vd;
import com.google.android.gms.internal.ads.zzaca;
import com.google.android.gms.internal.ads.zzadm;
import com.google.android.gms.internal.ads.zzbdd;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbwy;
import com.google.android.gms.internal.ads.zzcbz;
import com.google.android.gms.internal.ads.zzceu;
import com.google.android.gms.internal.ads.zzcit;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzckh;
import com.google.android.gms.internal.ads.zzclh;
import com.google.android.gms.internal.ads.zzco;
import com.google.android.gms.internal.ads.zzcql;
import com.google.android.gms.internal.ads.zzcqm;
import com.google.android.gms.internal.ads.zzcwd;
import com.google.android.gms.internal.ads.zzdal;
import com.google.android.gms.internal.ads.zzdbj;
import com.google.android.gms.internal.ads.zzdbv;
import com.google.android.gms.internal.ads.zzdce;
import com.google.android.gms.internal.ads.zzddw;
import com.google.android.gms.internal.ads.zzdgw;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzdmb;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdqh;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzduu;
import com.google.android.gms.internal.ads.zzequ;
import com.google.android.gms.internal.ads.zzese;
import com.google.android.gms.internal.ads.zzfet;
import com.google.android.gms.internal.ads.zzfgh;
import com.google.android.gms.internal.ads.zzfgi;
import com.google.android.gms.internal.ads.zzfii;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzfki;
import com.google.android.gms.internal.ads.zzfku;
import com.google.android.gms.internal.ads.zzflv;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfnv;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzfsu;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgdv;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzml;
import com.google.android.gms.internal.ads.zzmq;
import com.google.android.gms.internal.ads.zzrc;
import com.google.android.gms.internal.ads.zzsg;
import com.google.android.gms.internal.ads.zzsm;
import com.google.android.gms.internal.ads.zzso;
import com.google.android.gms.internal.ads.zzsp;
import com.google.android.gms.internal.ads.zzsr;
import com.google.android.gms.internal.ads.zzta;
import com.google.android.gms.internal.ads.zzuc;
import com.google.android.gms.internal.ads.zzuw;
import com.google.android.gms.internal.ads.zzvi;
import com.google.android.gms.internal.ads.zzyq;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ca2 implements zzgzl, zzmq, zzfsu, zzfmu, zzdhc, zzclh, zzbkf, zzbwy, zzcwd, zzese, zzfgi, zzfku, OnFailureListener, zzgv {
    public final /* synthetic */ int a;
    public final Object b;

    public ca2(g0 g0Var) {
        this.a = 29;
        this.b = g0Var.l;
    }

    private final void c() {
        zzdoc zzdocVar = ((zzdst) this.b).d;
        if (zzdocVar != null) {
            synchronized (zzdocVar) {
                zzdocVar.n.zzd(NativeCustomFormatAd.ASSET_NAME_VIDEO);
            }
        }
    }

    private final void e() {
        zzequ zzequVar = (zzequ) this.b;
        synchronized (zzequVar) {
            zzequVar.i = null;
        }
    }

    private final void f() {
        zzfii zzfiiVar = (zzfii) this.b;
        synchronized (zzfiiVar) {
            zzfiiVar.i = null;
        }
    }

    private final void h(Object obj) {
        zzfii zzfiiVar = (zzfii) this.b;
        dl2 dl2Var = (dl2) obj;
        synchronized (zzfiiVar) {
            try {
                zzfiiVar.i = dl2Var;
                if (((Boolean) zzbd.zzc().a(p32.t4)).booleanValue()) {
                    dl2Var.u.a = zzfiiVar.d;
                }
                zzfiiVar.i.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ca2 i(String str) {
        return new ca2((TextUtils.isEmpty(str) || str.length() > 1) ? zzji.UNINITIALIZED : zzjl.e(str.charAt(0)), 17);
    }

    public boolean a() {
        r rVar = (r) this.b;
        try {
            return Wrappers.a(rVar.a).b(128, "com.android.vending").versionCode >= 80837300;
        } catch (Exception e) {
            m mVar = rVar.f;
            r.h(mVar);
            mVar.n.b(e, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        t61 t61Var = (t61) this.b;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        ((zzfvh) t61Var.d).c(2025, -1L, exc);
    }

    @Override // com.google.android.gms.internal.ads.zzmq
    public zzml[] zza(Handler handler, zzadm zzadmVar, zzrc zzrcVar, zzyq zzyqVar, zzvi zzviVar) {
        zzcit zzcitVar = (zzcit) this.b;
        zzuw zzuwVar = zzuw.zzb;
        Context context = zzcitVar.c;
        zzsp zzspVar = new zzsp(context);
        n8.A0(!zzspVar.c);
        zzspVar.c = true;
        if (zzspVar.f == null) {
            zzspVar.f = new zzsr(new zzco[0]);
        }
        ud udVar = zzspVar.e;
        zzsm zzsmVar = zzspVar.g;
        if (udVar == null) {
            Context context2 = zzspVar.a;
            if (zzsmVar == null) {
                zzspVar.g = new zzsm(context2);
            }
            if (zzspVar.d == null) {
                zzspVar.d = zzso.zza;
            }
            zzsg zzsgVar = new zzsg(context2);
            td tdVar = context2 != null ? null : zzspVar.b;
            Context context3 = zzsgVar.a;
            if (context3 == null) {
                zzsgVar.c = tdVar;
            }
            zzsm zzsmVar2 = zzspVar.g;
            zzsgVar.d = zzsmVar2;
            zzsgVar.b = zzspVar.d;
            if (zzsmVar2 == null) {
                zzsgVar.d = new zzsm(context3);
            }
            zzspVar.e = new ud(zzsgVar);
        } else {
            n8.A0(zzsmVar == null);
            n8.A0(zzspVar.d == null);
        }
        zzta zztaVar = new zzta(context, new zzuc(context, null, null), zzuwVar, false, handler, zzrcVar, new vd(zzspVar));
        zzaca zzacaVar = new zzaca(context);
        zzacaVar.c = zzuwVar;
        zzacaVar.e = handler;
        zzacaVar.f = zzadmVar;
        n8.A0(!zzacaVar.b);
        Handler handler2 = zzacaVar.e;
        n8.A0((handler2 == null && zzacaVar.f == null) || !(handler2 == null || zzacaVar.f == null));
        zzacaVar.b = true;
        return new zzml[]{zztaVar, new g(zzacaVar)};
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
        dh2 dh2Var;
        switch (this.a) {
            case 0:
                zzcbz.l.remove((ListenableFuture) this.b);
                return;
            case 1:
                ((zzceu) this.b).b.set(1);
                return;
            case 4:
                df2 df2Var = (df2) this.b;
                zzfqg zzfqgVar = df2Var.g;
                zzfjc zzfjcVar = df2Var.e;
                tt2 tt2Var = df2Var.f;
                df2Var.h.b(zzfqgVar.b(zzfjcVar, tt2Var, false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (String) obj, tt2Var.c, null, null), true != zzt.zzh().k(df2Var.a) ? 1 : 2);
                return;
            case 13:
                try {
                    zzcjl zzcjlVar = (zzcjl) ((List) obj).get(0);
                    if (zzcjlVar == null) {
                        return;
                    }
                    try {
                        ((zzdqh) this.b).c.execute(new yb2(zzcjlVar, 5));
                        return;
                    } catch (ClassCastException e) {
                        e = e;
                    }
                } catch (ClassCastException | IndexOutOfBoundsException e2) {
                    e = e2;
                }
                Throwable th = e;
                if (((Boolean) zzbd.zzc().a(p32.r6)).booleanValue()) {
                    zzt.zzh().f("omid native display exp", th);
                    return;
                }
                return;
            case 18:
                ((bn2) obj).n = true;
                ((qn2) this.b).d.b();
                return;
            case 19:
                try {
                    ((zzfmu) this.b).zza((SQLiteDatabase) obj);
                    return;
                } catch (Exception e3) {
                    zzo.zzf("Error executing function on offline signal database: ".concat(String.valueOf(e3.getMessage())));
                    return;
                }
            case 21:
                zzequ zzequVar = (zzequ) this.b;
                rf2 rf2Var = (rf2) obj;
                synchronized (zzequVar) {
                    try {
                        rf2 rf2Var2 = zzequVar.i;
                        if (rf2Var2 != null) {
                            dh2 dh2Var2 = rf2Var.j;
                            if (dh2Var2 != null && (dh2Var = rf2Var2.j) != null) {
                                dh2Var2.a(dh2Var.a.get());
                            }
                            zzdce zzdceVar = zzequVar.i.c;
                            zzdceVar.getClass();
                            zzdceVar.i(new f10(null, 2));
                        }
                        zzequVar.i = rf2Var;
                        rf2Var.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            case 23:
                h(obj);
                return;
            default:
                ((t5) this.b).c.zzc((zzgdv) obj);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    /* JADX INFO: renamed from: zzc, reason: collision with other method in class */
    public void mo7zzc() {
        ((zzduu) this.b).m.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public JSONObject zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public JSONObject zzc() {
        return null;
    }

    public /* synthetic */ ca2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    public /* synthetic */ ca2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void b(Throwable th) {
    }

    private final void d(Throwable th) {
    }

    private final void g(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgv
    public /* synthetic */ byte[] zza(Uri uri) {
        return (byte[]) this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public zzed zza() throws zzfjr {
        zzfki zzfkiVar = (zzfki) this.b;
        zzfkiVar.getClass();
        try {
            return zzfkiVar.a.zzB();
        } catch (Throwable th) {
            throw new zzfjr(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public Object zza(Object obj) {
        zzfjc zzfjcVar = (zzfjc) obj;
        ne2 ne2Var = ((pg2) this.b).d;
        for (yt2 yt2Var : zzfjcVar.b.c) {
            Map map = ne2Var.a;
            String str = yt2Var.a;
            JSONObject jSONObject = yt2Var.b;
            if (map.containsKey(str) && jSONObject != null) {
                ((zzcqm) map.get(str)).zza(jSONObject);
            } else {
                Map map2 = ne2Var.b;
                if (map2.containsKey(str) && jSONObject != null) {
                    zzcql zzcqlVar = (zzcql) map2.get(str);
                    HashMap map3 = new HashMap();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String strOptString = jSONObject.optString(next);
                        if (strOptString != null) {
                            map3.put(next, strOptString);
                        }
                    }
                    zzcqlVar.zza(map3);
                }
            }
        }
        return zzfjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbkf, com.google.android.gms.internal.ads.zzese, com.google.android.gms.internal.ads.zzfku
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public void mo6zza() {
        switch (this.a) {
            case 15:
                c();
                return;
            case 21:
                e();
                return;
            case 23:
                f();
                return;
            default:
                zzflv zzflvVar = (zzflv) this.b;
                synchronized (zzflvVar) {
                    zzflvVar.e = 1;
                    zzflvVar.b();
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public void zza(int i, int i2, int i3, int i4) {
        ((zzduu) this.b).c.i(c22.m);
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public void mo3zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 6:
                zzdbv zzdbvVar = (zzdbv) obj;
                String message = ((zzdmb) obj2).getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                zzdbvVar.zzj(xg0.P(12, message, null));
                break;
            case 7:
                ((zzdbj) obj).zzc((zze) obj2);
                break;
            case 8:
                ((zzddw) obj).zzm((com.google.android.gms.ads.internal.client.zzt) obj2);
                break;
            case 9:
            default:
                zzfnb zzfnbVar = (zzfnb) obj2;
                ((zzfnv) obj).zzdK((zzfno) zzfnbVar.a, zzfnbVar.b);
                break;
            case 10:
                ((zzdgw) obj).zzj((l2) obj2);
                break;
            case 11:
                ((zzbde) obj).zzdj((zzbdd) obj2);
                break;
            case 12:
                ((zzdjy) obj).zzd((zzbj) obj2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zzcbz.l.remove((ListenableFuture) obj);
                break;
            case 1:
                ((zzceu) obj).b.set(-1);
                break;
            case 4:
                break;
            case 13:
                if (((Boolean) zzbd.zzc().a(p32.r6)).booleanValue()) {
                    zzt.zzh().f("omid native display exp", th);
                }
                break;
            case 18:
                break;
            case 19:
                zzo.zzf("Failed to get offline signal database: ".concat(String.valueOf(th.getMessage())));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfsu
    public /* synthetic */ void zza(boolean z) {
        zzcjl zzcjlVar = ((zzckh) this.b).a;
        zzfyn zzfynVar = zzs.zza;
        Objects.requireNonNull(zzcjlVar);
        zzfynVar.post(new yb2(zzcjlVar, 0));
    }

    @Override // com.google.android.gms.internal.ads.zzclh
    public /* synthetic */ void zza(boolean z, int i, String str, String str2) {
        ((w12) this.b).c();
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public void zzb() {
        ((zzduu) this.b).c.i(wh2.c);
    }

    @Override // com.google.android.gms.internal.ads.zzfgi
    public /* synthetic */ zzdal zza(zzfgh zzfghVar) {
        return ((zzfet) this.b).a(zzfghVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public void zzb(MotionEvent motionEvent) {
    }
}
