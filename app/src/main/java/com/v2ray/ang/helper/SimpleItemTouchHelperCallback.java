package com.v2ray.ang.helper;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.mz;
import defpackage.xu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/v2ray/ang/helper/SimpleItemTouchHelperCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$Callback;", "Lcom/v2ray/ang/helper/ItemTouchHelperAdapter;", "mAdapter", "<init>", "(Lcom/v2ray/ang/helper/ItemTouchHelperAdapter;)V", "Companion", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleItemTouchHelperCallback extends ItemTouchHelper.Callback {
    public static final /* synthetic */ int f = 0;
    public final ItemTouchHelperAdapter d;
    public ValueAnimator e;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/v2ray/ang/helper/SimpleItemTouchHelperCallback$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ALPHA_FULL", "F", "SWIPE_THRESHOLD", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ANIMATION_DURATION", "J", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    public SimpleItemTouchHelperCallback(ItemTouchHelperAdapter itemTouchHelperAdapter) {
        itemTouchHelperAdapter.getClass();
        this.d = itemTouchHelperAdapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        recyclerView.getClass();
        viewHolder.getClass();
        super.a(recyclerView, viewHolder);
        viewHolder.a.setAlpha(1.0f);
        if (viewHolder instanceof ItemTouchHelperViewHolder) {
            ((ItemTouchHelperViewHolder) viewHolder).onItemClear();
        }
        this.d.onItemMoveCompleted();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final int d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        recyclerView.getClass();
        viewHolder.getClass();
        int i = recyclerView.getLayoutManager() instanceof GridLayoutManager ? 15 : 3;
        return (i << 16) | i | 12336;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final float e(float f2) {
        return f2 * 10.0f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final float f(RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
        return 1.1f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f2, float f3, int i, boolean z) {
        canvas.getClass();
        viewHolder.getClass();
        View view = viewHolder.a;
        if (i != 1) {
            super.h(canvas, recyclerView, viewHolder, f2, f3, i, z);
            return;
        }
        float width = view.getWidth() * 0.25f;
        float fAbs = Math.abs(f2);
        float fMin = Math.min(fAbs, width) * Math.signum(f2);
        float fMin2 = 1.0f - (Math.min(fAbs, width) / width);
        view.setTranslationX(fMin);
        view.setAlpha(fMin2);
        if (fAbs < width || !z) {
            return;
        }
        l(viewHolder);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final boolean i(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        recyclerView.getClass();
        viewHolder.getClass();
        if (viewHolder.f != viewHolder2.f) {
            return false;
        }
        this.d.onItemMove(viewHolder.c(), viewHolder2.c());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void j(RecyclerView.ViewHolder viewHolder, int i) {
        if (i == 0 || !(viewHolder instanceof ItemTouchHelperViewHolder)) {
            return;
        }
        ((ItemTouchHelperViewHolder) viewHolder).onItemSelected();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public final void k(RecyclerView.ViewHolder viewHolder) {
        viewHolder.getClass();
        l(viewHolder);
    }

    public final void l(RecyclerView.ViewHolder viewHolder) {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            if (!valueAnimator.isRunning()) {
                valueAnimator = null;
            }
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(viewHolder.a.getTranslationX(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new mz(viewHolder, 6));
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.start();
        this.e = valueAnimatorOfFloat;
    }
}
