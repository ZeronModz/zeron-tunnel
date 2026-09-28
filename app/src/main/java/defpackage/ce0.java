package defpackage;

import io.ktor.http.content.OutgoingContent;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ce0 {
    public static final Logger a;

    static {
        Logger logger = LoggerFactory.getLogger("io.ktor.client.plugins.HttpCache");
        logger.getClass();
        a = logger;
    }

    public static final id0 a(OutgoingContent outgoingContent, Function1 function1, Function1 function12) {
        outgoingContent.getClass();
        return new id0(outgoingContent, 1, function1, function12);
    }
}
