package defpackage;

import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kv {
    public static final AttributeKey a;
    public static final Logger b;

    static {
        TypeReference typeReferenceB;
        ClassReference classReferenceA = Reflection.a(mk1.class);
        try {
            typeReferenceB = Reflection.b(mk1.class);
        } catch (Throwable unused) {
            typeReferenceB = null;
        }
        a = new AttributeKey("ValidateMark", new TypeInfo(classReferenceA, typeReferenceB));
        Logger logger = LoggerFactory.getLogger("io.ktor.client.plugins.DefaultResponseValidation");
        logger.getClass();
        b = logger;
    }
}
