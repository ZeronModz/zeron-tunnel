package defpackage;

import io.ktor.client.engine.HttpClientEngineCapability;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.collections.h;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ge0 {
    public static final AttributeKey a;

    static {
        TypeReference typeReference;
        ClassReference classReferenceA = Reflection.a(Map.class);
        try {
            KTypeProjection.c.getClass();
            KTypeProjection kTypeProjectionA = KTypeProjection.Companion.a(Reflection.c(HttpClientEngineCapability.class, KTypeProjection.d));
            KTypeProjection kTypeProjectionA2 = KTypeProjection.Companion.a(Reflection.b(Object.class));
            ReflectionFactory reflectionFactory = Reflection.a;
            ClassReference classReferenceA2 = Reflection.a(Map.class);
            List listAsList = Arrays.asList(kTypeProjectionA, kTypeProjectionA2);
            reflectionFactory.getClass();
            TypeReference typeReference2 = new TypeReference(classReferenceA2, listAsList, false);
            typeReference = new TypeReference(typeReference2.a, typeReference2.b, typeReference2.c, typeReference2.d | 2);
        } catch (Throwable unused) {
            typeReference = null;
        }
        a = new AttributeKey("EngineCapabilities", new TypeInfo(classReferenceA, typeReference));
        h.b(pe0.a);
    }
}
