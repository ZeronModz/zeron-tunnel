package defpackage;

import com.google.android.gms.internal.ads.zzhjq;
import java.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class f73 {
    public static final f73 b;
    public final Map a;

    static {
        zzhjq zzhjqVar = new zzhjq();
        HashMap map = zzhjqVar.a;
        if (map == null) {
            u7.p("cannot call build() twice");
            return;
        }
        f73 f73Var = new f73(DesugarCollections.unmodifiableMap(map));
        zzhjqVar.a = null;
        b = f73Var;
    }

    public /* synthetic */ f73(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f73) {
            return this.a.equals(((f73) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
