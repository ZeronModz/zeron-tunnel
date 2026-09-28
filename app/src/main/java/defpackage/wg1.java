package defpackage;

import com.google.common.collect.s1;
import com.google.common.collect.w0;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wg1 extends w0 implements Set {
    public final Collection a;

    public wg1(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.e90
    public final Object delegate() {
        return this.a;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return s1.f(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return s1.i(this);
    }

    @Override // com.google.common.collect.w0, defpackage.e90
    public final Collection delegate() {
        return this.a;
    }
}
