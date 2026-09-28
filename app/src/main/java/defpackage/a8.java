package defpackage;

import androidx.collection.ArrayMap;
import androidx.collection.IndexBasedArrayIterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a8 extends IndexBasedArrayIterator {
    public final /* synthetic */ int d;
    public final /* synthetic */ ArrayMap e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(ArrayMap arrayMap, int i) {
        super(arrayMap.c);
        this.d = i;
        switch (i) {
            case 1:
                this.e = arrayMap;
                super(arrayMap.c);
                break;
            default:
                this.e = arrayMap;
                break;
        }
    }

    @Override // androidx.collection.IndexBasedArrayIterator
    public final Object a(int i) {
        int i2 = this.d;
        ArrayMap arrayMap = this.e;
        switch (i2) {
            case 0:
                return arrayMap.f(i);
            default:
                return arrayMap.i(i);
        }
    }

    @Override // androidx.collection.IndexBasedArrayIterator
    public final void b(int i) {
        int i2 = this.d;
        ArrayMap arrayMap = this.e;
        switch (i2) {
            case 0:
                arrayMap.g(i);
                break;
            default:
                arrayMap.g(i);
                break;
        }
    }
}
