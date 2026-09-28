package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class rl extends LinearSmoothScroller {
    public final /* synthetic */ CarouselLayoutManager p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.p = carouselLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public final PointF a(int i) {
        return this.p.computeScrollVectorForPosition(i);
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int h(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.p;
        if (carouselLayoutManager.u == null || !carouselLayoutManager.isHorizontal()) {
            return 0;
        }
        int iF = RecyclerView.LayoutManager.F(view);
        return (int) (carouselLayoutManager.p - carouselLayoutManager.O0(iF, carouselLayoutManager.M0(iF)));
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int i(int i, View view) {
        CarouselLayoutManager carouselLayoutManager = this.p;
        if (carouselLayoutManager.u == null || carouselLayoutManager.isHorizontal()) {
            return 0;
        }
        int iF = RecyclerView.LayoutManager.F(view);
        return (int) (carouselLayoutManager.p - carouselLayoutManager.O0(iF, carouselLayoutManager.M0(iF)));
    }
}
