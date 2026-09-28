package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p21 {
    public static final void a(HashMap map, Function1 function1) {
        int i;
        map.getClass();
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i = 0;
            for (Object obj : map.keySet()) {
                obj.getClass();
                map2.put(obj, map.get(obj));
                i++;
                if (i == 999) {
                    break;
                }
            }
            function1.invoke(map2);
            map2.clear();
        }
        if (i > 0) {
            function1.invoke(map2);
        }
    }
}
