package defpackage;

import com.google.common.graph.d;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u20 extends d {
    @Override // com.google.common.collect.f
    public final Object a() {
        while (!this.f.hasNext()) {
            if (!c()) {
                b();
                return null;
            }
        }
        Object obj = this.e;
        Objects.requireNonNull(obj);
        return new s20(0, obj, this.f.next());
    }
}
