package defpackage;

import android.app.Application;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.collections.c;
import kotlin.jvm.internal.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w41 {
    public static final List a = c.A(Application.class, SavedStateHandle.class);
    public static final List b = c.z(SavedStateHandle.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Iterator itA = a.a(cls.getConstructors());
        while (itA.hasNext()) {
            Constructor constructor = (Constructor) itA.next();
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List listW = b.w(parameterTypes);
            if (list.equals(listW)) {
                return constructor;
            }
            if (list.size() == listW.size() && listW.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final ViewModel b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (ViewModel) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            s31.h("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            zu0.l("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
