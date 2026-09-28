package defpackage;

import androidx.collection.MutableObjectList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nu0 {
    public static final Object[] a = new Object[0];

    static {
        new MutableObjectList(0);
    }

    public static final void a(int i, List list) {
        int size = list.size();
        if (i < 0 || i >= size) {
            u7.i(vh.h(i, "Index ", size, " is out of bounds. The list has ", " elements."));
        }
    }

    public static final void b(int i, int i2, List list) {
        int size = list.size();
        if (i > i2) {
            u7.r(vh.h(i, "Indices are out of order. fromIndex (", i2, ") is greater than toIndex (", ")."));
            return;
        }
        if (i < 0) {
            u7.i(hz.p(i, "fromIndex (", ") is less than 0."));
            return;
        }
        if (i2 <= size) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is more than than the list size (" + size + ')');
    }
}
