package defpackage;

import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u11 extends RealWebSocket.Streams {
    public final /* synthetic */ Exchange d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u11(BufferedSource bufferedSource, BufferedSink bufferedSink, Exchange exchange) {
        super(true, bufferedSource, bufferedSink);
        this.d = exchange;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.a(true, true, null);
    }
}
