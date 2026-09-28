package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragment;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class px0 extends RecyclerView.ItemDecoration {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ PreferenceFragment d;

    public px0(PreferenceFragment preferenceFragment) {
        this.d = preferenceFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (d(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (this.a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (d(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.a.setBounds(0, height, width, this.b + height);
                this.a.draw(canvas);
            }
        }
    }

    public final boolean d(View view, RecyclerView recyclerView) {
        RecyclerView.ViewHolder viewHolderJ = recyclerView.J(view);
        if (!(viewHolderJ instanceof ux0) || !((ux0) viewHolderJ).y) {
            return false;
        }
        boolean z = this.c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        RecyclerView.ViewHolder viewHolderJ2 = recyclerView.J(recyclerView.getChildAt(iIndexOfChild + 1));
        return (viewHolderJ2 instanceof ux0) && ((ux0) viewHolderJ2).x;
    }
}
