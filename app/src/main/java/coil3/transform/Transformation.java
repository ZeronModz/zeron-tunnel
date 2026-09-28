package coil3.transform;

import android.graphics.Bitmap;
import coil3.size.Size;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yg0;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil3/transform/Transformation;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Transformation {
    public abstract String a();

    public abstract Bitmap b(Bitmap bitmap, Size size);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Transformation) && yg0.a(a(), ((Transformation) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return Reflection.a(getClass()).getSimpleName() + "(cacheKey=" + a() + ')';
    }
}
