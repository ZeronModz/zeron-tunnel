package coil3.graphics;

import coil3.graphics.ImageSource;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/decode/ByteBufferMetadata;", "Lcoil3/decode/ImageSource$Metadata;", "Ljava/nio/ByteBuffer;", "byteBuffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ByteBufferMetadata extends ImageSource.Metadata {
    public final ByteBuffer a;

    public ByteBufferMetadata(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }
}
