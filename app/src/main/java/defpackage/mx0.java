package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Binder;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebSettings;
import androidx.room.RoomSQLiteQuery;
import androidx.work.impl.model.PreferenceDao_Impl;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.TaggingLibraryJsInterface;
import com.google.android.gms.internal.ads.b6;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.qc;
import com.google.android.gms.internal.ads.y3;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzcen;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzecz;
import com.google.android.gms.internal.ads.zzedt;
import com.google.android.gms.internal.ads.zzeej;
import com.google.android.gms.internal.ads.zzeeq;
import com.google.android.gms.internal.ads.zzefg;
import com.google.android.gms.internal.ads.zzegr;
import com.google.android.gms.internal.ads.zzegt;
import com.google.android.gms.internal.ads.zzegy;
import com.google.android.gms.internal.ads.zzegz;
import com.google.android.gms.internal.ads.zzeha;
import com.google.android.gms.internal.ads.zzenv;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgfv;
import com.google.android.gms.internal.ads.zzgfw;
import com.google.android.gms.internal.ads.zzggb;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjl;
import dalvik.system.DexClassLoader;
import java.util.Objects;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mx0 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public mx0(g0 g0Var, wj3 wj3Var) {
        this.a = 18;
        this.b = wj3Var;
        Objects.requireNonNull(g0Var);
        this.c = g0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException, zzenv {
        SharedPreferences sharedPreferences;
        zzcen zzcenVar;
        int i = 0;
        switch (this.a) {
            case 0:
                Cursor cursorA = zt.a(((PreferenceDao_Impl) this.c).a, (RoomSQLiteQuery) this.b, false);
                try {
                    if (cursorA.moveToFirst() && !cursorA.isNull(0)) {
                        objValueOf = Long.valueOf(cursorA.getLong(0));
                        break;
                    }
                    return objValueOf;
                } finally {
                    cursorA.close();
                }
            case 1:
                return ((zzaye) this.b).a((Context) this.c);
            case 2:
                return ((TaggingLibraryJsInterface) this.b).getClickSignals((String) this.c);
            case 3:
                return (String) ((zzccq) this.b).k((Context) this.c, "getAppInstanceId");
            case 4:
                Context context = (Context) this.b;
                Context context2 = (Context) this.c;
                if (context != null) {
                    zze.zza("Attempting to read user agent from Google Play Services.");
                    sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
                } else {
                    zze.zza("Attempting to read user agent from local cache.");
                    sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
                    i = 1;
                }
                String string = sharedPreferences.getString("user_agent", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                if (TextUtils.isEmpty(string)) {
                    zze.zza("Reading user agent from WebSettings");
                    string = WebSettings.getDefaultUserAgent(context2);
                    if (i != 0) {
                        sharedPreferences.edit().putString("user_agent", string).apply();
                        zze.zza("Persisting user agent.");
                    }
                }
                return string;
            case 5:
                zzeak zzeakVar = (zzeak) this.b;
                zzfoe zzfoeVar = (zzfoe) this.c;
                zzeakVar.e.a(Boolean.TRUE);
                zzfoeVar.zzd(true);
                zzeakVar.p.b(zzfoeVar.zzm());
                return null;
            case 6:
                zzecz zzeczVar = (zzecz) this.b;
                zzbzu zzbzuVar = (zzbzu) this.c;
                zzeej zzeejVar = zzeczVar.c;
                synchronized (zzeejVar.b) {
                    try {
                        if (zzeejVar.c) {
                            zzcenVar = zzeejVar.a;
                        } else {
                            zzeejVar.c = true;
                            zzeejVar.e = zzbzuVar;
                            zzeejVar.f.checkAvailabilityAndConnect();
                            zzcenVar = zzeejVar.a;
                            zzcenVar.a.addListener(new kc2(zzeejVar, 15), g3.g);
                            zzeeq.b(zzeejVar.g, zzcenVar, zzeejVar.h);
                        }
                    } finally {
                    }
                }
                return (zzefg) zzcenVar.get(((Integer) zzbd.zzc().a(p32.C6)).intValue(), TimeUnit.SECONDS);
            case 7:
                return (zzefg) ((zzcen) ((zzedt) this.b).d.c((zzbzu) this.c)).a.get(((Integer) zzbd.zzc().a(p32.C6)).intValue(), TimeUnit.SECONDS);
            case 8:
                y3 y3Var = (y3) this.b;
                zzegy zzegyVar = (zzegy) this.c;
                y3Var.b(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_START);
                int i2 = -1;
                while (true) {
                    try {
                        if (i >= ((Integer) zzbd.zzc().a(p32.e8)).intValue()) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
                            sb.append("Received HTTP error code from ad server:");
                            sb.append(i2);
                            throw new zzenv(1, sb.toString());
                        }
                        zzegz zzegzVarA = new zzeha(y3Var.b, y3Var.c.afmaVersion, y3Var.p, Binder.getCallingUid(), null).zza(zzegyVar);
                        int i3 = zzegzVarA.a;
                        if (((Boolean) zzbd.zzc().a(p32.f8)).booleanValue()) {
                            y3Var.i.b("fr", String.valueOf(i));
                        }
                        if (i3 == 200) {
                            y3Var.b(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_END);
                            return zzegzVarA.c;
                        }
                        i++;
                        i2 = i3;
                    } catch (Exception e) {
                        throw new zzenv(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
                    }
                }
                break;
            case 9:
                zzegz zzegzVar = (zzegz) ((zzfnb) this.b).c.get();
                Object obj = ((u33) this.c).a;
                return new zzegt(zzegzVar, ((zzegr) obj).b, ((zzegr) obj).a);
            case 10:
                mv2 mv2Var = (mv2) this.b;
                String str = (String) this.c;
                zzu zzuVar = mv2Var.d;
                if (!((Boolean) zzbd.zzc().a(p32.ka)).booleanValue() || (!zzt.zzc().zzi(str) && !zzt.zzc().zzj(str))) {
                    return zzuVar.zzc(str, null);
                }
                qc qcVar = mv2Var.g.c;
                objValueOf = qcVar != null ? Base64.encodeToString(qcVar.a(), 10) : null;
                HashMap map = new HashMap();
                if (objValueOf != null) {
                    map.put((String) zzbd.zzc().a(p32.la), objValueOf);
                }
                return zzuVar.zzc(str, map);
            case 11:
                uy2 uy2Var = (uy2) this.b;
                zzggb zzggbVar = (zzggb) this.c;
                DexClassLoader dexClassLoader = uy2Var.l;
                zzgfw zzgfwVar = uy2Var.d;
                byte[] bArr = uy2Var.k;
                String str2 = zzggbVar.a;
                String str3 = zzggbVar.b;
                Class<?>[] clsArr = zzggbVar.c;
                try {
                    zzgfwVar.getClass();
                    return dexClassLoader.loadClass(new String(zzgfw.a(str2, bArr), "UTF-8")).getMethod(new String(zzgfw.a(str3, bArr), "UTF-8"), clsArr);
                } catch (zzgfv | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException e2) {
                    zu0.n(e2);
                    return null;
                }
            case 12:
                b6 b6Var = (b6) this.b;
                Context context3 = (Context) this.c;
                f6 f6Var = b6Var.d;
                to2 to2VarB = b6Var.a.b();
                if (to2VarB == null) {
                    f6Var.b(15004);
                    return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                String strZza = to2VarB.zza(context3, null);
                if (strZza != null) {
                    return strZza;
                }
                f6Var.b(15006);
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            case 13:
                vz2 vz2Var = (vz2) this.b;
                Context context4 = (Context) this.c;
                HashMap map2 = new HashMap();
                vz2Var.e.f(new wq(vz2Var, map2, context4), 20106);
                String strB = vz2Var.b(map2);
                map2.clear();
                return strB;
            case 14:
                g0 g0Var = ((zzjd) this.c).a;
                g0Var.w();
                e eVar = g0Var.c;
                g0.P(eVar);
                return eVar.V((String) this.b);
            case 15:
                g0 g0Var2 = ((zzjd) this.c).a;
                g0Var2.w();
                return new zzao(g0Var2.k0(((wj3) this.b).a));
            case 16:
                return ((zzk) this.b).zzb((Context) this.c, null);
            case 17:
                zzfyn zzfynVar = zzs.zza;
                String absolutePath = ((Context) this.c).getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
                WebSettings webSettings = (WebSettings) this.b;
                webSettings.setDatabasePath(absolutePath);
                webSettings.setDatabaseEnabled(true);
                webSettings.setDomStorageEnabled(true);
                webSettings.setDisplayZoomControls(false);
                webSettings.setBuiltInZoomControls(true);
                webSettings.setSupportZoom(true);
                if (((Boolean) zzbd.zzc().a(p32.r1)).booleanValue()) {
                    webSettings.setTextZoom(100);
                }
                webSettings.setAllowContentAccess(false);
                return Boolean.TRUE;
            default:
                wj3 wj3Var = (wj3) this.b;
                String str4 = wj3Var.a;
                yg0.m(str4);
                g0 g0Var3 = (g0) this.c;
                zzjl zzjlVarA = g0Var3.a(str4);
                zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                if (zzjlVarA.i(zzjkVar) && zzjl.c(100, wj3Var.s).i(zzjkVar)) {
                    return g0Var3.X(wj3Var).E();
                }
                g0Var3.zzaV().n.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public void finalize() throws Throwable {
        switch (this.a) {
            case 0:
                ((RoomSQLiteQuery) this.b).release();
                break;
            default:
                super.finalize();
                break;
        }
    }

    public /* synthetic */ mx0(Object obj, int i, Object obj2, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ mx0(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
