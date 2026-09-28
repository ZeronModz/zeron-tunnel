package io.ktor.client.request;

import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final AttributeKey a;

    static {
        TypeReference typeReferenceB;
        ClassReference classReferenceA = Reflection.a(ResponseAdapter.class);
        try {
            typeReferenceB = Reflection.b(ResponseAdapter.class);
        } catch (Throwable unused) {
            typeReferenceB = null;
        }
        a = new AttributeKey("ResponseAdapterAttributeKey", new TypeInfo(classReferenceA, typeReferenceB));
    }
}
