package com.blacksquircle.ui.editorkit.widget.internal;

import android.R;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.MultiAutoCompleteTextView;
import android.widget.OverScroller;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.xu;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u000fB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/internal/ScrollableEditText;", "Landroid/widget/MultiAutoCompleteTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "whether", "Lmk1;", "setHorizontallyScrolling", "(Z)V", "OnScrollChangedListener", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class ScrollableEditText extends MultiAutoCompleteTextView {
    public final OverScroller a;
    public final ArrayList b;
    public final float c;
    public VelocityTracker d;
    public boolean e;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/internal/ScrollableEditText$OnScrollChangedListener;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "x", "y", "oldX", "oldY", "Lmk1;", "onScrollChanged", "(IIII)V", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnScrollChangedListener {
        void onScrollChanged(int x, int y, int oldX, int oldY);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new OverScroller(context);
        this.b = new ArrayList();
        this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void a() {
        OverScroller overScroller = this.a;
        if (!overScroller.isFinished()) {
            overScroller.abortAnimation();
        }
        VelocityTracker velocityTracker = this.d;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.a;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            if (currY >= 0 || getScrollY() - Math.abs(currY) > 0) {
                scrollTo(currX, currY);
            }
            postInvalidate();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((OnScrollChangedListener) it.next()).onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((OnScrollChangedListener) it.next()).onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        motionEvent.getClass();
        if (this.d == null) {
            this.d = VelocityTracker.obtain();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            a();
        } else if (action == 1) {
            VelocityTracker velocityTracker3 = this.d;
            if (velocityTracker3 != null) {
                velocityTracker3.computeCurrentVelocity(1000, this.c);
            }
            int xVelocity = (!this.e || (velocityTracker = this.d) == null) ? 0 : (int) velocityTracker.getXVelocity();
            VelocityTracker velocityTracker4 = this.d;
            int yVelocity = velocityTracker4 != null ? (int) velocityTracker4.getYVelocity() : 0;
            if (Math.abs(yVelocity) < 0 || Math.abs(xVelocity) < 0) {
                VelocityTracker velocityTracker5 = this.d;
                if (velocityTracker5 != null) {
                    velocityTracker5.recycle();
                }
                this.d = null;
            } else if (xVelocity != 0 || yVelocity != 0) {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i = -xVelocity;
                int i2 = -yVelocity;
                Layout layout = getLayout();
                int paddingEnd = getPaddingEnd() + getPaddingStart() + ((layout != null ? layout.getWidth() : getWidth()) - getWidth());
                Layout layout2 = getLayout();
                this.a.fling(scrollX, scrollY, i, i2, 0, paddingEnd, 0, getPaddingBottom() + getPaddingTop() + ((layout2 != null ? layout2.getHeight() : getWidth()) - getHeight()));
            }
        } else if (action == 2 && (velocityTracker2 = this.d) != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setHorizontallyScrolling(boolean whether) {
        super.setHorizontallyScrolling(whether);
        this.e = whether;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ScrollableEditText(Context context, AttributeSet attributeSet, int i, int i2, xu xuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.autoCompleteTextViewStyle : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScrollableEditText(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
