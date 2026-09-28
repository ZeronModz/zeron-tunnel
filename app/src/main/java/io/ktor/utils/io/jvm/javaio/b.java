package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.ByteWriteChannel;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {
    public final /* synthetic */ ByteWriteChannel a;

    public b(ByteWriteChannel byteWriteChannel) {
        this.a = byteWriteChannel;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        kotlinx.coroutines.b.a(new BlockingKt$toOutputStream$1$close$1(this.a, null));
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws Throwable {
        kotlinx.coroutines.b.a(new BlockingKt$toOutputStream$1$flush$1(this.a, null));
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws Throwable {
        bArr.getClass();
        kotlinx.coroutines.b.a(new BlockingKt$toOutputStream$1$write$2(this.a, bArr, i, i2, null));
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws Throwable {
        kotlinx.coroutines.b.a(new BlockingKt$toOutputStream$1$write$1(this.a, i, null));
    }
}
