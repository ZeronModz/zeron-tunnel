package defpackage;

import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sg {
    public static final /* synthetic */ int a = 0;

    static {
        new Buffer();
    }

    public static final Buffer a(Source source) {
        source.getClass();
        Buffer c = source.getC();
        c.getClass();
        Buffer buffer = new Buffer();
        if (c.c == 0) {
            return buffer;
        }
        Segment segment = c.a;
        segment.getClass();
        Segment segmentF = segment.f();
        buffer.a = segmentF;
        buffer.b = segmentF;
        for (Segment segment2 = segment.f; segment2 != null; segment2 = segment2.f) {
            Segment segment3 = buffer.b;
            segment3.getClass();
            Segment segmentF2 = segment2.f();
            segment3.e(segmentF2);
            buffer.b = segmentF2;
        }
        buffer.c = c.c;
        return buffer;
    }

    public static final long b(Source source, long j) {
        source.getClass();
        source.request(j);
        long jMin = Math.min(j, source.getC().c);
        source.getC().skip(jMin);
        return jMin;
    }

    public static final long c(Source source) {
        source.getClass();
        return source.getC().c;
    }
}
