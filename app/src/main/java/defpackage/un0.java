package defpackage;

import com.google.common.collect.w0;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class un0 extends w0 {
    public final Collection a;

    public un0(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.e90
    public final Object delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.w0, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return new lh0(this.a.iterator(), 1);
    }

    @Override // com.google.common.collect.w0, java.util.Collection
    public final Object[] toArray() {
        return standardToArray();
    }

    @Override // com.google.common.collect.w0, defpackage.e90
    public final Collection delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.w0, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return standardToArray(objArr);
    }
}
