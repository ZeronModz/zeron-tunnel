package defpackage;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class dc0 extends TypeAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ TypeAdapter b;

    public /* synthetic */ dc0(TypeAdapter typeAdapter, int i) {
        this.a = i;
        this.b = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        int i = this.a;
        TypeAdapter typeAdapter = this.b;
        switch (i) {
            case 0:
                return new AtomicLong(((Number) typeAdapter.b(jsonReader)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                jsonReader.a();
                while (jsonReader.j()) {
                    arrayList.add(Long.valueOf(((Number) typeAdapter.b(jsonReader)).longValue()));
                }
                jsonReader.e();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        int i = this.a;
        TypeAdapter typeAdapter = this.b;
        switch (i) {
            case 0:
                typeAdapter.c(jsonWriter, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                jsonWriter.b();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    typeAdapter.c(jsonWriter, Long.valueOf(atomicLongArray.get(i2)));
                }
                jsonWriter.e();
                break;
        }
    }
}
