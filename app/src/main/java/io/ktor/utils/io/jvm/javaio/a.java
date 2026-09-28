package io.ktor.utils.io.jvm.javaio;

import defpackage.j03;
import io.ktor.utils.io.ByteReadChannel;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends InputStream {
    public final /* synthetic */ ByteReadChannel a;

    public a(ByteReadChannel byteReadChannel) {
        this.a = byteReadChannel;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        j03.e(this.a);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws Throwable {
        bArr.getClass();
        ByteReadChannel byteReadChannel = this.a;
        if (byteReadChannel.isClosedForRead()) {
            return -1;
        }
        if (byteReadChannel.getReadBuffer().exhausted()) {
            kotlinx.coroutines.b.a(new BlockingKt$toInputStream$1$blockingWait$1(byteReadChannel, null));
        }
        int atMostTo = byteReadChannel.getReadBuffer().readAtMostTo(bArr, i, Math.min(io.ktor.utils.io.c.i(byteReadChannel), i2) + i);
        return atMostTo >= 0 ? atMostTo : byteReadChannel.isClosedForRead() ? -1 : 0;
    }

    @Override // java.io.InputStream
    public final int read() throws Throwable {
        ByteReadChannel byteReadChannel = this.a;
        if (byteReadChannel.isClosedForRead()) {
            return -1;
        }
        if (byteReadChannel.getReadBuffer().exhausted()) {
            kotlinx.coroutines.b.a(new BlockingKt$toInputStream$1$blockingWait$1(byteReadChannel, null));
        }
        if (byteReadChannel.isClosedForRead()) {
            return -1;
        }
        return byteReadChannel.getReadBuffer().readByte() & 255;
    }
}
