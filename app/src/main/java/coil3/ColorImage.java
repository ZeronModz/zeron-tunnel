package coil3;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcoil3/ColorImage;", "Lcoil3/Image;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, TypedValues.Custom.S_COLOR, "width", "height", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "size", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "shareable", "<init>", "(IIIJZ)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ColorImage implements Image {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public Paint f;

    public /* synthetic */ ColorImage(int i, int i2, int i3, long j, boolean z, int i4, xu xuVar) {
        this((i4 & 1) != 0 ? -16777216 : i, (i4 & 2) != 0 ? -1 : i2, (i4 & 4) != 0 ? -1 : i3, (i4 & 8) != 0 ? 0L : j, (i4 & 16) != 0 ? true : z);
    }

    @Override // coil3.Image
    public final void draw(Canvas canvas) {
        int i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            paint.setColor(this.a);
            this.f = paint;
        }
        Paint paint2 = paint;
        int i2 = this.b;
        if (i2 < 0 || (i = this.c) < 0) {
            canvas.drawPaint(paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, i2, i, paint2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorImage)) {
            return false;
        }
        ColorImage colorImage = (ColorImage) obj;
        return this.a == colorImage.a && this.b == colorImage.b && this.c == colorImage.c && this.d == colorImage.d && this.e == colorImage.e;
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getHeight, reason: from getter */
    public final int getC() {
        return this.c;
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getShareable, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final long getD() {
        return this.d;
    }

    @Override // coil3.Image
    /* JADX INFO: renamed from: getWidth, reason: from getter */
    public final int getB() {
        return this.b;
    }

    public final int hashCode() {
        int i = ((((this.a * 31) + this.b) * 31) + this.c) * 31;
        long j = this.d;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + (this.e ? 1231 : 1237);
    }

    public final String toString() {
        return "ColorImage(color=" + this.a + ", width=" + this.b + ", height=" + this.c + ", size=" + this.d + ", shareable=" + this.e + ')';
    }

    public ColorImage(int i, int i2, int i3, long j, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = z;
    }

    public ColorImage() {
        this(0, 0, 0, 0L, false, 31, null);
    }
}
