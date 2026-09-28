package io.ktor.client.engine.okhttp;

import io.ktor.client.request.HttpRequestData;
import java.nio.ByteBuffer;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$IntRef;
import okio.BufferedSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ Ref$IntRef a;
    public final /* synthetic */ BufferedSource b;
    public final /* synthetic */ HttpRequestData c;
    public final /* synthetic */ CoroutineContext d;

    public /* synthetic */ b(Ref$IntRef ref$IntRef, BufferedSource bufferedSource, HttpRequestData httpRequestData, CoroutineContext coroutineContext) {
        this.a = ref$IntRef;
        this.b = bufferedSource;
        this.c = httpRequestData;
        this.d = coroutineContext;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return OkHttpEngineKt$toChannel$1.invokeSuspend$lambda$2$lambda$1(this.a, this.b, this.c, this.d, (ByteBuffer) obj);
    }
}
