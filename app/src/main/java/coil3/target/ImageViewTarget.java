package coil3.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import defpackage.yg0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcoil3/target/ImageViewTarget;", "Lcoil3/target/GenericViewTarget;", "Landroid/widget/ImageView;", "view", "<init>", "(Landroid/widget/ImageView;)V", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ImageViewTarget extends GenericViewTarget<ImageView> {
    public final ImageView b;

    public ImageViewTarget(ImageView imageView) {
        this.b = imageView;
    }

    @Override // coil3.target.GenericViewTarget
    public final void a(Drawable drawable) {
        this.b.setImageDrawable(drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewTarget) && yg0.a(this.b, ((ImageViewTarget) obj).b);
    }

    @Override // coil3.target.GenericViewTarget, coil3.transition.TransitionTarget
    public final Drawable getDrawable() {
        return this.b.getDrawable();
    }

    @Override // coil3.target.ViewTarget, coil3.transition.TransitionTarget
    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ImageViewTarget(view=" + this.b + ')';
    }
}
