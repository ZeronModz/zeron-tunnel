package defpackage;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s91 extends TypeAdapter {
    public static final r91 b = new r91();
    public final TypeAdapter a;

    public s91(TypeAdapter typeAdapter) {
        this.a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) {
        Date date = (Date) this.a.b(jsonReader);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) {
        this.a.c(jsonWriter, (Timestamp) obj);
    }
}
