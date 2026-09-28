package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.api.ClientHook;
import io.ktor.client.statement.HttpReceivePipeline;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ClientHook {
    public static final a a = new a();

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(HttpClient httpClient, Object obj) {
        Function2 function2 = (Function2) obj;
        httpClient.getClass();
        function2.getClass();
        HttpReceivePipeline httpReceivePipeline = httpClient.h;
        HttpReceivePipeline.g.getClass();
        httpReceivePipeline.g(HttpReceivePipeline.j, new AfterReceiveHook$install$1(function2, null));
    }
}
