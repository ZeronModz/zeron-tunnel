package defpackage;

import com.google.common.cache.b;
import com.google.common.collect.ImmutableList;
import com.google.common.eventbus.Subscribe;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vb1 extends b {
    @Override // com.google.common.cache.b
    public final Object load(Object obj) {
        Set setRawTypes = TypeToken.of((Class) obj).getTypes().rawTypes();
        HashMap map = new HashMap();
        Iterator it = setRawTypes.iterator();
        while (it.hasNext()) {
            for (Method method : ((Class) it.next()).getDeclaredMethods()) {
                if (method.isAnnotationPresent(Subscribe.class) && !method.isSynthetic()) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    boolean z = parameterTypes.length == 1;
                    int length = parameterTypes.length;
                    if (!z) {
                        u7.r(j03.q("Method %s has @Subscribe annotation but has %s parameters. Subscriber methods must have exactly 1 parameter.", method, Integer.valueOf(length)));
                        return null;
                    }
                    boolean zIsPrimitive = parameterTypes[0].isPrimitive();
                    String name = parameterTypes[0].getName();
                    String simpleName = ty0.a(parameterTypes[0]).getSimpleName();
                    if (zIsPrimitive) {
                        u7.r(j03.q("@Subscribe method %s's parameter is %s. Subscriber methods cannot accept primitives. Consider changing the parameter to %s.", method, name, simpleName));
                        return null;
                    }
                    xb1 xb1Var = new xb1(method);
                    if (!map.containsKey(xb1Var)) {
                        map.put(xb1Var, method);
                    }
                }
            }
        }
        return ImmutableList.copyOf(map.values());
    }
}
