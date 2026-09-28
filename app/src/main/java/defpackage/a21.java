package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a21 extends c21 {
    public final /* synthetic */ Method b;

    public a21(Method method) {
        this.b = method;
    }

    @Override // defpackage.c21
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            zu0.l("Failed invoking canAccess", e);
            return false;
        }
    }
}
