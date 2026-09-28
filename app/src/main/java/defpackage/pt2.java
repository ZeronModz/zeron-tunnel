package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.os.RemoteException;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzfm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.a6;
import com.google.android.gms.internal.ads.vd;
import com.google.android.gms.internal.ads.x5;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzfhv;
import com.google.android.gms.internal.ads.zzfie;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzfub;
import com.google.android.gms.internal.ads.zzful;
import com.google.android.gms.internal.ads.zzfut;
import com.google.android.gms.internal.ads.zzfuu;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgqg;
import com.google.android.gms.internal.ads.zzpc;
import com.google.android.gms.internal.appset.a;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzw;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.net.HttpURLConnection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pt2 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public pt2(zzfub zzfubVar) {
        this.a = 8;
        this.b = zzfubVar.e;
    }

    private final void a() {
        vu2 vu2Var = (vu2) this.b;
        synchronized (vu2Var) {
            HashMap map = vu2Var.c;
            ArrayList arrayList = new ArrayList(map.keySet());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i);
                uu2 uu2Var = (uu2) map.get(scheduledFuture);
                if (uu2Var != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                    scheduledFuture.cancel(false);
                    map.remove(scheduledFuture);
                    vu2Var.a(Math.max(0L, uu2Var.b - zzt.zzk().currentTimeMillis()), uu2Var.a);
                }
            }
        }
    }

    private final /* synthetic */ void b() {
        lp2 lp2Var = (lp2) this.b;
        if (((zzgoj) lp2Var.i) != null) {
            ((zzgqg) lp2Var.d).a("Unbind from service.", new Object[0]);
            Context context = (Context) lp2Var.c;
            f13 f13Var = (f13) lp2Var.h;
            f13Var.getClass();
            context.unbindService(f13Var);
            lp2Var.a = false;
            lp2Var.i = null;
            lp2Var.h = null;
            ArrayList arrayList = (ArrayList) lp2Var.e;
            synchronized (arrayList) {
                arrayList.clear();
            }
        }
    }

    private final /* synthetic */ void c() {
        sk3 sk3Var = (sk3) this.b;
        Object obj = sk3Var.a;
        synchronized (obj) {
            try {
                if (sk3Var.m) {
                    return;
                }
                long j = sk3Var.l - 1;
                sk3Var.l = j;
                if (j > 0) {
                    return;
                }
                if (j >= 0) {
                    sk3Var.a();
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (obj) {
                    sk3Var.n = illegalStateException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        uu2 uu2Var;
        int i = 3;
        int i2 = 1;
        int i3 = 0;
        switch (this.a) {
            case 0:
                ((zzfhv) this.b).zzg();
                return;
            case 1:
                ((zzfie) this.b).d.zzdI(xg0.P(6, null, null));
                return;
            case 2:
                zzfk zzfkVar = (zzfk) this.b;
                if (zzfkVar.zzL() != null) {
                    try {
                        zzfkVar.zzL().zzc(1);
                        return;
                    } catch (RemoteException e) {
                        zzo.zzj("Could not notify onAdFailedToLoad event.", e);
                        return;
                    }
                }
                return;
            case 3:
                ((zzfm) this.b).zzb();
                return;
            case 4:
                uu2 uu2Var2 = (uu2) this.b;
                vu2 vu2Var = uu2Var2.d;
                synchronized (vu2Var) {
                    try {
                        ScheduledFuture scheduledFuture = uu2Var2.c;
                        uu2Var = scheduledFuture != null ? (uu2) vu2Var.c.remove(scheduledFuture) : null;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (uu2Var != null) {
                    uu2Var2.d.b.execute(uu2Var2.a);
                    return;
                }
                return;
            case 5:
                a();
                return;
            case 6:
                zzcbg zzcbgVar = (zzcbg) this.b;
                if (zzcbgVar != null) {
                    try {
                        zzcbgVar.zzf(1);
                        return;
                    } catch (RemoteException e2) {
                        zzo.zzl("#007 Could not call remote method.", e2);
                        return;
                    }
                }
                return;
            case 7:
                zzftd zzftdVar = (zzftd) this.b;
                AtomicBoolean atomicBoolean = zzftdVar.e;
                AudioManager audioManager = zzftdVar.c;
                int streamVolume = audioManager.getStreamVolume(3);
                int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                float f = 0.0f;
                if (streamMaxVolume > 0 && streamVolume > 0) {
                    f = streamVolume / streamMaxVolume;
                    if (f > 1.0f) {
                        f = 1.0f;
                    }
                }
                atomicBoolean.set(false);
                if (((Float) zzftdVar.d.getAndSet(Float.valueOf(f))).floatValue() != f) {
                    zzftdVar.a.post(new pl(this, f, i2));
                    return;
                }
                return;
            case 8:
                ((WebView) this.b).destroy();
                return;
            case 9:
                zzful zzfulVar = ((hw2) this.b).e;
                zzfuv zzfuvVar = new zzfuv(zzfulVar);
                zzfuu zzfuuVar = zzfulVar.b;
                zzfuuVar.getClass();
                zzfuvVar.a = zzfuuVar;
                ArrayDeque arrayDeque = zzfuuVar.b;
                arrayDeque.add(zzfuvVar);
                if (zzfuuVar.c == null) {
                    zzfut zzfutVar = (zzfut) arrayDeque.poll();
                    zzfuuVar.c = zzfutVar;
                    if (zzfutVar != null) {
                        zzfutVar.executeOnExecutor(zzfuuVar.a, new Object[0]);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((TaskCompletionSource) this.b).b(new rw2(new tw2()));
                return;
            case 11:
                ((HttpURLConnection) this.b).disconnect();
                return;
            case 12:
                x5 x5Var = (x5) this.b;
                a6 a6Var = (a6) x5Var.a.zzb();
                long j = x5Var.e;
                if (j > 0) {
                    a6Var.e.zza(new pt2(a6Var, 13), j);
                    return;
                } else {
                    a6Var.a();
                    return;
                }
            case 13:
                ((a6) this.b).a();
                return;
            case 14:
                l03 l03Var = (l03) this.b;
                ListenableFuture listenableFutureZzc = l03Var.c.zzc(new us2(l03Var, 10));
                l03Var.b.e(53, listenableFutureZzc);
                l03Var.f = listenableFutureZzc;
                return;
            case 15:
                ((m03) this.b).a();
                return;
            case 16:
                ((q03) this.b).b();
                return;
            case 17:
                lp2 lp2Var = (lp2) ((f13) this.b).b;
                ((zzgqg) lp2Var.d).a("unlinkToDeath", new Object[0]);
                zzgoj zzgojVar = (zzgoj) lp2Var.i;
                zzgojVar.getClass();
                zzgojVar.asBinder().unlinkToDeath((s21) lp2Var.g, 0);
                lp2Var.i = null;
                lp2Var.a = false;
                return;
            case 18:
                b();
                return;
            case 19:
                ((zzj) this.b).zzR();
                return;
            case 20:
                ((d43) this.b).a.I();
                return;
            case 21:
                Context context = ((a) this.b).a;
                long j2 = a.a(context).getLong("app_set_id_last_used_time", -1L);
                long j3 = j2 != -1 ? j2 + 33696000000L : -1L;
                if (j3 == -1 || System.currentTimeMillis() <= j3) {
                    return;
                }
                if (!a.a(context).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    if (strValueOf.length() != 0) {
                        "Failed to clear app set ID generated for App ".concat(strValueOf);
                    }
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                if (strValueOf2.length() != 0) {
                    "Failed to clear app set ID last used time for App ".concat(strValueOf2);
                    return;
                }
                return;
            case 22:
                z zVar = ((qh3) this.b).c;
                zVar.l(new ComponentName(zVar.a.a, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 23:
                zzpc zzpcVar = (zzpc) this.b;
                zzpcVar.a(zzpcVar.b(), 1028, new ni3(2));
                zzpcVar.f.e();
                return;
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                z zVar2 = ((qh3) ((wn2) this.b).c).c;
                q qVar = zVar2.a.g;
                r.h(qVar);
                qVar.j(new ph3(zVar2, i3));
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                vd vdVar = (vd) this.b;
                if (vdVar.U >= 300000) {
                    ((nk3) vdVar.l).a.Q0 = true;
                    vdVar.U = 0L;
                    return;
                }
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                r rVar = ((zzw) this.b).a;
                r.e(rVar.u);
                rVar.u.e(((Long) l.D.a(null)).longValue());
                return;
            case 27:
                c();
                return;
            default:
                r rVar2 = (r) this.b;
                h0 h0Var = rVar2.i;
                w wVar = rVar2.m;
                r.f(h0Var);
                h0Var.a();
                if (h0Var.w() != 1) {
                    m mVar = rVar2.f;
                    r.h(mVar);
                    mVar.i.a("registerTrigger called but app not eligible");
                    return;
                }
                r.g(wVar);
                wVar.a();
                u uVar = wVar.l;
                if (uVar != null) {
                    uVar.c();
                }
                r.g(wVar);
                new Thread(new nf3(wVar, i)).start();
                return;
        }
    }

    public /* synthetic */ pt2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public pt2(d43 d43Var, boolean z) {
        this.a = 20;
        this.b = d43Var;
    }
}
