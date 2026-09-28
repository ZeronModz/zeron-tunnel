package defpackage;

import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.provider.Settings;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.i1;
import com.google.android.gms.internal.ads.u1;
import com.google.android.gms.internal.ads.w1;
import com.google.android.gms.internal.ads.zzbgj$zzaf$zzd;
import com.google.android.gms.internal.ads.zzbgj$zzq;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzehr;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfso;
import com.google.android.gms.internal.ads.zzfsr;
import com.google.android.gms.internal.ads.zzfsw;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfwz;
import com.google.android.gms.internal.ads.zzfxb;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzmy;
import com.google.android.gms.internal.ads.zzna;
import com.google.android.gms.internal.ads.zzwb;
import com.google.android.gms.internal.ads.zzwg;
import com.google.android.gms.internal.ads.zzwu;
import com.google.android.gms.internal.ads.zzwv;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class to2 implements zzfmu, zzfvk, zzdy, zzdr {
    public final /* synthetic */ int a;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public to2(zzfso zzfsoVar, zzfsr zzfsrVar, zzfsw zzfswVar, zzfsw zzfswVar2, boolean z) {
        this.a = 1;
        this.e = zzfsoVar;
        this.f = zzfsrVar;
        this.c = zzfswVar;
        if (zzfswVar2 == null) {
            this.d = zzfsw.NONE;
        } else {
            this.d = zzfswVar2;
        }
        this.b = z;
    }

    public static to2 a(zzfso zzfsoVar, zzfsr zzfsrVar, zzfsw zzfswVar, zzfsw zzfswVar2, boolean z) {
        if (zzfsoVar == null) {
            u7.r("CreativeType is null");
            return null;
        }
        if (zzfsrVar == null) {
            u7.r("ImpressionType is null");
            return null;
        }
        if (zzfswVar == null) {
            u7.r("Impression owner is null");
            return null;
        }
        if (zzfswVar == zzfsw.NONE) {
            u7.r("Impression owner is none");
            return null;
        }
        if (zzfsoVar == zzfso.DEFINED_BY_JAVASCRIPT && zzfswVar == zzfsw.NATIVE) {
            u7.r("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        if (zzfsrVar != zzfsr.DEFINED_BY_JAVASCRIPT || zzfswVar != zzfsw.NATIVE) {
            return new to2(zzfsoVar, zzfsrVar, zzfswVar, zzfswVar2, z);
        }
        u7.r("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        return null;
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        b02 b02VarV = i1.v();
        b02VarV.d();
        ((i1) b02VarV.b).z(5);
        zzian zzianVarZzs = zzian.zzs(bArr, 0, bArr.length);
        b02VarV.d();
        ((i1) b02VarV.b).w(zzianVarZzs);
        return Base64.encodeToString(((i1) b02VarV.e()).a(), 11);
    }

    public synchronized boolean b() {
        Object obj;
        try {
            obj = this.c;
        } catch (Exception e) {
            throw new zzfwz(2001, e);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", null).invoke(obj, null)).booleanValue();
    }

    public synchronized void c() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.c;
            obj.getClass().getDeclaredMethod("close", null).invoke(obj, null);
            ((zzfvh) this.f).b(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfwz(2003, e);
        }
    }

    public synchronized int d() {
        Object obj;
        try {
            obj = this.c;
        } catch (Exception e) {
            throw new zzfwz(2006, e);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", null).invoke(obj, null)).intValue();
    }

    public synchronized byte[] f(Map map) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.c;
        } catch (Exception e) {
            ((zzfvh) this.f).c(2007, System.currentTimeMillis() - jCurrentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public Object zza(Object obj) {
        long j;
        uo2 uo2Var = (uo2) ((ll3) this.c).b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((zzg) uo2Var.a).zzx()) {
            return null;
        }
        zzbgj$zzaf$zzd zzbgj_zzaf_zzd = (zzbgj$zzaf$zzd) this.f;
        u1 u1Var = (u1) this.e;
        ArrayList arrayList = (ArrayList) this.d;
        boolean z = this.b;
        e22 e22VarK = w1.K();
        e22VarK.d();
        ((w1) e22VarK.b).w(arrayList);
        Context context = uo2Var.c;
        zzbgj$zzq zzbgj_zzq = Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0 ? zzbgj$zzq.ENUM_TRUE : zzbgj$zzq.ENUM_FALSE;
        e22VarK.d();
        ((w1) e22VarK.b).D(zzbgj_zzq);
        zzbgj$zzq zzbgj_zzqZzf = zzt.zzf().zzf(context, uo2Var.e);
        e22VarK.d();
        ((w1) e22VarK.b).E(zzbgj_zzqZzf);
        zzehr zzehrVar = uo2Var.f;
        synchronized (zzehrVar.h) {
            j = zzehrVar.c;
        }
        e22VarK.d();
        ((w1) e22VarK.b).C(j);
        long jF = zzehrVar.f();
        e22VarK.d();
        ((w1) e22VarK.b).v(jF);
        int iD = zzehrVar.d();
        e22VarK.d();
        ((w1) e22VarK.b).F(iD);
        e22VarK.d();
        ((w1) e22VarK.b).H(zzbgj_zzaf_zzd);
        e22VarK.d();
        ((w1) e22VarK.b).x(u1Var);
        zzbgj$zzq zzbgj_zzq2 = uo2Var.g;
        e22VarK.d();
        ((w1) e22VarK.b).G(zzbgj_zzq2);
        zzbgj$zzq zzbgj_zzq3 = z ? zzbgj$zzq.ENUM_TRUE : zzbgj$zzq.ENUM_FALSE;
        e22VarK.d();
        ((w1) e22VarK.b).B(zzbgj_zzq3);
        long jB = zzehrVar.b();
        e22VarK.d();
        ((w1) e22VarK.b).I(jB);
        long jCurrentTimeMillis = zzt.zzk().currentTimeMillis();
        e22VarK.d();
        ((w1) e22VarK.b).A(jCurrentTimeMillis);
        zzbgj$zzq zzbgj_zzq4 = Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0 ? zzbgj$zzq.ENUM_TRUE : zzbgj$zzq.ENUM_FALSE;
        e22VarK.d();
        ((w1) e22VarK.b).y(zzbgj_zzq4);
        byte[] bArrA = ((w1) e22VarK.e()).a();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'completed_requests'");
        if (!z) {
            sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'failed_requests'");
        }
        ay2.K(sQLiteDatabase, uo2Var.f.b(), bArrA);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public synchronized String zzb(Context context, String str, View view, Activity activity) {
        byte[] bArrF;
        try {
            Map mapZzc = ((zzfxb) this.e).zzc();
            mapZzc.put("f", "v");
            mapZzc.put("ctx", context);
            mapZzc.put("aid", null);
            mapZzc.put("view", view);
            mapZzc.put("act", activity);
            bArrF = f(mapZzc);
            if (this.b) {
                mapZzc.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e(bArrF);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public synchronized String zzc(Context context, String str, String str2, View view, Activity activity) {
        byte[] bArrF;
        try {
            Map mapZzd = ((zzfxb) this.e).zzd();
            mapZzd.put("f", "c");
            mapZzd.put("ctx", context);
            mapZzd.put("cs", str2);
            mapZzd.put("aid", null);
            mapZzd.put("view", view);
            mapZzd.put("act", activity);
            bArrF = f(mapZzd);
            if (this.b) {
                mapZzd.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e(bArrF);
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public synchronized void zzd(String str, MotionEvent motionEvent) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map mapZze = ((zzfxb) this.e).zze();
            mapZze.put("aid", null);
            mapZze.put("evt", motionEvent);
            Object obj = this.c;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, mapZze);
            ((zzfvh) this.f).b(3003, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e) {
            throw new zzfwz(2005, e);
        }
    }

    public /* synthetic */ to2(ll3 ll3Var, boolean z, ArrayList arrayList, u1 u1Var, zzbgj$zzaf$zzd zzbgj_zzaf_zzd) {
        this.a = 0;
        this.c = ll3Var;
        this.b = z;
        this.d = arrayList;
        this.e = u1Var;
        this.f = zzbgj_zzaf_zzd;
    }

    public /* synthetic */ to2(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk
    public synchronized String zza(Context context, String str) {
        byte[] bArrF;
        try {
            Map mapZzb = ((zzfxb) this.e).zzb();
            mapZzb.put("f", "q");
            mapZzb.put("ctx", context);
            mapZzb.put("aid", null);
            bArrF = f(mapZzb);
            if (this.b) {
                mapZzb.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e(bArrF);
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo9zza(Object obj) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 3:
                ((zzna) obj).zzh((zzmy) obj5, (zzwb) obj4, (zzwg) obj3, (IOException) obj2, this.b);
                break;
            default:
                ((zzwv) obj).zzal(0, ((zzwu) obj5).a, (zzwb) obj4, (zzwg) obj3, (IOException) obj2, this.b);
                break;
        }
    }
}
