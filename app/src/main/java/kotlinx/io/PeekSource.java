package kotlinx.io;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/io/PeekSource;", "Lkotlinx/io/RawSource;", "Lkotlinx/io/Source;", "upstream", "<init>", "(Lkotlinx/io/Source;)V", "kotlinx-io-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PeekSource implements RawSource {
    public final Source a;
    public final Buffer b;
    public Segment c;
    public int d;
    public boolean e;
    public long f;

    public PeekSource(Source source) {
        source.getClass();
        this.a = source;
        Buffer buffer = source.getC();
        this.b = buffer;
        Segment segment = buffer.a;
        this.c = segment;
        this.d = segment != null ? segment.b : -1;
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // kotlinx.io.RawSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long readAtMostTo(kotlinx.io.Buffer r12, long r13) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.io.PeekSource.readAtMostTo(kotlinx.io.Buffer, long):long");
    }
}
