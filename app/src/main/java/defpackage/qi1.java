package defpackage;

import com.google.common.reflect.TypeToken;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qi1 extends gj1 {
    public final /* synthetic */ int b;
    public final Serializable c;

    public qi1() {
        this.b = 0;
        this.c = new HashMap();
    }

    @Override // defpackage.gj1
    public void b(Class cls) {
        switch (this.b) {
            case 0:
                a(cls.getGenericSuperclass());
                a(cls.getGenericInterfaces());
                break;
        }
    }

    @Override // defpackage.gj1
    public void c(GenericArrayType genericArrayType) {
        switch (this.b) {
            case 1:
                a(genericArrayType.getGenericComponentType());
                break;
        }
    }

    @Override // defpackage.gj1
    public final void d(ParameterizedType parameterizedType) {
        switch (this.b) {
            case 0:
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                cn0.t(typeParameters.length == actualTypeArguments.length);
                for (int i = 0; i < typeParameters.length; i++) {
                    ti1 ti1Var = new ti1(typeParameters[i]);
                    Type type = actualTypeArguments[i];
                    HashMap map = (HashMap) this.c;
                    if (!map.containsKey(ti1Var)) {
                        Type type2 = type;
                        while (true) {
                            if (type2 == null) {
                                map.put(ti1Var, type);
                            } else {
                                boolean z = type2 instanceof TypeVariable;
                                ti1 ti1Var2 = null;
                                if (z ? ti1Var.a((TypeVariable) type2) : false) {
                                    while (type != null) {
                                        type = (Type) map.remove(type instanceof TypeVariable ? new ti1((TypeVariable) type) : null);
                                    }
                                } else {
                                    if (z) {
                                        ti1Var2 = new ti1((TypeVariable) type2);
                                    }
                                    type2 = (Type) map.get(ti1Var2);
                                }
                            }
                        }
                    }
                }
                a(cls);
                a(parameterizedType.getOwnerType());
                break;
            default:
                a(parameterizedType.getActualTypeArguments());
                a(parameterizedType.getOwnerType());
                break;
        }
    }

    @Override // defpackage.gj1
    public final void e(TypeVariable typeVariable) {
        switch (this.b) {
            case 0:
                a(typeVariable.getBounds());
                return;
            default:
                throw new IllegalArgumentException(((TypeToken) this.c).runtimeType + "contains a type variable and is not safe for the operation");
        }
    }

    @Override // defpackage.gj1
    public final void f(WildcardType wildcardType) {
        switch (this.b) {
            case 0:
                a(wildcardType.getUpperBounds());
                break;
            default:
                a(wildcardType.getLowerBounds());
                a(wildcardType.getUpperBounds());
                break;
        }
    }

    public qi1(TypeToken typeToken) {
        this.b = 1;
        this.c = typeToken;
    }
}
