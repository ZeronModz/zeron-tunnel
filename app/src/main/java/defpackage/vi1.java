package defpackage;

import com.google.common.reflect.b;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class vi1 {
    public static final vi1 b = new vi1(new AtomicInteger());
    public final AtomicInteger a;

    public vi1(AtomicInteger atomicInteger) {
        this.a = atomicInteger;
    }

    public final Type a(Type type) {
        type.getClass();
        if ((type instanceof Class) || (type instanceof TypeVariable)) {
            return type;
        }
        boolean z = type instanceof GenericArrayType;
        AtomicInteger atomicInteger = this.a;
        if (z) {
            return b.c(new vi1(atomicInteger).a(((GenericArrayType) type).getGenericComponentType()));
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? b(wildcardType.getUpperBounds()) : type;
            }
            u7.g("must have been one of the known types");
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i = 0; i < actualTypeArguments.length; i++) {
            actualTypeArguments[i] = new ui1(atomicInteger, typeParameters[i]).a(actualTypeArguments[i]);
        }
        vi1 vi1Var = new vi1(atomicInteger);
        Type ownerType = parameterizedType.getOwnerType();
        return b.e(ownerType != null ? vi1Var.a(ownerType) : null, cls, actualTypeArguments);
    }

    public TypeVariable b(Type[] typeArr) {
        return b.d(vi1.class, "capture#" + this.a.incrementAndGet() + "-of ? extends " + new q43(String.valueOf('&')).a(Arrays.asList(typeArr)), typeArr);
    }
}
