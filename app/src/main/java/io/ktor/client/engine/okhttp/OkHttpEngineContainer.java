package io.ktor.client.engine.okhttp;

import defpackage.i60;
import io.ktor.client.HttpClientEngineContainer;
import io.ktor.client.engine.HttpClientEngineFactory;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/client/engine/okhttp/OkHttpEngineContainer;", "Lio/ktor/client/HttpClientEngineContainer;", "<init>", "()V", "ktor-client-okhttp"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OkHttpEngineContainer implements HttpClientEngineContainer {
    @Override // io.ktor.client.HttpClientEngineContainer
    public final HttpClientEngineFactory getFactory() {
        return i60.h;
    }

    public final String toString() {
        return "OkHttp";
    }
}
