package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.appcompat.widget.TintInfo;
import androidx.core.view.h;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class y5 {
    public final View a;
    public TintInfo d;
    public TintInfo e;
    public TintInfo f;
    public int c = -1;
    public final AppCompatDrawableManager b = AppCompatDrawableManager.a();

    public y5(View view) {
        this.a = view;
    }

    public final void a() {
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                TintInfo tintInfo = this.f;
                if (tintInfo == null) {
                    tintInfo = new TintInfo();
                    this.f = tintInfo;
                }
                tintInfo.a = null;
                tintInfo.d = false;
                tintInfo.b = null;
                tintInfo.c = false;
                WeakHashMap weakHashMap = h.a;
                ColorStateList colorStateListC = cn1.c(view);
                if (colorStateListC != null) {
                    tintInfo.d = true;
                    tintInfo.a = colorStateListC;
                }
                PorterDuff.Mode modeD = cn1.d(view);
                if (modeD != null) {
                    tintInfo.c = true;
                    tintInfo.b = modeD;
                }
                if (tintInfo.d || tintInfo.c) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = AppCompatDrawableManager.b;
                    ResourceManagerInternal.n(background, tintInfo, drawableState);
                    return;
                }
            }
            TintInfo tintInfo2 = this.e;
            if (tintInfo2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = AppCompatDrawableManager.b;
                ResourceManagerInternal.n(background, tintInfo2, drawableState2);
            } else {
                TintInfo tintInfo3 = this.d;
                if (tintInfo3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = AppCompatDrawableManager.b;
                    ResourceManagerInternal.n(background, tintInfo3, drawableState3);
                }
            }
        }
    }

    public final ColorStateList b() {
        TintInfo tintInfo = this.e;
        if (tintInfo != null) {
            return tintInfo.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        TintInfo tintInfo = this.e;
        if (tintInfo != null) {
            return tintInfo.b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListH;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = m11.C;
        bf1 bf1VarF = bf1.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = bf1VarF.b;
        View view2 = this.a;
        h.o(view2, view2.getContext(), iArr, attributeSet, bf1VarF.b, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.c = typedArray.getResourceId(0, -1);
                AppCompatDrawableManager appCompatDrawableManager = this.b;
                Context context2 = view.getContext();
                int i2 = this.c;
                synchronized (appCompatDrawableManager) {
                    colorStateListH = appCompatDrawableManager.a.h(context2, i2);
                }
                if (colorStateListH != null) {
                    g(colorStateListH);
                }
            }
            if (typedArray.hasValue(1)) {
                cn1.j(view, bf1VarF.a(1));
            }
            if (typedArray.hasValue(2)) {
                cn1.k(view, fz.c(typedArray.getInt(2, -1), null));
            }
            bf1VarF.g();
        } catch (Throwable th) {
            bf1VarF.g();
            throw th;
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateListH;
        this.c = i;
        AppCompatDrawableManager appCompatDrawableManager = this.b;
        if (appCompatDrawableManager != null) {
            Context context = this.a.getContext();
            synchronized (appCompatDrawableManager) {
                colorStateListH = appCompatDrawableManager.a.h(context, i);
            }
        } else {
            colorStateListH = null;
        }
        g(colorStateListH);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            TintInfo tintInfo = this.d;
            if (tintInfo == null) {
                tintInfo = new TintInfo();
                this.d = tintInfo;
            }
            tintInfo.a = colorStateList;
            tintInfo.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        TintInfo tintInfo = this.e;
        if (tintInfo == null) {
            tintInfo = new TintInfo();
            this.e = tintInfo;
        }
        tintInfo.a = colorStateList;
        tintInfo.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        TintInfo tintInfo = this.e;
        if (tintInfo == null) {
            tintInfo = new TintInfo();
            this.e = tintInfo;
        }
        tintInfo.b = mode;
        tintInfo.c = true;
        a();
    }
}
