package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.internal.b;
import com.google.android.gms.measurement.internal.c;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.l;
import com.google.android.gms.measurement.internal.m;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import java.util.TreeSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zf3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ zf3(w wVar, Bundle bundle, int i) {
        this.a = i;
        this.c = bundle;
        this.b = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        int i = this.a;
        Bundle bundle2 = this.c;
        w wVar = this.b;
        switch (i) {
            case 0:
                wVar.a();
                wVar.b();
                String string = bundle2.getString("name");
                yg0.j(string);
                r rVar = wVar.a;
                if (!rVar.a()) {
                    m mVar = rVar.f;
                    r.h(mVar);
                    mVar.n.a("Conditional property not cleared since app measurement is disabled");
                } else {
                    dj3 dj3Var = new dj3(0L, null, string, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
                    try {
                        h0 h0Var = rVar.i;
                        r.f(h0Var);
                        bundle2.getString("app_id");
                        rVar.j().t(new zw1(bundle2.getString("app_id"), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, dj3Var, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), h0Var.D(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, bundle2.getLong("creation_timestamp"), true)));
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
                break;
            default:
                c cVar = wVar.w;
                r rVar2 = wVar.a;
                if (bundle2.isEmpty()) {
                    bundle = bundle2;
                } else {
                    f63 f63Var = rVar2.e;
                    h0 h0Var2 = rVar2.i;
                    b bVar = rVar2.d;
                    m mVar2 = rVar2.f;
                    r.f(f63Var);
                    bundle = new Bundle(f63Var.y.a());
                    for (String str : bundle2.keySet()) {
                        Object obj = bundle2.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            r.f(h0Var2);
                            if (h0.j0(obj)) {
                                h0.q(cVar, null, 27, null, null, 0);
                            }
                            r.h(mVar2);
                            mVar2.k.c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (h0.z(str)) {
                            r.h(mVar2);
                            mVar2.k.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle.remove(str);
                        } else {
                            r.f(h0Var2);
                            bVar.getClass();
                            if (h0Var2.k0("param", str, 500, obj)) {
                                h0Var2.p(bundle, str, obj);
                            }
                        }
                    }
                    r.f(h0Var2);
                    h0 h0Var3 = bVar.a.i;
                    r.f(h0Var3);
                    int i2 = h0Var3.G(201500000) ? 100 : 25;
                    if (bundle.size() > i2) {
                        int i3 = 0;
                        for (String str2 : new TreeSet(bundle.keySet())) {
                            i3++;
                            if (i3 > i2) {
                                bundle.remove(str2);
                            }
                        }
                        r.f(h0Var2);
                        h0.q(cVar, null, 26, null, null, 0);
                        r.h(mVar2);
                        mVar2.k.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                }
                f63 f63Var2 = rVar2.e;
                r.f(f63Var2);
                f63Var2.y.b(bundle);
                if (!bundle2.isEmpty() || rVar2.d.k(null, l.X0)) {
                    rVar2.j().f(bundle);
                }
                break;
        }
    }
}
