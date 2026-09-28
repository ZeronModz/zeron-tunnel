package defpackage;

import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qu0 extends TypeAdapter {
    public static final hu0 c = new hu0(ToNumberPolicy.DOUBLE, 1);
    public final Gson a;
    public final ToNumberStrategy b;

    public qu0(Gson gson, ToNumberStrategy toNumberStrategy) {
        this.a = gson;
        this.b = toNumberStrategy;
    }

    public static Serializable e(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = pu0.a[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.a();
            return new ArrayList();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.b();
        return new LinkedTreeMap();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenW = jsonReader.w();
        Object objE = e(jsonReader, jsonTokenW);
        if (objE == null) {
            return d(jsonReader, jsonTokenW);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.j()) {
                String strQ = objE instanceof Map ? jsonReader.q() : null;
                JsonToken jsonTokenW2 = jsonReader.w();
                Serializable serializableE = e(jsonReader, jsonTokenW2);
                boolean z = serializableE != null;
                if (serializableE == null) {
                    serializableE = d(jsonReader, jsonTokenW2);
                }
                if (objE instanceof List) {
                    ((List) objE).add(serializableE);
                } else {
                    ((Map) objE).put(strQ, serializableE);
                }
                if (z) {
                    arrayDeque.addLast(objE);
                    objE = serializableE;
                }
            } else {
                if (objE instanceof List) {
                    jsonReader.e();
                } else {
                    jsonReader.f();
                }
                if (arrayDeque.isEmpty()) {
                    return objE;
                }
                objE = arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.i();
            return;
        }
        Class<?> cls = obj.getClass();
        Gson gson = this.a;
        gson.getClass();
        TypeAdapter typeAdapterD = gson.d(new TypeToken(cls));
        if (!(typeAdapterD instanceof qu0)) {
            typeAdapterD.c(jsonWriter, obj);
        } else {
            jsonWriter.c();
            jsonWriter.f();
        }
    }

    public final Serializable d(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = pu0.a[jsonToken.ordinal()];
        if (i == 3) {
            return jsonReader.u();
        }
        if (i == 4) {
            return this.b.readNumber(jsonReader);
        }
        if (i == 5) {
            return Boolean.valueOf(jsonReader.m());
        }
        if (i == 6) {
            jsonReader.s();
            return null;
        }
        zu0.g(jsonToken, "Unexpected token: ");
        return null;
    }
}
