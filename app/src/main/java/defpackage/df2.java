package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzbil;
import com.google.android.gms.internal.ads.zzcdv;
import com.google.android.gms.internal.ads.zzcdw;
import com.google.android.gms.internal.ads.zzcdz;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdag;
import com.google.android.gms.internal.ads.zzdbf;
import com.google.android.gms.internal.ads.zzdbv;
import com.google.android.gms.internal.ads.zzdbz;
import com.google.android.gms.internal.ads.zzdct;
import com.google.android.gms.internal.ads.zzddu;
import com.google.android.gms.internal.ads.zzdea;
import com.google.android.gms.internal.ads.zzdjd;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzfqg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class df2 implements zzdbf, zzdct, zzdbz, zza, zzdbv, zzdjd, zzdea {
    public final Context a;
    public final ta2 b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final zzfjc e;
    public final tt2 f;
    public final zzfqg g;
    public final zzfjx h;
    public final zzazh i;
    public final zzbil j;
    public final WeakReference k;
    public final WeakReference l;
    public final zzdag m;
    public final zzddu n;
    public final dh2 o;
    public final Set p;
    public boolean q;
    public final AtomicBoolean r = new AtomicBoolean();
    public zzcdv s = null;

    public df2(Context context, ta2 ta2Var, Executor executor, ScheduledExecutorService scheduledExecutorService, zzfjc zzfjcVar, tt2 tt2Var, zzfqg zzfqgVar, zzfjx zzfjxVar, View view, zzcjl zzcjlVar, zzazh zzazhVar, zzbil zzbilVar, zzdag zzdagVar, zzddu zzdduVar, dh2 dh2Var, Set set) {
        this.a = context;
        this.b = ta2Var;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.e = zzfjcVar;
        this.f = tt2Var;
        this.g = zzfqgVar;
        this.h = zzfjxVar;
        this.i = zzazhVar;
        this.k = new WeakReference(view);
        this.l = new WeakReference(zzcjlVar);
        this.j = zzbilVar;
        this.m = zzdagVar;
        this.n = zzdduVar;
        this.o = dh2Var;
        this.p = set;
    }

    public final List a() {
        List list = this.f.d;
        if (((Boolean) zzbd.zzc().a(p32.Qc)).booleanValue()) {
            zzt.zzc();
            Context context = this.a;
            if (zzs.zzG(context)) {
                zzt.zzc();
                Integer numZzw = zzs.zzw(context);
                if (numZzw != null) {
                    int iMin = Math.min(numZzw.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    public final void b(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.k.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            c();
        } else {
            this.d.schedule(new cf2(this, i, i2, 0), i2, TimeUnit.MILLISECONDS);
        }
    }

    public final void c() {
        int i;
        zzcdv zzcdvVar;
        tt2 tt2Var = this.f;
        List list = tt2Var.d;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) zzbd.zzc().a(p32.kf)).booleanValue() && this.s == null) {
            zzcdz zzcdzVar = zzt.zzh().c;
            Set set = this.p;
            String str = this.e.a.a.g;
            zzcdw zzcdwVar = zzcdzVar.d;
            synchronized (zzcdwVar.g) {
                try {
                    int i2 = zzcdwVar.m;
                    zzcdwVar.m = i2 + 1;
                    if (set.isEmpty()) {
                        zzcdvVar = new zzcdv(i2, -1, -1);
                    } else {
                        TreeSet treeSet = new TreeSet(set);
                        StringBuilder sb = new StringBuilder();
                        Iterator it = treeSet.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (true) {
                                sb.append((CharSequence) next);
                                if (!it.hasNext()) {
                                    break;
                                }
                                sb.append((CharSequence) ",");
                                next = it.next();
                            }
                        }
                        String string = sb.toString();
                        HashMap map = zzcdwVar.n;
                        Integer num = (Integer) map.get(string);
                        int iIntValue = num == null ? 0 : num.intValue();
                        map.put(string, Integer.valueOf(iIntValue + 1));
                        if (str == null) {
                            zzcdvVar = new zzcdv(i2, iIntValue, -1);
                        } else {
                            StringBuilder sb2 = new StringBuilder(str.length() + 1 + string.length());
                            sb2.append(str);
                            sb2.append("|");
                            sb2.append(string);
                            String string2 = sb2.toString();
                            HashMap map2 = zzcdwVar.o;
                            Integer num2 = (Integer) map2.get(string2);
                            int iIntValue2 = num2 == null ? 0 : num2.intValue();
                            map2.put(string2, Integer.valueOf(iIntValue2 + 1));
                            zzcdvVar = new zzcdv(i2, iIntValue, iIntValue2);
                        }
                    }
                } finally {
                }
            }
            this.s = zzcdvVar;
        }
        String strZzj = ((Boolean) zzbd.zzc().a(p32.s4)).booleanValue() ? this.i.b.zzj(this.a, (View) this.k.get(), null) : null;
        if ((((Boolean) zzbd.zzc().a(p32.Z0)).booleanValue() && this.e.b.b.h) || !((Boolean) j42.h.g()).booleanValue()) {
            this.h.a(this.g.b(this.e, tt2Var, false, strZzj, null, a(), this.o, this.s), this.n);
            return;
        }
        if (((Boolean) j42.g.g()).booleanValue() && ((i = tt2Var.b) == 1 || i == 2 || i == 5)) {
        }
        q33 q33Var = (q33) z.T(q33.q(u33.b), ((Long) zzbd.zzc().a(p32.C1)).longValue(), TimeUnit.MILLISECONDS, this.d);
        q33Var.addListener(new s33(0, q33Var, new i31(18, this, strZzj)), this.b);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        boolean zBooleanValue = ((Boolean) zzbd.zzc().a(p32.Z0)).booleanValue();
        zzfjc zzfjcVar = this.e;
        if ((zBooleanValue && zzfjcVar.b.b.h) || !((Boolean) j42.d.g()).booleanValue()) {
            tt2 tt2Var = this.f;
            this.h.b(this.g.a(zzfjcVar, tt2Var, tt2Var.c), true == zzt.zzh().k(this.a) ? 2 : 1);
        } else {
            zzbil zzbilVar = this.j;
            zzbilVar.getClass();
            z23 z23VarN = z.N(q33.q((q33) z.T(q33.q(u33.b), ((Long) j42.c.g()).longValue(), TimeUnit.MILLISECONDS, zzbilVar.c)), Throwable.class, ox1.g, g3.g);
            z23VarN.addListener(new s33(0, z23VarN, new ca2(this, 4)), this.b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[LOOP:0: B:13:0x0063->B:15:0x0069, LOOP_END] */
    @Override // com.google.android.gms.internal.ads.zzdbf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzcag r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11 = this;
            tt2 r13 = r11.f
            java.util.List r14 = r13.h
            com.google.android.gms.internal.ads.zzfqg r0 = r11.g
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.google.android.gms.common.util.Clock r2 = r0.h
            long r2 = r2.currentTimeMillis()
            java.lang.String r4 = r12.zzb()     // Catch: android.os.RemoteException -> Lb3
            int r12 = r12.zzc()     // Catch: android.os.RemoteException -> Lb3
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch: android.os.RemoteException -> Lb3
            l32 r5 = defpackage.p32.t4
            com.google.android.gms.internal.ads.zzbhc r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L42
            com.google.android.gms.internal.ads.zzfje r5 = r0.g
            if (r5 != 0) goto L3b
            com.google.android.gms.internal.ads.zzgra r5 = com.google.android.gms.internal.ads.zzgra.zzc()
            goto L45
        L3b:
            com.google.android.gms.internal.ads.zzfjd r5 = r5.a
        L3d:
            com.google.android.gms.internal.ads.zzgra r5 = com.google.android.gms.internal.ads.zzgra.zzd(r5)
            goto L45
        L42:
            com.google.android.gms.internal.ads.zzfjd r5 = r0.f
            goto L3d
        L45:
            ox1 r6 = defpackage.ox1.u
            com.google.android.gms.internal.ads.zzgra r6 = r5.zzb(r6)
            java.lang.String r7 = ""
            java.lang.Object r6 = r6.zza(r7)
            java.lang.String r6 = (java.lang.String) r6
            ox1 r8 = defpackage.ox1.t
            com.google.android.gms.internal.ads.zzgra r5 = r5.zzb(r8)
            java.lang.Object r5 = r5.zza(r7)
            java.lang.String r5 = (java.lang.String) r5
            java.util.Iterator r14 = r14.iterator()
        L63:
            boolean r7 = r14.hasNext()
            if (r7 == 0) goto Lb9
            java.lang.Object r7 = r14.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = android.net.Uri.encode(r6)
            java.lang.String r9 = "@gw_rwd_userid@"
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfqg.c(r7, r9, r8)
            java.lang.String r8 = android.net.Uri.encode(r5)
            java.lang.String r9 = "@gw_rwd_custom_data@"
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfqg.c(r7, r9, r8)
            java.lang.String r8 = java.lang.Long.toString(r2)
            java.lang.String r9 = "@gw_tmstmp@"
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfqg.c(r7, r9, r8)
            java.lang.String r8 = android.net.Uri.encode(r4)
            java.lang.String r9 = "@gw_rwd_itm@"
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfqg.c(r7, r9, r8)
            java.lang.String r8 = "@gw_rwd_amt@"
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfqg.c(r7, r8, r12)
            java.lang.String r8 = r0.b
            java.lang.String r9 = "@gw_sdkver@"
            java.lang.String r7 = com.google.android.gms.internal.ads.zzfqg.c(r7, r9, r8)
            android.content.Context r8 = r0.e
            boolean r9 = r13.W
            java.util.Map r10 = r13.w0
            java.lang.String r7 = defpackage.yg0.S(r7, r8, r9, r10)
            r1.add(r7)
            goto L63
        Lb3:
            r12 = move-exception
            java.lang.String r13 = "Unable to determine award type and amount."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r13, r12)
        Lb9:
            r12 = 0
            com.google.android.gms.internal.ads.zzfjx r11 = r11.h
            r11.a(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.df2.zzd(com.google.android.gms.internal.ads.zzcag, java.lang.String, java.lang.String):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdbz
    public final void zzdr() {
        if (this.r.compareAndSet(false, true)) {
            int iIntValue = ((Integer) zzbd.zzc().a(p32.B4)).intValue();
            if (iIntValue > 0) {
                b(iIntValue, ((Integer) zzbd.zzc().a(p32.C4)).intValue());
                return;
            }
            if (!((Boolean) zzbd.zzc().a(p32.A4)).booleanValue()) {
                c();
            } else {
                this.c.execute(new bf2(this, 0));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zze() {
        tt2 tt2Var = this.f;
        this.h.a(this.g.a(this.e, tt2Var, tt2Var.g), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzf() {
        tt2 tt2Var = this.f;
        this.h.a(this.g.a(this.e, tt2Var, tt2Var.i), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdct
    public final synchronized void zzg() {
        zzdag zzdagVar;
        try {
            if (this.q) {
                ArrayList arrayList = new ArrayList(a());
                tt2 tt2Var = this.f;
                arrayList.addAll(tt2Var.f);
                this.h.a(this.g.b(this.e, tt2Var, true, null, null, arrayList, null, null), null);
            } else {
                zzfjx zzfjxVar = this.h;
                zzfqg zzfqgVar = this.g;
                zzfjc zzfjcVar = this.e;
                tt2 tt2Var2 = this.f;
                zzfjxVar.a(zzfqgVar.a(zzfjcVar, tt2Var2, tt2Var2.m), null);
                if (((Boolean) zzbd.zzc().a(p32.x4)).booleanValue() && (zzdagVar = this.m) != null) {
                    List list = zzdagVar.b.m;
                    String strF = zzdagVar.c.f();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfqg.c((String) it.next(), "@gw_adnetstatus@", strF));
                    }
                    long jG = zzdagVar.c.g();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zzfqg.c((String) it2.next(), "@gw_ttr@", Long.toString(jG, 10)));
                    }
                    zzfjxVar.a(zzfqgVar.a(zzdagVar.a, zzdagVar.b, arrayList3), null);
                }
                zzfjxVar.a(zzfqgVar.a(zzfjcVar, tt2Var2, tt2Var2.f), null);
            }
            this.q = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjd
    public final void zzi() {
        tt2 tt2Var = this.f;
        this.h.a(this.g.a(this.e, tt2Var, tt2Var.u0), null);
    }

    @Override // com.google.android.gms.internal.ads.zzdbv
    public final void zzj(zze zzeVar) {
        if (((Boolean) zzbd.zzc().a(p32.b2)).booleanValue()) {
            int i = zzeVar.zza;
            ArrayList arrayList = new ArrayList();
            tt2 tt2Var = this.f;
            for (String str : tt2Var.o) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(zzfqg.c(str, "@gw_mpe@", sb.toString()));
            }
            this.h.a(this.g.a(this.e, tt2Var, arrayList), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdea
    public final void zzk() {
        tt2 tt2Var = this.f;
        if (tt2Var.e == 4) {
            this.h.a(this.g.a(this.e, tt2Var, tt2Var.A0), null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdJ() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzds() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbf
    public final void zzdt() {
    }
}
