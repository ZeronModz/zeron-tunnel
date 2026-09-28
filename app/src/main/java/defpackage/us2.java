package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import androidx.concurrent.futures.b;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.k5;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzfbk;
import com.google.android.gms.internal.ads.zzfbm;
import com.google.android.gms.internal.ads.zzfct;
import com.google.android.gms.internal.ads.zzfcw;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfna;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgct;
import com.google.android.gms.internal.ads.zzgfe;
import com.google.android.gms.internal.ads.zzgfx;
import com.google.android.gms.internal.ads.zzika;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.o;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzlp;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class us2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ us2(u33 u33Var) {
        this.a = 2;
        u33 u33Var2 = u33.b;
        this.b = u33Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        int i;
        boolean zIsActiveNetworkMetered;
        int i2;
        boolean z = false;
        switch (this.a) {
            case 0:
                return ((vs2) this.b).a();
            case 1:
                Context context = ((zzfbm) this.b).b;
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                zzt.zzc();
                int iOrdinal = -1;
                if (zzs.zzF(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                        i2 = type;
                    } else {
                        i2 = -1;
                    }
                    zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                    i = i2;
                } else {
                    i = -2;
                    zIsActiveNetworkMetered = false;
                }
                return new zzfbk(networkOperator, i, zzt.zzf().zzm(context), phoneType, zIsActiveNetworkMetered, iOrdinal);
            case 2:
                String str = (String) ((u33) this.b).a;
                u33 u33Var = u33.b;
                return new zzfct(str, null);
            case 3:
                return new zzfcx(((zzfcw) this.b).b);
            case 4:
                ((zzfna) this.b).zza();
                return null;
            case 5:
                Context context2 = (Context) ((t61) this.b).b;
                return z.d(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
            case 6:
                oy2 oy2Var = (oy2) this.b;
                ((zzgfe) oy2Var.c.zzb()).a();
                ((zzgfx) oy2Var.b.zzb()).zza();
                return null;
            case 7:
                return ((zzika) this.b).zzb();
            case 8:
                d6 d6Var = (d6) this.b;
                f6 f6Var = d6Var.i;
                zzgct zzgctVar = d6Var.b;
                zzgct zzgctVar2 = d6Var.d;
                zzika zzikaVar = d6Var.f;
                try {
                    File file = zzgctVar.a;
                    if (file.exists()) {
                        File file2 = ((zzgct) zzikaVar.zzb()).a;
                        File file3 = ((zzgct) d6Var.e.zzb()).a;
                        try {
                            if (file2.exists()) {
                                File parentFile = file3.getParentFile();
                                if (parentFile != null) {
                                    sb2.L(parentFile);
                                }
                                k02.I(file3);
                                k02.L(file2, file3);
                            }
                            File file4 = zzgctVar2.a;
                            File file5 = d6Var.c.a;
                            try {
                                if (file4.exists()) {
                                    k02.I(file5);
                                    k02.L(file4, file5);
                                }
                                File file6 = d6Var.a.a;
                                try {
                                    if (file.exists()) {
                                        k02.I(file6);
                                        k02.L(file, file6);
                                    }
                                    file.delete();
                                    ((zzgct) zzikaVar.zzb()).a.delete();
                                    zzgctVar2.a.delete();
                                    z = true;
                                } catch (IOException | SecurityException e) {
                                    f6Var.d(15313, e);
                                    zzgctVar.a.delete();
                                    ((zzgct) zzikaVar.zzb()).a.delete();
                                    zzgctVar2.a.delete();
                                }
                            } catch (IOException | SecurityException e2) {
                                f6Var.d(15312, e2);
                            }
                            break;
                        } catch (IOException e3) {
                            e = e3;
                            f6Var.d(15311, e);
                            zzgctVar.a.delete();
                            ((zzgct) zzikaVar.zzb()).a.delete();
                            zzgctVar2.a.delete();
                            return new Boolean(z);
                        } catch (SecurityException e4) {
                            e = e4;
                            f6Var.d(15311, e);
                            zzgctVar.a.delete();
                            ((zzgct) zzikaVar.zzb()).a.delete();
                            zzgctVar2.a.delete();
                            return new Boolean(z);
                        }
                        return new Boolean(z);
                    }
                    file.delete();
                    ((zzgct) zzikaVar.zzb()).a.delete();
                    zzgctVar2.a.delete();
                    return new Boolean(z);
                } catch (Throwable th) {
                    zzgctVar.a.delete();
                    ((zzgct) zzikaVar.zzb()).a.delete();
                    zzgctVar2.a.delete();
                    throw th;
                }
            case 9:
                k03 k03Var = (k03) this.b;
                ny1 ny1Var = new ny1(k03Var, 15);
                synchronized (k03Var) {
                    f6 f6Var2 = k03Var.b;
                    Context context3 = k03Var.a;
                    k5 k5Var = k03Var.c;
                    b bVar = new b();
                    bVar.c = new n31();
                    oh ohVar = new oh(bVar);
                    bVar.b = ohVar;
                    bVar.a = j03.class;
                    try {
                        k03.b(context3, k5Var, bVar);
                        bVar.a = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                    } catch (Exception e5) {
                        ohVar.a(e5);
                    }
                    j33 j33VarB0 = z.b0(ohVar, ny1Var, k03Var.d);
                    f6Var2.e(52, j33VarB0);
                    k03Var.f = j33VarB0;
                    break;
                }
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            case 10:
                Context context4 = ((l03) this.b).a;
                try {
                    return z.d(context4, context4.getPackageName(), Integer.toString(context4.getPackageManager().getPackageInfo(context4.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            case 11:
                p03 p03Var = (p03) this.b;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                p03Var.a.registerReceiver(p03Var, intentFilter);
                return null;
            case 12:
                return new com.google.android.gms.internal.measurement.zzt(((o) this.b).k);
            case 13:
                g0 g0Var = ((zzjd) this.b).a;
                g0Var.w();
                zzlp zzlpVar = g0Var.h;
                g0.P(zzlpVar);
                zzlpVar.a();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                zzfyn zzfynVar = zzs.zza;
                zzt.zzc();
                return zzs.zzV((Uri) this.b);
        }
    }

    public /* synthetic */ us2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public us2(zzjd zzjdVar, zzbg zzbgVar, String str) {
        this.a = 13;
        this.b = zzjdVar;
    }
}
