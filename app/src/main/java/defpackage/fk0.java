package defpackage;

import androidx.lifecycle.GeneratedAdapter;
import androidx.lifecycle.LifecycleObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fk0 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static GeneratedAdapter a(Constructor constructor, LifecycleObserver lifecycleObserver) {
        try {
            Object objNewInstance = constructor.newInstance(lifecycleObserver);
            objNewInstance.getClass();
            return (GeneratedAdapter) objNewInstance;
        } catch (IllegalAccessException e) {
            p60.l(e);
            return null;
        } catch (InstantiationException e2) {
            p60.l(e2);
            return null;
        } catch (InvocationTargetException e3) {
            p60.l(e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.Class r13) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk0.b(java.lang.Class):int");
    }
}
