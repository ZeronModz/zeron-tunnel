package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends nn0 {
    public final /* synthetic */ a1 d;

    public z0(a1 a1Var) {
        this.d = a1Var;
    }

    @Override // defpackage.nn0
    public final Iterator a() {
        return this.d.b();
    }

    @Override // defpackage.nn0
    public final NavigableMap b() {
        return this.d;
    }
}
