package defpackage;

import io.ktor.http.ContentType;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ir {
    public static final ContentType a = new ContentType("text", Marker.ANY_MARKER, null, 4, null);
    public static final ContentType b = new ContentType("text", "plain", null, 4, null);
    public static final ContentType c;

    static {
        new ContentType("text", "css", null, 4, null);
        new ContentType("text", "csv", null, 4, null);
        new ContentType("text", "html", null, 4, null);
        new ContentType("text", "javascript", null, 4, null);
        new ContentType("text", "vcard", null, 4, null);
        new ContentType("text", "xml", null, 4, null);
        c = new ContentType("text", "event-stream", null, 4, null);
    }
}
