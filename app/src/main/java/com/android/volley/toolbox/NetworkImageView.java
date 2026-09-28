package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class NetworkImageView extends ImageView {
    public int a;
    public Drawable b;
    public Bitmap c;

    public NetworkImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        getScaleType();
        if (getLayoutParams() != null) {
            z2 = getLayoutParams().width == -2;
            z3 = getLayoutParams().height == -2;
        } else {
            z2 = false;
            z3 = false;
        }
        boolean z4 = z2 && z3;
        if (width == 0 && height == 0 && !z4) {
            return;
        }
        if (!TextUtils.isEmpty(null)) {
            throw null;
        }
        int i5 = this.a;
        if (i5 != 0) {
            setImageResource(i5);
            return;
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            setImageBitmap(bitmap);
        } else {
            setImageBitmap(null);
        }
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.a = 0;
        this.b = null;
        this.c = bitmap;
    }

    public void setDefaultImageDrawable(Drawable drawable) {
        this.a = 0;
        this.c = null;
        this.b = drawable;
    }

    public void setDefaultImageResId(int i) {
        this.c = null;
        this.b = null;
        this.a = i;
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
    }

    public void setErrorImageDrawable(Drawable drawable) {
    }

    public void setErrorImageResId(int i) {
    }
}
