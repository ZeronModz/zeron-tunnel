package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class n73 implements Iterable {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;

    public n73(o73 o73Var, List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ov1(this.a.iterator(), this.b.iterator());
    }
}
