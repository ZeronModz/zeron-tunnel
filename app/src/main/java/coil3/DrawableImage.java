package coil3;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcoil3/DrawableImage;", "Lcoil3/Image;", "Landroid/graphics/drawable/Drawable;", "drawable", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "shareable", "<init>", "(Landroid/graphics/drawable/Drawable;Z)V", "SizeProvider", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DrawableImage implements Image {
    public final Drawable a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcoil3/DrawableImage$SizeProvider;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getSize", "()J", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface SizeProvider {
        long getSize();
    }

    public DrawableImage(Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
    }

    @Override // coil3.Image
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawableImage)) {
            return false;
        }
        DrawableImage drawableImage = (DrawableImage) obj;
        return yg0.a(this.a, drawableImage.a) && this.b == drawableImage.b;
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getHeight */
    public final int getC() {
        return coil3.util.f.a(this.a);
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getShareable, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // coil3.Image
    /* JADX INFO: renamed from: getSize */
    public final long getD() {
        Drawable drawable = this.a;
        long size = drawable instanceof SizeProvider ? ((SizeProvider) drawable).getSize() : ((long) coil3.util.f.b(drawable)) * 4 * ((long) coil3.util.f.a(drawable));
        if (size < 0) {
            return 0L;
        }
        return size;
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getWidth */
    public final int getB() {
        return coil3.util.f.b(this.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=" + this.b + ')';
    }
}
