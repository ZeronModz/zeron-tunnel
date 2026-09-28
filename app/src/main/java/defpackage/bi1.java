package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class bi1 implements TypeAdapterFactory {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ TypeAdapter c;

    public bi1(Class cls, Class cls2, TypeAdapter typeAdapter) {
        this.a = cls;
        this.b = cls2;
        this.c = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class cls = typeToken.a;
        if (cls == this.a || cls == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + Marker.ANY_NON_NULL_MARKER + this.a.getName() + ",adapter=" + this.c + "]";
    }
}
