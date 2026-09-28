package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vt extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        n8.e(3, "initialArraySize");
        return new ArrayList(3);
    }
}
