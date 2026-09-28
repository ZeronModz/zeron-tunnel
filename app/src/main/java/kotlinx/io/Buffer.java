package kotlinx.io;

import defpackage.dn0;
import defpackage.hz;
import defpackage.if3;
import defpackage.u7;
import defpackage.vh;
import defpackage.zu0;
import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/io/Buffer;", "Lkotlinx/io/Source;", "Lkotlinx/io/Sink;", "<init>", "()V", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Buffer implements Source, Sink {
    public Segment a;
    public Segment b;
    public long c;

    public final long a() {
        long j = this.c;
        if (j == 0) {
            return 0L;
        }
        Segment segment = this.b;
        segment.getClass();
        int i = segment.c;
        return (i >= 8192 || !segment.e) ? j : j - ((long) (i - segment.b));
    }

    public final void b() {
        Segment segment = this.a;
        segment.getClass();
        Segment segment2 = segment.f;
        this.a = segment2;
        if (segment2 == null) {
            this.b = null;
        } else {
            segment2.g = null;
        }
        segment.f = null;
        b.a(segment);
    }

    public final /* synthetic */ void c() {
        Segment segment = this.b;
        segment.getClass();
        Segment segment2 = segment.g;
        this.b = segment2;
        if (segment2 == null) {
            this.a = null;
        } else {
            segment2.f = null;
        }
        segment.g = null;
        b.a(segment);
    }

    public final void d(long j) throws EOFException {
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: " + j + ')');
    }

    public final /* synthetic */ Segment e(int i) {
        if (i < 1 || i > 8192) {
            u7.r("unexpected capacity");
            return null;
        }
        Segment segment = this.b;
        if (segment == null) {
            Segment segmentB = b.b();
            this.a = segmentB;
            this.b = segmentB;
            return segmentB;
        }
        if (segment.c + i <= 8192 && segment.e) {
            return segment;
        }
        Segment segmentB2 = b.b();
        segment.e(segmentB2);
        this.b = segmentB2;
        return segmentB2;
    }

    @Override // kotlinx.io.Source
    public final boolean exhausted() {
        return this.c == 0;
    }

    @Override // kotlinx.io.Source
    public final Source peek() {
        return new RealSource(new PeekSource(this));
    }

    @Override // kotlinx.io.Source
    public final int readAtMostTo(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if3.a(bArr.length, i, i2);
        Segment segment = this.a;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i2 - i, segment.b());
        int i3 = (i + iMin) - i;
        byte[] bArr2 = segment.a;
        int i4 = segment.b;
        kotlin.collections.b.f(i, i4, i4 + i3, bArr2, bArr);
        segment.b += i3;
        this.c -= (long) iMin;
        if (dn0.v(segment)) {
            b();
        }
        return iMin;
    }

    @Override // kotlinx.io.Source
    public final byte readByte() throws EOFException {
        Segment segment = this.a;
        if (segment == null) {
            d(1L);
            throw null;
        }
        int iB = segment.b();
        if (iB == 0) {
            b();
            return readByte();
        }
        byte[] bArr = segment.a;
        int i = segment.b;
        segment.b = i + 1;
        byte b = bArr[i];
        this.c--;
        if (iB == 1) {
            b();
        }
        return b;
    }

    @Override // kotlinx.io.Source
    public final int readInt() throws EOFException {
        Segment segment = this.a;
        if (segment == null) {
            d(4L);
            throw null;
        }
        int iB = segment.b();
        if (iB < 4) {
            require(4L);
            if (iB == 0) {
                b();
                return readInt();
            }
            return (readShort() & 65535) | (readShort() << 16);
        }
        byte[] bArr = segment.a;
        int i = segment.b;
        int i2 = (bArr[i + 3] & 255) | ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        segment.b = i + 4;
        this.c -= 4;
        if (iB == 4) {
            b();
        }
        return i2;
    }

    @Override // kotlinx.io.Source
    public final long readLong() throws EOFException {
        Segment segment = this.a;
        if (segment == null) {
            d(8L);
            throw null;
        }
        int iB = segment.b();
        if (iB < 8) {
            require(8L);
            if (iB != 0) {
                return (((long) readInt()) << 32) | (((long) readInt()) & 4294967295L);
            }
            b();
            return readLong();
        }
        byte[] bArr = segment.a;
        int i = segment.b;
        long j = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i + 7]) & 255);
        segment.b = i + 8;
        this.c -= 8;
        if (iB == 8) {
            b();
        }
        return j;
    }

    @Override // kotlinx.io.Source
    public final short readShort() throws EOFException {
        Segment segment = this.a;
        if (segment == null) {
            d(2L);
            throw null;
        }
        int iB = segment.b();
        if (iB < 2) {
            require(2L);
            if (iB == 0) {
                b();
                return readShort();
            }
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = segment.a;
        int i = segment.b;
        short s = (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
        segment.b = i + 2;
        this.c -= 2;
        if (iB == 2) {
            b();
        }
        return s;
    }

    @Override // kotlinx.io.Source
    public final void readTo(RawSink rawSink, long j) throws EOFException {
        rawSink.getClass();
        if (j < 0) {
            zu0.e(vh.j(j, "byteCount (", ") < 0"));
            return;
        }
        long j2 = this.c;
        if (j2 >= j) {
            rawSink.write(this, j);
        } else {
            rawSink.write(this, j2);
            throw new EOFException(vh.p(vh.w(j, "Buffer exhausted before writing ", " bytes. Only "), this.c, " bytes were written."));
        }
    }

    @Override // kotlinx.io.Source
    public final boolean request(long j) {
        if (j >= 0) {
            return this.c >= j;
        }
        zu0.e(vh.j(j, "byteCount: ", " < 0"));
        return false;
    }

    @Override // kotlinx.io.Source
    public final void require(long j) throws EOFException {
        if (j < 0) {
            zu0.e(hz.r(j, "byteCount: "));
            return;
        }
        if (this.c >= j) {
            return;
        }
        throw new EOFException("Buffer doesn't contain required number of bytes (size: " + this.c + ", required: " + j + ')');
    }

    @Override // kotlinx.io.Source
    public final void skip(long j) {
        if (j < 0) {
            zu0.e(vh.j(j, "byteCount (", ") < 0"));
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            Segment segment = this.a;
            if (segment == null) {
                throw new EOFException(vh.j(j, "Buffer exhausted before skipping ", " bytes."));
            }
            int iMin = (int) Math.min(j2, segment.c - segment.b);
            long j3 = iMin;
            this.c -= j3;
            j2 -= j3;
            int i = segment.b + iMin;
            segment.b = i;
            if (i == segment.c) {
                b();
            }
        }
    }

    public final String toString() {
        long j = this.c;
        if (j == 0) {
            return "Buffer(size=0)";
        }
        int iMin = (int) Math.min(64L, j);
        StringBuilder sb = new StringBuilder((iMin * 2) + (this.c > 64 ? 1 : 0));
        int i = 0;
        for (Segment segment = this.a; segment != null; segment = segment.f) {
            int i2 = 0;
            while (i < iMin && i2 < segment.b()) {
                int i3 = i2 + 1;
                byte bC = segment.c(i2);
                i++;
                char[] cArr = if3.d;
                sb.append(cArr[(bC >> 4) & 15]);
                sb.append(cArr[bC & 15]);
                i2 = i3;
            }
        }
        if (this.c > 64) {
            sb.append((char) 8230);
        }
        return "Buffer(size=" + this.c + " hex=" + ((Object) sb) + ')';
    }

    @Override // kotlinx.io.Sink
    public final long transferFrom(RawSource rawSource) {
        rawSource.getClass();
        long j = 0;
        while (true) {
            long atMostTo = rawSource.readAtMostTo(this, 8192L);
            if (atMostTo == -1) {
                return j;
            }
            j += atMostTo;
        }
    }

    @Override // kotlinx.io.Source
    public final long transferTo(RawSink rawSink) {
        rawSink.getClass();
        long j = this.c;
        if (j > 0) {
            rawSink.write(this, j);
        }
        return j;
    }

    @Override // kotlinx.io.RawSink
    public final void write(Buffer buffer, long j) {
        Segment segmentB;
        buffer.getClass();
        if (buffer == this) {
            u7.r("source == this");
            return;
        }
        if3.b(buffer.c, j);
        while (j > 0) {
            buffer.a.getClass();
            int i = 0;
            if (j < r0.b()) {
                Segment segment = this.b;
                if (segment != null && segment.e) {
                    long j2 = ((long) segment.c) + j;
                    SegmentCopyTracker segmentCopyTracker = segment.d;
                    if (j2 - ((long) (segmentCopyTracker != null ? segmentCopyTracker.b() : false ? 0 : segment.b)) <= 8192) {
                        Segment segment2 = buffer.a;
                        segment2.getClass();
                        segment2.g(segment, (int) j);
                        buffer.c -= j;
                        this.c += j;
                        return;
                    }
                }
                Segment segment3 = buffer.a;
                segment3.getClass();
                int i2 = (int) j;
                if (i2 <= 0 || i2 > segment3.c - segment3.b) {
                    u7.r("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    segmentB = segment3.f();
                } else {
                    segmentB = b.b();
                    byte[] bArr = segment3.a;
                    byte[] bArr2 = segmentB.a;
                    int i3 = segment3.b;
                    kotlin.collections.b.f(0, i3, i3 + i2, bArr, bArr2);
                }
                segmentB.c = segmentB.b + i2;
                segment3.b += i2;
                Segment segment4 = segment3.g;
                if (segment4 != null) {
                    segment4.e(segmentB);
                } else {
                    segmentB.f = segment3;
                    segment3.g = segmentB;
                }
                buffer.a = segmentB;
            }
            Segment segment5 = buffer.a;
            segment5.getClass();
            long jB = segment5.b();
            Segment segmentD = segment5.d();
            buffer.a = segmentD;
            if (segmentD == null) {
                buffer.b = null;
            }
            if (this.a == null) {
                this.a = segment5;
                this.b = segment5;
            } else {
                Segment segment6 = this.b;
                segment6.getClass();
                segment6.e(segment5);
                Segment segment7 = segment5.g;
                if (segment7 == null) {
                    u7.p("cannot compact");
                    return;
                }
                if (segment7.e) {
                    int i4 = segment5.c - segment5.b;
                    int i5 = 8192 - segment7.c;
                    segment7.getClass();
                    SegmentCopyTracker segmentCopyTracker2 = segment7.d;
                    if (!(segmentCopyTracker2 != null ? segmentCopyTracker2.b() : false)) {
                        Segment segment8 = segment5.g;
                        segment8.getClass();
                        i = segment8.b;
                    }
                    if (i4 <= i5 + i) {
                        Segment segment9 = segment5.g;
                        segment9.getClass();
                        segment5.g(segment9, i4);
                        if (segment5.d() != null) {
                            u7.p("Check failed.");
                            return;
                        } else {
                            b.a(segment5);
                            segment5 = segment9;
                        }
                    }
                }
                this.b = segment5;
                if (segment5.g == null) {
                    this.a = segment5;
                }
            }
            buffer.c -= jB;
            this.c += jB;
            j -= jB;
        }
    }

    @Override // kotlinx.io.Sink
    public final void writeByte(byte b) {
        Segment segmentE = e(1);
        byte[] bArr = segmentE.a;
        int i = segmentE.c;
        segmentE.c = i + 1;
        bArr[i] = b;
        this.c++;
    }

    @Override // kotlinx.io.Sink
    public final void writeInt(int i) {
        Segment segmentE = e(4);
        byte[] bArr = segmentE.a;
        int i2 = segmentE.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        segmentE.c = i2 + 4;
        this.c += 4;
    }

    @Override // kotlinx.io.Sink
    public final void writeLong(long j) {
        Segment segmentE = e(8);
        byte[] bArr = segmentE.a;
        int i = segmentE.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        segmentE.c = i + 8;
        this.c += 8;
    }

    @Override // kotlinx.io.Sink
    public final void writeShort(short s) {
        Segment segmentE = e(2);
        byte[] bArr = segmentE.a;
        int i = segmentE.c;
        bArr[i] = (byte) ((s >>> 8) & 255);
        bArr[i + 1] = (byte) (s & 255);
        segmentE.c = i + 2;
        this.c += 2;
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // kotlinx.io.Sink
    public final void emit() {
    }

    @Override // kotlinx.io.Sink, kotlinx.io.RawSink, java.io.Flushable
    public final void flush() {
    }

    @Override // kotlinx.io.Source, kotlinx.io.Sink
    /* JADX INFO: renamed from: getBuffer */
    public final Buffer getC() {
        return this;
    }

    @Override // kotlinx.io.Sink
    public final void hintEmit() {
    }

    @Override // kotlinx.io.RawSource
    public final long readAtMostTo(Buffer buffer, long j) {
        buffer.getClass();
        if (j >= 0) {
            long j2 = this.c;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            buffer.write(this, j);
            return j;
        }
        zu0.e(vh.j(j, "byteCount (", ") < 0"));
        return 0L;
    }

    @Override // kotlinx.io.Sink
    public final void write(RawSource rawSource, long j) throws EOFException {
        rawSource.getClass();
        if (j < 0) {
            zu0.e(vh.j(j, "byteCount (", ") < 0"));
            return;
        }
        long j2 = j;
        while (j2 > 0) {
            long atMostTo = rawSource.readAtMostTo(this, j2);
            if (atMostTo == -1) {
                throw new EOFException(vh.p(vh.w(j, "Source exhausted before reading ", " bytes. Only "), j - j2, " were read."));
            }
            j2 -= atMostTo;
        }
    }

    @Override // kotlinx.io.Sink
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if3.a(bArr.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            Segment segmentE = e(1);
            int iMin = Math.min(i2 - i3, segmentE.a()) + i3;
            kotlin.collections.b.f(segmentE.c, i3, iMin, bArr, segmentE.a);
            segmentE.c = (iMin - i3) + segmentE.c;
            i3 = iMin;
        }
        this.c += (long) (i2 - i);
    }
}
