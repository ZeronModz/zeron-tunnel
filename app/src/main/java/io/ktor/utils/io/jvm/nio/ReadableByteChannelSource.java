package io.ktor.utils.io.jvm.nio;

import defpackage.dn0;
import defpackage.u7;
import defpackage.vh;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlinx.io.Buffer;
import kotlinx.io.RawSource;
import kotlinx.io.Segment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/ktor/utils/io/jvm/nio/ReadableByteChannelSource;", "Lkotlinx/io/RawSource;", "Ljava/nio/channels/ReadableByteChannel;", "channel", "<init>", "(Ljava/nio/channels/ReadableByteChannel;)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
class ReadableByteChannelSource implements RawSource {
    public final ReadableByteChannel a;

    public ReadableByteChannelSource(ReadableByteChannel readableByteChannel) {
        readableByteChannel.getClass();
        this.a = readableByteChannel;
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // kotlinx.io.RawSource
    public final long readAtMostTo(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        if (j <= 0) {
            return 0L;
        }
        int iMin = (int) Math.min(j, 2147483647L);
        Segment segmentE = buffer.e(1);
        byte[] bArr = segmentE.a;
        int i = segmentE.c;
        int i2 = this.a.read(ByteBuffer.wrap(bArr, i, Math.min(iMin, bArr.length - i)));
        int iMax = Math.max(i2, 0);
        if (iMax == 1) {
            segmentE.c += iMax;
            buffer.c += (long) iMax;
        } else {
            if (iMax < 0 || iMax > segmentE.a()) {
                u7.n(segmentE.a(), vh.v(iMax, "Invalid number of bytes written: ", ". Should be in 0.."));
                return 0L;
            }
            if (iMax != 0) {
                segmentE.c += iMax;
                buffer.c += (long) iMax;
            } else if (dn0.v(segmentE)) {
                buffer.c();
            }
        }
        return i2;
    }

    public final String toString() {
        return "ReadableByteChannelSource(" + this.a + ')';
    }
}
