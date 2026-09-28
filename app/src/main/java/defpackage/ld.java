package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import dev.zeron.tunnel.R;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ld extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    public final WeakReference a;
    public final MaterialShapeDrawable b;
    public final TextDrawableHelper c;
    public final Rect d;
    public final md e;
    public float f;
    public float g;
    public final int h;
    public float i;
    public float j;
    public float k;
    public WeakReference l;
    public WeakReference m;

    public ld(Context context, BadgeState$State badgeState$State) {
        TextAppearance textAppearance;
        WeakReference weakReference = new WeakReference(context);
        this.a = weakReference;
        ke1.c(context, ke1.b, "Theme.MaterialComponents");
        this.d = new Rect();
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.c = textDrawableHelper;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = textDrawableHelper.a;
        textPaint.setTextAlign(align);
        md mdVar = new md(context, badgeState$State);
        this.e = mdVar;
        boolean zE = e();
        BadgeState$State badgeState$State2 = mdVar.b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.a(context, zE ? badgeState$State2.g.intValue() : badgeState$State2.e.intValue(), e() ? badgeState$State2.h.intValue() : badgeState$State2.f.intValue()).a());
        this.b = materialShapeDrawable;
        g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && textDrawableHelper.g != (textAppearance = new TextAppearance(context2, badgeState$State2.d.intValue()))) {
            textDrawableHelper.c(textAppearance, context2);
            textPaint.setColor(badgeState$State2.c.intValue());
            invalidateSelf();
            i();
            invalidateSelf();
        }
        int i = badgeState$State2.l;
        if (i != -2) {
            this.h = ((int) Math.pow(10.0d, ((double) i) - 1.0d)) - 1;
        } else {
            this.h = badgeState$State2.m;
        }
        textDrawableHelper.e = true;
        i();
        invalidateSelf();
        textDrawableHelper.e = true;
        g();
        i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(badgeState$State2.b.intValue());
        if (materialShapeDrawable.a.c != colorStateListValueOf) {
            materialShapeDrawable.m(colorStateListValueOf);
            invalidateSelf();
        }
        textPaint.setColor(badgeState$State2.c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.l;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.l.get();
            WeakReference weakReference3 = this.m;
            h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        i();
        setVisible(badgeState$State2.t.booleanValue(), false);
    }

    public final String a() {
        md mdVar = this.e;
        BadgeState$State badgeState$State = mdVar.b;
        BadgeState$State badgeState$State2 = mdVar.b;
        String str = badgeState$State.j;
        WeakReference weakReference = this.a;
        if (str == null) {
            if (!f()) {
                return null;
            }
            int i = this.h;
            if (i == -2 || d() <= i) {
                return NumberFormat.getInstance(badgeState$State2.n).format(d());
            }
            Context context = (Context) weakReference.get();
            return context == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : String.format(badgeState$State2.n, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), Marker.ANY_NON_NULL_MARKER);
        }
        int i2 = badgeState$State.l;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final CharSequence b() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        md mdVar = this.e;
        BadgeState$State badgeState$State = mdVar.b;
        if (badgeState$State.j != null) {
            CharSequence charSequence = badgeState$State.o;
            return charSequence != null ? charSequence : mdVar.b.j;
        }
        boolean zF = f();
        BadgeState$State badgeState$State2 = mdVar.b;
        if (!zF) {
            return badgeState$State2.p;
        }
        if (badgeState$State2.q == 0 || (context = (Context) this.a.get()) == null) {
            return null;
        }
        int i = this.h;
        return (i == -2 || d() <= i) ? context.getResources().getQuantityString(badgeState$State2.q, d(), Integer.valueOf(d())) : context.getString(badgeState$State2.r, Integer.valueOf(i));
    }

    public final FrameLayout c() {
        WeakReference weakReference = this.m;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int d() {
        int i = this.e.b.k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String strA;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.b.draw(canvas);
        if (!e() || (strA = a()) == null) {
            return;
        }
        Rect rect = new Rect();
        TextDrawableHelper textDrawableHelper = this.c;
        textDrawableHelper.a.getTextBounds(strA, 0, strA.length(), rect);
        float fExactCenterY = this.g - rect.exactCenterY();
        canvas.drawText(strA, this.f, rect.bottom <= 0 ? (int) fExactCenterY : Math.round(fExactCenterY), textDrawableHelper.a);
    }

    public final boolean e() {
        return this.e.b.j != null || f();
    }

    public final boolean f() {
        BadgeState$State badgeState$State = this.e.b;
        return badgeState$State.j == null && badgeState$State.k != -1;
    }

    public final void g() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        boolean zE = e();
        md mdVar = this.e;
        this.b.setShapeAppearanceModel(ShapeAppearanceModel.a(context, zE ? mdVar.b.g.intValue() : mdVar.b.e.intValue(), e() ? mdVar.b.h.intValue() : mdVar.b.f.intValue()).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.e.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void h(View view, FrameLayout frameLayout) {
        this.l = new WeakReference(view);
        this.m = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        i();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ld.i():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public final void onTextSizeChange() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        md mdVar = this.e;
        mdVar.a.i = i;
        mdVar.b.i = i;
        this.c.a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
