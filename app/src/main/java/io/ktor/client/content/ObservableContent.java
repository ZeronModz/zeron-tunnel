package io.ktor.client.content;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs$CastExtraArgs;
import defpackage.ii2;
import defpackage.p60;
import defpackage.qg;
import defpackage.tb0;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.client.utils.a;
import io.ktor.http.ContentType;
import io.ktor.http.Headers;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.d;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/ktor/client/content/ObservableContent;", "Lio/ktor/http/content/OutgoingContent$ReadChannelContent;", "Lio/ktor/http/content/OutgoingContent;", "delegate", "Lkotlin/coroutines/CoroutineContext;", "callContext", "Lio/ktor/client/content/ProgressListener;", ServiceSpecificExtraArgs$CastExtraArgs.LISTENER, "<init>", "(Lio/ktor/http/content/OutgoingContent;Lkotlin/coroutines/CoroutineContext;Lio/ktor/client/content/ProgressListener;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ObservableContent extends OutgoingContent.ReadChannelContent {
    public final OutgoingContent a;
    public final CoroutineContext b;
    public final ProgressListener c;
    public final ByteReadChannel d;

    public ObservableContent(OutgoingContent outgoingContent, CoroutineContext coroutineContext, ProgressListener progressListener) {
        outgoingContent.getClass();
        coroutineContext.getClass();
        progressListener.getClass();
        this.a = outgoingContent;
        this.b = coroutineContext;
        this.c = progressListener;
        this.d = e(outgoingContent);
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: a */
    public final Long getC() {
        return this.a.getC();
    }

    @Override // io.ktor.http.content.OutgoingContent
    /* JADX INFO: renamed from: b */
    public final ContentType getB() {
        return this.a.getB();
    }

    @Override // io.ktor.http.content.OutgoingContent
    public final Headers c() {
        return this.a.c();
    }

    @Override // io.ktor.http.content.OutgoingContent.ReadChannelContent
    public final ByteReadChannel d() {
        return a.a(this.d, this.b, this.a.getC(), this.c);
    }

    public final ByteReadChannel e(OutgoingContent outgoingContent) {
        if (outgoingContent instanceof OutgoingContent.ContentWrapper) {
            return e(((OutgoingContent.ContentWrapper) outgoingContent).a);
        }
        if (outgoingContent instanceof OutgoingContent.ByteArrayContent) {
            return ii2.a(((OutgoingContent.ByteArrayContent) outgoingContent).getA());
        }
        if (outgoingContent instanceof OutgoingContent.ProtocolUpgrade) {
            throw new UnsupportedContentTypeException(outgoingContent);
        }
        if (outgoingContent instanceof OutgoingContent.NoContent) {
            ByteReadChannel.Companion.getClass();
            return qg.b;
        }
        if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
            return ((OutgoingContent.ReadChannelContent) outgoingContent).d();
        }
        if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
            return d.i(tb0.a, this.b, new ObservableContent$getContent$1(outgoingContent, null)).a;
        }
        p60.b();
        return null;
    }
}
