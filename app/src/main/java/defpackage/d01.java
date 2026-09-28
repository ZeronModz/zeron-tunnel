package defpackage;

import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class d01 {
    public final List a;
    public final ib b;

    public d01(List list, ib ibVar) {
        jx0.b((list.isEmpty() && ibVar == ib.c) ? false : true, "No preferred quality and fallback strategy.");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.b = ibVar;
    }

    public static d01 a(List list, ib ibVar) {
        jx0.f(list, "qualities cannot be null");
        jx0.b(!list.isEmpty(), "qualities cannot be empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b01 b01Var = (b01) it.next();
            jx0.b(b01.h.contains(b01Var), "qualities contain invalid quality: " + b01Var);
        }
        return new d01(list, ibVar);
    }

    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.a + ", fallbackStrategy=" + this.b + "}";
    }
}
