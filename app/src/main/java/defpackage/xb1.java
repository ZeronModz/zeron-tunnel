package defpackage;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xb1 {
    public final String a;
    public final List b;

    public xb1(Method method) {
        this.a = method.getName();
        this.b = Arrays.asList(method.getParameterTypes());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xb1) {
            xb1 xb1Var = (xb1) obj;
            if (this.a.equals(xb1Var.a) && this.b.equals(xb1Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
