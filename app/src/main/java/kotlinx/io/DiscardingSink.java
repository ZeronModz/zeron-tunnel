package kotlinx.io;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/io/DiscardingSink;", "Lkotlinx/io/RawSink;", "<init>", "()V", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DiscardingSink implements RawSink {
    @Override // kotlinx.io.RawSink
    public final void write(Buffer buffer, long j) {
        buffer.getClass();
        buffer.skip(j);
    }

    @Override // kotlinx.io.RawSink, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // kotlinx.io.RawSink, java.io.Flushable
    public final void flush() {
    }
}
