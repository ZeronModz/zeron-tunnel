package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i21 extends TypeAdapter {
    public final k21 a;

    public i21(k21 k21Var) {
        this.a = k21Var;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader.w() == JsonToken.NULL) {
            jsonReader.s();
            return null;
        }
        Object objD = d();
        Map map = this.a.a;
        try {
            jsonReader.b();
            while (jsonReader.j()) {
                h21 h21Var = (h21) map.get(jsonReader.q());
                if (h21Var == null) {
                    jsonReader.D();
                } else {
                    f(objD, jsonReader, h21Var);
                }
            }
            jsonReader.f();
            return e(objD);
        } catch (IllegalAccessException e) {
            ii2 ii2Var = g21.a;
            zu0.l("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            return null;
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.i();
            return;
        }
        jsonWriter.c();
        try {
            Iterator it = this.a.b.iterator();
            while (it.hasNext()) {
                ((h21) it.next()).a(jsonWriter, obj);
            }
            jsonWriter.f();
        } catch (IllegalAccessException e) {
            ii2 ii2Var = g21.a;
            zu0.l("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object d();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, JsonReader jsonReader, h21 h21Var);
}
