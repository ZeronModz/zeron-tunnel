package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class st extends MaterialShapeDrawable.MaterialShapeDrawableState {
    public final RectF r;

    public st(st stVar) {
        super(stVar);
        this.r = stVar.r;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        tt ttVar = new tt(this);
        ttVar.y = this;
        ttVar.invalidateSelf();
        return ttVar;
    }

    public st(ShapeAppearanceModel shapeAppearanceModel, RectF rectF) {
        super(shapeAppearanceModel, null);
        this.r = rectF;
    }
}
