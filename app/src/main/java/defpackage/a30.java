package defpackage;

import com.google.common.collect.EnumMultiset;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a30 implements Iterator {
    public int a = 0;
    public int b = -1;
    public final /* synthetic */ EnumMultiset c;

    public a30(EnumMultiset enumMultiset) {
        this.c = enumMultiset;
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            EnumMultiset enumMultiset = this.c;
            if (i >= enumMultiset.enumConstants.length) {
                return false;
            }
            int[] iArr = enumMultiset.counts;
            int i2 = this.a;
            if (iArr[i2] > 0) {
                return true;
            }
            this.a = i2 + 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            p60.m();
            return null;
        }
        Object objA = a(this.a);
        int i = this.a;
        this.b = i;
        this.a = i + 1;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        n8.h(this.b >= 0);
        EnumMultiset enumMultiset = this.c;
        if (enumMultiset.counts[this.b] > 0) {
            EnumMultiset.access$210(enumMultiset);
            EnumMultiset.access$322(enumMultiset, enumMultiset.counts[this.b]);
            enumMultiset.counts[this.b] = 0;
        }
        this.b = -1;
    }
}
