package coil3.fetch;

import coil3.Image;
import coil3.graphics.DataSource;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil3/fetch/ImageFetchResult;", "Lcoil3/fetch/FetchResult;", "Lcoil3/Image;", "image", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "isSampled", "Lcoil3/decode/DataSource;", "dataSource", "<init>", "(Lcoil3/Image;ZLcoil3/decode/DataSource;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageFetchResult implements FetchResult {
    public final Image a;
    public final boolean b;
    public final DataSource c;

    public ImageFetchResult(Image image, boolean z, DataSource dataSource) {
        this.a = image;
        this.b = z;
        this.c = dataSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageFetchResult)) {
            return false;
        }
        ImageFetchResult imageFetchResult = (ImageFetchResult) obj;
        return yg0.a(this.a, imageFetchResult.a) && this.b == imageFetchResult.b && this.c == imageFetchResult.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ')';
    }
}
