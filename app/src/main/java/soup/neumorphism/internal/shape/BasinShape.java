package soup.neumorphism.internal.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c;
import soup.neumorphism.NeumorphShapeDrawable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsoup/neumorphism/internal/shape/BasinShape;", "Lsoup/neumorphism/internal/shape/Shape;", "Lsoup/neumorphism/NeumorphShapeDrawable$NeumorphShapeDrawableState;", "drawableState", "<init>", "(Lsoup/neumorphism/NeumorphShapeDrawable$NeumorphShapeDrawableState;)V", "neumorphism_release"}, k = 1, mv = {1, 4, 0})
public final class BasinShape implements Shape {
    public final List a;

    public BasinShape(NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState) {
        neumorphShapeDrawableState.getClass();
        this.a = c.A(new FlatShape(neumorphShapeDrawableState), new PressedShape(neumorphShapeDrawableState));
    }

    @Override // soup.neumorphism.internal.shape.Shape
    public final void draw(Canvas canvas, Path path) {
        canvas.getClass();
        path.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Shape) it.next()).draw(canvas, path);
        }
    }

    @Override // soup.neumorphism.internal.shape.Shape
    public final void setDrawableState(NeumorphShapeDrawable.NeumorphShapeDrawableState neumorphShapeDrawableState) {
        neumorphShapeDrawableState.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Shape) it.next()).setDrawableState(neumorphShapeDrawableState);
        }
    }

    @Override // soup.neumorphism.internal.shape.Shape
    public final void updateShadowBitmap(Rect rect) {
        rect.getClass();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Shape) it.next()).updateShadowBitmap(rect);
        }
    }
}
