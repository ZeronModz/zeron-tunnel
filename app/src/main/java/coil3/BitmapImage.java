package coil3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.i5;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcoil3/BitmapImage;", "Lcoil3/Image;", "Landroid/graphics/Bitmap;", "bitmap", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "shareable", "<init>", "(Landroid/graphics/Bitmap;Z)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BitmapImage implements Image {
    public final Bitmap a;
    public final boolean b;

    public BitmapImage(Bitmap bitmap, boolean z) {
        this.a = bitmap;
        this.b = z;
    }

    @Override // coil3.Image
    public final void draw(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitmapImage)) {
            return false;
        }
        BitmapImage bitmapImage = (BitmapImage) obj;
        return yg0.a(this.a, bitmapImage.a) && this.b == bitmapImage.b;
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getHeight */
    public final int getC() {
        return this.a.getHeight();
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getShareable, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getSize */
    public final long getD() {
        return i5.f(this.a);
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getWidth */
    public final int getB() {
        return this.a.getWidth();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=" + this.b + ')';
    }
}
