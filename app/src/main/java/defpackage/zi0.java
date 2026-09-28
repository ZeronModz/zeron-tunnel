package defpackage;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zi0 implements JsonSerializer {
    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(Object obj, Type type, JsonSerializationContext jsonSerializationContext) {
        Double d = (Double) obj;
        return new JsonPrimitive(d != null ? Integer.valueOf((int) d.doubleValue()) : null);
    }
}
