package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.q;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.u;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhe;
import com.google.android.gms.measurement.internal.zzhg;
import com.google.android.gms.measurement.internal.zzx;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class nf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;

    public /* synthetic */ nf3(w wVar, int i) {
        this.a = i;
        this.b = wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        w wVar = this.b;
        switch (i) {
            case 0:
                wVar.A();
                break;
            case 1:
                zzx zzxVar = wVar.r;
                r rVar = zzxVar.a;
                q qVar = rVar.g;
                w wVar2 = rVar.m;
                f63 f63Var = rVar.e;
                r.h(qVar);
                qVar.a();
                if (zzxVar.c()) {
                    if (zzxVar.b()) {
                        r.f(f63Var);
                        f63Var.w.b(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        r.g(wVar2);
                        wVar2.h("auto", bundle, "_cmpx");
                    } else {
                        r.f(f63Var);
                        zzhg zzhgVar = f63Var.w;
                        String strA = zzhgVar.a();
                        if (TextUtils.isEmpty(strA)) {
                            m mVar = rVar.f;
                            r.h(mVar);
                            mVar.g.a("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long jA = f63Var.x.a() / 3600000;
                            Uri uri = Uri.parse(strA);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (jA - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            r.g(wVar2);
                            wVar2.h(str2, (Bundle) pair.second, "_cmp");
                        }
                        zzhgVar.b(null);
                    }
                    r.f(f63Var);
                    f63Var.x.b(0L);
                    break;
                }
                break;
            case 2:
                wVar.a();
                r rVar2 = wVar.a;
                f63 f63Var2 = rVar2.e;
                m mVar2 = rVar2.f;
                r.f(f63Var2);
                zzhc zzhcVar = f63Var2.t;
                if (zzhcVar.a()) {
                    r.h(mVar2);
                    mVar2.m.a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    zzhe zzheVar = f63Var2.u;
                    long jA2 = zzheVar.a();
                    zzheVar.b(1 + jA2);
                    if (jA2 >= 5) {
                        r.h(mVar2);
                        mVar2.i.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        zzhcVar.b(true);
                    } else {
                        u uVar = wVar.t;
                        if (uVar == null) {
                            uVar = new u(wVar, rVar2, 0, 0 == true ? 1 : 0);
                            wVar.t = uVar;
                        }
                        uVar.b(0L);
                    }
                }
                break;
            default:
                wVar.A();
                break;
        }
    }
}
