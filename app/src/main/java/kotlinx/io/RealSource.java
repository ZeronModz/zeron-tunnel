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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/io/RealSource;", "Lkotlinx/io/Source;", "Lkotlinx/io/RawSource;", "source", "<init>", "(Lkotlinx/io/RawSource;)V", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RealSource implements Source {
    public final RawSource a;
    public boolean b;
    public final Buffer c;

    public RealSource(RawSource rawSource) {
        rawSource.getClass();
        this.a = rawSource;
        this.c = new Buffer();
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public final void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.close();
        Buffer buffer = this.c;
        buffer.skip(buffer.c);
    }

    @Override // kotlinx.io.Source
    public final boolean exhausted() {
        if (this.b) {
            u7.p("Source is closed.");
            return false;
        }
        Buffer buffer = this.c;
        return buffer.exhausted() && this.a.readAtMostTo(buffer, 8192L) == -1;
    }

    @Override // kotlinx.io.Source, kotlinx.io.Sink
    /* JADX INFO: renamed from: getBuffer, reason: from getter */
    public final Buffer getC() {
        return this.c;
    }

    @Override // kotlinx.io.Source
    public final Source peek() {
        if (!this.b) {
            return new RealSource(new PeekSource(this));
        }
        u7.p("Source is closed.");
        return null;
    }

    @Override // kotlinx.io.RawSource
    public final long readAtMostTo(Buffer buffer, long j) {
        buffer.getClass();
        if (this.b) {
            u7.p("Source is closed.");
            return 0L;
        }
        if (j < 0) {
            zu0.e(hz.r(j, "byteCount: "));
            return 0L;
        }
        Buffer buffer2 = this.c;
        if (buffer2.c == 0 && this.a.readAtMostTo(buffer2, 8192L) == -1) {
            return -1L;
        }
        return buffer2.readAtMostTo(buffer, Math.min(j, buffer2.c));
    }

    @Override // kotlinx.io.Source
    public final byte readByte() throws EOFException {
        require(1L);
        return this.c.readByte();
    }

    @Override // kotlinx.io.Source
    public final int readInt() throws EOFException {
        require(4L);
        return this.c.readInt();
    }

    @Override // kotlinx.io.Source
    public final long readLong() throws EOFException {
        require(8L);
        return this.c.readLong();
    }

    @Override // kotlinx.io.Source
    public final short readShort() throws EOFException {
        require(2L);
        return this.c.readShort();
    }

    @Override // kotlinx.io.Source
    public final void readTo(RawSink rawSink, long j) throws EOFException {
        Buffer buffer = this.c;
        rawSink.getClass();
        try {
            require(j);
            buffer.readTo(rawSink, j);
        } catch (EOFException e) {
            rawSink.write(buffer, buffer.c);
            throw e;
        }
    }

    @Override // kotlinx.io.Source
    public final boolean request(long j) {
        Buffer buffer;
        if (this.b) {
            u7.p("Source is closed.");
            return false;
        }
        if (j < 0) {
            zu0.e(hz.r(j, "byteCount: "));
            return false;
        }
        do {
            buffer = this.c;
            if (buffer.c >= j) {
                return true;
            }
        } while (this.a.readAtMostTo(buffer, 8192L) != -1);
        return false;
    }

    @Override // kotlinx.io.Source
    public final void require(long j) throws EOFException {
        if (!request(j)) {
            throw new EOFException(vh.j(j, "Source doesn't contain required number of bytes (", ")."));
        }
    }

    @Override // kotlinx.io.Source
    public final void skip(long j) throws EOFException {
        if (this.b) {
            u7.p("Source is closed.");
            return;
        }
        if (j < 0) {
            zu0.e(hz.r(j, "byteCount: "));
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            Buffer buffer = this.c;
            if (buffer.c == 0 && this.a.readAtMostTo(buffer, 8192L) == -1) {
                throw new EOFException(vh.p(vh.w(j, "Source exhausted before skipping ", " bytes (only "), j2 - j, " bytes were skipped)."));
            }
            long jMin = Math.min(j2, buffer.c);
            buffer.skip(jMin);
            j2 -= jMin;
        }
    }

    public final String toString() {
        return "buffered(" + this.a + ')';
    }

    @Override // kotlinx.io.Source
    public final long transferTo(RawSink rawSink) {
        Buffer buffer;
        rawSink.getClass();
        long j = 0;
        while (true) {
            RawSource rawSource = this.a;
            buffer = this.c;
            if (rawSource.readAtMostTo(buffer, 8192L) == -1) {
                break;
            }
            long jA = buffer.a();
            if (jA > 0) {
                j += jA;
                rawSink.write(buffer, jA);
            }
        }
        long j2 = buffer.c;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        rawSink.write(buffer, j2);
        return j3;
    }

    @Override // kotlinx.io.Source
    public final int readAtMostTo(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if3.a(bArr.length, i, i2);
        Buffer buffer = this.c;
        if (buffer.c == 0 && this.a.readAtMostTo(buffer, 8192L) == -1) {
            return -1;
        }
        return buffer.readAtMostTo(bArr, i, ((int) Math.min(i2 - i, buffer.c)) + i);
    }
}
