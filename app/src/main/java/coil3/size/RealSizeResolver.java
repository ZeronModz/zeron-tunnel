package coil3.size;

import defpackage.yg0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/size/RealSizeResolver;", "Lcoil3/size/SizeResolver;", "Lcoil3/size/Size;", "size", "<init>", "(Lcoil3/size/Size;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealSizeResolver implements SizeResolver {
    public final Size a;

    public RealSizeResolver(Size size) {
        this.a = size;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RealSizeResolver) && yg0.a(this.a, ((RealSizeResolver) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // coil3.size.SizeResolver
    public final Object size(Continuation continuation) {
        return this.a;
    }

    public final String toString() {
        return "RealSizeResolver(size=" + this.a + ')';
    }
}
