package defpackage;

import com.google.common.graph.d;
import java.util.Objects;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v20 extends d {
    public HashSet g;

    @Override // com.google.common.collect.f
    public final Object a() {
        do {
            Objects.requireNonNull(this.g);
            while (this.f.hasNext()) {
                Object next = this.f.next();
                if (!this.g.contains(next)) {
                    Object obj = this.e;
                    Objects.requireNonNull(obj);
                    return new s20(1, next, obj);
                }
            }
            this.g.add(this.e);
        } while (c());
        this.g = null;
        b();
        return null;
    }
}
