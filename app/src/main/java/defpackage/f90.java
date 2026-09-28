package defpackage;

import com.google.common.collect.s1;
import com.google.common.collect.w0;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f90 extends w0 implements Set {
    @Override // com.google.common.collect.w0, defpackage.e90
    public abstract Set delegate();

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@CheckForNull Object obj) {
        return obj == this || delegate().equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean standardEquals(@CheckForNull Object obj) {
        return s1.f(this, obj);
    }

    public int standardHashCode() {
        return s1.i(this);
    }

    @Override // com.google.common.collect.w0
    public boolean standardRemoveAll(Collection<?> collection) {
        collection.getClass();
        return s1.n(this, collection);
    }
}
