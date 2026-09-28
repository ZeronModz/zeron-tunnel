package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class v13 extends x13 {
    public static final x13 f(int i) {
        return i < 0 ? x13.b : i > 0 ? x13.c : x13.a;
    }

    @Override // defpackage.x13
    public final x13 a(Comparator comparator, Object obj, Object obj2) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.x13
    public final x13 b(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.x13
    public final x13 c(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.x13
    public final x13 d(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.x13
    public final int e() {
        return 0;
    }
}
