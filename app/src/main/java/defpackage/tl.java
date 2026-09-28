package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import dev.zeron.tunnel.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class tl extends RecyclerView.ItemDecoration {
    public final Paint a;
    public List b;

    public tl() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        for (nj0 nj0Var : this.b) {
            paint.setColor(oo.b(nj0Var.c, -65281, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).isHorizontal()) {
                canvas2 = canvas;
                canvas2.drawLine(nj0Var.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.i(), nj0Var.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.d(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).y.f(), nj0Var.b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y.g(), nj0Var.b, paint);
            }
            canvas = canvas2;
        }
    }
}
