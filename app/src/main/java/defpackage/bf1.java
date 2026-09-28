package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatDrawableManager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class bf1 {
    public final Context a;
    public final TypedArray b;
    public TypedValue c;

    public bf1(Context context, TypedArray typedArray) {
        this.a = context;
        this.b = typedArray;
    }

    public static bf1 e(Context context, AttributeSet attributeSet, int[] iArr) {
        return new bf1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static bf1 f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new bf1(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateListI;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListI = k5.i(this.a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListI;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : n8.p(this.a, resourceId);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable drawableF;
        if (!this.b.hasValue(i) || (resourceId = this.b.getResourceId(i, 0)) == 0) {
            return null;
        }
        AppCompatDrawableManager appCompatDrawableManagerA = AppCompatDrawableManager.a();
        Context context = this.a;
        synchronized (appCompatDrawableManagerA) {
            drawableF = appCompatDrawableManagerA.a.f(context, resourceId, true);
        }
        return drawableF;
    }

    public final Typeface d(int i, int i2, e7 e7Var) {
        int resourceId = this.b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        TypedValue typedValue2 = typedValue;
        ThreadLocal threadLocal = r31.a;
        Context context = this.a;
        if (context.isRestricted()) {
            return null;
        }
        return r31.b(context, resourceId, typedValue2, i2, e7Var, true, false);
    }

    public final void g() {
        this.b.recycle();
    }
}
