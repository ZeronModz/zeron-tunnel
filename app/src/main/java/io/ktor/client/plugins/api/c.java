package io.ktor.client.plugins.api;

import defpackage.ie0;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpSend;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements ClientHook {
    public static final c a = new c();

    @Override // io.ktor.client.plugins.api.ClientHook
    public final void install(HttpClient httpClient, Object obj) {
        Function3 function3 = (Function3) obj;
        httpClient.getClass();
        function3.getClass();
        HttpSend httpSend = (HttpSend) ie0.a(httpClient, HttpSend.c);
        httpSend.b.add(new Send$install$1(function3, httpClient, null));
    }
}
