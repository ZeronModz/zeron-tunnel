package defpackage;

import io.ktor.utils.io.ByteReadChannel;
import kotlin.coroutines.Continuation;
import kotlinx.io.Buffer;
import kotlinx.io.Source;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class pg implements ByteReadChannel {
    public final Buffer a = new Buffer();

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Object awaitContent(int i, Continuation continuation) {
        return Boolean.FALSE;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final Throwable getClosedCause() {
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final Source getReadBuffer() {
        return this.a;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public final boolean isClosedForRead() {
        return true;
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public final void cancel(Throwable th) {
    }
}
