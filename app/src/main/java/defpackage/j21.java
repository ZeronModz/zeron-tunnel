package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j21 extends i21 {
    public final ObjectConstructor b;

    public j21(ObjectConstructor objectConstructor, k21 k21Var) {
        super(k21Var);
        this.b = objectConstructor;
    }

    @Override // defpackage.i21
    public final Object d() {
        return this.b.construct();
    }

    @Override // defpackage.i21
    public final void f(Object obj, JsonReader jsonReader, h21 h21Var) throws IllegalAccessException {
        Field field = h21Var.b;
        Object objB = h21Var.g.b(jsonReader);
        if (objB == null && h21Var.h) {
            return;
        }
        if (h21Var.d) {
            ReflectiveTypeAdapterFactory.a(obj, field);
        } else if (h21Var.i) {
            throw new JsonIOException("Cannot set value of 'static final' ".concat(g21.d(field, false)));
        }
        field.set(obj, objB);
    }

    @Override // defpackage.i21
    public final Object e(Object obj) {
        return obj;
    }
}
