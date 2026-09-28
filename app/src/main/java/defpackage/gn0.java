package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gn0 extends TypeAdapter {
    public final fh1 a;
    public final fh1 b;
    public final ObjectConstructor c;
    public final /* synthetic */ MapTypeAdapterFactory d;

    public gn0(MapTypeAdapterFactory mapTypeAdapterFactory, fh1 fh1Var, fh1 fh1Var2, ObjectConstructor objectConstructor) {
        this.d = mapTypeAdapterFactory;
        this.a = fh1Var;
        this.b = fh1Var2;
        this.c = objectConstructor;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenW = jsonReader.w();
        if (jsonTokenW == JsonToken.NULL) {
            jsonReader.s();
            return null;
        }
        Map map = (Map) this.c.construct();
        if (jsonTokenW == JsonToken.BEGIN_ARRAY) {
            jsonReader.a();
            while (jsonReader.j()) {
                jsonReader.a();
                Object objB = this.a.b.b(jsonReader);
                if (map.put(objB, this.b.b.b(jsonReader)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + objB);
                }
                jsonReader.e();
            }
            jsonReader.e();
            return map;
        }
        jsonReader.b();
        while (jsonReader.j()) {
            JsonReaderInternalAccess.a.getClass();
            if (jsonReader instanceof JsonTreeReader) {
                JsonTreeReader jsonTreeReader = (JsonTreeReader) jsonReader;
                jsonTreeReader.G(JsonToken.NAME);
                Map.Entry entry = (Map.Entry) ((Iterator) jsonTreeReader.K()).next();
                jsonTreeReader.M(entry.getValue());
                jsonTreeReader.M(new JsonPrimitive((String) entry.getKey()));
            } else {
                int iD = jsonReader.i;
                if (iD == 0) {
                    iD = jsonReader.d();
                }
                if (iD == 13) {
                    jsonReader.i = 9;
                } else if (iD == 12) {
                    jsonReader.i = 8;
                } else {
                    if (iD != 14) {
                        throw jsonReader.F("a name");
                    }
                    jsonReader.i = 10;
                }
            }
            Object objB2 = this.a.b.b(jsonReader);
            if (map.put(objB2, this.b.b.b(jsonReader)) != null) {
                throw new JsonSyntaxException("duplicate key: " + objB2);
            }
        }
        jsonReader.f();
        return map;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        String strE;
        Map map = (Map) obj;
        if (map == null) {
            jsonWriter.i();
            return;
        }
        boolean z = this.d.b;
        fh1 fh1Var = this.b;
        if (!z) {
            jsonWriter.c();
            for (Map.Entry entry : map.entrySet()) {
                jsonWriter.g(String.valueOf(entry.getKey()));
                fh1Var.c(jsonWriter, entry.getValue());
            }
            jsonWriter.f();
            return;
        }
        ArrayList arrayList = new ArrayList(map.size());
        ArrayList arrayList2 = new ArrayList(map.size());
        int i = 0;
        boolean z2 = false;
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            fh1 fh1Var2 = this.a;
            fh1Var2.getClass();
            try {
                JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
                fh1Var2.c(jsonTreeWriter, key);
                JsonElement jsonElementU = jsonTreeWriter.u();
                arrayList.add(jsonElementU);
                arrayList2.add(entry2.getValue());
                jsonElementU.getClass();
                z2 |= (jsonElementU instanceof JsonArray) || (jsonElementU instanceof JsonObject);
            } catch (IOException e) {
                throw new JsonIOException(e);
            }
        }
        if (z2) {
            jsonWriter.b();
            int size = arrayList.size();
            while (i < size) {
                jsonWriter.b();
                JsonElement jsonElement = (JsonElement) arrayList.get(i);
                ki1.z.getClass();
                ni0.f(jsonElement, jsonWriter);
                fh1Var.c(jsonWriter, arrayList2.get(i));
                jsonWriter.e();
                i++;
            }
            jsonWriter.e();
            return;
        }
        jsonWriter.c();
        int size2 = arrayList.size();
        while (i < size2) {
            JsonElement jsonElement2 = (JsonElement) arrayList.get(i);
            jsonElement2.getClass();
            if (jsonElement2 instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement2;
                Serializable serializable = jsonPrimitive.a;
                if (serializable instanceof Number) {
                    strE = String.valueOf(jsonPrimitive.d());
                } else if (serializable instanceof Boolean) {
                    strE = Boolean.toString(jsonPrimitive.b());
                } else {
                    if (!(serializable instanceof String)) {
                        zu0.a();
                        return;
                    }
                    strE = jsonPrimitive.e();
                }
            } else {
                if (!(jsonElement2 instanceof JsonNull)) {
                    zu0.a();
                    return;
                }
                strE = "null";
            }
            jsonWriter.g(strE);
            fh1Var.c(jsonWriter, arrayList2.get(i));
            i++;
        }
        jsonWriter.f();
    }
}
