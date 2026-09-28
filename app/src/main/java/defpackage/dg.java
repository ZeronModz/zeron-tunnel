package defpackage;

import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import kotlin.time.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dg {
    public static final AttributeKey a;
    public static final AttributeKey b;
    public static final AttributeKey c;
    public static final AttributeKey d;

    static {
        TypeReference typeReferenceB;
        TypeReference typeReferenceB2;
        TypeReference typeReferenceB3;
        Class cls = Boolean.TYPE;
        ClassReference classReferenceA = Reflection.a(Boolean.class);
        TypeReference typeReferenceB4 = null;
        try {
            typeReferenceB = Reflection.b(cls);
        } catch (Throwable unused) {
            typeReferenceB = null;
        }
        a = new AttributeKey("SSERequestFlag", new TypeInfo(classReferenceA, typeReferenceB));
        ClassReference classReferenceA2 = Reflection.a(a.class);
        try {
            typeReferenceB2 = Reflection.b(a.class);
        } catch (Throwable unused2) {
            typeReferenceB2 = null;
        }
        b = new AttributeKey("SSEReconnectionTime", new TypeInfo(classReferenceA2, typeReferenceB2));
        ClassReference classReferenceA3 = Reflection.a(Boolean.class);
        try {
            typeReferenceB3 = Reflection.b(cls);
        } catch (Throwable unused3) {
            typeReferenceB3 = null;
        }
        c = new AttributeKey("SSEShowCommentEvents", new TypeInfo(classReferenceA3, typeReferenceB3));
        ClassReference classReferenceA4 = Reflection.a(Boolean.class);
        try {
            typeReferenceB4 = Reflection.b(cls);
        } catch (Throwable unused4) {
        }
        d = new AttributeKey("SSEShowRetryEvents", new TypeInfo(classReferenceA4, typeReferenceB4));
    }
}
