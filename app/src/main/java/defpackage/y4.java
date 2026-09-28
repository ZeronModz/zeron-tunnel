package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 extends ea1 {
    public LongSparseArray J;
    public SparseArrayCompat K;

    public y4(y4 y4Var, AnimatedStateListDrawableCompat animatedStateListDrawableCompat, Resources resources) {
        super(y4Var, animatedStateListDrawableCompat, resources);
        if (y4Var != null) {
            this.J = y4Var.J;
            this.K = y4Var.K;
        } else {
            this.J = new LongSparseArray();
            this.K = new SparseArrayCompat();
        }
    }

    @Override // defpackage.ea1
    public final void f() {
        this.J = this.J.clone();
        this.K = this.K.clone();
    }

    public final int g(int i) {
        Object obj;
        if (i < 0) {
            return 0;
        }
        SparseArrayCompat sparseArrayCompat = this.K;
        Object obj2 = 0;
        sparseArrayCompat.getClass();
        int iC = w91.c(sparseArrayCompat.d, i, sparseArrayCompat.b);
        if (iC >= 0 && (obj = sparseArrayCompat.c[iC]) != mc2.e) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    @Override // defpackage.ea1, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new AnimatedStateListDrawableCompat(this, null);
    }

    @Override // defpackage.ea1, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new AnimatedStateListDrawableCompat(this, resources);
    }
}
