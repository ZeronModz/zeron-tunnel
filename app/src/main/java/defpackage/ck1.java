package defpackage;

import kotlin.ULong$Companion;
import kotlin.text.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ck1 implements Comparable {
    public static final ULong$Companion b;
    public final long a;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.ULong$Companion] */
    static {
        final xu xuVar = null;
        b = new Object(xuVar) { // from class: kotlin.ULong$Companion
        };
    }

    public static String a(long j) {
        if (j >= 0) {
            a.b(10);
            String string = Long.toString(j, 10);
            string.getClass();
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        a.b(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        a.b(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((ck1) obj).a;
        long j2 = this.a ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ck1) {
            return this.a == ((ck1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return a(this.a);
    }
}
