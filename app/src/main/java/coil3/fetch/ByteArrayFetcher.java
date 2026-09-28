package coil3.fetch;

import coil3.ImageLoader;
import coil3.fetch.Fetcher;
import coil3.graphics.DataSource;
import coil3.graphics.SourceImageSource;
import coil3.request.Options;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import okio.Buffer;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcoil3/fetch/ByteArrayFetcher;", "Lcoil3/fetch/Fetcher;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "byteArray", "Lcoil3/request/Options;", "options", "<init>", "([BLcoil3/request/Options;)V", "Factory", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ByteArrayFetcher implements Fetcher {
    public final byte[] a;
    public final Options b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/fetch/ByteArrayFetcher$Factory;", "Lcoil3/fetch/Fetcher$Factory;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements Fetcher.Factory<byte[]> {
        @Override // coil3.fetch.Fetcher.Factory
        public final Fetcher create(byte[] bArr, Options options, ImageLoader imageLoader) {
            return new ByteArrayFetcher(bArr, options);
        }
    }

    public ByteArrayFetcher(byte[] bArr, Options options) {
        this.a = bArr;
        this.b = options;
    }

    @Override // coil3.fetch.Fetcher
    public final Object fetch(Continuation continuation) {
        Buffer buffer = new Buffer();
        byte[] bArr = this.a;
        bArr.getClass();
        buffer.m68write(bArr, 0, bArr.length);
        return new SourceFetchResult(new SourceImageSource(buffer, this.b.f, null), null, DataSource.MEMORY);
    }
}
