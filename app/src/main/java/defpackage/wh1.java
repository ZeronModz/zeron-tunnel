package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class wh1 extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        String strU = jsonReader.u();
        try {
            return Currency.getInstance(strU);
        } catch (IllegalArgumentException e) {
            StringBuilder sbX = vh.x("Failed parsing '", strU, "' as Currency; at path ");
            sbX.append(jsonReader.i());
            throw new JsonSyntaxException(sbX.toString(), e);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        jsonWriter.r(((Currency) obj).getCurrencyCode());
    }
}
