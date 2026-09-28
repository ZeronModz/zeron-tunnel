package defpackage;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c21 {
    public static final c21 a;

    static {
        c21 a21Var;
        if (yh0.a >= 9) {
            try {
                a21Var = new a21(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                a21Var = null;
            }
        } else {
            a21Var = null;
        }
        if (a21Var == null) {
            a21Var = new b21();
        }
        a = a21Var;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
