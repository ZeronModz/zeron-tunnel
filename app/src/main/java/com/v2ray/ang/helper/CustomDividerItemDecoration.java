package com.v2ray.ang.helper;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/v2ray/ang/helper/CustomDividerItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "Landroid/graphics/drawable/Drawable;", "divider", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "orientation", "<init>", "(Landroid/graphics/drawable/Drawable;I)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomDividerItemDecoration extends RecyclerView.ItemDecoration {
    public final Drawable a;
    public final int b;

    public CustomDividerItemDecoration(Drawable drawable, int i) {
        drawable.getClass();
        this.a = drawable;
        this.b = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.getClass();
        view.getClass();
        state.getClass();
        int i = this.b;
        Drawable drawable = this.a;
        if (i == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public final void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        canvas.getClass();
        state.getClass();
        int i = 0;
        int i2 = this.b;
        Drawable drawable = this.a;
        if (i2 == 1) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount() - 1;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.getClass();
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams)).bottomMargin;
                drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                drawable.draw(canvas);
                i++;
            }
            return;
        }
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount2 = recyclerView.getChildCount() - 1;
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
            layoutParams2.getClass();
            int right = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) layoutParams2)).rightMargin;
            drawable.setBounds(right, paddingTop, drawable.getIntrinsicWidth() + right, height);
            drawable.draw(canvas);
            i++;
        }
    }
}
