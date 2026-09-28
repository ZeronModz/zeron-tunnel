package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class c01 {
    public static final HashMap b;
    public static final HashMap c;
    public final HashMap a = new HashMap();

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(b01.d, Range.create(2160, 4319));
        map.put(b01.c, Range.create(1080, 1439));
        map.put(b01.b, Range.create(720, 1079));
        map.put(b01.a, Range.create(241, 719));
        HashMap map2 = new HashMap();
        c = map2;
        map2.put(0, o8.a);
        map2.put(1, o8.c);
    }

    public c01(List list, HashMap map) {
        HashMap map2;
        Integer num;
        b01 b01Var;
        HashMap map3 = b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = c;
            if (!zHasNext) {
                break;
            }
            b01 b01Var2 = (b01) it.next();
            this.a.put(new hc(b01Var2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.a.put(new hc(b01Var2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.a.get(new hc((b01) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    b01Var = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains(Integer.valueOf(size.getHeight()))) {
                    b01Var = (b01) entry2.getKey();
                    break;
                }
            }
            if (b01Var != null) {
                Iterator it5 = map2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (o8.a(size, (Rational) entry3.getValue(), p81.b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.a.get(new hc(b01Var, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.a.entrySet()) {
            Size size2 = (Size) map.get(((hc) entry4.getKey()).a);
            if (size2 != null) {
                Size size3 = p81.a;
                Collections.sort((List) entry4.getValue(), new u8(size2.getHeight() * size2.getWidth(), 1));
            }
        }
    }
}
