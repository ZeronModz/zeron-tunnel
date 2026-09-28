package io.ktor.utils.io;

import defpackage.sg;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/SourceByteReadChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/Source;", "source", "<init>", "(Lkotlinx/io/Source;)V", "Lio/ktor/utils/io/CloseToken;", "closed", "Lio/ktor/utils/io/CloseToken;", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SourceByteReadChannel implements ByteReadChannel {
    public final Source a;
    private volatile CloseToken closed;

    public SourceByteReadChannel(Source source) {
        source.getClass();
        this.a = source;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object awaitContent(int i, Continuation continuation) throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause != null) {
            throw closedCause;
        }
        int i2 = sg.a;
        return Boolean.valueOf(this.a.getC().c >= ((long) i));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final void cancel(Throwable th) {
        String message;
        if (this.closed != null) {
            return;
        }
        this.a.close();
        if (th == null || (message = th.getMessage()) == null) {
            message = "Channel was cancelled";
        }
        this.closed = new CloseToken(new IOException(message, th));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final Throwable getClosedCause() {
        CloseToken closeToken = this.closed;
        if (closeToken != null) {
            return closeToken.a();
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Source getReadBuffer() throws Throwable {
        Throwable closedCause = getClosedCause();
        if (closedCause == null) {
            return this.a;
        }
        throw closedCause;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean isClosedForRead() {
        return this.a.exhausted();
    }
}
