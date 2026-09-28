package com.blacksquircle.ui.editorkit.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.blacksquircle.ui.editorkit.widget.internal.ScrollableEditText;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.he1;
import defpackage.l02;
import defpackage.v01;
import defpackage.xu;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.c;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0002#$B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010\"\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006%"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/TextScroller;", "Landroid/view/View;", "Lcom/blacksquircle/ui/editorkit/widget/internal/ScrollableEditText$OnScrollChangedListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmk1;", "getMeasurements", "()V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getThumbTop", "()F", "Lcom/blacksquircle/ui/editorkit/widget/TextScroller$State;", "value", "a", "Lcom/blacksquircle/ui/editorkit/widget/TextScroller$State;", "getState", "()Lcom/blacksquircle/ui/editorkit/widget/TextScroller$State;", "setState", "(Lcom/blacksquircle/ui/editorkit/widget/TextScroller$State;)V", "state", "Landroid/graphics/Bitmap;", "b", "Lkotlin/Lazy;", "getNormalBitmap", "()Landroid/graphics/Bitmap;", "normalBitmap", "c", "getDraggingBitmap", "draggingBitmap", "Companion", "State", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class TextScroller extends View implements ScrollableEditText.OnScrollChangedListener {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public State state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Lazy normalBitmap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Lazy draggingBitmap;
    public final int d;
    public final Drawable e;
    public final Drawable f;
    public final Handler g;
    public final he1 h;
    public final Paint i;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/TextScroller$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ALPHA_MAX", "I", "ALPHA_MIN", "ALPHA_STEP", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "EXITING_DELAY", "J", "TIME_EXITING", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/blacksquircle/ui/editorkit/widget/TextScroller$State;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "(Ljava/lang/String;I)V", "HIDDEN", "VISIBLE", "DRAGGING", "EXITING", "editorkit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State HIDDEN = new State("HIDDEN", 0);
        public static final State VISIBLE = new State("VISIBLE", 1);
        public static final State DRAGGING = new State("DRAGGING", 2);
        public static final State EXITING = new State("EXITING", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{HIDDEN, VISIBLE, DRAGGING, EXITING};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = kotlin.enums.a.a(stateArr$values);
        }

        private State(String str, int i) {
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    static {
        new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextScroller(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        super(context, attributeSet, i);
        context.getClass();
        this.state = State.HIDDEN;
        this.normalBitmap = c.b(new Function0<Bitmap>() { // from class: com.blacksquircle.ui.editorkit.widget.TextScroller$normalBitmap$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Bitmap invoke() {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.this$0.getWidth(), this.this$0.d, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                this.this$0.e.setBounds(new Rect(0, 0, this.this$0.getWidth(), this.this$0.d));
                this.this$0.e.draw(new Canvas(bitmapCreateBitmap));
                return bitmapCreateBitmap;
            }
        });
        this.draggingBitmap = c.b(new Function0<Bitmap>() { // from class: com.blacksquircle.ui.editorkit.widget.TextScroller$draggingBitmap$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Bitmap invoke() {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.this$0.getWidth(), this.this$0.d, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                this.this$0.f.setBounds(new Rect(0, 0, this.this$0.getWidth(), this.this$0.d));
                this.this$0.f.draw(new Canvas(bitmapCreateBitmap));
                return bitmapCreateBitmap;
            }
        });
        this.g = new Handler(Looper.getMainLooper());
        this.h = new he1(this, 0);
        Paint paint = new Paint();
        this.i = paint;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, v01.a, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(1);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(0);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(2);
        if (zHasValue) {
            l02.e(typedArrayObtainStyledAttributes, 1);
            drawable = typedArrayObtainStyledAttributes.getDrawable(1);
            drawable.getClass();
        } else {
            drawable = context.getDrawable(2131230899);
            drawable.getClass();
        }
        this.e = drawable;
        if (zHasValue2) {
            l02.e(typedArrayObtainStyledAttributes, 0);
            drawable2 = typedArrayObtainStyledAttributes.getDrawable(0);
            drawable2.getClass();
        } else {
            drawable2 = context.getDrawable(2131230900);
            drawable2.getClass();
        }
        this.f = drawable2;
        if (zHasValue3) {
            l02.e(typedArrayObtainStyledAttributes, 2);
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            drawable.setTint(color);
            drawable2.setTint(color);
        }
        this.d = drawable.getIntrinsicHeight();
        paint.setAntiAlias(true);
        paint.setDither(false);
        paint.setAlpha(225);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final Bitmap getDraggingBitmap() {
        return (Bitmap) this.draggingBitmap.getValue();
    }

    private final Bitmap getNormalBitmap() {
        return (Bitmap) this.normalBitmap.getValue();
    }

    private final float getThumbTop() {
        return 0.0f;
    }

    public final State getState() {
        return this.state;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        int i = a.a[this.state.ordinal()];
        Paint paint = this.i;
        if (i == 2) {
            paint.setAlpha(225);
            canvas.drawBitmap(getNormalBitmap(), 0.0f, 0.0f, paint);
            return;
        }
        if (i == 3) {
            paint.setAlpha(225);
            canvas.drawBitmap(getDraggingBitmap(), 0.0f, 0.0f, paint);
        } else {
            if (i != 4) {
                return;
            }
            if (paint.getAlpha() <= 25) {
                paint.setAlpha(0);
                setState(State.HIDDEN);
            } else {
                paint.setAlpha(paint.getAlpha() - 25);
                canvas.drawBitmap(getNormalBitmap(), 0.0f, 0.0f, paint);
                getHandler().postDelayed(this.h, 17L);
            }
        }
    }

    @Override // android.view.View, com.blacksquircle.ui.editorkit.widget.internal.ScrollableEditText.OnScrollChangedListener
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        if (this.state != State.DRAGGING) {
            getMeasurements();
            setState(State.VISIBLE);
            this.g.postDelayed(this.h, 2000L);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return false;
    }

    public final void setState(State state) {
        state.getClass();
        int i = a.a[state.ordinal()];
        he1 he1Var = this.h;
        Handler handler = this.g;
        if (i == 1) {
            handler.removeCallbacks(he1Var);
            this.state = state;
            invalidate();
        } else {
            if (i == 2) {
                throw null;
            }
            if (i == 3) {
                handler.removeCallbacks(he1Var);
                this.state = state;
                invalidate();
            } else {
                if (i != 4) {
                    return;
                }
                handler.removeCallbacks(he1Var);
                this.state = state;
                invalidate();
            }
        }
    }

    private final void getMeasurements() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextScroller(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ TextScroller(Context context, AttributeSet attributeSet, int i, int i2, xu xuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextScroller(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
