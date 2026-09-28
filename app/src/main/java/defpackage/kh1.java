package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class kh1 extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader.w() == JsonToken.NULL) {
            jsonReader.s();
            return null;
        }
        String strU = jsonReader.u();
        if (strU.length() == 1) {
            return Character.valueOf(strU.charAt(0));
        }
        StringBuilder sbX = vh.x("Expecting character, got: ", strU, "; at ");
        sbX.append(jsonReader.i());
        throw new JsonSyntaxException(sbX.toString());
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        Character ch = (Character) obj;
        jsonWriter.r(ch == null ? null : String.valueOf(ch));
    }
}
