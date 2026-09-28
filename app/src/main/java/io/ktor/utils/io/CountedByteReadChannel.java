package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.io.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/utils/io/CountedByteReadChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "delegate", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CountedByteReadChannel implements ByteReadChannel {
    public final ByteReadChannel a;
    public final Buffer b;
    public long c;

    public CountedByteReadChannel(ByteReadChannel byteReadChannel) {
        byteReadChannel.getClass();
        this.a = byteReadChannel;
        this.b = new Buffer();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Buffer getReadBuffer() {
        Buffer buffer = this.b;
        this.c = buffer.c;
        this.c += buffer.transferFrom(this.a.getReadBuffer());
        return buffer;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object awaitContent(int i, Continuation continuation) {
        return getReadBuffer().c < ((long) i) ? this.a.awaitContent(i, continuation) : Boolean.TRUE;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final void cancel(Throwable th) {
        this.a.cancel(th);
        this.b.getClass();
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final Throwable getClosedCause() {
        return this.a.getClosedCause();
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean isClosedForRead() {
        return this.b.exhausted() && this.a.isClosedForRead();
    }
}
