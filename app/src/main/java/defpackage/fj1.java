package defpackage;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o3;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fj1 {
    public static final bj1 a = new bj1(0);
    public static final bj1 b = new bj1(1);

    /* JADX WARN: Multi-variable type inference failed */
    public final int a(Object obj, HashMap map) {
        Integer num = (Integer) map.get(obj);
        if (num != null) {
            return num.intValue();
        }
        boolean zIsInterface = d(obj).isInterface();
        Iterator it = c(obj).iterator();
        int iMax = zIsInterface;
        while (it.hasNext()) {
            iMax = Math.max(iMax, a(it.next(), map));
        }
        Object objE = e(obj);
        int iMax2 = iMax;
        if (objE != null) {
            iMax2 = Math.max(iMax, a(objE, map));
        }
        int i = iMax2 + 1;
        map.put(obj, Integer.valueOf(i));
        return i;
    }

    public ImmutableList b(ImmutableCollection immutableCollection) {
        HashMap map = new HashMap();
        Iterator<E> it = immutableCollection.iterator();
        while (it.hasNext()) {
            a(it.next(), map);
        }
        return new dj1(o3.natural().reverse(), map).immutableSortedCopy(map.keySet());
    }

    public abstract Iterable c(Object obj);

    public abstract Class d(Object obj);

    public abstract Object e(Object obj);
}
