package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.util.client.zzv;
import com.google.android.gms.internal.ads.zzddu;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfqb;
import com.google.android.gms.internal.ads.zzgzz;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class mv2 {
    public final Context a;
    public final ta2 b;
    public final zzgzz c;
    public final zzu d;
    public final lv2 e;
    public final zzfor f;
    public final lc2 g;

    public mv2(Context context, ta2 ta2Var, zzgzz zzgzzVar, zzu zzuVar, lv2 lv2Var, zzfor zzforVar, lc2 lc2Var) {
        this.a = context;
        this.b = ta2Var;
        this.c = zzgzzVar;
        this.d = zzuVar;
        this.e = lv2Var;
        this.f = zzforVar;
        this.g = lc2Var;
    }

    public final void a(List list, zzv zzvVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((String) it.next(), zzvVar, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(String str, zzv zzvVar, bv2 bv2Var, zzddu zzdduVar) {
        ListenableFuture listenableFutureZzc;
        zzfoe zzfoeVarX = null;
        if (zzfor.a() && ((Boolean) d42.d.g()).booleanValue()) {
            zzfoeVarX = ec1.X(this.a, 14);
            zzfoeVarX.zza();
        }
        zzfoe zzfoeVar = zzfoeVarX;
        int i = 0;
        Object[] objArr = 0;
        if (zzvVar != null) {
            listenableFutureZzc = new zzfqb(zzvVar.zza(), this.d, this.c, this.e, this.g).a(str);
        } else {
            listenableFutureZzc = this.c.zzc(new mx0(this, 10, str, objArr == true ? 1 : 0));
        }
        listenableFutureZzc.addListener(new s33(i, listenableFutureZzc, new t61(16, this, zzfoeVar, bv2Var, zzdduVar, false)), this.b);
    }
}
