package defpackage;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public class uh1 extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        if (jsonReader.w() != JsonToken.NULL) {
            return InetAddress.getByName(jsonReader.u());
        }
        jsonReader.s();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        jsonWriter.r(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
