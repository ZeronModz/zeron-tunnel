package defpackage;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.shape.RoundedCornerTreatment;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r71 extends ShapeableDelegate {
    public boolean f = false;
    public float g = 0.0f;

    public r71(FrameLayout frameLayout) {
        d(frameLayout);
    }

    private void d(View view) {
        view.setOutlineProvider(new dn(this, 1));
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final void a(FrameLayout frameLayout) {
        ShapeAppearanceModel shapeAppearanceModel;
        ShapeAppearanceModel shapeAppearanceModel2;
        RectF rectF;
        ShapeAppearanceModel shapeAppearanceModel3 = this.c;
        this.g = (shapeAppearanceModel3 == null || (rectF = this.d) == null) ? 0.0f : shapeAppearanceModel3.f.getCornerSize(rectF);
        boolean z = false;
        if ((this.d.isEmpty() || (shapeAppearanceModel2 = this.c) == null) ? false : shapeAppearanceModel2.f(this.d)) {
            z = true;
        } else if (!this.d.isEmpty() && (shapeAppearanceModel = this.c) != null && this.b && !shapeAppearanceModel.f(this.d)) {
            ShapeAppearanceModel shapeAppearanceModel4 = this.c;
            if ((shapeAppearanceModel4.a instanceof RoundedCornerTreatment) && (shapeAppearanceModel4.b instanceof RoundedCornerTreatment) && (shapeAppearanceModel4.d instanceof RoundedCornerTreatment) && (shapeAppearanceModel4.c instanceof RoundedCornerTreatment)) {
                float cornerSize = shapeAppearanceModel4.e.getCornerSize(this.d);
                float cornerSize2 = this.c.f.getCornerSize(this.d);
                float cornerSize3 = this.c.h.getCornerSize(this.d);
                float cornerSize4 = this.c.g.getCornerSize(this.d);
                if (cornerSize == 0.0f && cornerSize3 == 0.0f && cornerSize2 == cornerSize4) {
                    RectF rectF2 = this.d;
                    rectF2.set(rectF2.left - cornerSize2, rectF2.top, rectF2.right, rectF2.bottom);
                    this.g = cornerSize2;
                } else if (cornerSize == 0.0f && cornerSize2 == 0.0f && cornerSize3 == cornerSize4) {
                    RectF rectF3 = this.d;
                    rectF3.set(rectF3.left, rectF3.top - cornerSize3, rectF3.right, rectF3.bottom);
                    this.g = cornerSize3;
                } else if (cornerSize2 == 0.0f && cornerSize4 == 0.0f && cornerSize == cornerSize3) {
                    RectF rectF4 = this.d;
                    rectF4.set(rectF4.left, rectF4.top, rectF4.right + cornerSize, rectF4.bottom);
                    this.g = cornerSize;
                } else if (cornerSize3 == 0.0f && cornerSize4 == 0.0f && cornerSize == cornerSize2) {
                    RectF rectF5 = this.d;
                    rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + cornerSize);
                    this.g = cornerSize;
                }
                z = true;
            }
        }
        this.f = z;
        frameLayout.setClipToOutline(!b());
        if (b()) {
            frameLayout.invalidate();
        } else {
            frameLayout.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final boolean b() {
        return !this.f || this.a;
    }
}
