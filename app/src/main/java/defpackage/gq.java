package defpackage;

import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class gq {
    public static final Symbol a = new Symbol("CLOSED");

    public static final Object a(Segment segment, long j, Function2 function2) {
        while (true) {
            Segment segment2 = segment;
            while (true) {
                if (segment2.d >= j && !segment2.c()) {
                    return segment2;
                }
                Object objectVolatile = m8.a.getObjectVolatile(segment2, ConcurrentLinkedListNode.a);
                Symbol symbol = a;
                if (objectVolatile == symbol) {
                    return symbol;
                }
                segment = (Segment) ((ConcurrentLinkedListNode) objectVolatile);
                if (segment != null) {
                    break;
                }
                Segment segment3 = (Segment) function2.invoke(Long.valueOf(segment2.d + 1), segment2);
                while (true) {
                    Unsafe unsafe = m8.a;
                    long j2 = ConcurrentLinkedListNode.a;
                    if (unsafe.compareAndSwapObject(segment2, j2, (Object) null, segment3)) {
                        if (segment2.c()) {
                            segment2.d();
                        }
                        segment2 = segment3;
                    } else if (unsafe.getObjectVolatile(segment2, j2) != null) {
                        break;
                    }
                }
            }
        }
    }
}
