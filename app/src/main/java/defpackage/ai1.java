package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class ai1 extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        BitSet bitSet = new BitSet();
        jsonReader.a();
        JsonToken jsonTokenW = jsonReader.w();
        int i = 0;
        while (jsonTokenW != JsonToken.END_ARRAY) {
            int i2 = ci1.a[jsonTokenW.ordinal()];
            boolean zM = true;
            if (i2 == 1 || i2 == 2) {
                int iO = jsonReader.o();
                if (iO == 0) {
                    zM = false;
                } else if (iO != 1) {
                    StringBuilder sbV = vh.v(iO, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbV.append(jsonReader.i());
                    throw new JsonSyntaxException(sbV.toString());
                }
            } else {
                if (i2 != 3) {
                    StringBuilder sb = new StringBuilder("Invalid bitset value type: ");
                    sb.append(jsonTokenW);
                    String path = jsonReader.getPath();
                    sb.append("; at path ");
                    sb.append(path);
                    throw new JsonSyntaxException(sb.toString());
                }
                zM = jsonReader.m();
            }
            if (zM) {
                bitSet.set(i);
            }
            i++;
            jsonTokenW = jsonReader.w();
        }
        jsonReader.e();
        return bitSet;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        jsonWriter.b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            jsonWriter.o(bitSet.get(i) ? 1L : 0L);
        }
        jsonWriter.e();
    }
}
