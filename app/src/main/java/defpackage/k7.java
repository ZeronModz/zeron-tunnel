package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.appcompat.widget.TintInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class k7 {
    public final TextView a;
    public TintInfo b;
    public TintInfo c;
    public TintInfo d;
    public TintInfo e;
    public TintInfo f;
    public TintInfo g;
    public TintInfo h;
    public final r7 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public k7(TextView textView) {
        this.a = textView;
        this.i = new r7(textView);
    }

    public static TintInfo c(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList colorStateListH;
        synchronized (appCompatDrawableManager) {
            colorStateListH = appCompatDrawableManager.a.h(context, i);
        }
        if (colorStateListH == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.d = true;
        tintInfo.a = colorStateListH;
        return tintInfo;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            u1.o(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            u1.o(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            EditorInfoCompat.c(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            EditorInfoCompat.c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            EditorInfoCompat.c(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        EditorInfoCompat.c(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public final void a(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        PorterDuff.Mode mode = AppCompatDrawableManager.b;
        ResourceManagerInternal.n(drawable, tintInfo, drawableState);
    }

    public final void b() {
        TintInfo tintInfo = this.b;
        TextView textView = this.a;
        if (tintInfo != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        TintInfo tintInfo = this.h;
        if (tintInfo != null) {
            return tintInfo.a;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        TintInfo tintInfo = this.h;
        if (tintInfo != null) {
            return tintInfo.b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instruction units count: 1029
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k7.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, m11.z);
        bf1 bf1Var = new bf1(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, bf1Var);
        if (Build.VERSION.SDK_INT >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            i7.d(textView, string);
        }
        bf1Var.g();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i, int i2, int i3, int i4) {
        r7 r7Var = this.i;
        if (r7Var.i()) {
            DisplayMetrics displayMetrics = r7Var.j.getResources().getDisplayMetrics();
            r7Var.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (r7Var.g()) {
                r7Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        r7 r7Var = this.i;
        if (r7Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = r7Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                r7Var.f = r7.b(iArrCopyOf);
                if (!r7Var.h()) {
                    io0.m(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                r7Var.g = false;
            }
            if (r7Var.g()) {
                r7Var.a();
            }
        }
    }

    public final void k(int i) {
        r7 r7Var = this.i;
        if (r7Var.i()) {
            if (i == 0) {
                r7Var.a = 0;
                r7Var.d = -1.0f;
                r7Var.e = -1.0f;
                r7Var.c = -1.0f;
                r7Var.f = new int[0];
                r7Var.b = false;
                return;
            }
            if (i != 1) {
                u7.r(hz.o(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = r7Var.j.getResources().getDisplayMetrics();
            r7Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (r7Var.g()) {
                r7Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        TintInfo tintInfo = this.h;
        if (tintInfo == null) {
            tintInfo = new TintInfo();
            this.h = tintInfo;
        }
        TintInfo tintInfo2 = tintInfo;
        tintInfo.a = colorStateList;
        tintInfo.d = colorStateList != null;
        this.b = tintInfo2;
        this.c = tintInfo2;
        this.d = tintInfo2;
        this.e = tintInfo2;
        this.f = tintInfo2;
        this.g = tintInfo2;
    }

    public final void m(PorterDuff.Mode mode) {
        TintInfo tintInfo = this.h;
        if (tintInfo == null) {
            tintInfo = new TintInfo();
            this.h = tintInfo;
        }
        TintInfo tintInfo2 = tintInfo;
        tintInfo.b = mode;
        tintInfo.c = mode != null;
        this.b = tintInfo2;
        this.c = tintInfo2;
        this.d = tintInfo2;
        this.e = tintInfo2;
        this.f = tintInfo2;
        this.g = tintInfo2;
    }

    public final void n(Context context, bf1 bf1Var) {
        String string;
        int i = this.j;
        TypedArray typedArray = bf1Var.b;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceD = bf1Var.d(i5, this.j, new e7(this, i6, i7, new WeakReference(this.a)));
                if (typefaceD != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = typefaceD;
                    } else {
                        this.l = j7.a(Typeface.create(typefaceD, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = j7.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
