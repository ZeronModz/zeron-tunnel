package defpackage;

import kotlin.UShort$Companion;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gk1 implements Comparable {
    public static final UShort$Companion b;
    public final short a;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.UShort$Companion] */
    static {
        final xu xuVar = null;
        b = new Object(xuVar) { // from class: kotlin.UShort$Companion
        };
    }

    public /* synthetic */ gk1(short s) {
        this.a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return yg0.q(this.a & 65535, ((gk1) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gk1) {
            return this.a == ((gk1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
