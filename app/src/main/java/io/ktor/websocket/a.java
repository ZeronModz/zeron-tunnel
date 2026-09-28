package io.ktor.websocket;

import io.ktor.websocket.CloseReason;
import kotlinx.coroutines.CoroutineName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final Logger a;
    public static final CoroutineName b;
    public static final CoroutineName c;
    public static final CloseReason d;

    static {
        Logger logger = LoggerFactory.getLogger("io.ktor.websocket.WebSocket");
        logger.getClass();
        a = logger;
        b = new CoroutineName("ws-incoming-processor");
        c = new CoroutineName("ws-outgoing-processor");
        d = new CloseReason(CloseReason.Codes.NORMAL, "OK");
    }
}
