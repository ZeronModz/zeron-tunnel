package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class vl extends wl {
    public final /* synthetic */ CarouselLayoutManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.b = carouselLayoutManager;
    }

    @Override // defpackage.wl
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f = rectF2.left;
        float f2 = rectF3.left;
        if (f < f2 && rectF2.right > f2) {
            float f3 = f2 - f;
            rectF.left += f3;
            f = rectF2.left + f3;
            rectF2.left = f;
        }
        float f4 = rectF2.right;
        float f5 = rectF3.right;
        if (f4 <= f5 || f >= f5) {
            return;
        }
        float f6 = f4 - f5;
        rectF.right = Math.max(rectF.right - f6, rectF.left);
        rectF2.right = Math.max(rectF2.right - f6, rectF2.left);
    }

    @Override // defpackage.wl
    public final float b(RecyclerView.LayoutParams layoutParams) {
        return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    @Override // defpackage.wl
    public final RectF c(float f, float f2, float f3, float f4) {
        return new RectF(f4, 0.0f, f2 - f4, f);
    }

    @Override // defpackage.wl
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        return carouselLayoutManager.o - carouselLayoutManager.getPaddingBottom();
    }

    @Override // defpackage.wl
    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        if (carouselLayoutManager.R0()) {
            return 0;
        }
        return carouselLayoutManager.n;
    }

    @Override // defpackage.wl
    public final int f() {
        return 0;
    }

    @Override // defpackage.wl
    public final int g() {
        return this.b.n;
    }

    @Override // defpackage.wl
    public final int h() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        if (carouselLayoutManager.R0()) {
            return carouselLayoutManager.n;
        }
        return 0;
    }

    @Override // defpackage.wl
    public final int i() {
        return this.b.getPaddingTop();
    }

    @Override // defpackage.wl
    public final void j(View view, int i, int i2) {
        int paddingTop = this.b.getPaddingTop();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        RecyclerView.LayoutManager.M(view, i, paddingTop, i2, RecyclerView.LayoutManager.B(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + paddingTop);
    }

    @Override // defpackage.wl
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = fFloor;
            rectF.left = Math.min(rectF.left, fFloor);
        }
        if (rectF2.left >= rectF3.right) {
            float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = fCeil;
            rectF.right = Math.max(fCeil, rectF.right);
        }
    }

    @Override // defpackage.wl
    public final void l(View view, Rect rect, float f, float f2) {
        view.offsetLeftAndRight((int) (f2 - (rect.left + f)));
    }
}
