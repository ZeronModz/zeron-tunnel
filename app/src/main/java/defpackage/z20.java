package defpackage;

import com.google.common.collect.EnumMultiset;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z20 extends a30 {
    public final /* synthetic */ EnumMultiset d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z20(EnumMultiset enumMultiset) {
        super(enumMultiset);
        this.d = enumMultiset;
    }

    @Override // defpackage.a30
    public final Object a(int i) {
        return this.d.enumConstants[i];
    }
}
