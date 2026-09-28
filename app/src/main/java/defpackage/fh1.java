package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class fh1 extends TypeAdapter {
    public final Gson a;
    public final TypeAdapter b;
    public final Type c;

    public fh1(Gson gson, TypeAdapter typeAdapter, Type type) {
        this.a = gson;
        this.b = typeAdapter;
        this.c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public final Object b(JsonReader jsonReader) {
        return this.b.b(jsonReader);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    @Override // com.google.gson.TypeAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.gson.stream.JsonWriter r4, java.lang.Object r5) {
        /*
            r3 = this;
            java.lang.reflect.Type r0 = r3.c
            if (r5 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r5.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            com.google.gson.TypeAdapter r2 = r3.b
            if (r1 == r0) goto L3d
            com.google.gson.reflect.TypeToken r0 = new com.google.gson.reflect.TypeToken
            r0.<init>(r1)
            com.google.gson.Gson r3 = r3.a
            com.google.gson.TypeAdapter r3 = r3.d(r0)
            boolean r0 = r3 instanceof defpackage.i21
            if (r0 != 0) goto L26
            goto L3c
        L26:
            r0 = r2
        L27:
            boolean r1 = r0 instanceof com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
            if (r1 == 0) goto L37
            r1 = r0
            com.google.gson.internal.bind.SerializationDelegatingTypeAdapter r1 = (com.google.gson.internal.bind.SerializationDelegatingTypeAdapter) r1
            com.google.gson.TypeAdapter r1 = r1.d()
            if (r1 != r0) goto L35
            goto L37
        L35:
            r0 = r1
            goto L27
        L37:
            boolean r0 = r0 instanceof defpackage.i21
            if (r0 != 0) goto L3c
            goto L3d
        L3c:
            r2 = r3
        L3d:
            r2.c(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh1.c(com.google.gson.stream.JsonWriter, java.lang.Object):void");
    }
}
