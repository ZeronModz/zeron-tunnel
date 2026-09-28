package defpackage;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class xg1 implements TypeAdapterFactory {
    public final TypeToken a;
    public final boolean b;
    public final JsonSerializer c;
    public final JsonDeserializer d;

    /* JADX WARN: Multi-variable type inference failed */
    public xg1(zi0 zi0Var, TypeToken typeToken, boolean z) {
        this.c = zi0Var;
        this.d = zi0Var instanceof JsonDeserializer ? (JsonDeserializer) zi0Var : null;
        this.a = typeToken;
        this.b = z;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        TypeToken typeToken2 = this.a;
        if (typeToken2.equals(typeToken) || (this.b && typeToken2.b == typeToken.a)) {
            return new TreeTypeAdapter(this.c, this.d, gson, typeToken, this);
        }
        return null;
    }
}
