package defpackage;

import com.google.android.gms.internal.ads.zzibj;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gd3 {
    public static volatile gd3 b;
    public static final gd3 c = new gd3();
    public final Map a = Collections.EMPTY_MAP;

    public static gd3 a() {
        gd3 gd3Var = b;
        if (gd3Var != null) {
            return gd3Var;
        }
        synchronized (gd3.class) {
            try {
                gd3 gd3Var2 = b;
                if (gd3Var2 != null) {
                    return gd3Var2;
                }
                int i = wc3.a;
                gd3 gd3VarB = zzibj.b();
                b = gd3VarB;
                return gd3VarB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
