package defpackage;

import io.ktor.http.ContentType;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fr {
    public static final ContentType a = new ContentType("application", Marker.ANY_MARKER, null, 4, null);
    public static final ContentType b = new ContentType("application", "atom+xml", null, 4, null);
    public static final ContentType c;
    public static final ContentType d;
    public static final ContentType e;
    public static final ContentType f;
    public static final ContentType g;
    public static final ContentType h;
    public static final ContentType i;

    static {
        new ContentType("application", "cbor", null, 4, null);
        c = new ContentType("application", "json", null, 4, null);
        new ContentType("application", "hal+json", null, 4, null);
        d = new ContentType("application", "javascript", null, 4, null);
        e = new ContentType("application", "octet-stream", null, 4, null);
        f = new ContentType("application", "rss+xml", null, 4, null);
        new ContentType("application", "soap+xml", null, 4, null);
        g = new ContentType("application", "xml", null, 4, null);
        h = new ContentType("application", "xml-dtd", null, 4, null);
        new ContentType("application", "zip", null, 4, null);
        new ContentType("application", "gzip", null, 4, null);
        i = new ContentType("application", "x-www-form-urlencoded", null, 4, null);
        new ContentType("application", "pdf", null, 4, null);
        new ContentType("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet", null, 4, null);
        new ContentType("application", "vnd.openxmlformats-officedocument.wordprocessingml.document", null, 4, null);
        new ContentType("application", "vnd.openxmlformats-officedocument.presentationml.presentation", null, 4, null);
        new ContentType("application", "protobuf", null, 4, null);
        new ContentType("application", "wasm", null, 4, null);
        new ContentType("application", "problem+json", null, 4, null);
        new ContentType("application", "problem+xml", null, 4, null);
    }
}
