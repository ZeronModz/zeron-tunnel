package defpackage;

import io.ktor.http.ContentType;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hr {
    public static final ContentType a;

    static {
        new ContentType("multipart", Marker.ANY_MARKER, null, 4, null);
        new ContentType("multipart", "mixed", null, 4, null);
        new ContentType("multipart", "alternative", null, 4, null);
        new ContentType("multipart", "related", null, 4, null);
        a = new ContentType("multipart", "form-data", null, 4, null);
        new ContentType("multipart", "signed", null, 4, null);
        new ContentType("multipart", "encrypted", null, 4, null);
        new ContentType("multipart", "byteranges", null, 4, null);
    }
}
