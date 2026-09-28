package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.common.a;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbyq;
import com.google.android.gms.internal.ads.zzbyr;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z82 implements zzbyr {
    public static final Object l = new Object();
    public static zzbyr m;
    public static zzbyr n;
    public static zzbyr o;
    public static Boolean p;
    public final Context b;
    public final VersionInfoParcel e;
    public final PackageInfo f;
    public final String g;
    public final String h;
    public boolean j;
    public final HashSet k;
    public final Object a = new Object();
    public final WeakHashMap c = new WeakHashMap();
    public final ExecutorService d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    public final AtomicBoolean i = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z82(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z82.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static zzbyr a(Context context) {
        zzbyr zzbyqVar;
        synchronized (l) {
            try {
                zzbyqVar = m;
                if (zzbyqVar == null) {
                    if (f(context)) {
                        zzbyqVar = new z82(context, VersionInfoParcel.forPackage());
                        m = zzbyqVar;
                    } else {
                        zzbyqVar = new zzbyq();
                        m = zzbyqVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbyqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbyr b(android.content.Context r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6) {
        /*
            java.lang.Object r0 = defpackage.z82.l
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbyr r1 = defpackage.z82.o     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L7d
            x40 r1 = defpackage.c42.c     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r1.g()     // Catch: java.lang.Throwable -> L3b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L39
            l32 r1 = defpackage.p32.H8     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.zzbhc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r4.a(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L37
            x40 r1 = defpackage.c42.a     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r1.g()     // Catch: java.lang.Throwable -> L3b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L39
        L37:
            r1 = r3
            goto L3d
        L39:
            r1 = r2
            goto L3d
        L3b:
            r5 = move-exception
            goto L7f
        L3d:
            boolean r4 = f(r5)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L5a
            z82 r1 = new z82     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L3b
            r1.g()     // Catch: java.lang.Throwable -> L3b
            java.lang.Thread$UncaughtExceptionHandler r5 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L3b
            y82 r6 = new y82     // Catch: java.lang.Throwable -> L3b
            r6.<init>(r1, r5, r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r6)     // Catch: java.lang.Throwable -> L3b
            defpackage.z82.o = r1     // Catch: java.lang.Throwable -> L3b
            goto L7d
        L5a:
            if (r1 == 0) goto L77
            if (r5 == 0) goto L77
            z82 r1 = new z82     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L3b
            r1.j = r3     // Catch: java.lang.Throwable -> L3b
            r1.g()     // Catch: java.lang.Throwable -> L3b
            java.lang.Thread$UncaughtExceptionHandler r5 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L3b
            y82 r6 = new y82     // Catch: java.lang.Throwable -> L3b
            r6.<init>(r1, r5, r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r6)     // Catch: java.lang.Throwable -> L3b
        L74:
            defpackage.z82.o = r1     // Catch: java.lang.Throwable -> L3b
            goto L7d
        L77:
            com.google.android.gms.internal.ads.zzbyq r1 = new com.google.android.gms.internal.ads.zzbyq     // Catch: java.lang.Throwable -> L3b
            r1.<init>()     // Catch: java.lang.Throwable -> L3b
            goto L74
        L7d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            return r1
        L7f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z82.b(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):com.google.android.gms.internal.ads.zzbyr");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:11:0x002d, B:14:0x003b, B:15:0x0042), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzbyr c(android.content.Context r3) {
        /*
            java.lang.Object r0 = defpackage.z82.l
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzbyr r1 = defpackage.z82.n     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L42
            l32 r1 = defpackage.p32.I8     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L3b
            l32 r1 = defpackage.p32.H8     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.zzbhc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r1 != 0) goto L3b
            if (r3 == 0) goto L3b
            z82 r1 = new z82     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()     // Catch: java.lang.Throwable -> L39
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L39
            defpackage.z82.n = r1     // Catch: java.lang.Throwable -> L39
            goto L42
        L39:
            r3 = move-exception
            goto L44
        L3b:
            com.google.android.gms.internal.ads.zzbyq r1 = new com.google.android.gms.internal.ads.zzbyq     // Catch: java.lang.Throwable -> L39
            r1.<init>()     // Catch: java.lang.Throwable -> L39
            defpackage.z82.n = r1     // Catch: java.lang.Throwable -> L39
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            return r1
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z82.c(android.content.Context):com.google.android.gms.internal.ads.zzbyr");
    }

    public static String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean f(Context context) {
        Boolean boolValueOf;
        if (context != null) {
            synchronized (l) {
                try {
                    boolValueOf = p;
                    if (boolValueOf == null) {
                        boolValueOf = Boolean.valueOf(zzbb.zzh().nextInt(100) < ((Integer) zzbd.zzc().a(p32.he)).intValue());
                        p = boolValueOf;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (boolValueOf.booleanValue()) {
                if (!((Boolean) zzbd.zzc().a(p32.H8)).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean zZzo = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzo |= zzf.zzo(stackTraceElement.getClassName());
                    zEquals |= z82.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int iIntValue = ((Integer) zzbd.zzc().a(p32.J8)).intValue();
            if (iIntValue > 0) {
                HashSet hashSet = this.k;
                if (hashSet.size() >= iIntValue) {
                    return;
                }
                String strZzg = zzf.zzg(d(th));
                if (strZzg == null) {
                    strZzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                }
                if (hashSet.contains(strZzg)) {
                    return;
                } else {
                    hashSet.add(strZzg);
                }
            }
            if (!zZzo || zEquals) {
                return;
            }
            if (!this.j) {
                zzh(th, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            if (this.i.getAndSet(true) || !((Boolean) c42.c.g()).booleanValue() || (sharedPreferences = (context = this.b).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", kf2.O(context, "crash_without_write") + 1).commit();
        }
    }

    public final void g() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.a) {
            this.c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new y82(this, thread.getUncaughtExceptionHandler(), 1));
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(Throwable th, String str) {
        if (this.j) {
            return;
        }
        zzi(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzi(Throwable th, String str, float f) {
        Throwable th2;
        boolean zC;
        String packageName;
        PackageInfo packageInfoB;
        ActivityManager.MemoryInfo memoryInfoZze;
        String strZzg;
        Context context = this.b;
        if (this.j) {
            return;
        }
        Handler handler = zzf.zza;
        if (((Boolean) t42.e.g()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z = ((Boolean) zzbd.zzc().a(p32.W2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && zzf.zzo(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzf.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strD = d(th);
            boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.fa)).booleanValue();
            String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (zBooleanValue && (strZzg = zzf.zzg(d(th))) != null) {
                str2 = strZzg;
            }
            double d = f;
            double dRandom = Math.random();
            int i = f > 0.0f ? (int) (1.0f / f) : 1;
            if (dRandom < d) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zC = Wrappers.a(context).c();
                } catch (Throwable th4) {
                    zzo.zzg("Error fetching instant app info", th4);
                    zC = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    zzo.zzi("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zC)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i2 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i2));
                String str3 = Build.MANUFACTURER;
                String strT = Build.MODEL;
                if (!strT.startsWith(str3)) {
                    strT = vh.t(new StringBuilder(String.valueOf(str3).length() + 1 + strT.length()), str3, " ", strT);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", strT);
                VersionInfoParcel versionInfoParcel = this.e;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strD).appendQueryParameter("eids", TextUtils.join(",", zzbd.zzb().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "839961582").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(t42.c.g()));
                a.b.getClass();
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(yb0.a(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    builderAppendQueryParameter5.appendQueryParameter("hash", str2);
                }
                if (((Boolean) zzbd.zzc().a(p32.O8)).booleanValue() && (memoryInfoZze = zzf.zze(context)) != null) {
                    builderAppendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfoZze.availMem));
                    builderAppendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfoZze.totalMem));
                    builderAppendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfoZze.lowMemory ? "0" : "1");
                }
                if (((Boolean) zzbd.zzc().a(p32.N8)).booleanValue()) {
                    String str4 = this.g;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter5.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = this.h;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter5.appendQueryParameter("psv", str5);
                    }
                    if (i2 >= 26) {
                        packageInfoB = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoB = null;
                    } else {
                        try {
                            packageInfoB = Wrappers.a(context).b(128, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused2) {
                            packageInfoB = null;
                        }
                    }
                    if (packageInfoB != null) {
                        builderAppendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(packageInfoB.versionCode));
                        builderAppendQueryParameter5.appendQueryParameter("wvvn", packageInfoB.versionName);
                        builderAppendQueryParameter5.appendQueryParameter("wvpn", packageInfoB.packageName);
                    }
                }
                PackageInfo packageInfo = this.f;
                if (packageInfo != null) {
                    builderAppendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter5.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter5.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    this.d.execute(new s33(16, new zzu(context, null), (String) it.next()));
                }
            }
        }
    }
}
