package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ul extends wl {
    public final /* synthetic */ CarouselLayoutManager b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ul(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.b = carouselLayoutManager;
    }

    @Override // defpackage.wl
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f = rectF2.top;
        float f2 = rectF3.top;
        if (f < f2 && rectF2.bottom > f2) {
            float f3 = f2 - f;
            rectF.top += f3;
            rectF3.top += f3;
        }
        float f4 = rectF2.bottom;
        float f5 = rectF3.bottom;
        if (f4 <= f5 || rectF2.top >= f5) {
            return;
        }
        float f6 = f4 - f5;
        rectF.bottom = Math.max(rectF.bottom - f6, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f6, rectF2.top);
    }

    @Override // defpackage.wl
    public final float b(RecyclerView.LayoutParams layoutParams) {
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // defpackage.wl
    public final RectF c(float f, float f2, float f3, float f4) {
        return new RectF(0.0f, f3, f2, f - f3);
    }

    @Override // defpackage.wl
    public final int d() {
        return this.b.o;
    }

    @Override // defpackage.wl
    public final int e() {
        return this.b.o;
    }

    @Override // defpackage.wl
    public final int f() {
        return this.b.getPaddingLeft();
    }

    @Override // defpackage.wl
    public final int g() {
        CarouselLayoutManager carouselLayoutManager = this.b;
        return carouselLayoutManager.n - carouselLayoutManager.getPaddingRight();
    }

    @Override // defpackage.wl
    public final int h() {
        return 0;
    }

    @Override // defpackage.wl
    public final int i() {
        return 0;
    }

    @Override // defpackage.wl
    public final void j(View view, int i, int i2) {
        int paddingLeft = this.b.getPaddingLeft();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        RecyclerView.LayoutManager.M(view, paddingLeft, i, RecyclerView.LayoutManager.C(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + paddingLeft, i2);
    }

    @Override // defpackage.wl
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = fFloor;
            rectF.top = Math.min(rectF.top, fFloor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = fCeil;
            rectF.bottom = Math.max(fCeil, rectF.bottom);
        }
    }

    @Override // defpackage.wl
    public final void l(View view, Rect rect, float f, float f2) {
        view.offsetTopAndBottom((int) (f2 - (rect.top + f)));
    }
}
