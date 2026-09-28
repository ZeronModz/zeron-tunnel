package defpackage;

import com.google.common.collect.ArrayTable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i8 extends h8 {
    public final /* synthetic */ int b;
    public final int c;
    public final /* synthetic */ ArrayTable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(ArrayTable arrayTable, int i, int i2) {
        super(arrayTable.rowKeyToIndex);
        this.b = i2;
        switch (i2) {
            case 1:
                this.d = arrayTable;
                super(arrayTable.columnKeyToIndex);
                this.c = i;
                break;
            default:
                this.d = arrayTable;
                this.c = i;
                break;
        }
    }

    @Override // defpackage.h8
    public final String b() {
        switch (this.b) {
            case 0:
                return "Row";
            default:
                return "Column";
        }
    }

    @Override // defpackage.h8
    public final Object c(int i) {
        int i2 = this.b;
        int i3 = this.c;
        ArrayTable arrayTable = this.d;
        switch (i2) {
            case 0:
                return arrayTable.at(i, i3);
            default:
                return arrayTable.at(i3, i);
        }
    }

    @Override // defpackage.h8
    public final Object d(int i, Object obj) {
        int i2 = this.b;
        int i3 = this.c;
        ArrayTable arrayTable = this.d;
        switch (i2) {
            case 0:
                return arrayTable.set(i, i3, obj);
            default:
                return arrayTable.set(i3, i, obj);
        }
    }
}
