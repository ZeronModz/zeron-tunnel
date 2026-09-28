package defpackage;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class sh1 extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader.w() == JsonToken.NULL) {
            jsonReader.s();
            return null;
        }
        String strU = jsonReader.u();
        if (strU.equals("null")) {
            return null;
        }
        return new URL(strU);
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        URL url = (URL) obj;
        jsonWriter.r(url == null ? null : url.toExternalForm());
    }
}
