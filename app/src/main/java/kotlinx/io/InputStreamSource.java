package kotlinx.io;

import defpackage.dn0;
import defpackage.vh;
import defpackage.zu0;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/io/InputStreamSource;", "Lkotlinx/io/RawSource;", "Ljava/io/InputStream;", "input", "<init>", "(Ljava/io/InputStream;)V", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
class InputStreamSource implements RawSource {
    public final InputStream a;

    public InputStreamSource(InputStream inputStream) {
        inputStream.getClass();
        this.a = inputStream;
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // kotlinx.io.RawSource
    public final long readAtMostTo(Buffer buffer, long j) throws IOException {
        buffer.getClass();
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            zu0.e(vh.j(j, "byteCount (", ") < 0"));
            return 0L;
        }
        try {
            Segment segmentE = buffer.e(1);
            long j2 = this.a.read(segmentE.a, segmentE.c, (int) Math.min(j, r4.length - r5));
            int i = j2 == -1 ? 0 : (int) j2;
            if (i == 1) {
                segmentE.c += i;
                buffer.c += (long) i;
                return j2;
            }
            if (i < 0 || i > segmentE.a()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + segmentE.a()).toString());
            }
            if (i != 0) {
                segmentE.c += i;
                buffer.c += (long) i;
                return j2;
            }
            if (dn0.v(segmentE)) {
                buffer.c();
            }
            return j2;
        } catch (AssertionError e) {
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? g.o(message, "getsockname failed", false) : false) {
                    throw new IOException(e);
                }
            }
            throw e;
        }
    }

    public final String toString() {
        return "RawSource(" + this.a + ')';
    }
}
