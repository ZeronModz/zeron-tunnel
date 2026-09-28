package io.github.g00fy2.quickie;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.fq0;
import defpackage.io0;
import defpackage.l02;
import defpackage.l8;
import defpackage.mn;
import defpackage.oo;
import defpackage.r31;
import defpackage.xu;
import defpackage.zz0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.math.a;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001'B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u000b*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR*\u0010!\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u0018R*\u0010%\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"\"\u0004\b&\u0010\u0018¨\u0006("}, d2 = {"Lio/github/g00fy2/quickie/QROverlayView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "stringRes", "Lmk1;", "setCustomText", "(I)V", "drawableRes", "setCustomIcon", "(Ljava/lang/Integer;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "ratio", "setHorizontalFrameRatio", "(F)V", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "on", "setTorchState", "(Z)V", "getAccentColor", "()I", "Landroid/view/View;", "setTintAndStateAwareBackground", "(Landroid/view/View;)V", "value", "p", "Z", "isHighlighted", "()Z", "setHighlighted", "q", "isLoading", "setLoading", "Companion", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QROverlayView extends FrameLayout {
    public static final /* synthetic */ int r = 0;
    public final fq0 a;
    public final int b;
    public final int c;
    public final int d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final float i;
    public final float j;
    public final RectF k;
    public final RectF l;
    public Bitmap m;
    public Canvas n;
    public float o;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean isHighlighted;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean isLoading;

    /* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lio/github/g00fy2/quickie/QROverlayView$Companion;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "BACKGROUND_ALPHA", "D", "BUTTON_BACKGROUND_ALPHA", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "STROKE_WIDTH", "F", "OUT_RADIUS", "FRAME_MARGIN_RATIO", "ICON_MAX_HEIGHT", "quickie-foss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public Companion(xu xuVar) {
        }
    }

    static {
        new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QROverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.quickie_overlay_view, this);
        int i2 = R.id.close_image_view;
        AppCompatImageView appCompatImageView = (AppCompatImageView) l02.n(R.id.close_image_view, this);
        if (appCompatImageView != null) {
            i2 = R.id.gallery_image_view;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) l02.n(R.id.gallery_image_view, this);
            if (appCompatImageView2 != null) {
                i2 = R.id.progress_view;
                LinearLayout linearLayout = (LinearLayout) l02.n(R.id.progress_view, this);
                if (linearLayout != null) {
                    i2 = R.id.title_text_view;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) l02.n(R.id.title_text_view, this);
                    if (appCompatTextView != null) {
                        i2 = R.id.torch_image_view;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) l02.n(R.id.torch_image_view, this);
                        if (appCompatImageView3 != null) {
                            fq0 fq0Var = new fq0();
                            fq0Var.a = this;
                            fq0Var.b = appCompatImageView;
                            fq0Var.c = appCompatImageView2;
                            fq0Var.d = linearLayout;
                            fq0Var.e = appCompatTextView;
                            fq0Var.f = appCompatImageView3;
                            this.a = fq0Var;
                            this.b = context.getColor(R.color.quickie_gray);
                            this.c = getAccentColor();
                            int iE = oo.e(-16777216, a.a(196.35d));
                            this.d = iE;
                            Paint paint = new Paint();
                            paint.setAlpha(a.a(196.35d));
                            this.e = paint;
                            this.f = new Paint(1);
                            Paint paint2 = new Paint(1);
                            paint2.setColor(iE);
                            this.g = paint2;
                            Paint paint3 = new Paint(1);
                            paint3.setColor(0);
                            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                            this.h = paint3;
                            this.i = TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
                            this.j = TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics());
                            this.k = new RectF();
                            this.l = new RectF();
                            this.o = 1.0f;
                            setWillNotDraw(false);
                            return;
                        }
                    }
                }
            }
        }
        io0.e("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final int getAccentColor() {
        TypedValue typedValue = new TypedValue();
        return getContext().getTheme().resolveAttribute(android.R.attr.colorAccent, typedValue, true) ? typedValue.data : getContext().getColor(R.color.quickie_accent_fallback);
    }

    private final void setTintAndStateAwareBackground(View view) {
        Drawable background = view.getBackground();
        if (background != null) {
            int[][] iArr = {new int[]{android.R.attr.state_pressed, android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed, -16842913}, new int[]{-16842919, android.R.attr.state_selected}, new int[0]};
            int i = this.b;
            int i2 = this.c;
            ColorStateList colorStateListWithAlpha = new ColorStateList(iArr, new int[]{i, i2, i2, i}).withAlpha(a.a(153.0d));
            colorStateListWithAlpha.getClass();
            background.setTintList(colorStateListWithAlpha);
            view.setBackground(background);
        }
    }

    public final void a() {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int iMin = Math.min(width, height);
        float f = this.o;
        float f2 = iMin;
        float f3 = f2 - ((f > 1.0f ? 0.25f * ((1.0f / f) * 1.5f) : 0.25f) * f2);
        float fApplyDimension = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        float f4 = width;
        float f5 = height;
        float f6 = f3 / this.o;
        float f7 = f6 + f5;
        RectF rectF = this.k;
        rectF.set(f4 - f3, f5 - f6, f4 + f3, f7);
        this.l.set(rectF.left + fApplyDimension, rectF.top + fApplyDimension, rectF.right - fApplyDimension, rectF.bottom - fApplyDimension);
        int iB = a.b(((-getPaddingTop()) + height) - f3);
        fq0 fq0Var = this.a;
        AppCompatTextView appCompatTextView = (AppCompatTextView) fq0Var.e;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) fq0Var.e;
        int height2 = (iB - appCompatTextView.getHeight()) / 2;
        ViewGroup.LayoutParams layoutParams = appCompatTextView2.getLayoutParams();
        layoutParams.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = height2;
        appCompatTextView2.setLayoutParams(marginLayoutParams);
        appCompatTextView2.setVisibility(iB < appCompatTextView2.getHeight() ? 4 : 0);
    }

    public final void b(boolean z, l8 l8Var) {
        fq0 fq0Var = this.a;
        AppCompatImageView appCompatImageView = (AppCompatImageView) fq0Var.b;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) fq0Var.b;
        int i = 8;
        appCompatImageView.setVisibility(z ? 0 : 8);
        appCompatImageView2.setOnClickListener(new mn(l8Var, i));
        if (z) {
            setTintAndStateAwareBackground(appCompatImageView2);
        }
    }

    public final void c(zz0 zz0Var) {
        fq0 fq0Var = this.a;
        ((AppCompatImageView) fq0Var.c).setVisibility(0);
        AppCompatImageView appCompatImageView = (AppCompatImageView) fq0Var.c;
        appCompatImageView.setOnClickListener(new mn(zz0Var, 9));
        setTintAndStateAwareBackground(appCompatImageView);
    }

    public final void d(boolean z, Function1 function1) {
        fq0 fq0Var = this.a;
        AppCompatImageView appCompatImageView = (AppCompatImageView) fq0Var.f;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) fq0Var.f;
        appCompatImageView.setVisibility(z ? 0 : 8);
        appCompatImageView2.setOnClickListener(new mn(function1, 7));
        if (z) {
            setTintAndStateAwareBackground(appCompatImageView2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int i = this.isHighlighted ? this.c : this.b;
        Paint paint = this.f;
        paint.setColor(i);
        Canvas canvas2 = this.n;
        canvas2.getClass();
        canvas2.drawColor(this.d);
        Canvas canvas3 = this.n;
        canvas3.getClass();
        RectF rectF = this.k;
        float f = this.i;
        canvas3.drawRoundRect(rectF, f, f, paint);
        Canvas canvas4 = this.n;
        canvas4.getClass();
        Paint paint2 = this.h;
        RectF rectF2 = this.l;
        float f2 = this.j;
        canvas4.drawRoundRect(rectF2, f2, f2, paint2);
        if (this.isLoading) {
            Canvas canvas5 = this.n;
            canvas5.getClass();
            canvas5.drawRoundRect(rectF2, f2, f2, this.g);
        }
        Bitmap bitmap = this.m;
        bitmap.getClass();
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.e);
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.m != null || getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        this.n = new Canvas(bitmapCreateBitmap);
        this.m = bitmapCreateBitmap;
        a();
    }

    public final void setCustomIcon(Integer drawableRes) {
        fq0 fq0Var = this.a;
        if (drawableRes == null) {
            ((AppCompatTextView) fq0Var.e).setCompoundDrawables(null, null, null, null);
            return;
        }
        if (drawableRes.intValue() != 0) {
            try {
                Resources resources = getResources();
                int iIntValue = drawableRes.intValue();
                ThreadLocal threadLocal = r31.a;
                Drawable drawable = resources.getDrawable(iIntValue, null);
                if (drawable != null) {
                    float fApplyDimension = TypedValue.applyDimension(1, 56.0f, getResources().getDisplayMetrics()) / drawable.getMinimumHeight();
                    if (fApplyDimension < 1.0f) {
                        drawable.setBounds(0, 0, a.b(drawable.getMinimumWidth() * fApplyDimension), a.b(drawable.getMinimumHeight() * fApplyDimension));
                    } else {
                        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                    }
                    ((AppCompatTextView) fq0Var.e).setCompoundDrawables(null, drawable, null, null);
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
    }

    public final void setCustomText(int stringRes) {
        if (stringRes != 0) {
            try {
                ((AppCompatTextView) this.a.e).setText(stringRes);
            } catch (Resources.NotFoundException unused) {
            }
        }
    }

    public final void setHighlighted(boolean z) {
        if (this.isHighlighted != z) {
            this.isHighlighted = z;
            invalidate();
        }
    }

    public final void setHorizontalFrameRatio(float ratio) {
        if (ratio > 1.0f) {
            this.o = ratio;
            a();
        }
    }

    public final void setLoading(boolean z) {
        if (this.isLoading != z) {
            this.isLoading = z;
            ((LinearLayout) this.a.d).setVisibility(z ? 0 : 8);
        }
    }

    public final void setTorchState(boolean on) {
        ((AppCompatImageView) this.a.f).setSelected(on);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QROverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ QROverlayView(Context context, AttributeSet attributeSet, int i, int i2, xu xuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QROverlayView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
