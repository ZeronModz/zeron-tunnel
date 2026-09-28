package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class gi1 extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader.w() == JsonToken.NULL) {
            jsonReader.s();
            return null;
        }
        try {
            int iO = jsonReader.o();
            if (iO <= 65535 && iO >= -32768) {
                return Short.valueOf((short) iO);
            }
            StringBuilder sbV = vh.v(iO, "Lossy conversion from ", " to short; at path ");
            sbV.append(jsonReader.i());
            throw new JsonSyntaxException(sbV.toString());
        } catch (NumberFormatException e) {
            throw new JsonSyntaxException(e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        if (((Number) obj) == null) {
            jsonWriter.i();
        } else {
            jsonWriter.o(r4.shortValue());
        }
    }
}
