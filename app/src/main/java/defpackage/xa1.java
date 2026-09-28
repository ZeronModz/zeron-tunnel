package defpackage;

import java.util.Set;
import kotlin.collections.b;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class xa1 {
    public static final Set a;

    static {
        zj1.b.getClass();
        ck1.b.getClass();
        wj1.b.getClass();
        gk1.b.getClass();
        a = b.y(new SerialDescriptor[]{bk1.b, ek1.b, yj1.b, ik1.b});
    }

    public static final boolean a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return serialDescriptor.getL() && a.contains(serialDescriptor);
    }
}
