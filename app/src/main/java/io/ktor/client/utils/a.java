package io.ktor.client.utils;

import defpackage.tb0;
import io.ktor.client.content.ProgressListener;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.d;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final ByteReadChannel a(ByteReadChannel byteReadChannel, CoroutineContext coroutineContext, Long l, ProgressListener progressListener) {
        byteReadChannel.getClass();
        coroutineContext.getClass();
        progressListener.getClass();
        return d.i(tb0.a, coroutineContext, new ByteChannelUtilsKt$observable$1(byteReadChannel, progressListener, l, null)).a;
    }
}
