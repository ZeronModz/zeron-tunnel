package io.ktor.http.content;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.x10;
import defpackage.xu;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "NoContent", "ReadChannelContent", "WriteChannelContent", "ByteArrayContent", "ProtocolUpgrade", "ContentWrapper", "Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/http/content/OutgoingContent$ContentWrapper;", "Lio/ktor/http/content/OutgoingContent$NoContent;", "Lio/ktor/http/content/OutgoingContent$ProtocolUpgrade;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OutgoingContent {

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ByteArrayContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ByteArrayContent extends OutgoingContent {
        public ByteArrayContent() {
            super(null);
        }

        public abstract byte[] d();
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ContentWrapper;", "Lio/ktor/http/content/OutgoingContent;", "delegate", "<init>", "(Lio/ktor/http/content/OutgoingContent;)V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ContentWrapper extends OutgoingContent {
        public final OutgoingContent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentWrapper(OutgoingContent outgoingContent) {
            super(null);
            outgoingContent.getClass();
            this.a = outgoingContent;
        }

        @Override // io.ktor.http.content.OutgoingContent
        public final Long a() {
            return this.a.a();
        }

        @Override // io.ktor.http.content.OutgoingContent
        public final ContentType b() {
            return this.a.b();
        }

        @Override // io.ktor.http.content.OutgoingContent
        public Headers c() {
            return this.a.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/OutgoingContent$NoContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class NoContent extends OutgoingContent {
        public NoContent() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ProtocolUpgrade;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ProtocolUpgrade extends OutgoingContent {
        public ProtocolUpgrade() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ReadChannelContent extends OutgoingContent {
        public ReadChannelContent() {
            super(null);
        }

        public abstract ByteReadChannel d();
    }

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/http/content/OutgoingContent$WriteChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "<init>", "()V", "ktor-http"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class WriteChannelContent extends OutgoingContent {
        public WriteChannelContent() {
            super(null);
        }

        public abstract Object d(ByteWriteChannel byteWriteChannel, Continuation continuation);
    }

    public OutgoingContent(xu xuVar) {
    }

    public Long a() {
        return null;
    }

    public ContentType b() {
        return null;
    }

    public Headers c() {
        Headers.Companion.getClass();
        return x10.a;
    }
}
