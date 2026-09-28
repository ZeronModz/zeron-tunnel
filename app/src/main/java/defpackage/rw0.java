package defpackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import okio.Buffer;
import okio.Pipe;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rw0 implements Sink {
    public final Timeout a = new Timeout();
    public final /* synthetic */ Pipe b;

    public rw0(Pipe pipe) {
        this.b = pipe;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Pipe pipe = this.b;
        ReentrantLock reentrantLock = pipe.d;
        reentrantLock.lock();
        try {
            if (pipe.c) {
                return;
            }
            pipe.c = true;
            pipe.e.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        Pipe pipe = this.b;
        ReentrantLock reentrantLock = pipe.d;
        reentrantLock.lock();
        try {
            if (pipe.c) {
                throw new IllegalStateException("closed");
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.a;
    }

    @Override // okio.Sink
    public final void write(Buffer buffer, long j) {
        buffer.getClass();
        Pipe pipe = this.b;
        ReentrantLock reentrantLock = pipe.d;
        reentrantLock.lock();
        try {
            boolean z = pipe.c;
            Condition condition = pipe.e;
            Buffer buffer2 = pipe.b;
            if (z) {
                throw new IllegalStateException("closed");
            }
            while (j > 0) {
                long j2 = pipe.a - buffer2.b;
                if (j2 == 0) {
                    this.a.a(condition);
                } else {
                    long jMin = Math.min(j2, j);
                    buffer2.write(buffer, jMin);
                    j -= jMin;
                    condition.signalAll();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
