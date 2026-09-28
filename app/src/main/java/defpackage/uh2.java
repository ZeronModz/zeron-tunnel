package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.d2;
import com.google.android.gms.internal.ads.e;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.l2;
import com.google.android.gms.internal.ads.td;
import com.google.android.gms.internal.ads.ud;
import com.google.android.gms.internal.ads.w2;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzboz;
import com.google.android.gms.internal.ads.zzbvs;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzclh;
import com.google.android.gms.internal.ads.zzcts;
import com.google.android.gms.internal.ads.zzcwd;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdbv;
import com.google.android.gms.internal.ads.zzdcx;
import com.google.android.gms.internal.ads.zzdgw;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdmc;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdoh;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzefc;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzeiu;
import com.google.android.gms.internal.ads.zzekj;
import com.google.android.gms.internal.ads.zzenv;
import com.google.android.gms.internal.ads.zzeqd;
import com.google.android.gms.internal.ads.zzerx;
import com.google.android.gms.internal.ads.zzese;
import com.google.android.gms.internal.ads.zzfez;
import com.google.android.gms.internal.ads.zzfio;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjr;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfnv;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfqs;
import com.google.android.gms.internal.ads.zzfsa;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfzh;
import com.google.android.gms.internal.ads.zzgru;
import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzikp;
import com.google.android.gms.internal.ads.zzmq;
import com.google.android.gms.internal.ads.zzpw;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.o;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.zzgm;
import com.google.android.gms.measurement.internal.zzjs;
import java.util.Objects;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExecutorCoroutineDispatcherImpl;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh2 implements zzdhc, zzgzl, zzclh, zzbgc, zzfmu, zzcwd, zzdmc, zzese, zzfzh, zzfwf, zzr, zzgru, zzgm, zzpw {
    public final /* synthetic */ int a;
    public final Object b;

    public uh2(int i) {
        this.a = 24;
        this.b = qj1.O(i);
    }

    private final void d() {
        zzerx zzerxVar = (zzerx) this.b;
        synchronized (zzerxVar) {
            zzerxVar.j = null;
        }
    }

    private final void e() {
        zzfez zzfezVar = (zzfez) this.b;
        synchronized (zzfezVar) {
            zzfezVar.k = null;
        }
    }

    private final void g(Throwable th) {
        zzfsa zzfsaVar = (zzfsa) this.b;
        synchronized (zzfsaVar) {
            try {
                zzfsaVar.m.set(false);
                if ((th instanceof zzfqs) && ((zzfqs) th).zza() == 0) {
                    throw null;
                }
                zzfsaVar.c(true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final /* synthetic */ void i(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            zzeak zzeakVar = (zzeak) this.b;
            zzeakVar.c = true;
            zzeakVar.d("com.google.android.gms.ads.MobileAds", (int) (zzt.zzk().elapsedRealtime() - zzeakVar.d), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true);
            zzeakVar.i.execute(new e(1, this, str));
        }
    }

    private final void j(Object obj) {
        zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) zzbd.zzc().a(p32.f7)).booleanValue()) {
            do2 do2Var = (do2) this.b;
            ut2 ut2Var = zzfjcVar.b.b;
            do2Var.e.c(ut2Var.f);
            zzehr zzehrVar = do2Var.e;
            long j = ut2Var.g;
            synchronized (zzehrVar.h) {
                zzehrVar.c = j;
            }
        }
    }

    private final /* synthetic */ void k(Object obj) {
        zzerx zzerxVar = (zzerx) this.b;
        xi2 xi2Var = (xi2) obj;
        synchronized (zzerxVar) {
            zzerxVar.j = xi2Var;
            xi2Var.a();
        }
    }

    private final void l(Object obj) {
        pf2 pf2Var = (pf2) obj;
        zzfez zzfezVar = (zzfez) this.b;
        synchronized (zzfezVar) {
            try {
                pf2 pf2Var2 = zzfezVar.k;
                if (pf2Var2 != null) {
                    pf2Var2.d();
                }
                zzfezVar.k = pf2Var;
                zzcjl zzcjlVar = pf2Var.l;
                if (zzcjlVar != null) {
                    zzcjlVar.zzay(zzfezVar);
                }
                zzfezVar.f.a(new zzcts(pf2Var, zzfezVar, zzfezVar.f, zzfezVar.h));
                pf2Var.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void m(Object obj) {
        zzfio zzfioVar = (zzfio) this.b;
        dl2 dl2Var = (dl2) obj;
        synchronized (zzfioVar) {
            try {
                zzfioVar.d = dl2Var;
                if (((Boolean) zzbd.zzc().a(p32.t4)).booleanValue()) {
                    dl2Var.u.a = zzfioVar.c;
                }
                zzfioVar.d.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void n(Object obj) {
        zzfsa zzfsaVar = (zzfsa) this.b;
        synchronized (zzfsaVar) {
            try {
                zzfsaVar.m.set(false);
                if (obj != null) {
                    zzfsaVar.k.a();
                    zzfsaVar.q.set(true);
                    zzfsaVar.b(obj);
                }
                if (obj == null || zzfsaVar.f == null) {
                    zzfsaVar.c(obj == null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(String str, zzikp zzikpVar) {
        k02.E(zzikpVar, "provider");
        ((LinkedHashMap) this.b).put(str, zzikpVar);
    }

    public void h(String str, zzikp zzikpVar) {
        a(str, zzikpVar);
    }

    public ue3 o() {
        return new ue3((LinkedHashMap) this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public void zza(Throwable th) {
        switch (this.a) {
            case 4:
                if (((Boolean) zzbd.zzc().a(p32.r6)).booleanValue()) {
                    zzt.zzh().g(th, "omid native display exp");
                    return;
                }
                return;
            case 6:
                return;
            case 7:
                synchronized (this) {
                    zzeak zzeakVar = (zzeak) this.b;
                    zzeakVar.c = true;
                    zzeakVar.d("com.google.android.gms.ads.MobileAds", (int) (zzt.zzk().elapsedRealtime() - zzeakVar.d), "Internal Error.", false);
                    zzeakVar.e.b(new Exception());
                    break;
                }
                return;
            case 8:
                if (((Boolean) zzbd.zzc().a(p32.f7)).booleanValue()) {
                    Matcher matcher = do2.h.matcher(th.getMessage());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        do2 do2Var = (do2) this.b;
                        do2Var.e.c(Integer.parseInt(strGroup));
                        return;
                    }
                    return;
                }
                return;
            case 9:
            case 18:
                return;
            case 19:
                g(th);
                return;
            default:
                r03 r03Var = (r03) this.b;
                r03Var.b(th);
                r03Var.c();
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    /* JADX INFO: renamed from: zzb */
    public void mo5zzb(Object obj) {
        zzcen zzcenVar;
        switch (this.a) {
            case 4:
                zzdoc zzdocVar = (zzdoc) this.b;
                zzdocVar.m.F((zzcjl) obj);
                zzdoh zzdohVar = zzdocVar.m;
                synchronized (zzdohVar) {
                    zzcenVar = zzdohVar.n;
                }
                gp2 gp2VarG = zzdocVar.g("Google", true);
                if (gp2VarG != null && zzcenVar != null) {
                    zzcenVar.a(gp2VarG);
                    return;
                } else {
                    if (zzcenVar != null) {
                        zzcenVar.cancel(false);
                        return;
                    }
                    return;
                }
            case 5:
            case 10:
            case 11:
            case 12:
            case 13:
            case 17:
            default:
                ((r03) this.b).c();
                return;
            case 6:
                ((zzcjl) obj).zze("sendMessageToNativeJs", (Map) this.b);
                return;
            case 7:
                i(obj);
                return;
            case 8:
                j(obj);
                return;
            case 9:
                ((zzefc) this.b).c.zzdP((zzfjc) obj);
                return;
            case 14:
                k(obj);
                return;
            case 15:
                l(obj);
                return;
            case 16:
                m(obj);
                return;
            case 18:
                ((zzfoe) this.b).zza();
                return;
            case 19:
                n(obj);
                return;
        }
    }

    public /* synthetic */ uh2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public uh2(zzeak zzeakVar) {
        this.a = 7;
        Objects.requireNonNull(zzeakVar);
        this.b = zzeakVar;
    }

    public uh2(zzeqd zzeqdVar, tt2 tt2Var) {
        this.a = 13;
        this.b = tt2Var;
        Objects.requireNonNull(zzeqdVar);
    }

    public uh2(f6 f6Var, r03 r03Var) {
        this.a = 21;
        this.b = r03Var;
        Objects.requireNonNull(f6Var);
    }

    public uh2(zzjs zzjsVar, r rVar) {
        this.a = 26;
        this.b = rVar;
    }

    public uh2(yk2 yk2Var, Map map) {
        this.a = 6;
        this.b = map;
        Objects.requireNonNull(yk2Var);
    }

    private final void b(Throwable th) {
    }

    private final void c(Throwable th) {
    }

    private final void f(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public void zzb(int i, long j, String str) {
        ((zzk) this.b).zzo().e(i, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    /* JADX INFO: renamed from: zzb */
    public tt2 mo79zzb() {
        return (tt2) this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzdmc
    public void zza(boolean z, Context context, zzdbs zzdbsVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public /* synthetic */ zzed zza() throws zzfjr {
        try {
            return ((zzbvs) ((zzekj) this.b).b).zzh();
        } catch (RemoteException e) {
            throw new zzfjr(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public /* synthetic */ Object zza(Object obj) {
        zzeiu.c((SQLiteDatabase) obj, (zzu) this.b);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfzh, com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public CoroutineScope mo10zza() {
        return zr.a(new ExecutorCoroutineDispatcherImpl((ta2) this.b));
    }

    @Override // com.google.android.gms.internal.ads.zzese, com.google.android.gms.internal.ads.zzfku
    /* JADX INFO: renamed from: zza */
    public void mo6zza() {
        switch (this.a) {
            case 14:
                d();
                return;
            case 15:
                e();
                return;
            default:
                zzfio zzfioVar = (zzfio) this.b;
                synchronized (zzfioVar) {
                    zzfioVar.d = null;
                    break;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public void zza(int i, long j) {
        ((zzk) this.b).zzo().b(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzpw
    public void zza(td tdVar) {
        ud udVar = (ud) this.b;
        udVar.c();
        td tdVar2 = udVar.e;
        if (tdVar2 == null || tdVar.equals(tdVar2)) {
            return;
        }
        udVar.e = tdVar;
        com.google.android.gms.internal.ads.zzed zzedVar = udVar.c;
        if (zzedVar != null) {
            zzedVar.c(-1, ni3.h);
            zzedVar.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    /* JADX INFO: renamed from: zza */
    public void mo3zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((zzdbv) obj).zzj((zze) obj2);
                break;
            case 1:
                ((zzdcx) obj).zza((jg2) obj2);
                break;
            case 2:
                ((zzdgw) obj).zzk((l2) obj2);
                break;
            case 3:
                ((zzboz) obj).zzb((zzcas) obj2);
                break;
            default:
                zzfnb zzfnbVar = (zzfnb) obj2;
                ((zzfnv) obj).zzdL((zzfno) zzfnbVar.a, zzfnbVar.b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgru
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ Object mo10zza() {
        return (zzmq) this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzbgc
    public void zza(g32 g32Var) {
        e32 e32Var = (e32) g32Var.zzG().o();
        d2 d2Var = (d2) this.b;
        e32Var.d();
        ((w2) e32Var.b).y(d2Var);
        g32Var.d();
        ((y2) g32Var.b).B((w2) e32Var.e());
    }

    @Override // com.google.android.gms.internal.ads.zzclh
    public /* synthetic */ void zza(boolean z, int i, String str, String str2) {
        w12 w12Var = (w12) this.b;
        if (z) {
            w12Var.c();
            return;
        }
        int length = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(length + 58 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
        sb.append("Image Web View failed to load. Error code: ");
        sb.append(i);
        sb.append(", Description: ");
        sb.append(str);
        w12Var.b(new zzenv(1, vh.s(sb, ", Failing URL: ", str2)));
    }

    @Override // com.google.android.gms.measurement.internal.zzgm
    /* JADX INFO: renamed from: zza, reason: collision with other method in class */
    public boolean mo80zza() {
        m mVar = ((r) this.b).f;
        r.h(mVar);
        return Log.isLoggable(mVar.g(), 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public void zza(int i, String str, List list, boolean z, boolean z2) {
        p13 p13Var;
        r rVar = ((o) this.b).a;
        int i2 = i - 1;
        if (i2 == 0) {
            m mVar = rVar.f;
            r.h(mVar);
            p13Var = mVar.m;
        } else if (i2 != 1) {
            if (i2 == 3) {
                m mVar2 = rVar.f;
                r.h(mVar2);
                p13Var = mVar2.n;
            } else if (i2 != 4) {
                m mVar3 = rVar.f;
                r.h(mVar3);
                p13Var = mVar3.l;
            } else if (z) {
                m mVar4 = rVar.f;
                r.h(mVar4);
                p13Var = mVar4.j;
            } else if (!z2) {
                m mVar5 = rVar.f;
                r.h(mVar5);
                p13Var = mVar5.k;
            } else {
                m mVar6 = rVar.f;
                r.h(mVar6);
                p13Var = mVar6.i;
            }
        } else if (z) {
            m mVar7 = rVar.f;
            r.h(mVar7);
            p13Var = mVar7.g;
        } else if (!z2) {
            m mVar8 = rVar.f;
            r.h(mVar8);
            p13Var = mVar8.h;
        } else {
            m mVar9 = rVar.f;
            r.h(mVar9);
            p13Var = mVar9.f;
        }
        int size = list.size();
        if (size == 1) {
            p13Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            p13Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            p13Var.a(str);
        } else {
            p13Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
