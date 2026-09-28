package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.j0;
import com.google.android.gms.internal.ads.pa;
import com.google.android.gms.internal.ads.q0;
import com.google.android.gms.internal.ads.zzgdq;
import com.google.android.gms.internal.ads.zzguf;
import com.google.android.gms.internal.ads.zzibq;
import com.google.android.gms.internal.ads.zzibr;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jy2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzgdq b;

    public /* synthetic */ jy2(zzgdq zzgdqVar, int i) {
        this.a = i;
        this.b = zzgdqVar;
    }

    private final void a() {
        int i;
        zzgdq zzgdqVar = this.b;
        if (!zzgdqVar.e || zzgdqVar.l.getAndSet(true)) {
            return;
        }
        Context context = zzgdqVar.a;
        String str = zzgdqVar.j;
        double d = zzgdqVar.i;
        long j = zzgdqVar.k;
        Locale locale = Locale.getDefault();
        oz1 oz1VarV = j0.v();
        long j2 = Build.VERSION.SDK_INT;
        oz1VarV.d();
        ((j0) oz1VarV.b).y(j2);
        String str2 = Build.MODEL;
        oz1VarV.d();
        ((j0) oz1VarV.b).z(str2);
        String language = locale.getLanguage();
        oz1VarV.d();
        ((j0) oz1VarV.b).A(language);
        String country = locale.getCountry();
        oz1VarV.d();
        ((j0) oz1VarV.b).B(country);
        oz1VarV.d();
        ((j0) oz1VarV.b).E(str);
        String packageName = context.getPackageName();
        oz1VarV.d();
        ((j0) oz1VarV.b).C(packageName);
        oz1VarV.d();
        ((j0) oz1VarV.b).H(j);
        if (d > 0.0d) {
            oz1VarV.d();
            ((j0) oz1VarV.b).G((int) (1.0d / d));
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            long j3 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            oz1VarV.d();
            ((j0) oz1VarV.b).D(j3);
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                i = 5;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                i = 4;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                i = 7;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                i = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
            }
            oz1VarV.d();
            ((j0) oz1VarV.b).I(i);
        } catch (RuntimeException unused2) {
        }
        j0 j0Var = (j0) oz1VarV.e();
        synchronized (zzgdqVar.m) {
            zzgdqVar.p.f(j0Var);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        oz1 oz1Var;
        zzguf zzgufVarZzq;
        String string;
        switch (this.a) {
            case 0:
                a();
                return;
            default:
                zzgdq zzgdqVar = this.b;
                synchronized (zzgdqVar.m) {
                    oz1 oz1Var2 = zzgdqVar.p;
                    zzibr zzibrVar = oz1Var2.a;
                    zzibrVar.getClass();
                    pa paVar = (pa) zzibrVar.r(zzibq.NEW_BUILDER, null);
                    boolean zF = oz1Var2.b.f();
                    zzibr zzibrVar2 = oz1Var2.b;
                    if (zF) {
                        zzibrVar2.m();
                        zzibrVar2 = oz1Var2.b;
                    }
                    paVar.b = zzibrVar2;
                    oz1Var = (oz1) paVar;
                    break;
                }
                synchronized (zzgdqVar.n) {
                    ArrayList arrayList = zzgdqVar.q;
                    zzgufVarZzq = zzguf.zzq(arrayList);
                    arrayList.clear();
                    zzgdqVar.r = false;
                    break;
                }
                int size = zzgufVarZzq.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    iy2 iy2Var = (iy2) zzgufVarZzq.get(i);
                    if (i2 >= zzgdqVar.g) {
                        zzgdqVar.a((j0) oz1Var.e());
                        oz1Var.d();
                        ((j0) oz1Var.b).x();
                        i2 = 0;
                    }
                    uz1 uz1VarV = q0.v();
                    long j = iy2Var.a;
                    uz1VarV.d();
                    ((q0) uz1VarV.b).w(j);
                    long j2 = iy2Var.b;
                    uz1VarV.d();
                    ((q0) uz1VarV.b).x(j2);
                    long j3 = iy2Var.e;
                    uz1VarV.d();
                    ((q0) uz1VarV.b).A(j3);
                    String str = iy2Var.d;
                    if (str != null) {
                        uz1VarV.d();
                        ((q0) uz1VarV.b).B(str);
                    }
                    Throwable th = iy2Var.c;
                    int i3 = th == null ? 2 : 3;
                    uz1VarV.d();
                    ((q0) uz1VarV.b).C(i3);
                    if (th != null) {
                        String name = th.getClass().getName();
                        uz1VarV.d();
                        ((q0) uz1VarV.b).y(name);
                        try {
                            StringWriter stringWriter = new StringWriter();
                            try {
                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                try {
                                    th.printStackTrace(printWriter);
                                    string = stringWriter.toString();
                                    printWriter.close();
                                    stringWriter.close();
                                } catch (Throwable th2) {
                                    try {
                                        printWriter.close();
                                        break;
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            } finally {
                            }
                        } catch (IOException unused) {
                            string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        uz1VarV.d();
                        ((q0) uz1VarV.b).z(string);
                    }
                    q0 q0Var = (q0) uz1VarV.e();
                    oz1Var.d();
                    ((j0) oz1Var.b).w(q0Var);
                    i++;
                    i2++;
                }
                if (i2 > 0) {
                    zzgdqVar.a((j0) oz1Var.e());
                    oz1Var.d();
                    ((j0) oz1Var.b).x();
                    return;
                }
                return;
        }
    }
}
