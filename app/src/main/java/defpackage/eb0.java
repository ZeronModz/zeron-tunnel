package defpackage;

import com.google.common.collect.o3;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class eb0 {
    public static final o3 a = o3.natural().onResultOf(new p60(6)).compound(o3.natural().onResultOf(new p60(7))).reverse().onResultOf(new p60(8));

    public static void a(Class cls, Exception exc) {
        Object objNewInstance;
        for (Constructor constructor : a.sortedCopy(Arrays.asList(cls.getConstructors()))) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] objArr = new Object[parameterTypes.length];
            int i = 0;
            while (true) {
                objNewInstance = null;
                if (i < parameterTypes.length) {
                    Class<?> cls2 = parameterTypes[i];
                    if (cls2.equals(String.class)) {
                        objArr[i] = exc.toString();
                    } else if (!cls2.equals(Throwable.class)) {
                        break;
                    } else {
                        objArr[i] = exc;
                    }
                    i++;
                } else {
                    try {
                        objNewInstance = constructor.newInstance(objArr);
                        break;
                    } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
                    }
                }
            }
            Exception exc2 = (Exception) objNewInstance;
            if (exc2 != null) {
                if (exc2.getCause() == null) {
                    exc2.initCause(exc);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", exc);
    }
}
