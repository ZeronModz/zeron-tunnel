package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.internal.ads.zzgnb;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class i03 {
    public final Set a;
    public final n03 b;

    public i03(n03 n03Var, Set set) {
        this.a = set;
        this.b = n03Var;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzgnb) it.next()).zzb(map);
        }
        return map;
    }

    public final HashMap b(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzgnb) it.next()).zzc(map, context, view);
        }
        return map;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((zzgnb) it.next()).zzd(map);
        }
        return map;
    }
}
