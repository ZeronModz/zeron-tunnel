package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.util.Pair;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class eo0 extends RecyclerView.ItemDecoration {
    public final Calendar a = ol1.i(null);
    public final Calendar b = ol1.i(null);
    public final /* synthetic */ MaterialCalendar c;

    public eo0(MaterialCalendar materialCalendar) {
        this.c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if ((recyclerView.getAdapter() instanceof xr1) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            xr1 xr1Var = (xr1) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            MaterialCalendar materialCalendar = this.c;
            for (Pair<Long, Long> pair : materialCalendar.a0.getSelectedRanges()) {
                Object obj = pair.a;
                Object obj2 = pair.b;
                if (obj != null && obj2 != null) {
                    long jLongValue = ((Long) obj).longValue();
                    Calendar calendar = this.a;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) obj2).longValue();
                    Calendar calendar2 = this.b;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - xr1Var.d.b0.a.c;
                    int i2 = calendar2.get(1) - xr1Var.d.b0.a.c;
                    View viewQ = gridLayoutManager.q(i);
                    View viewQ2 = gridLayoutManager.q(i2);
                    int i3 = gridLayoutManager.F;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View viewQ3 = gridLayoutManager.q(gridLayoutManager.F * i6);
                        if (viewQ3 != null) {
                            int top = viewQ3.getTop() + ((lh) materialCalendar.f0.d).a.top;
                            int bottom = viewQ3.getBottom() - ((lh) materialCalendar.f0.d).a.bottom;
                            canvas.drawRect((i6 != i4 || viewQ == null) ? 0 : (viewQ.getWidth() / 2) + viewQ.getLeft(), top, (i6 != i5 || viewQ2 == null) ? recyclerView.getWidth() : (viewQ2.getWidth() / 2) + viewQ2.getLeft(), bottom, (Paint) materialCalendar.f0.h);
                        }
                    }
                }
            }
        }
    }
}
