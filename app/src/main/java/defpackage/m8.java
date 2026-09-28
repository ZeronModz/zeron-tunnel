package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class m8 {
    public static final /* synthetic */ Unsafe a;

    static {
        Field declaredField;
        try {
            declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    declaredField = null;
                    break;
                }
                Field field = declaredFields[i];
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    declaredField = field;
                    break;
                }
                i++;
            }
            if (declaredField != null) {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
        }
        declaredField.setAccessible(true);
        try {
            a = (Unsafe) declaredField.get(null);
        } catch (IllegalAccessException e2) {
            p60.l(e2);
        }
    }

    public static /* synthetic */ Object a(Object obj, Object obj2, long j) {
        while (true) {
            Unsafe unsafe = a;
            Object objectVolatile = unsafe.getObjectVolatile(obj, j);
            Object obj3 = obj;
            Object obj4 = obj2;
            long j2 = j;
            if (unsafe.compareAndSwapObject(obj3, j2, objectVolatile, obj4)) {
                return objectVolatile;
            }
            obj = obj3;
            j = j2;
            obj2 = obj4;
        }
    }
}
