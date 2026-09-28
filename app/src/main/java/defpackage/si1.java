package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.reflect.TypeResolver;
import com.google.common.reflect.b;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class si1 {
    public final ImmutableMap a;

    public si1() {
        this.a = ImmutableMap.of();
    }

    public Type a(TypeVariable typeVariable, ri1 ri1Var) {
        Type type = (Type) this.a.get(new ti1(typeVariable));
        if (type != null) {
            return new TypeResolver(ri1Var).b(type);
        }
        Type[] bounds = typeVariable.getBounds();
        if (bounds.length != 0) {
            Type[] typeArrC = new TypeResolver(ri1Var).c(bounds);
            if (!sj1.a || !Arrays.equals(bounds, typeArrC)) {
                return b.d(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrC);
            }
        }
        return typeVariable;
    }

    public si1(ImmutableMap immutableMap) {
        this.a = immutableMap;
    }
}
