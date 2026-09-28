package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzf;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.a;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.eb;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.p4;
import com.google.android.gms.internal.ads.q4;
import com.google.android.gms.internal.ads.r4;
import com.google.android.gms.internal.ads.sd;
import com.google.android.gms.internal.ads.zzbqn;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzckr;
import com.google.android.gms.internal.ads.zzdoc;
import com.google.android.gms.internal.ads.zzdoh;
import com.google.android.gms.internal.ads.zzdpg;
import com.google.android.gms.internal.ads.zzdqe;
import com.google.android.gms.internal.ads.zzdvl;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzeak;
import com.google.android.gms.internal.ads.zzelg;
import com.google.android.gms.internal.ads.zzesm;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfgv;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfot;
import com.google.android.gms.internal.ads.zzfsa;
import com.google.android.gms.internal.ads.zzfsj;
import com.google.android.gms.internal.ads.zzfsq;
import com.google.android.gms.internal.ads.zzfsu;
import com.google.android.gms.internal.ads.zzgoj;
import com.google.android.gms.internal.ads.zzgqg;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.z;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.trilead.ssh2.sftp.ErrorCodes;
import java.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qj2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public qj2(z zVar, zzlu zzluVar) {
        this.a = 23;
        this.b = zzluVar;
        Objects.requireNonNull(zVar);
        this.c = zVar;
    }

    private final void a() {
        zzfsa zzfsaVar = (zzfsa) this.c;
        zze zzeVar = (zze) this.b;
        synchronized (zzfsaVar) {
            zzch zzchVar = zzfsaVar.i;
            if (zzchVar != null) {
                try {
                    zzchVar.zzg(zzfsaVar.l, zzeVar);
                } catch (RemoteException unused) {
                    zzo.zzi("Failed to call onAdFailedToPreload");
                }
            }
        }
    }

    private final void b() {
        Object t03Var;
        zzgoj zzgojVar;
        IBinder iBinder = (IBinder) this.c;
        int i = u03.a;
        if (iBinder == null) {
            t03Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            t03Var = iInterfaceQueryLocalInterface instanceof zzgoj ? (zzgoj) iInterfaceQueryLocalInterface : new t03(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        }
        f13 f13Var = (f13) this.b;
        lp2 lp2Var = (lp2) f13Var.b;
        lp2Var.i = t03Var;
        ((zzgqg) lp2Var.d).a("linkToDeath", new Object[0]);
        try {
            zzgojVar = (zzgoj) lp2Var.i;
        } catch (RemoteException e) {
            ((zzgqg) ((lp2) f13Var.b).d).d(e, "linkToDeath failed", new Object[0]);
        }
        if (zzgojVar == null) {
            throw null;
        }
        zzgojVar.asBinder().linkToDeath((s21) lp2Var.g, 0);
        lp2 lp2Var2 = (lp2) f13Var.b;
        lp2Var2.a = false;
        synchronized (((ArrayList) lp2Var2.e)) {
            try {
                Iterator it = ((ArrayList) lp2Var2.e).iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                ((ArrayList) lp2Var2.e).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        qh3 qh3Var = (qh3) this.c;
        synchronized (qh3Var) {
            try {
                qh3Var.a = false;
                z zVar = qh3Var.c;
                if (!zVar.r()) {
                    m mVar = zVar.a.f;
                    r.h(mVar);
                    mVar.m.a("Connected to remote service");
                    zzgb zzgbVar = (zzgb) this.b;
                    zVar.a();
                    yg0.m(zzgbVar);
                    zVar.d = zzgbVar;
                    zVar.n();
                    zVar.p();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z zVar2 = ((qh3) this.c).c;
        ScheduledExecutorService scheduledExecutorService = zVar2.g;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            zVar2.g = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        g82 g82Var;
        switch (this.a) {
            case 0:
                ((zzdoc) this.b).j((zzdqe) this.c);
                return;
            case 1:
                zzdpg zzdpgVar = (zzdpg) this.b;
                ViewGroup viewGroup = (ViewGroup) this.c;
                cu2 cu2Var = zzdpgVar.b;
                zzg zzgVar = zzdpgVar.a;
                zzdoh zzdohVar = zzdpgVar.d;
                if (zzdohVar.f() != null) {
                    boolean z = viewGroup != null;
                    if (zzdohVar.M() == 2 || zzdohVar.M() == 1) {
                        zzgVar.zzr(cu2Var.g, String.valueOf(zzdohVar.M()), z);
                        return;
                    } else {
                        if (zzdohVar.M() == 6) {
                            String str = cu2Var.g;
                            zzgVar.zzr(str, "2", z);
                            zzgVar.zzr(str, "1", z);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 2:
                ((zzdye) this.b).d.zzc((String) this.c, null);
                return;
            case 3:
                zzf.zzf((zzdxz) this.b, "cld_r", zzt.zzk().elapsedRealtime() - ((Long) this.c).longValue());
                return;
            case 4:
                try {
                    ((zzbqn) this.c).zzb(((zzeak) this.b).b());
                    return;
                } catch (RemoteException e) {
                    zzo.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
                    return;
                }
            case 5:
                if (((Boolean) zzbd.zzc().a(p32.j6)).booleanValue() && yv2.a.a) {
                    ((zzfsj) this.b).d((View) this.c, zzfsq.NOT_VISIBLE);
                    return;
                }
                return;
            case 6:
                aw2 aw2Var = (aw2) this.b;
                zzfsu zzfsuVar = (zzfsu) this.c;
                Iterator it = aw2Var.d.values().iterator();
                while (it.hasNext()) {
                    ((zzfsj) it.next()).c();
                }
                Timer timer = new Timer();
                timer.schedule(new zo2(aw2Var, zzfsuVar, timer), 1000L);
                return;
            case 7:
                zzelg zzelgVar = (zzelg) this.b;
                zzcjl zzcjlVar = (zzcjl) this.c;
                zzcjlVar.zzJ();
                cu2 cu2Var2 = zzelgVar.d;
                zzckr zzckrVarZzh = zzcjlVar.zzh();
                zzga zzgaVar = cu2Var2.a;
                if (zzgaVar != null && zzckrVarZzh != null) {
                    zzckrVarZzh.a(zzgaVar);
                }
                if (!((Boolean) zzbd.zzc().a(p32.P1)).booleanValue() || zzcjlVar.isAttachedToWindow()) {
                    return;
                }
                zzcjlVar.onPause();
                zzcjlVar.zzaG(true);
                return;
            case 8:
                ((zzen) this.b).zzD((IObjectWrapper) this.c);
                return;
            case 9:
                ((zzesm) ((wl0) this.b).f).d.c.zzdI((zze) this.c);
                return;
            case 10:
                ((zzfff) this.b).d.zzdI((zze) this.c);
                return;
            case 11:
                ((zzfgv) ((wl0) this.b).f).e.zzdI((zze) this.c);
                return;
            case 12:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.c;
                InputStream inputStream = (InputStream) this.b;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                        try {
                            mc2.k(inputStream, autoCloseOutputStream, false);
                            autoCloseOutputStream.close();
                            inputStream.close();
                            return;
                        } finally {
                        }
                    } catch (IOException unused) {
                        return;
                    }
                } finally {
                }
            case 13:
                zzfor zzforVar = (zzfor) this.b;
                av2 av2Var = (av2) this.c;
                synchronized (zzfor.m) {
                    try {
                        if (!zzforVar.i) {
                            zzforVar.i = true;
                            if (zzfor.a()) {
                                try {
                                    zzt.zzc();
                                    zzforVar.d = zzs.zzt(zzforVar.a);
                                } catch (RemoteException | RuntimeException e2) {
                                    zzt.zzh().f("CuiMonitor.gettingAppIdFromManifest", e2);
                                }
                                a aVar = a.b;
                                Context context = zzforVar.a;
                                aVar.getClass();
                                zzforVar.e = yb0.a(context);
                                int iIntValue = ((Integer) zzbd.zzc().a(p32.ba)).intValue();
                                if (((Boolean) zzbd.zzc().a(p32.pd)).booleanValue()) {
                                    long j = iIntValue;
                                    g3.d.scheduleWithFixedDelay(zzforVar, j, j, TimeUnit.MILLISECONDS);
                                } else {
                                    long j2 = iIntValue;
                                    g3.d.scheduleAtFixedRate(zzforVar, j2, j2, TimeUnit.MILLISECONDS);
                                }
                                l32 l32Var = p32.ha;
                                if (((Boolean) zzbd.zzc().a(l32Var)).booleanValue()) {
                                    lc2 lc2Var = zzforVar.h;
                                    lc2Var.getClass();
                                    if (((Boolean) zzbd.zzc().a(l32Var)).booleanValue() && !lc2Var.e.getAndSet(true)) {
                                        lc2Var.a();
                                    }
                                }
                                break;
                            }
                        }
                    } finally {
                    }
                }
                if (zzfor.a() && av2Var != null) {
                    synchronized (zzfor.l) {
                        try {
                            dv2 dv2Var = zzforVar.c;
                            if (((r4) dv2Var.b).v() >= ((Integer) zzbd.zzc().a(p32.ca)).intValue()) {
                                return;
                            }
                            cv2 cv2VarX = p4.x();
                            int i = av2Var.m;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).T(i);
                            boolean z2 = av2Var.b;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).y(z2);
                            long j3 = av2Var.a;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).z(j3);
                            cv2VarX.d();
                            ((p4) cv2VarX.b).U();
                            String str2 = zzforVar.b.afmaVersion;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).B(str2);
                            String str3 = zzforVar.d;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).C(str3);
                            String str4 = Build.VERSION.RELEASE;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).D(str4);
                            int i2 = Build.VERSION.SDK_INT;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).E(i2);
                            int i3 = av2Var.o;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).v(i3);
                            int i4 = av2Var.c;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).G(i4);
                            long j4 = zzforVar.e;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).H(j4);
                            int i5 = av2Var.n;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).w(i5);
                            String str5 = av2Var.d;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).I(str5);
                            String str6 = av2Var.e;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).J(str6);
                            String str7 = av2Var.f;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).K(str7);
                            zzdvl zzdvlVarB = zzforVar.f.b(av2Var.f);
                            String string = (zzdvlVarB == null || (g82Var = zzdvlVarB.b) == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : g82Var.toString();
                            cv2VarX.d();
                            ((p4) cv2VarX.b).L(string);
                            String str8 = av2Var.g;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).M(str8);
                            zzfot zzfotVar = av2Var.h;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).Q(zzfotVar);
                            String str9 = av2Var.k;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).P(str9);
                            String str10 = av2Var.i;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).N(str10);
                            String str11 = av2Var.j;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).O(str11);
                            long j5 = av2Var.l;
                            cv2VarX.d();
                            ((p4) cv2VarX.b).A(j5);
                            if (((Boolean) zzbd.zzc().a(p32.ga)).booleanValue()) {
                                List list = zzforVar.g;
                                cv2VarX.d();
                                ((p4) cv2VarX.b).F(list);
                            }
                            if (((Boolean) zzbd.zzc().a(p32.ha)).booleanValue()) {
                                lc2 lc2Var2 = zzforVar.h;
                                eb ebVar = lc2Var2.b;
                                String str12 = lc2Var2.a;
                                if (ebVar != null) {
                                    cv2VarX.d();
                                    ((p4) cv2VarX.b).R(ebVar);
                                }
                                if (str12 != null) {
                                    cv2VarX.d();
                                    ((p4) cv2VarX.b).S(str12);
                                }
                            }
                            ev2 ev2VarV = q4.v();
                            ev2VarV.d();
                            ((q4) ev2VarV.b).w((p4) cv2VarX.e());
                            dv2Var.d();
                            ((r4) dv2Var.b).x((q4) ev2VarV.e());
                            return;
                        } finally {
                        }
                    }
                }
                return;
            case 14:
                a();
                return;
            case 15:
                ((TaskCompletionSource) this.c).b(rw2.a((Context) this.b, "GLAS"));
                return;
            case 16:
                b();
                return;
            case 17:
                lp2 lp2Var = (lp2) this.b;
                try {
                    ((Runnable) this.c).run();
                    return;
                } catch (RuntimeException e3) {
                    ((zzgqg) lp2Var.d).c("error caused by ", e3);
                    return;
                }
            case 18:
                y63 y63Var = (y63) this.c;
                r rVar = (r) y63Var.b.b;
                q qVar = rVar.g;
                r.h(qVar);
                qVar.a();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", y63Var.a);
                try {
                    if (((zzbq) this.b).zze(bundle) == null) {
                        m mVar = rVar.f;
                        r.h(mVar);
                        mVar.f.a("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e4) {
                    m mVar2 = rVar.f;
                    r.h(mVar2);
                    mVar2.f.b(e4.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                q qVar2 = rVar.g;
                r.h(qVar2);
                qVar2.a();
                throw new IllegalStateException("Unexpected call on client side");
            case 19:
                z zVarJ = ((AppMeasurementDynamiteService) this.c).a.j();
                zzcu zzcuVar = (zzcu) this.b;
                zVarJ.a();
                zVarJ.b();
                zVarJ.o(new wq(zVarJ, zVarJ.q(false), zzcuVar, 22, false));
                return;
            case 20:
                g0 g0Var = ((zzjd) this.c).a;
                g0Var.w();
                zw1 zw1Var = (zw1) this.b;
                if (zw1Var.c.a() == null) {
                    g0Var.getClass();
                    String str13 = zw1Var.a;
                    yg0.m(str13);
                    wj3 wj3VarL = g0Var.L(str13);
                    if (wj3VarL != null) {
                        g0Var.V(zw1Var, wj3VarL);
                        return;
                    }
                    return;
                }
                g0Var.getClass();
                String str14 = zw1Var.a;
                yg0.m(str14);
                wj3 wj3VarL2 = g0Var.L(str14);
                if (wj3VarL2 != null) {
                    g0Var.U(zw1Var, wj3VarL2);
                    return;
                }
                return;
            case 21:
                ((w) this.c).u((Boolean) this.b, true);
                return;
            case 22:
                w wVar = ((AppMeasurementDynamiteService) this.c).a.m;
                r.g(wVar);
                wVar.n((mo2) this.b);
                return;
            case 23:
                z zVar = (z) this.c;
                zzgb zzgbVar = zVar.d;
                r rVar2 = zVar.a;
                if (zzgbVar == null) {
                    m mVar3 = rVar2.f;
                    r.h(mVar3);
                    mVar3.f.a("Failed to send current screen to service");
                    return;
                }
                try {
                    zzlu zzluVar = (zzlu) this.b;
                    if (zzluVar == null) {
                        zzgbVar.zzl(0L, null, null, rVar2.a.getPackageName());
                    } else {
                        zzgbVar.zzl(zzluVar.c, zzluVar.a, zzluVar.b, rVar2.a.getPackageName());
                    }
                    zVar.n();
                    return;
                } catch (RemoteException e5) {
                    m mVar4 = rVar2.f;
                    r.h(mVar4);
                    mVar4.f.b(e5, "Failed to send current screen to the service");
                    return;
                }
            case ErrorCodes.SSH_FX_FILE_IS_A_DIRECTORY /* 24 */:
                ((qh3) this.c).c.l((ComponentName) this.b);
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_CONFLICT /* 25 */:
                c();
                return;
            case ErrorCodes.SSH_FX_BYTE_RANGE_LOCK_REFUSED /* 26 */:
                g0 g0Var2 = (g0) this.b;
                g0Var2.w();
                Runnable runnable = (Runnable) this.c;
                g0Var2.zzaW().a();
                ArrayList arrayList = g0Var2.p;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    g0Var2.p = arrayList;
                }
                arrayList.add(runnable);
                g0Var2.l();
                return;
            case 27:
                ((sd) this.b).g((NetworkEvent) this.c);
                return;
            case ErrorCodes.SSH_FX_FILE_CORRUPT /* 28 */:
                ((sd) this.b).i((TrackChangeEvent) this.c);
                return;
            default:
                ((sd) this.b).f((PlaybackErrorEvent) this.c);
                return;
        }
    }

    public /* synthetic */ qj2(Object obj, int i, Object obj2, boolean z) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public /* synthetic */ qj2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public qj2(zznt zzntVar, g0 g0Var, Runnable runnable) {
        this.a = 26;
        this.b = g0Var;
        this.c = runnable;
    }

    public qj2(y63 y63Var, zzbq zzbqVar, y63 y63Var2) {
        this.a = 18;
        this.b = zzbqVar;
        this.c = y63Var;
    }
}
