package defpackage;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.TypeToken;
import com.google.common.reflect.b;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yi1 extends gj1 {
    public final /* synthetic */ ImmutableSet.Builder b;

    public yi1(ImmutableSet.Builder builder) {
        this.b = builder;
    }

    @Override // defpackage.gj1
    public final void b(Class cls) {
        this.b.f0(cls);
    }

    @Override // defpackage.gj1
    public final void c(GenericArrayType genericArrayType) {
        Class<? super Object> rawType = TypeToken.of(genericArrayType.getGenericComponentType()).getRawType();
        di0 di0Var = b.a;
        this.b.f0(Array.newInstance(rawType, 0).getClass());
    }

    @Override // defpackage.gj1
    public final void d(ParameterizedType parameterizedType) {
        this.b.f0((Class) parameterizedType.getRawType());
    }

    @Override // defpackage.gj1
    public final void e(TypeVariable typeVariable) {
        a(typeVariable.getBounds());
    }

    @Override // defpackage.gj1
    public final void f(WildcardType wildcardType) {
        a(wildcardType.getUpperBounds());
    }
}
