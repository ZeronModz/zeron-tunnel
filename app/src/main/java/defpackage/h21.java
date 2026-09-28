package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h21 {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Method e;
    public final /* synthetic */ TypeAdapter f;
    public final /* synthetic */ TypeAdapter g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;

    public h21(String str, Field field, boolean z, Method method, TypeAdapter typeAdapter, TypeAdapter typeAdapter2, boolean z2, boolean z3) {
        this.d = z;
        this.e = method;
        this.f = typeAdapter;
        this.g = typeAdapter2;
        this.h = z2;
        this.i = z3;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(JsonWriter jsonWriter, Object obj) throws IllegalAccessException {
        Object objInvoke;
        boolean z = this.d;
        Field field = this.b;
        Method method = this.e;
        if (z) {
            if (method == null) {
                ReflectiveTypeAdapterFactory.a(obj, field);
            } else {
                ReflectiveTypeAdapterFactory.a(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new JsonIOException(vh.m("Accessor ", g21.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        jsonWriter.g(this.a);
        this.f.c(jsonWriter, objInvoke);
    }
}
