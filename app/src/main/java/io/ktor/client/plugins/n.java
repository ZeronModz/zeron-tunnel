package io.ktor.client.plugins;

import defpackage.vh;
import io.ktor.client.plugins.api.ClientPlugin;
import io.ktor.client.request.HttpRequestData;
import java.io.IOException;
import java.net.SocketTimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public static final Logger a;
    public static final ClientPlugin b;

    static {
        Logger logger = LoggerFactory.getLogger("io.ktor.client.plugins.HttpTimeout");
        logger.getClass();
        a = logger;
        b = io.ktor.client.plugins.api.a.a("HttpTimeout", HttpTimeoutKt$HttpTimeout$1.INSTANCE, new c(8));
    }

    public static final SocketTimeoutException a(HttpRequestData httpRequestData, IOException iOException) {
        Object obj;
        httpRequestData.getClass();
        StringBuilder sb = new StringBuilder("Socket timeout has expired [url=");
        sb.append(httpRequestData.a);
        sb.append(", socket_timeout=");
        HttpTimeoutConfig httpTimeoutConfig = (HttpTimeoutConfig) httpRequestData.a();
        if (httpTimeoutConfig == null || (obj = httpTimeoutConfig.c) == null) {
            obj = "unknown";
        }
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(vh.k(obj, "] ms", sb));
        socketTimeoutException.initCause(iOException);
        return socketTimeoutException;
    }
}
