package io.ktor.http.content;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import io.ktor.http.ContentType;
import io.ktor.http.HttpStatusCode;
import io.ktor.http.content.OutgoingContent;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/http/content/ByteArrayContent;", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "bytes", "Lio/ktor/http/ContentType;", "contentType", "Lio/ktor/http/HttpStatusCode;", "status", "<init>", "([BLio/ktor/http/ContentType;Lio/ktor/http/HttpStatusCode;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ByteArrayContent extends OutgoingContent.ByteArrayContent {
    public final byte[] a;
    public final ContentType b;

    public /* synthetic */ ByteArrayContent(byte[] bArr, ContentType contentType, HttpStatusCode httpStatusCode, int i, xu xuVar) {
        this(bArr, (i & 2) != 0 ? null : contentType, (i & 4) != 0 ? null : httpStatusCode);
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final Long a() {
        return Long.valueOf(this.a.length);
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ContentType getB() {
        return this.b;
    }

    @Override // io.ktor.http.content.OutgoingContent.ByteArrayContent
    /* JADX INFO: renamed from: d, reason: from getter */
    public final byte[] getA() {
        return this.a;
    }

    public ByteArrayContent(byte[] bArr, ContentType contentType, HttpStatusCode httpStatusCode) {
        bArr.getClass();
        this.a = bArr;
        this.b = contentType;
    }
}
