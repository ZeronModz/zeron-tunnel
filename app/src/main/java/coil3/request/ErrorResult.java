package coil3.request;

import coil3.Image;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil3/request/ErrorResult;", "Lcoil3/request/ImageResult;", "Lcoil3/Image;", "image", "Lcoil3/request/ImageRequest;", "request", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "throwable", "<init>", "(Lcoil3/Image;Lcoil3/request/ImageRequest;Ljava/lang/Throwable;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ErrorResult implements ImageResult {
    public final Image a;
    public final ImageRequest b;
    public final Throwable c;

    public ErrorResult(Image image, ImageRequest imageRequest, Throwable th) {
        this.a = image;
        this.b = imageRequest;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResult)) {
            return false;
        }
        ErrorResult errorResult = (ErrorResult) obj;
        return yg0.a(this.a, errorResult.a) && yg0.a(this.b, errorResult.b) && yg0.a(this.c, errorResult.c);
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
        Image image = this.a;
        int iHashCode = image == null ? 0 : image.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ')';
    }
}
