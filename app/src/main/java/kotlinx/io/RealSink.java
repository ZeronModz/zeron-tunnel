package kotlinx.io;

import defpackage.hz;
import defpackage.if3;
import defpackage.u7;
import defpackage.vh;
import defpackage.zu0;
import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/io/RealSink;", "Lkotlinx/io/Sink;", "Lkotlinx/io/RawSink;", "sink", "<init>", "(Lkotlinx/io/RawSink;)V", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RealSink implements Sink {
    public final RawSink a;
    public boolean b;
    public final Buffer c;

    public RealSink(RawSink rawSink) {
        rawSink.getClass();
        this.a = rawSink;
        this.c = new Buffer();
    }

    @Override // kotlinx.io.RawSink, java.lang.AutoCloseable
    public final void close() throws Throwable {
        RawSink rawSink = this.a;
        if (this.b) {
            return;
        }
        try {
            Buffer buffer = this.c;
            long j = buffer.c;
            if (j > 0) {
                rawSink.write(buffer, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            rawSink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.b = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // kotlinx.io.Sink
    public final void emit() {
        if (this.b) {
            u7.p("Sink is closed.");
            return;
        }
        Buffer buffer = this.c;
        long j = buffer.c;
        if (j > 0) {
            this.a.write(buffer, j);
        }
    }

    @Override // kotlinx.io.Sink, kotlinx.io.RawSink, java.io.Flushable
    public final void flush() {
        if (this.b) {
            u7.p("Sink is closed.");
            return;
        }
        Buffer buffer = this.c;
        long j = buffer.c;
        RawSink rawSink = this.a;
        if (j > 0) {
            rawSink.write(buffer, j);
        }
        rawSink.flush();
    }

    @Override // kotlinx.io.Sink
    /* JADX INFO: renamed from: getBuffer, reason: from getter */
    public final Buffer getC() {
        return this.c;
    }

    @Override // kotlinx.io.Sink
    public final void hintEmit() {
        if (this.b) {
            u7.p("Sink is closed.");
            return;
        }
        Buffer buffer = this.c;
        long jA = buffer.a();
        if (jA > 0) {
            this.a.write(buffer, jA);
        }
    }

    public final String toString() {
        return "buffered(" + this.a + ')';
    }

    @Override // kotlinx.io.Sink
    public final long transferFrom(RawSource rawSource) {
        rawSource.getClass();
        long j = 0;
        if (this.b) {
            u7.p("Sink is closed.");
            return 0L;
        }
        while (true) {
            long atMostTo = rawSource.readAtMostTo(this.c, 8192L);
            if (atMostTo == -1) {
                return j;
            }
            j += atMostTo;
            hintEmit();
        }
    }

    @Override // kotlinx.io.Sink
    public final void write(RawSource rawSource, long j) throws EOFException {
        rawSource.getClass();
        if (this.b) {
            u7.p("Sink is closed.");
            return;
        }
        if (j < 0) {
            zu0.e(hz.r(j, "byteCount: "));
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            long atMostTo = rawSource.readAtMostTo(this.c, j2);
            if (atMostTo == -1) {
                throw new EOFException(vh.p(vh.w(j, "Source exhausted before reading ", " bytes from it (number of bytes read: "), j - j2, ")."));
            }
            j2 -= atMostTo;
            hintEmit();
        }
    }

    @Override // kotlinx.io.Sink
    public final void writeByte(byte b) {
        if (this.b) {
            u7.p("Sink is closed.");
        } else {
            this.c.writeByte(b);
            hintEmit();
        }
    }

    @Override // kotlinx.io.Sink
    public final void writeInt(int i) {
        if (this.b) {
            u7.p("Sink is closed.");
        } else {
            this.c.writeInt(i);
            hintEmit();
        }
    }

    @Override // kotlinx.io.Sink
    public final void writeLong(long j) {
        if (this.b) {
            u7.p("Sink is closed.");
        } else {
            this.c.writeLong(j);
            hintEmit();
        }
    }

    @Override // kotlinx.io.Sink
    public final void writeShort(short s) {
        if (this.b) {
            u7.p("Sink is closed.");
        } else {
            this.c.writeShort(s);
            hintEmit();
        }
    }

    @Override // kotlinx.io.Sink
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (!this.b) {
            if3.a(bArr.length, i, i2);
            this.c.write(bArr, i, i2);
            hintEmit();
            return;
        }
        u7.p("Sink is closed.");
    }

    @Override // kotlinx.io.RawSink
    public final void write(Buffer buffer, long j) {
        buffer.getClass();
        if (this.b) {
            u7.p("Sink is closed.");
        } else if (j >= 0) {
            this.c.write(buffer, j);
            hintEmit();
        } else {
            zu0.e(hz.r(j, "byteCount: "));
        }
    }
}
