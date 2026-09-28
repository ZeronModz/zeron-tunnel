package defpackage;

import com.google.common.collect.ArrayTable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j8 extends h8 {
    public final /* synthetic */ ArrayTable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(ArrayTable arrayTable) {
        super(arrayTable.columnKeyToIndex);
        this.b = arrayTable;
    }

    @Override // defpackage.h8
    public final String b() {
        return "Column";
    }

    @Override // defpackage.h8
    public final Object c(int i) {
        return new i8(this.b, i, 0);
    }

    @Override // defpackage.h8
    public final Object d(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.h8, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
