package io.ktor.client.plugins;

import defpackage.mk1;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.events.EventDefinition;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final Logger a;
    public static final EventDefinition b;
    public static final ClientPlugin c;
    public static final AttributeKey d;
    public static final AttributeKey e;
    public static final AttributeKey f;
    public static final AttributeKey g;
    public static final AttributeKey h;

    static {
        TypeReference typeReferenceB;
        TypeReference typeReferenceD;
        TypeReference typeReferenceD2;
        TypeReference typeReferenceD3;
        TypeReference typeReferenceD4;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        Logger logger = LoggerFactory.getLogger("io.ktor.client.plugins.HttpRequestRetry");
        logger.getClass();
        a = logger;
        b = new EventDefinition();
        c = io.ktor.client.plugins.api.a.a("RetryFeature", HttpRequestRetryKt$HttpRequestRetry$1.INSTANCE, new c(7));
        ClassReference classReferenceA = Reflection.a(Integer.class);
        try {
            typeReferenceB = Reflection.b(cls2);
        } catch (Throwable unused) {
            typeReferenceB = null;
        }
        d = new AttributeKey("MaxRetriesPerRequestAttributeKey", new TypeInfo(classReferenceA, typeReferenceB));
        ClassReference classReferenceA2 = Reflection.a(Function3.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.c;
            TypeReference typeReferenceB2 = Reflection.b(HttpRetryShouldRetryContext.class);
            companion.getClass();
            typeReferenceD = Reflection.d(Function3.class, KTypeProjection.Companion.a(typeReferenceB2), KTypeProjection.Companion.a(Reflection.b(HttpRequest.class)), KTypeProjection.Companion.a(Reflection.b(HttpResponse.class)), KTypeProjection.Companion.a(Reflection.b(cls)));
        } catch (Throwable unused2) {
            typeReferenceD = null;
        }
        e = new AttributeKey("ShouldRetryPerRequestAttributeKey", new TypeInfo(classReferenceA2, typeReferenceD));
        ClassReference classReferenceA3 = Reflection.a(Function3.class);
        try {
            KTypeProjection.Companion companion2 = KTypeProjection.c;
            TypeReference typeReferenceB3 = Reflection.b(HttpRetryShouldRetryContext.class);
            companion2.getClass();
            typeReferenceD2 = Reflection.d(Function3.class, KTypeProjection.Companion.a(typeReferenceB3), KTypeProjection.Companion.a(Reflection.b(HttpRequestBuilder.class)), KTypeProjection.Companion.a(Reflection.b(Throwable.class)), KTypeProjection.Companion.a(Reflection.b(cls)));
        } catch (Throwable unused3) {
            typeReferenceD2 = null;
        }
        f = new AttributeKey("ShouldRetryOnExceptionPerRequestAttributeKey", new TypeInfo(classReferenceA3, typeReferenceD2));
        ClassReference classReferenceA4 = Reflection.a(Function2.class);
        try {
            KTypeProjection.Companion companion3 = KTypeProjection.c;
            TypeReference typeReferenceB4 = Reflection.b(HttpRetryModifyRequestContext.class);
            companion3.getClass();
            typeReferenceD3 = Reflection.d(Function2.class, KTypeProjection.Companion.a(typeReferenceB4), KTypeProjection.Companion.a(Reflection.b(HttpRequestBuilder.class)), KTypeProjection.Companion.a(Reflection.b(mk1.class)));
        } catch (Throwable unused4) {
            typeReferenceD3 = null;
        }
        g = new AttributeKey("ModifyRequestPerRequestAttributeKey", new TypeInfo(classReferenceA4, typeReferenceD3));
        ClassReference classReferenceA5 = Reflection.a(Function2.class);
        try {
            KTypeProjection.Companion companion4 = KTypeProjection.c;
            TypeReference typeReferenceB5 = Reflection.b(HttpRetryDelayContext.class);
            companion4.getClass();
            typeReferenceD4 = Reflection.d(Function2.class, KTypeProjection.Companion.a(typeReferenceB5), KTypeProjection.Companion.a(Reflection.b(cls2)), KTypeProjection.Companion.a(Reflection.b(Long.TYPE)));
        } catch (Throwable unused5) {
            typeReferenceD4 = null;
        }
        h = new AttributeKey("RetryDelayPerRequestAttributeKey", new TypeInfo(classReferenceA5, typeReferenceD4));
    }
}
