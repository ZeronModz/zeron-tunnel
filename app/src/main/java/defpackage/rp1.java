package defpackage;

import io.ktor.util.AttributeKey;
import io.ktor.util.reflect.TypeInfo;
import io.ktor.websocket.WebSocketExtension;
import java.util.List;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeReference;
import kotlin.reflect.KTypeProjection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class rp1 {
    public static final AttributeKey a;
    public static final Logger b;

    static {
        TypeReference typeReferenceC;
        ClassReference classReferenceA = Reflection.a(List.class);
        try {
            KTypeProjection.c.getClass();
            typeReferenceC = Reflection.c(List.class, KTypeProjection.Companion.a(Reflection.c(WebSocketExtension.class, KTypeProjection.d)));
        } catch (Throwable unused) {
            typeReferenceC = null;
        }
        a = new AttributeKey("Websocket extensions", new TypeInfo(classReferenceA, typeReferenceC));
        Logger logger = LoggerFactory.getLogger("io.ktor.client.plugins.websocket.WebSockets");
        logger.getClass();
        b = logger;
    }
}
