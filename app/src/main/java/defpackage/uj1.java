package defpackage;

import com.google.common.collect.ImmutableMap;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class uj1 implements InvocationHandler {
    public static final ImmutableMap b;
    public final tj1 a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (Method method : tj1.class.getMethods()) {
            if (method.getDeclaringClass().equals(tj1.class)) {
                try {
                    method.setAccessible(true);
                } catch (AccessControlException unused) {
                }
                builder.d(method.getName(), method);
            }
        }
        b = builder.b();
    }

    public uj1(tj1 tj1Var) {
        this.a = tj1Var;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        Method method2 = (Method) b.get(name);
        if (method2 == null) {
            u7.s(name);
            return null;
        }
        try {
            return method2.invoke(this.a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
