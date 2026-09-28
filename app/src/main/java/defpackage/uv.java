package defpackage;

import io.ktor.http.ContentType;
import io.ktor.http.content.OutgoingContent;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class uv extends OutgoingContent.ByteArrayContent {
    public final ContentType a;
    public final long b;
    public final /* synthetic */ Object c;

    public uv(ContentType contentType, Object obj) {
        this.c = obj;
        if (contentType == null) {
            ContentType contentType2 = fr.a;
            contentType = fr.e;
        }
        this.a = contentType;
        this.b = ((byte[]) obj).length;
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final Long a() {
        return Long.valueOf(this.b);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final ContentType b() {
        return this.a;
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    public final byte[] d() {
        return (byte[]) this.c;
    }
}
