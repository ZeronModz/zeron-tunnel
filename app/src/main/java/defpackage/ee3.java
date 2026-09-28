package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.h0;
import com.google.android.gms.measurement.internal.r;
import com.google.android.gms.measurement.internal.w;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzmb;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ee3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public ee3(zzmb zzmbVar, Bundle bundle, zzlu zzluVar, zzlu zzluVar2, long j) {
        this.a = 2;
        this.b = bundle;
        this.c = zzluVar;
        this.e = zzluVar2;
        this.d = j;
        Objects.requireNonNull(zzmbVar);
        this.f = zzmbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                String str = (String) obj2;
                g0 g0Var = ((zzjd) obj4).a;
                String str2 = (String) obj3;
                if (str2 != null) {
                    zzlu zzluVar = new zzlu((String) obj, str2, this.d);
                    g0Var.zzaW().a();
                    String str3 = g0Var.G;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    g0Var.G = str;
                    g0Var.F = zzluVar;
                } else {
                    g0Var.zzaW().a();
                    String str4 = g0Var.G;
                    if (str4 == null || str4.equals(str)) {
                        g0Var.G = str;
                        g0Var.F = null;
                    }
                }
                break;
            case 1:
                String str5 = (String) obj2;
                Object obj5 = this.e;
                ((w) obj4).l(this.d, obj5, (String) obj3, str5);
                break;
            default:
                zzmb zzmbVar = (zzmb) obj4;
                Bundle bundle = (Bundle) obj3;
                zzmbVar.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                h0 h0Var = zzmbVar.a.i;
                r.f(h0Var);
                zzmbVar.k((zzlu) obj2, (zzlu) obj, this.d, true, h0Var.i("screen_view", bundle, null, false));
                break;
        }
    }

    public /* synthetic */ ee3(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.e = obj2;
        this.d = j;
        this.f = obj;
    }
}
