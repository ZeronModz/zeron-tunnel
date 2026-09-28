package io.ktor.client.plugins;

import io.ktor.client.plugins.api.ClientPlugin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final Logger a;
    public static final ClientPlugin b;

    static {
        Logger logger = LoggerFactory.getLogger("io.ktor.client.plugins.HttpPlainText");
        logger.getClass();
        a = logger;
        b = io.ktor.client.plugins.api.a.a("HttpPlainText", HttpPlainTextKt$HttpPlainText$1.INSTANCE, new c(4));
    }
}
