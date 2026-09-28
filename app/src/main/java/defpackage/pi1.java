package defpackage;

import com.google.common.reflect.TypeResolver;
import com.google.common.reflect.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pi1 extends gj1 {
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ Type c;

    public pi1(HashMap map, Type type) {
        this.b = map;
        this.c = type;
    }

    @Override // defpackage.gj1
    public final void b(Class cls) {
        Type type = this.c;
        if (type instanceof WildcardType) {
            return;
        }
        oq.h("No type mapping from ", cls, " to ", type);
    }

    @Override // defpackage.gj1
    public final void c(GenericArrayType genericArrayType) {
        Type type = this.c;
        if (type instanceof WildcardType) {
            return;
        }
        Type typeB = b.b(type);
        cn0.h(typeB != null, "%s is not an array type.", type);
        TypeResolver.a(this.b, genericArrayType.getGenericComponentType(), typeB);
    }

    @Override // defpackage.gj1
    public final void d(ParameterizedType parameterizedType) {
        Type type = this.c;
        if (type instanceof WildcardType) {
            return;
        }
        try {
            ParameterizedType parameterizedType2 = (ParameterizedType) ParameterizedType.class.cast(type);
            Type ownerType = parameterizedType.getOwnerType();
            HashMap map = this.b;
            if (ownerType != null && parameterizedType2.getOwnerType() != null) {
                TypeResolver.a(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
            }
            cn0.i(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, type);
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
            cn0.i(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
            for (int i = 0; i < actualTypeArguments.length; i++) {
                TypeResolver.a(map, actualTypeArguments[i], actualTypeArguments2[i]);
            }
        } catch (ClassCastException unused) {
            p60.c(type, " is not a ParameterizedType");
        }
    }

    @Override // defpackage.gj1
    public final void e(TypeVariable typeVariable) {
        this.b.put(new ti1(typeVariable), this.c);
    }

    @Override // defpackage.gj1
    public final void f(WildcardType wildcardType) {
        HashMap map;
        Type type = this.c;
        if (type instanceof WildcardType) {
            WildcardType wildcardType2 = (WildcardType) type;
            Type[] upperBounds = wildcardType.getUpperBounds();
            Type[] upperBounds2 = wildcardType2.getUpperBounds();
            Type[] lowerBounds = wildcardType.getLowerBounds();
            Type[] lowerBounds2 = wildcardType2.getLowerBounds();
            cn0.i(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, type);
            int i = 0;
            while (true) {
                int length = upperBounds.length;
                map = this.b;
                if (i >= length) {
                    break;
                }
                TypeResolver.a(map, upperBounds[i], upperBounds2[i]);
                i++;
            }
            for (int i2 = 0; i2 < lowerBounds.length; i2++) {
                TypeResolver.a(map, lowerBounds[i2], lowerBounds2[i2]);
            }
        }
    }
}
