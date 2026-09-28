package defpackage;

import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.plugins.api.a;
import io.ktor.client.plugins.c;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class me0 {
    public static final Logger a;
    public static final ClientPlugin b;

    static {
        Logger logger = LoggerFactory.getLogger("io.ktor.client.plugins.HttpRequestLifecycle");
        logger.getClass();
        a = logger;
        b = a.b("RequestLifecycle", new c(6));
    }
}
