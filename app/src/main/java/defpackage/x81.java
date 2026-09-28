package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class x81 extends c1 {
    public final /* synthetic */ v81 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x81(v81 v81Var) {
        super(v81Var, 2);
        this.c = v81Var;
    }

    @Override // defpackage.c1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new w81(this.c);
    }
}
