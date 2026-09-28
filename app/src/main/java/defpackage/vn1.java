package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.viewpager.widget.ViewPager;
import androidx.webkit.ProfileStore;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.internal.ads.j;
import com.google.android.gms.internal.ads.zzazb;
import com.google.android.gms.internal.ads.zzazo;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbbx;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbdy;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzbrg;
import com.google.android.gms.internal.ads.zzbzq;
import com.google.android.gms.internal.ads.zzcfj;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzcia;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzcjw;
import com.google.android.gms.internal.ads.zzdxz;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.util.Features;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class vn1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vn1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        boolean zBooleanValue;
        zzazb zzazbVar = (zzazb) this.b;
        if (zzazbVar.b != null) {
            return;
        }
        synchronized (zzazb.c) {
            if (zzazbVar.b != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((Boolean) p32.l3.g()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzazb.d = rw2.a(((zzazb) this.b).a.a, "ADSHIELD");
                    z = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z = zBooleanValue;
            }
            ((zzazb) this.b).b = Boolean.valueOf(z);
            zzazb.c.open();
        }
    }

    private final void b() {
        l12 l12Var = (l12) this.b;
        synchronized (l12Var.c) {
            if (l12Var.d.get() && l12Var.e) {
                l12Var.d.set(false);
                zzo.zzd("App went background");
                Iterator it = l12Var.f.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzbdy) it.next()).zza(false);
                    } catch (Exception e) {
                        zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    }
                }
            } else {
                zzo.zzd("App is still foreground");
            }
        }
    }

    private final void c() {
        x40 x40Var = (x40) this.b;
        synchronized (x40Var) {
            try {
                zzbgi zzbgiVar = (zzbgi) x40Var.c;
                if (zzbgiVar.b) {
                    zzbgiVar.a.zzh((byte[]) x40Var.b);
                    zzbgiVar.a.zzi(0);
                    zzbgiVar.a.zzj(x40Var.a);
                    zzbgiVar.a.zzg(null);
                    zzbgiVar.a.zzf();
                }
            } catch (RemoteException e) {
                zzo.zze("Clearcut log failed", e);
            }
        }
    }

    private final void d() throws Throwable {
        LinkedHashMap linkedHashMap;
        zzbhj zzbhjVar = (zzbhj) this.b;
        zzbhjVar.getClass();
        while (true) {
            try {
                zzbht zzbhtVar = (zzbht) zzbhjVar.a.take();
                kx kxVarB = zzbhtVar.b();
                if (!TextUtils.isEmpty(kxVarB.b)) {
                    LinkedHashMap linkedHashMap2 = zzbhjVar.b;
                    synchronized (zzbhtVar.c) {
                        zzt.zzh().a();
                        linkedHashMap = zzbhtVar.b;
                    }
                    zzbhjVar.b(zzbhjVar.a(linkedHashMap2, linkedHashMap), kxVarB);
                }
            } catch (InterruptedException e) {
                zzo.zzj("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void e() {
        long jLongValue;
        long jIntValue;
        boolean zBooleanValue;
        long j;
        long j2;
        zzcia zzciaVar = (zzcia) this.b;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzf(zzciaVar.e)));
        try {
            jLongValue = ((Long) zzbd.zzc().a(p32.h0)).longValue() * 1000;
            jIntValue = ((Integer) zzbd.zzc().a(p32.w)).intValue();
            zBooleanValue = ((Boolean) zzbd.zzc().a(p32.w2)).booleanValue();
        } catch (Exception e) {
            String str = zzciaVar.e;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            zzo.zzi(sb.toString());
            zzt.zzh().g(e, "VideoStreamExoPlayerCache.preload");
            zzciaVar.release();
            zzciaVar.i(zzciaVar.e, strConcat, "error", zzcia.k("error", e));
        }
        synchronized (zzciaVar) {
            if (zzt.zzk().currentTimeMillis() - zzciaVar.i > jLongValue) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(jLongValue).length() + 27);
                sb2.append("Timeout reached. Limit: ");
                sb2.append(jLongValue);
                sb2.append(" ms");
                throw new IOException(sb2.toString());
            }
            if (zzciaVar.f) {
                throw new IOException("Abort requested before buffering finished. ");
            }
            if (!zzciaVar.g) {
                if (!zzciaVar.d.a()) {
                    throw new IOException("ExoPlayer was released during preloading.");
                }
                long jZzt = zzciaVar.d.i.zzt();
                if (jZzt > 0) {
                    long jZzv = zzciaVar.d.i.zzv();
                    if (jZzv != zzciaVar.j) {
                        boolean z = jZzv > 0;
                        String str2 = zzciaVar.e;
                        long jE = zBooleanValue ? zzciaVar.d.e() : -1L;
                        long jF = zBooleanValue ? zzciaVar.d.f() : -1L;
                        long jG = zBooleanValue ? zzciaVar.d.g() : -1L;
                        int i = zzcfv.a.get();
                        int i2 = zzcfv.b.get();
                        Handler handler = zzf.zza;
                        j = jIntValue;
                        ib2 ib2Var = new ib2(zzciaVar, str2, strConcat, jZzv, jZzt, jE, jF, jG, z, i, i2);
                        j2 = jZzv;
                        jZzt = jZzt;
                        handler.post(ib2Var);
                        zzciaVar.j = j2;
                    } else {
                        j = jIntValue;
                        j2 = jZzv;
                    }
                    if (j2 >= jZzt) {
                        zzf.zza.post(new lb2(zzciaVar, zzciaVar.e, strConcat, jZzt));
                    } else if (zzciaVar.d.m >= j && j2 > 0) {
                    }
                }
                zzs.zza.postDelayed(new vn1(zzciaVar, 25), ((Long) zzbd.zzc().a(p32.i0)).longValue());
                return;
            }
            zzt.zzB().a.remove(zzciaVar.h);
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String strA;
        ProfileStore profileStore = null;
        switch (this.a) {
            case 0:
                ViewPager viewPager = (ViewPager) this.b;
                viewPager.setScrollState(0);
                viewPager.q();
                return;
            case 1:
                zaaw zaawVar = (zaaw) this.b;
                a aVar = zaawVar.d;
                Context context = zaawVar.c;
                aVar.getClass();
                if (yb0.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException unused) {
                    return;
                }
            case 2:
                ((zabq) this.b).e();
                return;
            case 3:
                ((zact) this.b).h.zae(new ConnectionResult(4));
                return;
            case 4:
                zzb zzbVar = (zzb) this.b;
                zzbVar.zzc(Thread.currentThread());
                zzbVar.zza();
                return;
            case 5:
                ((zzac) this.b).zzb();
                return;
            case 6:
                ((j) this.b).getClass();
                return;
            case 7:
                e02 e02Var = (e02) this.b;
                synchronized (e02Var.o) {
                    if (e02Var.p) {
                        return;
                    }
                    e02Var.p = true;
                    try {
                        e02Var.c();
                        break;
                    } catch (Exception e) {
                        ((e02) this.b).f.c(2023, -1L, e);
                    }
                    e02 e02Var2 = (e02) this.b;
                    synchronized (e02Var2.o) {
                        e02Var2.p = false;
                        break;
                    }
                    return;
                }
            case 8:
                a();
                return;
            case 9:
                ((zzbar) this.b).c();
                return;
            case 10:
                zzbbx zzbbxVar = (zzbbx) this.b;
                try {
                    t02 t02Var = zzbbxVar.a;
                    Class<?> clsLoadClass = t02Var.c.loadClass(new String(t02Var.d.b(zzbbxVar.b, t02Var.e), "UTF-8"));
                    if (clsLoadClass != null) {
                        zzbbxVar.d = clsLoadClass.getMethod(new String(zzbbxVar.a.d.b(zzbbxVar.c, t02Var.e), "UTF-8"), zzbbxVar.e);
                    }
                    break;
                } catch (zzazo | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused2) {
                } catch (Throwable th) {
                    zzbbxVar.f.countDown();
                    throw th;
                }
                zzbbxVar.f.countDown();
                return;
            case 11:
                ((zzbdg) this.b).d(3);
                return;
            case 12:
                b();
                return;
            case 13:
                ((zzbfl) this.b).d();
                return;
            case 14:
                c();
                return;
            case 15:
                d();
                return;
            case 16:
                zzbid zzbidVar = (zzbid) this.b;
                Context context2 = zzbidVar.c;
                if (zzbidVar.f != null || context2 == null || (strA = et.a(context2)) == null || strA.equals(context2.getPackageName())) {
                    return;
                }
                zzbidVar.a = context2.getApplicationContext();
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                if (!TextUtils.isEmpty(strA)) {
                    intent.setPackage(strA);
                }
                context2.bindService(intent, zzbidVar, 33);
                return;
            case 17:
                ((zzbij) this.b).d();
                return;
            case 18:
                zzbqf zzbqfVar = (zzbqf) this.b;
                if (zzbqfVar.a == null) {
                    return;
                }
                zzbqfVar.a.disconnect();
                Binder.flushPendingCommands();
                return;
            case 19:
                zze.zza("maybeDestroy > Destroying engine.");
                zzbrg zzbrgVar = (zzbrg) this.b;
                zzbrgVar.zzn("/result", f62.j);
                zzbrgVar.zzj();
                return;
            case 20:
                ((zzbzq) this.b).f.set(false);
                return;
            case 21:
                ((AtomicBoolean) this.b).getAndSet(true);
                return;
            case 22:
                ((zzcfk) this.b).g();
                return;
            case 23:
                ((zzcfj) this.b).zzi();
                return;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                zzt.zzB().a.remove((gb2) this.b);
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                e();
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                zzcjl zzcjlVar = ((zzcjw) this.b).a;
                zzcjlVar.zzah();
                zzm zzmVarZzL = zzcjlVar.zzL();
                if (zzmVarZzL != null) {
                    zzmVarZzL.zzv();
                    return;
                }
                return;
            case 27:
                int i = zzcjw.I;
                zzbhj zzbhjVarA = zzt.zzh().a();
                String str = (String) this.b;
                if (zzbhjVarA.g.contains(str)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", zzbhjVarA.f);
                linkedHashMap.put("ue", str);
                zzbhjVarA.b(zzbhjVarA.a(zzbhjVarA.b, linkedHashMap), null);
                return;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                zzt.zzu().zzf(((gp2) this.b).a);
                return;
            default:
                hc2 hc2Var = (hc2) this.b;
                zzdxz zzdxzVar = hc2Var.b;
                long jElapsedRealtime = zzt.zzk().elapsedRealtime();
                ec2 ec2Var = hc2Var.a;
                ec2Var.getClass();
                if (!vp1.b(Features.MULTI_PROFILE)) {
                    zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
                    return;
                }
                try {
                    profileStore = (ProfileStore) ProfileStore.class.getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e2) {
                    zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e2.getMessage())));
                    try {
                        profileStore = (ProfileStore) Class.forName("androidx.webkit.ProfileStore$-CC").getDeclaredMethod("getInstance", null).invoke(null, null);
                    } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e3) {
                        zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e3.getMessage())));
                    }
                }
                if (profileStore == null) {
                    zzo.zzi("WebViewCompat failure: No instance");
                    if (((Boolean) zzbd.zzc().a(p32.xf)).booleanValue()) {
                        i31 i31VarA = zzdxzVar.a();
                        i31VarA.c("action", "webview_p_f");
                        i31VarA.c("webview_p_f", "No instance");
                        i31VarA.d();
                        return;
                    }
                    return;
                }
                ec2Var.a = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
                if (((Boolean) zzbd.zzc().a(p32.xf)).booleanValue()) {
                    long jElapsedRealtime2 = zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                    i31 i31VarA2 = zzdxzVar.a();
                    i31VarA2.c("action", "webview_p_l");
                    i31VarA2.c("webview_p_l", Long.toString(jElapsedRealtime2));
                    i31VarA2.d();
                    return;
                }
                return;
        }
    }
}
