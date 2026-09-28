package defpackage;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class cj1 extends ej1 {
    @Override // defpackage.fj1
    public final ImmutableList b(ImmutableCollection immutableCollection) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Object obj : immutableCollection) {
            if (!this.c.d(obj).isInterface()) {
                builder.d0(obj);
            }
        }
        return super.b(builder.f0());
    }

    @Override // defpackage.fj1
    public final Iterable c(Object obj) {
        return ImmutableSet.of();
    }
}
