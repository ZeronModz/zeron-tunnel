package defpackage;

import com.trilead.ssh2.sftp.AttribFlags;
import kotlin.UInt$Companion;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zj1 implements Comparable {
    public static final UInt$Companion b;
    public final int a;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.UInt$Companion] */
    static {
        final xu xuVar = null;
        b = new Object(xuVar) { // from class: kotlin.UInt$Companion
        };
    }

    public /* synthetic */ zj1(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return yg0.q(this.a ^ AttribFlags.SSH_FILEXFER_ATTR_EXTENDED, ((zj1) obj).a ^ AttribFlags.SSH_FILEXFER_ATTR_EXTENDED);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zj1) {
            return this.a == ((zj1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
