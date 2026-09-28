package coil3.request;

import coil3.Image;
import coil3.graphics.DataSource;
import coil3.memory.MemoryCache;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcoil3/request/SuccessResult;", "Lcoil3/request/ImageResult;", "Lcoil3/Image;", "image", "Lcoil3/request/ImageRequest;", "request", "Lcoil3/decode/DataSource;", "dataSource", "Lcoil3/memory/MemoryCache$Key;", "memoryCacheKey", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "diskCacheKey", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "isSampled", "isPlaceholderCached", "<init>", "(Lcoil3/Image;Lcoil3/request/ImageRequest;Lcoil3/decode/DataSource;Lcoil3/memory/MemoryCache$Key;Ljava/lang/String;ZZ)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SuccessResult implements ImageResult {
    public final Image a;
    public final ImageRequest b;
    public final DataSource c;
    public final MemoryCache.Key d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public /* synthetic */ SuccessResult(Image image, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2, int i, xu xuVar) {
        this(image, imageRequest, (i & 4) != 0 ? DataSource.MEMORY : dataSource, (i & 8) != 0 ? null : key, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuccessResult)) {
            return false;
        }
        SuccessResult successResult = (SuccessResult) obj;
        return yg0.a(this.a, successResult.a) && yg0.a(this.b, successResult.b) && this.c == successResult.c && yg0.a(this.d, successResult.d) && yg0.a(this.e, successResult.e) && this.f == successResult.f && this.g == successResult.g;
    }

    @Override // coil3.request.ImageResult
    /* JADX INFO: renamed from: getImage, reason: from getter */
    public final Image getA() {
        return this.a;
    }

    @Override // coil3.request.ImageResult
    /* JADX INFO: renamed from: getRequest, reason: from getter */
    public final ImageRequest getB() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        MemoryCache.Key key = this.d;
        int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
        String str = this.e;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237);
    }

    public final String toString() {
        return "SuccessResult(image=" + this.a + ", request=" + this.b + ", dataSource=" + this.c + ", memoryCacheKey=" + this.d + ", diskCacheKey=" + this.e + ", isSampled=" + this.f + ", isPlaceholderCached=" + this.g + ')';
    }

    public SuccessResult(Image image, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2) {
        this.a = image;
        this.b = imageRequest;
        this.c = dataSource;
        this.d = key;
        this.e = str;
        this.f = z;
        this.g = z2;
    }
}
