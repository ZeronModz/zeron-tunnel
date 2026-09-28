package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.core.view.h;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class a7 extends y6 {
    public final AppCompatSeekBar f;
    public Drawable g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public boolean j;
    public boolean k;

    public a7(AppCompatSeekBar appCompatSeekBar) {
        super((AbsSeekBar) appCompatSeekBar);
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = false;
        this.f = appCompatSeekBar;
    }

    public final void A() {
        Drawable drawable = this.g;
        if (drawable != null) {
            if (this.j || this.k) {
                Drawable drawableMutate = drawable.mutate();
                this.g = drawableMutate;
                if (this.j) {
                    drawableMutate.setTintList(this.h);
                }
                if (this.k) {
                    this.g.setTintMode(this.i);
                }
                if (this.g.isStateful()) {
                    this.g.setState(this.f.getDrawableState());
                }
            }
        }
    }

    public final void B(Canvas canvas) {
        if (this.g != null) {
            int max = this.f.getMax();
            if (max > 1) {
                int intrinsicWidth = this.g.getIntrinsicWidth();
                int intrinsicHeight = this.g.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.g.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.g.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // defpackage.y6
    public final void o(AttributeSet attributeSet, int i) {
        super.o(attributeSet, i);
        AppCompatSeekBar appCompatSeekBar = this.f;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = m11.h;
        bf1 bf1VarF = bf1.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = bf1VarF.b;
        h.o(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, bf1VarF.b, i, 0);
        Drawable drawableC = bf1VarF.c(0);
        if (drawableC != null) {
            appCompatSeekBar.setThumb(drawableC);
        }
        Drawable drawableB = bf1VarF.b(1);
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.g = drawableB;
        if (drawableB != null) {
            drawableB.setCallback(appCompatSeekBar);
            drawableB.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (drawableB.isStateful()) {
                drawableB.setState(appCompatSeekBar.getDrawableState());
            }
            A();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.i = fz.c(typedArray.getInt(3, -1), this.i);
            this.k = true;
        }
        if (typedArray.hasValue(2)) {
            this.h = bf1VarF.a(2);
            this.j = true;
        }
        bf1VarF.g();
        A();
    }
}
