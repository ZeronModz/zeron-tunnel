package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.l5;
import com.google.android.gms.internal.ads.z;
import com.google.android.gms.internal.ads.zzcwi;
import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzekg;
import com.google.android.gms.internal.ads.zzenr;
import com.google.android.gms.internal.ads.zzenv;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzgcc;
import com.google.android.gms.internal.ads.zzgfb;
import com.google.android.gms.internal.ads.zzgfc;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gj0 implements zzgfb {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public synchronized b43 a(zzfjc zzfjcVar) {
        try {
            if (!((AtomicBoolean) this.g).getAndSet(true)) {
                List list = zzfjcVar.b.a;
                if (list.isEmpty()) {
                    ((b43) this.f).d(new zzenv(3, hq2.a(zzfjcVar)));
                } else {
                    this.i = zzfjcVar;
                    zzenr zzenrVar = (zzenr) this.d;
                    this.h = new bq2(zzfjcVar, zzenrVar, (b43) this.f);
                    zzenrVar.b(list);
                    tt2 tt2VarA = ((bq2) this.h).a();
                    while (tt2VarA != null) {
                        b(tt2VarA);
                        tt2VarA = ((bq2) this.h).a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (b43) this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(tt2 tt2Var) {
        int i;
        ListenableFuture listenableFutureV;
        synchronized (this) {
            Iterator it = tt2Var.a.iterator();
            while (true) {
                i = 3;
                if (!it.hasNext()) {
                    listenableFutureV = z.v(new zzecr(3));
                    break;
                }
                zzekg zzekgVarZza = ((zzcwi) this.c).zza(tt2Var.b, (String) it.next());
                if (zzekgVarZza != null && zzekgVarZza.zza((zzfjc) this.i, tt2Var)) {
                    listenableFutureV = z.T(zzekgVarZza.zzb((zzfjc) this.i, tt2Var), tt2Var.R, TimeUnit.MILLISECONDS, (ScheduledExecutorService) this.b);
                    break;
                }
            }
        }
        ((zzenr) this.d).d((zzfjc) this.i, tt2Var, listenableFutureV, (zzfqg) this.e);
        listenableFutureV.addListener(new s33(0 == true ? 1 : 0, listenableFutureV, new mo2(this, i, tt2Var, false)), (ta2) this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzgfb
    public zzgfc zza() {
        k02.M(Context.class, (Context) this.c);
        k02.M(Map.class, (Map) this.g);
        k02.M(vz1.class, (vz1) this.h);
        k02.M(zzgcc.class, (zzgcc) this.i);
        return new sd2((l5) this.a, (t61) this.b, (Context) this.c, (View) this.d, (Activity) this.e, (String) this.f, (Map) this.g, (vz1) this.h, (zzgcc) this.i);
    }

    @Override // com.google.android.gms.internal.ads.zzgfb
    public /* bridge */ /* synthetic */ zzgfb zzb(zzgcc zzgccVar) {
        zzgccVar.getClass();
        this.i = zzgccVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfb
    public /* bridge */ /* synthetic */ zzgfb zzc(vz1 vz1Var) {
        vz1Var.getClass();
        this.h = vz1Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfb
    public /* bridge */ /* synthetic */ zzgfb zzd(Map map) {
        this.g = map;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfb
    public /* synthetic */ zzgfb zze(String str) {
        this.f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfb
    public /* synthetic */ zzgfb zzf(Activity activity) {
        this.e = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfb
    public /* synthetic */ zzgfb zzg(View view) {
        this.d = view;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgfb
    public /* bridge */ /* synthetic */ zzgfb zzh(Context context) {
        context.getClass();
        this.c = context;
        return this;
    }
}
