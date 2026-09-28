package kotlinx.io;

import defpackage.if3;
import defpackage.u7;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/io/OutputStreamSink;", "Lkotlinx/io/RawSink;", "Ljava/io/OutputStream;", "out", "<init>", "(Ljava/io/OutputStream;)V", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
class OutputStreamSink implements RawSink {
    public final OutputStream a;

    public OutputStreamSink(OutputStream outputStream) {
        outputStream.getClass();
        this.a = outputStream;
    }

    @Override // kotlinx.io.RawSink, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // kotlinx.io.RawSink, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    public final String toString() {
        return "RawSink(" + this.a + ')';
    }

    @Override // kotlinx.io.RawSink
    public final void write(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        if3.b(buffer.c, j);
        while (j > 0) {
            if (buffer.exhausted()) {
                u7.r("Buffer is empty");
                return;
            }
            Segment segment = buffer.a;
            segment.getClass();
            byte[] bArr = segment.a;
            int i = segment.b;
            int iMin = (int) Math.min(j, segment.c - i);
            this.a.write(bArr, i, iMin);
            long j2 = iMin;
            j -= j2;
            if (iMin != 0) {
                if (iMin < 0) {
                    u7.p("Returned negative read bytes count");
                    return;
                } else {
                    if (iMin > segment.b()) {
                        u7.p("Returned too many bytes");
                        return;
                    }
                    buffer.skip(j2);
                }
            }
        }
    }
}
