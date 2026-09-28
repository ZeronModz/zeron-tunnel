package defpackage;

import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.measurement.internal.e;
import com.google.android.gms.measurement.internal.g0;
import com.google.android.gms.measurement.internal.o;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k93 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ String c;

    public /* synthetic */ k93(o oVar, String str, int i) {
        this.a = i;
        this.b = oVar;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        String str = this.c;
        o oVar = this.b;
        switch (i) {
            case 0:
                return new zzu("internal.appMetadata", new k93(oVar, str, 1));
            case 1:
                e eVar = oVar.b.c;
                g0.P(eVar);
                x33 x33VarC0 = eVar.c0(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                oVar.a.d.f();
                map.put("gmp_version", 133005L);
                if (x33VarC0 != null) {
                    String strN = x33VarC0.N();
                    if (strN != null) {
                        map.put("app_version", strN);
                    }
                    map.put("app_version_int", Long.valueOf(x33VarC0.P()));
                    map.put("dynamite_version", Long.valueOf(x33VarC0.b()));
                }
                return map;
            default:
                return new zzn("internal.remoteConfig", new mo2(oVar, 16, str, false));
        }
    }
}
