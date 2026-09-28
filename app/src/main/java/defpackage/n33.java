package defpackage;

import com.google.android.gms.internal.ads.h7;
import com.google.android.gms.internal.ads.zzguf;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n33 extends h7 {
    public List p;

    public n33(zzguf zzgufVar, boolean z) {
        List arrayList;
        super(zzgufVar, z, true);
        if (zzgufVar.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            int size = zzgufVar.size();
            xg0.M(size, "initialArraySize");
            arrayList = new ArrayList(size);
        }
        for (int i = 0; i < zzgufVar.size(); i++) {
            arrayList.add(null);
        }
        this.p = arrayList;
        u();
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final void q(int i) {
        this.l = null;
        this.p = null;
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final void v(int i, Object obj) {
        List list = this.p;
        if (list != null) {
            list.set(i, new o33(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.h7
    public final void w() {
        List<o33> list = this.p;
        if (list != null) {
            int size = list.size();
            xg0.M(size, "initialArraySize");
            ArrayList arrayList = new ArrayList(size);
            for (o33 o33Var : list) {
                arrayList.add(o33Var != null ? o33Var.a : null);
            }
            c(DesugarCollections.unmodifiableList(arrayList));
        }
    }
}
