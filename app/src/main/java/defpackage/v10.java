package defpackage;

import io.ktor.http.content.OutgoingContent;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v10 extends OutgoingContent.NoContent {
    public static final v10 a = new v10();

    @Override // io.ktor.http.content.OutgoingContent
    public final Long a() {
        return 0L;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v10);
    }

    public final int hashCode() {
        return 1450860306;
    }

    public final String toString() {
        return "EmptyContent";
    }
}
