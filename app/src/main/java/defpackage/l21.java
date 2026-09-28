package defpackage;

import com.google.gson.JsonParseException;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l21 extends i21 {
    public static final HashMap e;
    public final Constructor b;
    public final Object[] c;
    public final HashMap d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        e = map;
    }

    public l21(Class cls, k21 k21Var, boolean z) {
        super(k21Var);
        this.d = new HashMap();
        ii2 ii2Var = g21.a;
        Constructor constructorJ = ii2Var.j(cls);
        this.b = constructorJ;
        if (z) {
            ReflectiveTypeAdapterFactory.a(null, constructorJ);
        } else {
            g21.f(constructorJ);
        }
        String[] strArrK = ii2Var.k(cls);
        for (int i = 0; i < strArrK.length; i++) {
            this.d.put(strArrK[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.b.getParameterTypes();
        this.c = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.c[i2] = e.get(parameterTypes[i2]);
        }
    }

    @Override // defpackage.i21
    public final Object d() {
        return (Object[]) this.c.clone();
    }

    @Override // defpackage.i21
    public final Object e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e2) {
            ii2 ii2Var = g21.a;
            zu0.l("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e2);
            return null;
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + g21.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + g21.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e5) {
            zu0.l("Failed to invoke constructor '" + g21.b(constructor) + "' with args " + Arrays.toString(objArr), e5.getCause());
            return null;
        }
    }

    @Override // defpackage.i21
    public final void f(Object obj, JsonReader jsonReader, h21 h21Var) {
        Object[] objArr = (Object[]) obj;
        String str = h21Var.c;
        Integer num = (Integer) this.d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + g21.b(this.b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objB = h21Var.g.b(jsonReader);
        if (objB != null || !h21Var.h) {
            objArr[iIntValue] = objB;
        } else {
            StringBuilder sbX = vh.x("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbX.append(jsonReader.getPath());
            throw new JsonParseException(sbX.toString());
        }
    }
}
