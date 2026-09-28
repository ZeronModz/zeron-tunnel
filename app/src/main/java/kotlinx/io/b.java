package kotlinx.io;

import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.u7;
import defpackage.yg0;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.text.g;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static final Segment a;
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final AtomicReferenceArray f;
    public static final AtomicReferenceArray g;

    static {
        int iIntValue;
        int i = 0;
        Segment.h.getClass();
        a = new Segment(new byte[0], 0, 0, null, false, null);
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        int i2 = iHighestOneBit / 2;
        int i3 = i2 >= 1 ? i2 : 1;
        c = i3;
        String property = System.getProperty("kotlinx.io.pool.size.bytes", yg0.a(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304");
        property.getClass();
        Integer numA0 = g.a0(property);
        if (numA0 != null && (iIntValue = numA0.intValue()) >= 0) {
            i = iIntValue;
        }
        d = i;
        int i4 = i / i3;
        if (i4 < 8192) {
            i4 = 8192;
        }
        e = i4;
        f = new AtomicReferenceArray(iHighestOneBit);
        g = new AtomicReferenceArray(i3);
    }

    public static final void a(Segment segment) {
        segment.getClass();
        if (segment.f != null || segment.g != null) {
            u7.r("Failed requirement.");
            return;
        }
        SegmentCopyTracker segmentCopyTracker = segment.d;
        if (segmentCopyTracker != null && segmentCopyTracker.c()) {
            return;
        }
        int id = (int) ((((long) b) - 1) & Thread.currentThread().getId());
        segment.b = 0;
        segment.e = true;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = f;
            Segment segment2 = (Segment) atomicReferenceArray.get(id);
            Segment segment3 = a;
            if (segment2 != segment3) {
                int i = segment2 != null ? segment2.c : 0;
                if (i < 65536) {
                    segment.f = segment2;
                    segment.c = i + AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT;
                    while (!atomicReferenceArray.compareAndSet(id, segment2, segment)) {
                        if (atomicReferenceArray.get(id) != segment2) {
                            break;
                        }
                    }
                    return;
                }
                if (d <= 0) {
                    return;
                }
                segment.b = 0;
                segment.e = true;
                int i2 = c;
                int id2 = (int) (Thread.currentThread().getId() & (((long) i2) - 1));
                int i3 = 0;
                while (true) {
                    AtomicReferenceArray atomicReferenceArray2 = g;
                    Segment segment4 = (Segment) atomicReferenceArray2.get(id2);
                    if (segment4 != segment3) {
                        int i4 = (segment4 != null ? segment4.c : 0) + AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT;
                        if (i4 <= e) {
                            segment.f = segment4;
                            segment.c = i4;
                            while (!atomicReferenceArray2.compareAndSet(id2, segment4, segment)) {
                                if (atomicReferenceArray2.get(id2) != segment4) {
                                    break;
                                }
                            }
                            return;
                        }
                        if (i3 >= i2) {
                            return;
                        }
                        i3++;
                        id2 = (id2 + 1) & (i2 - 1);
                    }
                }
            }
        }
    }

    public static final Segment b() {
        AtomicReferenceArray atomicReferenceArray;
        Segment segment;
        Segment segment2;
        int id = (int) ((((long) b) - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = f;
            segment = a;
            segment2 = (Segment) atomicReferenceArray.getAndSet(id, segment);
        } while (yg0.a(segment2, segment));
        if (segment2 != null) {
            atomicReferenceArray.set(id, segment2.f);
            segment2.f = null;
            segment2.c = 0;
            return segment2;
        }
        atomicReferenceArray.set(id, null);
        if (d <= 0) {
            Segment.h.getClass();
            return new Segment(null);
        }
        int i = c;
        int id2 = (int) (Thread.currentThread().getId() & (((long) i) - 1));
        int i2 = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = g;
            Segment segment3 = (Segment) atomicReferenceArray2.getAndSet(id2, segment);
            if (!yg0.a(segment3, segment)) {
                if (segment3 != null) {
                    atomicReferenceArray2.set(id2, segment3.f);
                    segment3.f = null;
                    segment3.c = 0;
                    return segment3;
                }
                atomicReferenceArray2.set(id2, null);
                if (i2 >= i) {
                    Segment.h.getClass();
                    return new Segment(null);
                }
                id2 = (id2 + 1) & (i - 1);
                i2++;
            }
        }
    }
}
