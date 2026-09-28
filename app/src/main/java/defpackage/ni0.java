package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ni0 extends TypeAdapter {
    public static final ni0 a = new ni0();

    private ni0() {
    }

    public static JsonElement d(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = mi0.a[jsonToken.ordinal()];
        if (i == 3) {
            return new JsonPrimitive(jsonReader.u());
        }
        if (i == 4) {
            return new JsonPrimitive(new LazilyParsedNumber(jsonReader.u()));
        }
        if (i == 5) {
            return new JsonPrimitive(Boolean.valueOf(jsonReader.m()));
        }
        if (i == 6) {
            jsonReader.s();
            return JsonNull.a;
        }
        zu0.g(jsonToken, "Unexpected token: ");
        return null;
    }

    public static JsonElement e(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i = mi0.a[jsonToken.ordinal()];
        if (i == 1) {
            jsonReader.a();
            return new JsonArray();
        }
        if (i != 2) {
            return null;
        }
        jsonReader.b();
        return new JsonObject();
    }

    public static void f(JsonElement jsonElement, JsonWriter jsonWriter) {
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            jsonWriter.i();
            return;
        }
        if (jsonElement instanceof JsonPrimitive) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
            Serializable serializable = jsonPrimitive.a;
            if (serializable instanceof Number) {
                jsonWriter.q(jsonPrimitive.d());
                return;
            } else if (serializable instanceof Boolean) {
                jsonWriter.s(jsonPrimitive.b());
                return;
            } else {
                jsonWriter.r(jsonPrimitive.e());
                return;
            }
        }
        if (jsonElement instanceof JsonArray) {
            jsonWriter.b();
            Iterator it = ((JsonArray) jsonElement).a.iterator();
            while (it.hasNext()) {
                f((JsonElement) it.next(), jsonWriter);
            }
            jsonWriter.e();
            return;
        }
        if (!(jsonElement instanceof JsonObject)) {
            io0.m(jsonElement.getClass(), "Couldn't write ");
            return;
        }
        jsonWriter.c();
        for (Map.Entry entry : ((JsonObject) jsonElement).a.entrySet()) {
            jsonWriter.g((String) entry.getKey());
            f((JsonElement) entry.getValue(), jsonWriter);
        }
        jsonWriter.f();
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader instanceof JsonTreeReader) {
            JsonTreeReader jsonTreeReader = (JsonTreeReader) jsonReader;
            JsonToken jsonTokenW = jsonTreeReader.w();
            if (jsonTokenW == JsonToken.NAME || jsonTokenW == JsonToken.END_ARRAY || jsonTokenW == JsonToken.END_OBJECT || jsonTokenW == JsonToken.END_DOCUMENT) {
                io0.n("Unexpected ", jsonTokenW, " when reading a JsonElement.");
                return null;
            }
            JsonElement jsonElement = (JsonElement) jsonTreeReader.K();
            jsonTreeReader.D();
            return jsonElement;
        }
        JsonToken jsonTokenW2 = jsonReader.w();
        JsonElement jsonElementE = e(jsonReader, jsonTokenW2);
        if (jsonElementE == null) {
            return d(jsonReader, jsonTokenW2);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.j()) {
                String strQ = jsonElementE instanceof JsonObject ? jsonReader.q() : null;
                JsonToken jsonTokenW3 = jsonReader.w();
                JsonElement jsonElementE2 = e(jsonReader, jsonTokenW3);
                boolean z = jsonElementE2 != null;
                if (jsonElementE2 == null) {
                    jsonElementE2 = d(jsonReader, jsonTokenW3);
                }
                if (jsonElementE instanceof JsonArray) {
                    ((JsonArray) jsonElementE).a.add(jsonElementE2 == null ? JsonNull.a : jsonElementE2);
                } else {
                    ((JsonObject) jsonElementE).a.put(strQ, jsonElementE2 == null ? JsonNull.a : jsonElementE2);
                }
                if (z) {
                    arrayDeque.addLast(jsonElementE);
                    jsonElementE = jsonElementE2;
                }
            } else {
                if (jsonElementE instanceof JsonArray) {
                    jsonReader.e();
                } else {
                    jsonReader.f();
                }
                if (arrayDeque.isEmpty()) {
                    return jsonElementE;
                }
                jsonElementE = (JsonElement) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final /* bridge */ /* synthetic */ void c(JsonWriter jsonWriter, Object obj) {
        f((JsonElement) obj, jsonWriter);
    }
}
