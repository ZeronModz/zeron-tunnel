package defpackage;

import com.google.common.cache.o;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bm0 extends o {
    public final int b;

    public bm0(Object obj, int i) {
        super(obj);
        this.b = i;
    }

    @Override // com.google.common.cache.o, com.google.common.cache.LocalCache$ValueReference
    public final int getWeight() {
        return this.b;
    }
}
