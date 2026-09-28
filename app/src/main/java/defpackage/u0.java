package defpackage;

import com.google.common.collect.Multiset;
import com.google.common.collect.a0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends on0 {
    public final /* synthetic */ a0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(a0 a0Var) {
        super(1);
        this.c = a0Var;
    }

    @Override // defpackage.on0
    public final Multiset b() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.c.elementIterator();
    }
}
