package io.ktor.client.plugins.api;

import defpackage.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final ClientPlugin a(String str, Function0 function0, Function1 function1) {
        function0.getClass();
        return new ClientPluginImpl(str, function0, function1);
    }

    public static final ClientPlugin b(String str, Function1 function1) {
        return new ClientPluginImpl(str, new o0(9), function1);
    }
}
