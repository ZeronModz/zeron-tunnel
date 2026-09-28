package defpackage;

import kotlin.UByte$Companion;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class wj1 implements Comparable {
    public static final UByte$Companion b;
    public final byte a;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.UByte$Companion] */
    static {
        final xu xuVar = null;
        b = new Object(xuVar) { // from class: kotlin.UByte$Companion
        };
    }

    public /* synthetic */ wj1(byte b2) {
        this.a = b2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return yg0.q(this.a & 255, ((wj1) obj).a & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wj1) {
            return this.a == ((wj1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a & 255);
    }
}
