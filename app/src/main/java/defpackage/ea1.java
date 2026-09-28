package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.StateListDrawableCompat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public class ea1 extends Drawable.ConstantState {
    public int A;
    public boolean B;
    public ColorFilter C;
    public boolean D;
    public ColorStateList E;
    public PorterDuff.Mode F;
    public boolean G;
    public boolean H;
    public int[][] I;
    public final StateListDrawableCompat a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public int z;

    public ea1(ea1 ea1Var, StateListDrawableCompat stateListDrawableCompat, Resources resources) {
        this.i = false;
        this.l = false;
        this.x = true;
        this.z = 0;
        this.A = 0;
        this.a = stateListDrawableCompat;
        this.b = resources != null ? resources : ea1Var != null ? ea1Var.b : null;
        int i = ea1Var != null ? ea1Var.c : 0;
        int i2 = DrawableContainerCompat.m;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.c = i;
        if (ea1Var != null) {
            this.d = ea1Var.d;
            this.e = ea1Var.e;
            this.v = true;
            this.w = true;
            this.i = ea1Var.i;
            this.l = ea1Var.l;
            this.x = ea1Var.x;
            this.y = ea1Var.y;
            this.z = ea1Var.z;
            this.A = ea1Var.A;
            this.B = ea1Var.B;
            this.C = ea1Var.C;
            this.D = ea1Var.D;
            this.E = ea1Var.E;
            this.F = ea1Var.F;
            this.G = ea1Var.G;
            this.H = ea1Var.H;
            if (ea1Var.c == i) {
                if (ea1Var.j) {
                    this.k = ea1Var.k != null ? new Rect(ea1Var.k) : null;
                    this.j = true;
                }
                if (ea1Var.m) {
                    this.n = ea1Var.n;
                    this.o = ea1Var.o;
                    this.p = ea1Var.p;
                    this.q = ea1Var.q;
                    this.m = true;
                }
            }
            if (ea1Var.r) {
                this.s = ea1Var.s;
                this.r = true;
            }
            if (ea1Var.t) {
                this.u = ea1Var.u;
                this.t = true;
            }
            Drawable[] drawableArr = ea1Var.g;
            this.g = new Drawable[drawableArr.length];
            this.h = ea1Var.h;
            SparseArray sparseArray = ea1Var.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.h);
            }
            int i3 = this.h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i4, constantState);
                    } else {
                        this.g[i4] = drawableArr[i4];
                    }
                }
            }
        } else {
            this.g = new Drawable[10];
            this.h = 0;
        }
        if (ea1Var != null) {
            this.I = ea1Var.I;
        } else {
            this.I = new int[this.g.length][];
        }
    }

    public final int a(Drawable drawable) {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        if (i >= drawableArr.length) {
            int i2 = i + 10;
            Drawable[] drawableArr2 = new Drawable[i2];
            System.arraycopy(drawableArr, 0, drawableArr2, 0, i);
            this.g = drawableArr2;
            int[][] iArr = new int[i2][];
            System.arraycopy(this.I, 0, iArr, 0, i);
            this.I = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.a);
        this.g[i] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.v = false;
        return i;
    }

    public final void b() {
        this.m = true;
        c();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.o) {
                this.o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.p) {
                this.p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i);
                Drawable[] drawableArr = this.g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.b);
                drawableNewDrawable.setLayoutDirection(this.y);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i) {
        int iIndexOfKey;
        Drawable drawable = this.g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f.valueAt(iIndexOfKey)).newDrawable(this.b);
        drawableNewDrawable.setLayoutDirection(this.y);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.a);
        this.g[i] = drawableMutate;
        this.f.removeAt(iIndexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return drawableMutate;
    }

    public final int e(int[] iArr) {
        int[][] iArr2 = this.I;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    public void f() {
        int[][] iArr = this.I;
        int[][] iArr2 = new int[iArr.length][];
        for (int length = iArr.length - 1; length >= 0; length--) {
            int[] iArr3 = this.I[length];
            iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
        }
        this.I = iArr2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.e | this.d;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new StateListDrawableCompat(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new StateListDrawableCompat(this, resources);
    }
}
