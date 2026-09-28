package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.e5;
import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.q1;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzazc;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvh;
import com.google.android.gms.internal.ads.zzfvj;
import com.google.android.gms.internal.ads.zzfwq;
import com.google.android.gms.internal.ads.zzfwr;
import com.google.android.gms.internal.ads.zzfwv;
import com.google.android.gms.internal.ads.zzfwy;
import com.google.android.gms.internal.ads.zzfwz;
import com.google.android.gms.internal.ads.zzfxa;
import com.google.android.gms.internal.ads.zzian;
import com.google.android.gms.internal.ads.zzicg;
import com.google.android.gms.tasks.b;
import com.google.android.gms.tasks.g;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class e02 implements zzazc {
    public static e02 r;
    public final Context a;
    public final zzfwr b;
    public final zzfwy c;
    public final zzfxa d;
    public final r02 e;
    public final zzfvh f;
    public final Executor g;
    public final zzbch h;
    public final rb0 i;
    public final v02 k;
    public final zzbal l;
    public final zzbac m;
    public volatile boolean p;
    public volatile boolean q;
    public volatile long n = 0;
    public final Object o = new Object();
    public final CountDownLatch j = new CountDownLatch(1);

    public e02(Context context, zzfvh zzfvhVar, zzfwr zzfwrVar, zzfwy zzfwyVar, zzfxa zzfxaVar, r02 r02Var, Executor executor, zzfvc zzfvcVar, zzbch zzbchVar, v02 v02Var, zzbal zzbalVar, zzbac zzbacVar) {
        this.q = false;
        this.a = context;
        this.f = zzfvhVar;
        this.b = zzfwrVar;
        this.c = zzfwyVar;
        this.d = zzfxaVar;
        this.e = r02Var;
        this.g = executor;
        this.h = zzbchVar;
        this.k = v02Var;
        this.l = zzbalVar;
        this.m = zzbacVar;
        this.q = false;
        this.i = new rb0(24, this, zzfvcVar);
    }

    public static synchronized e02 d(Context context, ExecutorService executorService, zzfvj zzfvjVar, boolean z) {
        try {
            if (r == null) {
                zzfvh zzfvhVarA = zzfvh.a(context, executorService, z);
                h02 h02VarA = ((Boolean) zzbd.zzc().a(p32.j4)).booleanValue() ? h02.a(context) : null;
                v02 v02VarA = ((Boolean) zzbd.zzc().a(p32.k4)).booleanValue() ? v02.a(context, executorService) : null;
                zzbal zzbalVar = ((Boolean) zzbd.zzc().a(p32.s3)).booleanValue() ? new zzbal() : null;
                zzbac zzbacVar = ((Boolean) zzbd.zzc().a(p32.B3)).booleanValue() ? new zzbac() : null;
                t61 t61Var = new t61(context, executorService, zzfvhVarA, new e5());
                g gVarC = b.c(new us2(t61Var, 5), executorService);
                gVarC.c(executorService, new ca2(t61Var, 26));
                t61Var.e = gVarC;
                q02 q02Var = new q02(context);
                r02 r02Var = new r02(zzfvjVar, t61Var, new zzbar(context, q02Var), q02Var, h02VarA, v02VarA, zzbalVar, zzbacVar);
                zzbch zzbchVarV = l02.V(context, zzfvhVarA);
                zzfvc zzfvcVar = new zzfvc();
                e02 e02Var = new e02(context, zzfvhVarA, new zzfwr(context, zzbchVarV), new zzfwy(context, zzbchVarV, new nx2(zzfvhVarA, 22), ((Boolean) zzbd.zzc().a(p32.c3)).booleanValue()), new zzfxa(context, r02Var, zzfvhVarA, zzfvcVar, false), r02Var, executorService, zzfvcVar, zzbchVarV, v02VarA, zzbalVar, zzbacVar);
                r = e02Var;
                e02Var.a();
                r.b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return r;
    }

    public final synchronized void a() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfwq zzfwqVarE = e();
        if (zzfwqVarE == null) {
            this.f.b(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.d.a(zzfwqVarE)) {
            this.q = true;
            this.j.countDown();
        }
    }

    public final void b() {
        if (this.p) {
            return;
        }
        synchronized (this.o) {
            try {
                if (!this.p) {
                    if ((System.currentTimeMillis() / 1000) - this.n < 3600) {
                        return;
                    }
                    zzfwq zzfwqVarC = this.d.c();
                    if ((zzfwqVarC == null || zzfwqVarC.a.w() - (System.currentTimeMillis() / 1000) < 3600) && l02.T(this.h)) {
                        this.g.execute(new vn1(this, 7));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        String strV;
        String strZzb;
        int length;
        zzfwq zzfwqVarE;
        q1 q1Var;
        boolean zA;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfwq zzfwqVarE2 = e();
        if (zzfwqVarE2 != null) {
            strV = zzfwqVarE2.a.v();
            strZzb = zzfwqVarE2.a.zzb();
        } else {
            strV = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.a;
                zzbch zzbchVar = this.h;
                zzfvh zzfvhVar = this.f;
                zzfwv zzfwvVarE = z.e(context, zzbchVar, strV, strZzb, zzfvhVar);
                byte[] bArr = zzfwvVarE.b;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfvhVar.b(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzian zzianVarZzs = zzian.zzs(bArr, 0, length);
                        gd3 gd3Var = gd3.b;
                        int i = wc3.a;
                        n1 n1VarX = n1.x(zzianVarZzs, gd3.c);
                        if (n1VarX.v().v().isEmpty() || n1VarX.v().zzb().isEmpty() || n1VarX.zzc().zzy().length == 0 || ((zzfwqVarE = e()) != null && (q1Var = zzfwqVarE.a) != null && n1VarX.v().v().equals(q1Var.v()) && n1VarX.v().zzb().equals(q1Var.zzb()))) {
                            this.f.b(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            rb0 rb0Var = this.i;
                            int i2 = zzfwvVarE.c;
                            if (!((Boolean) zzbd.zzc().a(p32.a3)).booleanValue()) {
                                zA = this.b.a(n1VarX, rb0Var);
                            } else if (i2 == 3) {
                                zA = this.c.b(n1VarX);
                            } else {
                                if (i2 == 4) {
                                    zA = this.c.a(n1VarX, rb0Var);
                                }
                                this.f.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zA) {
                                zzfwq zzfwqVarE3 = e();
                                if (zzfwqVarE3 != null) {
                                    if (this.d.a(zzfwqVarE3)) {
                                        this.q = true;
                                    }
                                    this.n = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.f.b(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.f.b(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (Throwable th) {
                this.j.countDown();
                throw th;
            }
        } catch (zzicg e) {
            this.f.c(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
        this.j.countDown();
    }

    public final zzfwq e() {
        if (l02.T(this.h)) {
            if (((Boolean) zzbd.zzc().a(p32.a3)).booleanValue()) {
                zzfwy zzfwyVar = this.c;
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (zzfwy.f) {
                    try {
                        q1 q1VarF = zzfwyVar.f(1);
                        if (q1VarF == null) {
                            zzfwyVar.e(4022, jCurrentTimeMillis);
                            return null;
                        }
                        File fileC = zzfwyVar.c(q1VarF.v());
                        File file = new File(fileC, "pcam.jar");
                        if (!file.exists()) {
                            file = new File(fileC, "pcam");
                        }
                        File file2 = new File(fileC, "pcbc");
                        File file3 = new File(fileC, "pcopt");
                        zzfwyVar.e(5016, jCurrentTimeMillis);
                        return new zzfwq(q1VarF, file, file2, file3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            zzfwr zzfwrVar = this.b;
            q1 q1VarB = zzfwrVar.b(1);
            if (q1VarB != null) {
                String strV = q1VarB.v();
                File fileA = sb2.A(strV, zzfwrVar.c(), "pcam.jar");
                if (!fileA.exists()) {
                    fileA = sb2.A(strV, zzfwrVar.c(), "pcam");
                }
                return new zzfwq(q1VarB, fileA, sb2.A(strV, zzfwrVar.c(), "pcbc"), sb2.A(strV, zzfwrVar.c(), "pcopt"));
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzd(MotionEvent motionEvent) {
        to2 to2VarB = this.d.b();
        if (to2VarB != null) {
            try {
                to2VarB.zzd(null, motionEvent);
            } catch (zzfwz e) {
                this.f.c(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zze(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) zzbd.zzc().a(p32.ud)).booleanValue() || (displayMetrics = this.a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, String str, View view, Activity activity) {
        v02 v02Var = this.k;
        if (v02Var != null && v02Var.d) {
            v02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) zzbd.zzc().a(p32.s3)).booleanValue()) {
            zzbal zzbalVar = this.l;
            zzbalVar.h = zzbalVar.g;
            zzbalVar.g = SystemClock.uptimeMillis();
        }
        b();
        to2 to2VarB = this.d.b();
        if (to2VarB == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = to2VarB.zzc(context, null, str, view, activity);
        this.f.e(5000, System.currentTimeMillis() - jCurrentTimeMillis, null, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzh(View view) {
        this.e.c.a(view);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbac zzbacVar = this.m;
        if (zzbacVar != null) {
            zzbacVar.a = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, View view, Activity activity) {
        v02 v02Var = this.k;
        if (v02Var != null && v02Var.d) {
            v02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) zzbd.zzc().a(p32.s3)).booleanValue()) {
            this.l.a(context, view);
        }
        b();
        to2 to2VarB = this.d.b();
        if (to2VarB == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = to2VarB.zzb(context, null, view, activity);
        this.f.e(5002, System.currentTimeMillis() - jCurrentTimeMillis, null, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        v02 v02Var = this.k;
        if (v02Var != null && v02Var.d) {
            v02Var.b = System.currentTimeMillis();
        }
        if (((Boolean) zzbd.zzc().a(p32.s3)).booleanValue()) {
            zzbal zzbalVar = this.l;
            zzbalVar.b = zzbalVar.a;
            zzbalVar.a = SystemClock.uptimeMillis();
        }
        b();
        to2 to2VarB = this.d.b();
        if (to2VarB == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = to2VarB.zza(context, null);
        this.f.e(5001, System.currentTimeMillis() - jCurrentTimeMillis, null, strZza, null);
        return strZza;
    }
}
