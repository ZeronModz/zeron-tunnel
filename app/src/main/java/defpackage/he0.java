package defpackage;

import io.ktor.client.HttpClientConfig;
import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineName;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class he0 {
    public static final CoroutineName a = new CoroutineName("call-context");
    public static final AttributeKey b;

    static {
        TypeReference typeReferenceC;
        ClassReference classReferenceA = Reflection.a(HttpClientConfig.class);
        try {
            KTypeProjection.c.getClass();
            typeReferenceC = Reflection.c(HttpClientConfig.class, KTypeProjection.d);
        } catch (Throwable unused) {
            typeReferenceC = null;
        }
        b = new AttributeKey("client-config", new TypeInfo(classReferenceA, typeReferenceC));
    }
}
