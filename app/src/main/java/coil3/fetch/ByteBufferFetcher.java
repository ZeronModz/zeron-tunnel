package coil3.fetch;

import coil3.ImageLoader;
import coil3.fetch.Fetcher;
import coil3.graphics.ByteBufferMetadata;
import coil3.graphics.DataSource;
import coil3.graphics.SourceImageSource;
import coil3.request.Options;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import defpackage.kg;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.RealBufferedSource;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcoil3/fetch/ByteBufferFetcher;", "Lcoil3/fetch/Fetcher;", "Ljava/nio/ByteBuffer;", Constants$ScionAnalytics$MessageType.DATA_MESSAGE, "Lcoil3/request/Options;", "options", "<init>", "(Ljava/nio/ByteBuffer;Lcoil3/request/Options;)V", "Factory", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ByteBufferFetcher implements Fetcher {
    public final ByteBuffer a;
    public final Options b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/fetch/ByteBufferFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", "Ljava/nio/ByteBuffer;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<ByteBuffer> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher create(ByteBuffer byteBuffer, Options options, ImageLoader imageLoader) {
            return new ByteBufferFetcher(byteBuffer, options);
        }
    }

    public ByteBufferFetcher(ByteBuffer byteBuffer, Options options) {
        this.a = byteBuffer;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object fetch(Continuation continuation) {
        ByteBuffer byteBuffer = this.a;
        return new SourceFetchResult(new SourceImageSource(new RealBufferedSource(new kg(byteBuffer)), this.b.f, new ByteBufferMetadata(byteBuffer)), null, DataSource.MEMORY);
    }
}
