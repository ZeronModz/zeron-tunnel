package defpackage;

import com.trilead.ssh2.sftp.AttribFlags;
import java.util.concurrent.atomic.AtomicReference;
import okio.Segment;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x51 {
    public static final Segment a = new Segment(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(Segment segment) {
        segment.getClass();
        if (segment.f != null || segment.g != null) {
            u7.r("Failed requirement.");
            return;
        }
        if (segment.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        Segment segment2 = a;
        Segment segment3 = (Segment) atomicReference.getAndSet(segment2);
        if (segment3 == segment2) {
            return;
        }
        int i = segment3 != null ? segment3.c : 0;
        if (i >= 65536) {
            atomicReference.set(segment3);
            return;
        }
        segment.f = segment3;
        segment.b = 0;
        segment.c = i + AttribFlags.SSH_FILEXFER_ATTR_LINK_COUNT;
        atomicReference.set(segment);
    }

    public static final Segment b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        Segment segment = a;
        Segment segment2 = (Segment) atomicReference.getAndSet(segment);
        if (segment2 == segment) {
            return new Segment();
        }
        if (segment2 == null) {
            atomicReference.set(null);
            return new Segment();
        }
        atomicReference.set(segment2.f);
        segment2.f = null;
        segment2.c = 0;
        return segment2;
    }
}
