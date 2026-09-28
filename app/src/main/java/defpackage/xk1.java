package defpackage;

import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.UnsafeAllocator;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xk1 extends UnsafeAllocator {
    public final /* synthetic */ Method b;
    public final /* synthetic */ int c;

    public xk1(int i, Method method) {
        this.b = method;
        this.c = i;
    }

    @Override // com.google.gson.internal.UnsafeAllocator
    public final Object a(Class cls) {
        String strA = ConstructorConstructor.a(cls);
        if (strA == null) {
            return this.b.invoke(null, cls, Integer.valueOf(this.c));
        }
        u7.g("UnsafeAllocator is used for non-instantiable type: ".concat(strA));
        return null;
    }
}
