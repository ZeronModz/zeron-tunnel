package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class io extends TypeAdapter {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public io(fh1 fh1Var, ObjectConstructor objectConstructor) {
        this.b = fh1Var;
        this.c = objectConstructor;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                if (jsonReader.w() == JsonToken.NULL) {
                    jsonReader.s();
                    return null;
                }
                Collection collection = (Collection) ((ObjectConstructor) obj).construct();
                jsonReader.a();
                while (jsonReader.j()) {
                    collection.add(((fh1) obj2).b.b(jsonReader));
                }
                jsonReader.e();
                return collection;
            default:
                Class cls = (Class) obj2;
                Object objB = ((zh1) obj).c.b(jsonReader);
                if (objB == null || cls.isInstance(objB)) {
                    return objB;
                }
                throw new JsonSyntaxException("Expected a " + cls.getName() + " but was " + objB.getClass().getName() + "; at path " + jsonReader.i());
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        switch (this.a) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    jsonWriter.b();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((fh1) this.b).c(jsonWriter, it.next());
                    }
                    jsonWriter.e();
                } else {
                    jsonWriter.i();
                }
                break;
            default:
                ((zh1) this.c).c.c(jsonWriter, obj);
                break;
        }
    }

    public io(zh1 zh1Var, Class cls) {
        this.c = zh1Var;
        this.b = cls;
    }
}
