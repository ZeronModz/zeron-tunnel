package coil3.disk;

import defpackage.mk1;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil3/disk/FaultHidingSink;", "Lokio/Sink;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/IOException;", "Lmk1;", "onException", "<init>", "(Lokio/Sink;Lkotlin/jvm/functions/Function1;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FaultHidingSink implements Sink {
    public final Sink a;
    public final Function1 b;
    public boolean c;

    public FaultHidingSink(Sink sink, Function1<? super IOException, mk1> function1) {
        this.a = sink;
        this.b = function1;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        try {
            this.a.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.a.timeout();
    }

    @Override // okio.Sink
    public final void write(Buffer buffer, long j) throws EOFException {
        if (this.c) {
            buffer.skip(j);
            return;
        }
        try {
            this.a.write(buffer, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
