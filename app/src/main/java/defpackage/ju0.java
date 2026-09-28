package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.ToNumberStrategy;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ju0 extends TypeAdapter {
    public static final hu0 b = new hu0(new ju0(ToNumberPolicy.LAZILY_PARSED_NUMBER), 0);
    public final ToNumberStrategy a;

    public ju0(ToNumberStrategy toNumberStrategy) {
        this.a = toNumberStrategy;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenW = jsonReader.w();
        int i = iu0.a[jsonTokenW.ordinal()];
        if (i == 1) {
            jsonReader.s();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.a.readNumber(jsonReader);
        }
        StringBuilder sb = new StringBuilder("Expecting number, got: ");
        sb.append(jsonTokenW);
        String path = jsonReader.getPath();
        sb.append("; at path ");
        sb.append(path);
        throw new JsonSyntaxException(sb.toString());
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        jsonWriter.q((Number) obj);
    }
}
