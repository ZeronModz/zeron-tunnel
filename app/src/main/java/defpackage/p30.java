package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p30 extends TypeAdapter {
    public volatile TypeAdapter a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Gson d;
    public final /* synthetic */ TypeToken e;
    public final /* synthetic */ Excluder f;

    public p30(Excluder excluder, boolean z, boolean z2, Gson gson, TypeToken typeToken) {
        this.f = excluder;
        this.b = z;
        this.c = z2;
        this.d = gson;
        this.e = typeToken;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) throws IOException {
        if (this.b) {
            jsonReader.D();
            return null;
        }
        TypeAdapter typeAdapterE = this.a;
        if (typeAdapterE == null) {
            typeAdapterE = this.d.e(this.f, this.e);
            this.a = typeAdapterE;
        }
        return typeAdapterE.b(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public final void c(JsonWriter jsonWriter, Object obj) throws IOException {
        if (this.c) {
            jsonWriter.i();
            return;
        }
        TypeAdapter typeAdapterE = this.a;
        if (typeAdapterE == null) {
            typeAdapterE = this.d.e(this.f, this.e);
            this.a = typeAdapterE;
        }
        typeAdapterE.c(jsonWriter, obj);
    }
}
