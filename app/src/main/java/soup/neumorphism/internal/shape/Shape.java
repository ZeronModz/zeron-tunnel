package soup.neumorphism.internal.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import soup.neumorphism.NeumorphShapeDrawable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lsoup/neumorphism/internal/shape/Shape;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Lsoup/neumorphism/NeumorphShapeDrawable$NeumorphShapeDrawableState;", "newDrawableState", "Lmk1;", "setDrawableState", "(Lsoup/neumorphism/NeumorphShapeDrawable$NeumorphShapeDrawableState;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Path;", "outlinePath", "draw", "(Landroid/graphics/Canvas;Landroid/graphics/Path;)V", "Landroid/graphics/Rect;", "bounds", "updateShadowBitmap", "(Landroid/graphics/Rect;)V", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
public interface Shape {
    void draw(Canvas canvas, Path outlinePath);

    void setDrawableState(NeumorphShapeDrawable.NeumorphShapeDrawableState newDrawableState);

    void updateShadowBitmap(Rect bounds);
}
