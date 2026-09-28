package coil3;

import coil3.Extras;
import coil3.request.ImageRequest;
import coil3.request.Options;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final Object a(ImageRequest imageRequest, Extras.Key key) {
        Object obj = imageRequest.x.a.get(key);
        if (obj != null) {
            return obj;
        }
        Object obj2 = imageRequest.z.n.a.get(key);
        return obj2 == null ? key.a : obj2;
    }

    public static final Object b(Options options, Extras.Key key) {
        Object obj = options.j.a.get(key);
        return obj == null ? key.a : obj;
    }
}
