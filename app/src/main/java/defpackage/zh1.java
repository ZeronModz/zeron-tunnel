package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zh1 implements TypeAdapterFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ TypeAdapter c;

    public /* synthetic */ zh1(Object obj, TypeAdapter typeAdapter, int i) {
        this.a = i;
        this.b = obj;
        this.c = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        int i = this.a;
        TypeAdapter typeAdapter = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (typeToken.a == ((Class) obj)) {
                    return typeAdapter;
                }
                return null;
            case 1:
                Class<?> cls = typeToken.a;
                if (((Class) obj).isAssignableFrom(cls)) {
                    return new io(this, cls);
                }
                return null;
            default:
                if (typeToken.equals((TypeToken) obj)) {
                    return typeAdapter;
                }
                return null;
        }
    }

    public String toString() {
        int i = this.a;
        TypeAdapter typeAdapter = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "Factory[type=" + ((Class) obj).getName() + ",adapter=" + typeAdapter + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) obj).getName() + ",adapter=" + typeAdapter + "]";
            default:
                return super.toString();
        }
    }
}
