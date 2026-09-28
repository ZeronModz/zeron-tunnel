package defpackage;

import io.ktor.http.ContentType;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gr {
    public static final ContentType a;

    static {
        new ContentType("image", Marker.ANY_MARKER, null, 4, null);
        new ContentType("image", "gif", null, 4, null);
        new ContentType("image", "jpeg", null, 4, null);
        new ContentType("image", "png", null, 4, null);
        a = new ContentType("image", "svg+xml", null, 4, null);
        new ContentType("image", "x-icon", null, 4, null);
    }
}
