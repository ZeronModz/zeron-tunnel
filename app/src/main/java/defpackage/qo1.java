package defpackage;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.widget.ViewTransitionController;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qo1 {
    public final int a;
    public final int b;
    public final lr0 c;
    public final int d;
    public final ViewTransitionController f;
    public final Interpolator g;
    public float i;
    public float j;
    public final boolean m;
    public final KeyCache e = new KeyCache();
    public boolean h = false;
    public final Rect l = new Rect();
    public long k = System.nanoTime();

    public qo1(ViewTransitionController viewTransitionController, lr0 lr0Var, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
        this.m = false;
        this.f = viewTransitionController;
        this.c = lr0Var;
        this.d = i2;
        ArrayList arrayList = viewTransitionController.d;
        if (arrayList == null) {
            arrayList = new ArrayList();
            viewTransitionController.d = arrayList;
        }
        arrayList.add(this);
        this.g = interpolator;
        this.a = i4;
        this.b = i5;
        if (i3 == 3) {
            this.m = true;
        }
        this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        a();
    }

    public final void a() {
        boolean z = this.h;
        int i = this.b;
        int i2 = this.a;
        Interpolator interpolator = this.g;
        lr0 lr0Var = this.c;
        ViewTransitionController viewTransitionController = this.f;
        if (z) {
            long jNanoTime = System.nanoTime();
            long j = jNanoTime - this.k;
            this.k = jNanoTime;
            float interpolation = this.i - (((float) (j * 1.0E-6d)) * this.j);
            this.i = interpolation;
            if (interpolation < 0.0f) {
                this.i = 0.0f;
                interpolation = 0.0f;
            }
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(interpolation);
            }
            boolean zF = lr0Var.f(interpolation, jNanoTime, lr0Var.b, this.e);
            if (this.i <= 0.0f) {
                if (i2 != -1) {
                    lr0Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    lr0Var.b.setTag(i, null);
                }
                viewTransitionController.e.add(this);
            }
            if (this.i > 0.0f || zF) {
                viewTransitionController.a.invalidate();
                return;
            }
            return;
        }
        long jNanoTime2 = System.nanoTime();
        long j2 = jNanoTime2 - this.k;
        this.k = jNanoTime2;
        float interpolation2 = (((float) (j2 * 1.0E-6d)) * this.j) + this.i;
        this.i = interpolation2;
        if (interpolation2 >= 1.0f) {
            this.i = 1.0f;
            interpolation2 = 1.0f;
        }
        if (interpolator != null) {
            interpolation2 = interpolator.getInterpolation(interpolation2);
        }
        boolean zF2 = lr0Var.f(interpolation2, jNanoTime2, lr0Var.b, this.e);
        if (this.i >= 1.0f) {
            if (i2 != -1) {
                lr0Var.b.setTag(i2, Long.valueOf(System.nanoTime()));
            }
            if (i != -1) {
                lr0Var.b.setTag(i, null);
            }
            if (!this.m) {
                viewTransitionController.e.add(this);
            }
        }
        if (this.i < 1.0f || zF2) {
            viewTransitionController.a.invalidate();
        }
    }

    public final void b() {
        this.h = true;
        int i = this.d;
        if (i != -1) {
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
        }
        this.f.a.invalidate();
        this.k = System.nanoTime();
    }
}
