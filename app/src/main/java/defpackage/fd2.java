package defpackage;

import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.g3;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbgo;
import com.google.android.gms.internal.ads.zzbxw;
import com.google.android.gms.internal.ads.zzbzu;
import com.google.android.gms.internal.ads.zzcdj;
import com.google.android.gms.internal.ads.zzcdk;
import com.google.android.gms.internal.ads.zzcdm;
import com.google.android.gms.internal.ads.zzcdu;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzezj;
import com.google.android.gms.internal.ads.zzfax;
import com.google.android.gms.internal.ads.zzfba;
import com.google.android.gms.internal.ads.zzfbz;
import com.google.android.gms.internal.ads.zzfcc;
import com.google.android.gms.internal.ads.zzfck;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfcw;
import com.google.android.gms.internal.ads.zzfcz;
import com.google.android.gms.internal.ads.zzfdc;
import com.google.android.gms.internal.ads.zzfdr;
import com.google.android.gms.internal.ads.zzfmk;
import com.google.android.gms.internal.ads.zzfno;
import com.google.android.gms.internal.ads.zzgup;
import com.google.android.gms.internal.ads.zzika;
import com.google.android.gms.internal.ads.zzikg;
import com.google.android.gms.internal.ads.zzikp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fd2 extends zzfbz {
    public final zzfdc a;
    public final gd2 b;
    public final se3 c;
    public final fg2 d;
    public final bs2 e;
    public final pe2 f;
    public final yf2 g;
    public final qc2 h;
    public final we2 i;
    public final ha2 j;
    public final se3 k;

    public fd2(gd2 gd2Var, zzfdc zzfdcVar) {
        this.b = gd2Var;
        this.a = zzfdcVar;
        int i = 11;
        this.c = se3.a(new bs2(gd2Var.v, i));
        et2 et2Var = new et2(zzfdcVar, 1);
        et2 et2Var2 = new et2(zzfdcVar, 2);
        et2 et2Var3 = new et2(zzfdcVar, 3);
        int i2 = le2.a;
        sc2 sc2Var = gd2Var.h;
        se3 se3Var = gd2Var.e;
        zzfmk zzfmkVar = pu2.a;
        this.d = new fg2((zzikp) sc2Var, (zzikp) se3Var, (zzikg) et2Var, (zzikp) et2Var2, (zzikp) et2Var3, 16);
        int i3 = ie2.a;
        this.e = new bs2(sc2Var, 7);
        et2 et2Var4 = new et2(zzfdcVar, 0);
        int i4 = je2.a;
        this.f = new pe2(et2Var4, 21);
        int i5 = ke2.a;
        this.g = new yf2(se3Var, sc2Var, i);
        int i6 = 24;
        this.h = new qc2(i6);
        et2 et2Var5 = new et2(zzfdcVar, 5);
        et2 et2Var6 = new et2(zzfdcVar, 6);
        se3 se3Var2 = gd2Var.D;
        int i7 = me2.a;
        this.i = new we2(se3Var2, et2Var3, et2Var4, se3Var, et2Var5, et2Var6, 8);
        int i8 = he2.a;
        this.j = new ha2(et2Var4, se3Var2, se3Var, 26);
        et2 et2Var7 = new et2(zzfdcVar, 4);
        se3 se3VarA = se3.a(wl2.a);
        se3 se3VarA2 = se3.a(vl2.a);
        se3 se3VarA3 = se3.a(xl2.a);
        se3 se3VarA4 = se3.a(yl2.a);
        int i9 = ue3.b;
        LinkedHashMap linkedHashMapO = qj1.O(4);
        zzfno zzfnoVar = zzfno.GMS_SIGNALS;
        k02.E(zzfnoVar, "key");
        linkedHashMapO.put(zzfnoVar, se3VarA);
        zzfno zzfnoVar2 = zzfno.BUILD_URL;
        k02.E(zzfnoVar2, "key");
        linkedHashMapO.put(zzfnoVar2, se3VarA2);
        zzfno zzfnoVar3 = zzfno.HTTP;
        k02.E(zzfnoVar3, "key");
        linkedHashMapO.put(zzfnoVar3, se3VarA3);
        zzfno zzfnoVar4 = zzfno.PRE_PROCESS;
        k02.E(zzfnoVar4, "key");
        linkedHashMapO.put(zzfnoVar4, se3VarA4);
        se3 se3VarA5 = se3.a(new ha2(et2Var7, gd2Var.h, new ue3(linkedHashMapO), 10));
        int i10 = we3.c;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(se3VarA5);
        this.k = se3.a(new yr2(gd2Var.e, new th2(new we3(list, arrayList), i6)));
    }

    @Override // com.google.android.gms.internal.ads.zzfbz
    public final zzfba a() {
        gd2 gd2Var = this.b;
        Context context = (Context) gd2Var.b.c;
        k02.J(context);
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        zzcdj zzcdjVar = new zzcdj();
        zzfdc zzfdcVar = this.a;
        String str = zzfdcVar.a.d;
        k02.J(str);
        zzfcs zzfcsVar = new zzfcs(zzcdjVar, ta2Var, str);
        se3 se3Var = gd2Var.e;
        zzezj zzezjVar = new zzezj(zzfcsVar, 0L, (ScheduledExecutorService) se3Var.zzb());
        zzbxw zzbxwVar = new zzbxw();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) se3Var.zzb();
        nc2 nc2Var = gd2Var.b;
        Context context2 = (Context) nc2Var.c;
        k02.J(context2);
        zzezj zzezjVar2 = new zzezj(new zzfcz(zzbxwVar, scheduledExecutorService, context2), ((Long) zzbd.zzc().a(p32.d5)).longValue(), (ScheduledExecutorService) se3Var.zzb());
        zzcdm zzcdmVar = new zzcdm();
        Context context3 = (Context) nc2Var.c;
        k02.J(context3);
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) se3Var.zzb();
        int i = zzfdcVar.b;
        zzbzu zzbzuVar = zzfdcVar.a;
        zzezj zzezjVar3 = new zzezj(new at2(zzcdmVar, context3, scheduledExecutorService2, ta2Var, i, zzbzuVar.l, zzbzuVar.k), 0L, (ScheduledExecutorService) se3Var.zzb());
        zzezj zzezjVar4 = new zzezj(new zzfdr(ta2Var), 0L, (ScheduledExecutorService) se3Var.zzb());
        zzbfs zzbfsVar = new zzbfs();
        k02.J(context3);
        zzfck zzfckVar = new zzfck(zzbfsVar, ta2Var, context3);
        zzbgo zzbgoVar = new zzbgo();
        k02.J(ta2Var);
        List list = zzfdcVar.a.e;
        k02.J(list);
        zzfcw zzfcwVar = new zzfcw(zzbgoVar, ta2Var, list);
        zzfcc zzfccVarE = e();
        zzfax zzfaxVar = (zzfax) gd2Var.Q0.zzb();
        se3 se3Var2 = gd2Var.D;
        String str2 = zzbzuVar.d;
        k02.J(str2);
        new zzbfg();
        ir2 ir2Var = new ir2((zzcdu) se3Var2.zzb(), (ScheduledExecutorService) se3Var.zzb(), ta2Var);
        zzcdu zzcduVar = (zzcdu) se3Var2.zzb();
        boolean z = zzbzuVar.k;
        new zzcdk();
        k02.J(str2);
        return new zzfba(context, ta2Var, zzgup.zzm(zzezjVar, zzezjVar2, zzezjVar3, zzezjVar4, zzfckVar, zzfcwVar, zzfccVarE, zzfaxVar, ir2Var, new ft2(zzcduVar, z, ta2Var, (ScheduledExecutorService) se3Var.zzb(), zzfdcVar.a(), zzbzuVar.o)), (bv2) this.c.zzb(), (zzdxz) gd2Var.l.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzfbz
    public final zzfba b() {
        gd2 gd2Var = this.b;
        se3 se3Var = gd2Var.Q0;
        Context context = (Context) gd2Var.b.c;
        k02.J(context);
        new zzcdj();
        new zzcdk();
        Object objZzb = se3Var.zzb();
        zzfcc zzfccVarE = e();
        zzbgo zzbgoVar = new zzbgo();
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        List list = this.a.a.e;
        k02.J(list);
        zzfcw zzfcwVar = new zzfcw(zzbgoVar, ta2Var, list);
        zzika zzikaVarB = se3.b(this.d);
        zzika zzikaVarB2 = se3.b(this.e);
        se3.b(this.f);
        zzika zzikaVarB3 = se3.b(this.g);
        zzika zzikaVarB4 = se3.b(this.h);
        se3.b(this.i);
        zzika zzikaVarB5 = se3.b(this.j);
        k02.J(ta2Var);
        bv2 bv2Var = (bv2) this.c.zzb();
        zzdxz zzdxzVar = (zzdxz) gd2Var.l.zzb();
        HashSet hashSet = new HashSet();
        hashSet.add((dt2) objZzb);
        hashSet.add(zzfccVarE);
        hashSet.add(zzfcwVar);
        if (((Boolean) zzbd.zzc().a(p32.L6)).booleanValue()) {
            hashSet.add((zzfax) zzikaVarB.zzb());
        }
        if (((Boolean) zzbd.zzc().a(p32.M6)).booleanValue()) {
            hashSet.add((zzfax) zzikaVarB2.zzb());
        }
        if (((Boolean) zzbd.zzc().a(p32.O6)).booleanValue()) {
            hashSet.add((zzfax) zzikaVarB3.zzb());
        }
        if (((Boolean) zzbd.zzc().a(p32.P6)).booleanValue()) {
            hashSet.add((zzfax) zzikaVarB4.zzb());
        }
        if (((Boolean) zzbd.zzc().a(p32.Q3)).booleanValue()) {
            hashSet.add((zzfax) zzikaVarB5.zzb());
        }
        return new zzfba(context, ta2Var, hashSet, bv2Var, zzdxzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfbz
    public final xu2 c() {
        return (xu2) this.k.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfbz
    public final bv2 d() {
        return (bv2) this.c.zzb();
    }

    public final zzfcc e() {
        zzcdm zzcdmVar = new zzcdm();
        ta2 ta2Var = g3.a;
        k02.J(ta2Var);
        zzfdc zzfdcVar = this.a;
        String string = zzfdcVar.a.a.getString("ms");
        if (string == null) {
            string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return new zzfcc(zzcdmVar, ta2Var, string, zzfdcVar.a.f, zzfdcVar.b);
    }
}
