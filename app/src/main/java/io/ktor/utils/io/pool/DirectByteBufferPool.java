package io.ktor.utils.io.pool;

import com.google.android.gms.ads.RequestConfiguration;
import com.trilead.ssh2.sftp.AttribFlags;
import defpackage.u7;
import defpackage.xu;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/utils/io/pool/DirectByteBufferPool;", "Lio/ktor/utils/io/pool/DefaultPool;", "Ljava/nio/ByteBuffer;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "capacity", "bufferSize", "<init>", "(II)V", "ktor-io"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DirectByteBufferPool extends DefaultPool<ByteBuffer> {
    public final int g;

    public /* synthetic */ DirectByteBufferPool(int i, int i2, int i3, xu xuVar) {
        this((i3 & 1) != 0 ? 2000 : i, (i3 & 2) != 0 ? AttribFlags.SSH_FILEXFER_ATTR_MIME_TYPE : i2);
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public final Object a(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        byteBuffer.clear();
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
        return byteBuffer;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public final Object b() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.g);
        byteBufferAllocateDirect.getClass();
        return byteBufferAllocateDirect;
    }

    @Override // io.ktor.utils.io.pool.DefaultPool
    public final void d(Object obj) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (byteBuffer.capacity() != this.g) {
            u7.p("Check failed.");
        } else {
            if (byteBuffer.isDirect()) {
                return;
            }
            u7.p("Check failed.");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DirectByteBufferPool() {
        int i = 0;
        this(i, i, 3, null);
    }

    public DirectByteBufferPool(int i, int i2) {
        super(i);
        this.g = i2;
    }
}
