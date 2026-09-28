package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzv;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcrz;
import com.google.android.gms.internal.ads.zzcwi;
import com.google.android.gms.internal.ads.zzdbh;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzekg;
import com.google.android.gms.internal.ads.zzekl;
import com.google.android.gms.internal.ads.zzenr;
import com.google.android.gms.internal.ads.zzenv;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfnb;
import com.google.android.gms.internal.ads.zzfnm;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class hq2 implements zzgyw {
    public final xu2 a;
    public final zzdbh b;
    public final zzfqg c;
    public final mv2 d;
    public final ta2 e;
    public final ScheduledExecutorService f;
    public final zzcwi g;
    public final zzenr h;
    public final zzekl i;
    public final Context j;
    public final bv2 k;
    public final gj0 l;
    public final zzdxt m;

    public hq2(Context context, xu2 xu2Var, zzenr zzenrVar, zzdbh zzdbhVar, zzfqg zzfqgVar, mv2 mv2Var, zzcwi zzcwiVar, ta2 ta2Var, ScheduledExecutorService scheduledExecutorService, zzekl zzeklVar, bv2 bv2Var, gj0 gj0Var, zzdxt zzdxtVar) {
        this.j = context;
        this.a = xu2Var;
        this.h = zzenrVar;
        this.b = zzdbhVar;
        this.c = zzfqgVar;
        this.d = mv2Var;
        this.g = zzcwiVar;
        this.e = ta2Var;
        this.f = scheduledExecutorService;
        this.i = zzeklVar;
        this.k = bv2Var;
        this.l = gj0Var;
        this.m = zzdxtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(com.google.android.gms.internal.ads.zzfjc r5) {
        /*
            l32 r0 = defpackage.p32.A6
            com.google.android.gms.internal.ads.zzbhc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "No fill."
            r2 = 1
            if (r2 == r0) goto L18
            java.lang.String r0 = "No ad config."
            goto L19
        L18:
            r0 = r1
        L19:
            zt2 r5 = r5.b
            ut2 r5 = r5.b
            int r2 = r5.f
            if (r2 == 0) goto L5b
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L3c
            if (r2 >= r4) goto L3c
            l32 r2 = defpackage.p32.z6
            com.google.android.gms.internal.ads.zzbhc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L5b
            goto L5c
        L3c:
            if (r2 < r4) goto L45
            r0 = 400(0x190, float:5.6E-43)
            if (r2 >= r0) goto L45
            java.lang.String r1 = "No location header to follow redirect or too many redirects."
            goto L5c
        L45:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "Received error HTTP response code: "
            java.lang.String r1 = defpackage.vh.i(r2, r0, r1)
            goto L5c
        L5b:
            r1 = r0
        L5c:
            q43 r5 = r5.j
            if (r5 == 0) goto L63
            java.lang.String r5 = r5.b
            return r5
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq2.a(com.google.android.gms.internal.ads.zzfjc):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final ListenableFuture zza(Object obj) {
        int i;
        Bundle bundle;
        hq2 hq2Var = this;
        zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) zzbd.zzc().a(p32.K2)).booleanValue() && (bundle = zzfjcVar.b.d) != null) {
            hq2Var.m.e.putAll(bundle);
        }
        if (((Boolean) zzbd.zzc().a(p32.L2)).booleanValue()) {
            ec1.R(zzdxh.RENDERING_START.zza(), hq2Var.m.e);
        }
        String strA = a(zzfjcVar);
        zzekl zzeklVar = hq2Var.i;
        zt2 zt2Var = zzfjcVar.b;
        ut2 ut2Var = zt2Var.b;
        zzeklVar.d = ut2Var;
        if (((Boolean) zzbd.zzc().a(p32.E9)).booleanValue() && (i = ut2Var.f) != 0 && (i < 200 || i >= 300)) {
            return z.v(new zzenv(3, strA));
        }
        String str = ut2Var.q;
        if (!((Boolean) zzbd.zzc().a(p32.v4)).booleanValue() || TextUtils.isEmpty(str)) {
            for (tt2 tt2Var : zt2Var.a) {
                zzeklVar.b(tt2Var, zzeklVar.a.size());
                Iterator it = tt2Var.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzeklVar.c(tt2Var, 0L, xg0.P(1, null, null), false);
                        break;
                    }
                    zzekg zzekgVarZza = hq2Var.g.zza(tt2Var.b, (String) it.next());
                    if (zzekgVarZza == null || !zzekgVarZza.zza(zzfjcVar, tt2Var)) {
                    }
                }
            }
        } else {
            List list = zt2Var.a;
            synchronized (zzeklVar) {
                Map map = zzeklVar.b;
                if (map.containsKey(str)) {
                    zzv zzvVar = (zzv) map.get(str);
                    List list2 = zzeklVar.a;
                    int iIndexOf = list2.indexOf(zzvVar);
                    try {
                        list2.remove(iIndexOf);
                    } catch (IndexOutOfBoundsException e) {
                        zzt.zzh().f("AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry", e);
                    }
                    zzeklVar.b.remove(str);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zzeklVar.b((tt2) it2.next(), iIndexOf);
                        iIndexOf++;
                    }
                }
            }
        }
        zzdbh zzdbhVar = hq2Var.b;
        zzcrz zzcrzVar = new zzcrz(zzfjcVar, hq2Var.d, hq2Var.c);
        ta2 ta2Var = hq2Var.e;
        zzdbhVar.h(zzcrzVar, ta2Var);
        if (ut2Var.r > 1) {
            return hq2Var.l.a(zzfjcVar);
        }
        String strA2 = a(zzfjcVar);
        xu2 xu2Var = hq2Var.a;
        zzfno zzfnoVar = zzfno.RENDER_CONFIG_INIT;
        Objects.requireNonNull(xu2Var);
        zzfnb zzfnbVarK = new fq0(xu2Var, zzfnoVar, null, zzfnm.d, Collections.EMPTY_LIST, z.v(new zzenv(3, strA2))).k();
        zzenr zzenrVar = hq2Var.h;
        zzenrVar.a();
        int i2 = 0;
        for (tt2 tt2Var2 : zt2Var.a) {
            Iterator it3 = tt2Var2.a.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                String str2 = (String) it3.next();
                zzekg zzekgVarZza2 = hq2Var.g.zza(tt2Var2.b, str2);
                if (zzekgVarZza2 != null && zzekgVarZza2.zza(zzfjcVar, tt2Var2)) {
                    fq0 fq0VarA = xu2Var.a(zzfnbVarK, zzfno.RENDER_CONFIG_WATERFALL);
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(str2).length());
                    sb.append("render-config-");
                    sb.append(i2);
                    sb.append("-");
                    sb.append(str2);
                    String string = sb.toString();
                    ListenableFuture listenableFuture = (ListenableFuture) fq0VarA.c;
                    List list3 = (List) fq0VarA.d;
                    ListenableFuture listenableFuture2 = (ListenableFuture) fq0VarA.e;
                    zzfnm zzfnmVar = (zzfnm) fq0VarA.f;
                    Object obj2 = fq0VarA.a;
                    Objects.requireNonNull(zzfnmVar);
                    zzfnbVarK = new fq0(zzfnmVar, obj2, string, listenableFuture, list3, z.R(listenableFuture2, Throwable.class, new ue2(hq2Var, tt2Var2, zzfjcVar, zzekgVarZza2, 3), zzfnmVar.a)).k();
                    break;
                }
                hq2Var = this;
            }
            i2++;
            hq2Var = this;
        }
        zzfnbVarK.addListener(new kc2(zzenrVar, 20), ta2Var);
        return zzfnbVarK;
    }
}
