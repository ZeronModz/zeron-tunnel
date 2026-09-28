package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfot;
import java.util.ArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bv2 implements Runnable {
    public final zzfor b;
    public String c;
    public String e;
    public zt2 f;
    public zze g;
    public ScheduledFuture h;
    public final ArrayList a = new ArrayList();
    public int i = 2;
    public zzfot d = zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public bv2(zzfor zzforVar) {
        this.b = zzforVar;
    }

    public final synchronized void a(zzfoe zzfoeVar) {
        try {
            if (((Boolean) d42.c.g()).booleanValue()) {
                ArrayList arrayList = this.a;
                zzfoeVar.zzc();
                arrayList.add(zzfoeVar);
                ScheduledFuture scheduledFuture = this.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.h = g3.d.schedule(this, ((Integer) zzbd.zzc().a(p32.da)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(ArrayList arrayList) {
        try {
            if (((Boolean) d42.c.g()).booleanValue()) {
                if (arrayList.contains("banner") || arrayList.contains(AdFormat.BANNER.name())) {
                    this.i = 3;
                } else if (arrayList.contains("interstitial") || arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    this.i = 4;
                } else if (arrayList.contains("native") || arrayList.contains(AdFormat.NATIVE.name())) {
                    this.i = 8;
                } else if (arrayList.contains("rewarded") || arrayList.contains(AdFormat.REWARDED.name())) {
                    this.i = 5;
                } else if (arrayList.contains("app_open_ad")) {
                    this.i = 7;
                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                    this.i = 6;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(String str) {
        boolean zMatches;
        if (((Boolean) d42.c.g()).booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                zMatches = false;
            } else {
                zMatches = Pattern.matches((String) zzbd.zzc().a(p32.ea), str);
            }
            if (zMatches) {
                this.c = str;
            }
        }
    }

    public final synchronized void d(Bundle bundle) {
        if (((Boolean) d42.c.g()).booleanValue()) {
            this.d = zzaa.zzd(bundle);
        }
    }

    public final synchronized void e(zt2 zt2Var) {
        if (((Boolean) d42.c.g()).booleanValue()) {
            this.f = zt2Var;
        }
    }

    public final synchronized void f(zze zzeVar) {
        if (((Boolean) d42.c.g()).booleanValue()) {
            this.g = zzeVar;
        }
    }

    public final synchronized void g(String str) {
        if (((Boolean) d42.c.g()).booleanValue()) {
            this.e = str;
        }
    }

    public final synchronized void h() {
        try {
            if (((Boolean) d42.c.g()).booleanValue()) {
                ScheduledFuture scheduledFuture = this.h;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                ArrayList<zzfoe> arrayList = this.a;
                for (zzfoe zzfoeVar : arrayList) {
                    int i = this.i;
                    if (i != 2) {
                        zzfoeVar.zzp(i);
                    }
                    if (!TextUtils.isEmpty(this.c)) {
                        zzfoeVar.zze(this.c);
                    }
                    if (!TextUtils.isEmpty(this.e) && !zzfoeVar.zzl()) {
                        zzfoeVar.zzi(this.e);
                    }
                    zt2 zt2Var = this.f;
                    if (zt2Var != null) {
                        zzfoeVar.zzg(zt2Var);
                    } else {
                        zze zzeVar = this.g;
                        if (zzeVar != null) {
                            zzfoeVar.zzh(zzeVar);
                        }
                    }
                    zzfoeVar.zzf(this.d);
                    this.b.b(zzfoeVar.zzm());
                }
                arrayList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i(int i) {
        if (((Boolean) d42.c.g()).booleanValue()) {
            this.i = i;
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        h();
    }
}
