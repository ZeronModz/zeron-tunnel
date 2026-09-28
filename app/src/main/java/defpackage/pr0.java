package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.core.widgets.Placeholder;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class pr0 {
    public ConstraintWidgetContainer a = new ConstraintWidgetContainer();
    public ConstraintWidgetContainer b = new ConstraintWidgetContainer();
    public ConstraintSet c = null;
    public ConstraintSet d = null;
    public int e;
    public int f;
    public final /* synthetic */ MotionLayout g;

    public pr0(MotionLayout motionLayout) {
        this.g = motionLayout;
    }

    public static void c(ConstraintWidgetContainer constraintWidgetContainer, ConstraintWidgetContainer constraintWidgetContainer2) {
        ArrayList<ConstraintWidget> arrayList = constraintWidgetContainer.w0;
        HashMap map = new HashMap();
        map.put(constraintWidgetContainer, constraintWidgetContainer2);
        constraintWidgetContainer2.w0.clear();
        constraintWidgetContainer2.h(constraintWidgetContainer, map);
        for (ConstraintWidget constraintWidget : arrayList) {
            ConstraintWidget barrier = constraintWidget instanceof Barrier ? new Barrier() : constraintWidget instanceof Guideline ? new Guideline() : constraintWidget instanceof Flow ? new Flow() : constraintWidget instanceof Placeholder ? new Placeholder() : constraintWidget instanceof Helper ? new HelperWidget() : new ConstraintWidget();
            constraintWidgetContainer2.add(barrier);
            map.put(constraintWidget, barrier);
        }
        for (ConstraintWidget constraintWidget2 : arrayList) {
            ((ConstraintWidget) map.get(constraintWidget2)).h(constraintWidget2, map);
        }
    }

    public static ConstraintWidget d(ConstraintWidgetContainer constraintWidgetContainer, View view) {
        if (constraintWidgetContainer.j0 == view) {
            return constraintWidgetContainer;
        }
        ArrayList arrayList = constraintWidgetContainer.w0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) arrayList.get(i);
            if (constraintWidget.j0 == view) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final void a() {
        HashMap map;
        int[] iArr;
        int i;
        MotionLayout motionLayout = this.g;
        int childCount = motionLayout.getChildCount();
        HashMap map2 = motionLayout.B;
        map2.clear();
        SparseArray sparseArray = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            lr0 lr0Var = new lr0(childAt);
            int id = childAt.getId();
            iArr2[i2] = id;
            sparseArray.put(id, lr0Var);
            map2.put(childAt, lr0Var);
        }
        int i3 = 0;
        while (i3 < childCount) {
            View childAt2 = motionLayout.getChildAt(i3);
            lr0 lr0Var2 = (lr0) map2.get(childAt2);
            if (lr0Var2 == null) {
                map = map2;
                iArr = iArr2;
                i = i3;
            } else {
                Rect rect = lr0Var2.a;
                ir0 ir0Var = lr0Var2.h;
                qr0 qr0Var = lr0Var2.f;
                if (this.c != null) {
                    ConstraintWidget constraintWidgetD = d(this.a, childAt2);
                    if (constraintWidgetD != null) {
                        Rect rectY = motionLayout.y(constraintWidgetD);
                        ConstraintSet constraintSet = this.c;
                        int width = motionLayout.getWidth();
                        int height = motionLayout.getHeight();
                        map = map2;
                        int i4 = constraintSet.d;
                        if (i4 != 0) {
                            lr0.h(rectY, rect, i4, width, height);
                        }
                        qr0Var.c = 0.0f;
                        qr0Var.d = 0.0f;
                        lr0Var2.g(qr0Var);
                        iArr = iArr2;
                        i = i3;
                        qr0Var.d(rectY.left, rectY.top, rectY.width(), rectY.height());
                        ConstraintSet.Constraint constraintI = constraintSet.i(lr0Var2.c);
                        qr0Var.a(constraintI);
                        ConstraintSet.Motion motion = constraintI.d;
                        lr0Var2.l = motion.g;
                        ir0Var.d(rectY, constraintSet, i4, lr0Var2.c);
                        lr0Var2.C = constraintI.f.i;
                        lr0Var2.E = motion.j;
                        lr0Var2.F = motion.i;
                        Context context = lr0Var2.b.getContext();
                        int i5 = motion.l;
                        lr0Var2.G = i5 != -2 ? i5 != -1 ? i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 4 ? i5 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new kr0(Easing.c(motion.k), 0) : AnimationUtils.loadInterpolator(context, motion.m);
                    } else {
                        map = map2;
                        iArr = iArr2;
                        i = i3;
                        if (motionLayout.L != 0) {
                            Debug.b();
                            Debug.d(childAt2);
                            childAt2.getClass();
                        }
                    }
                } else {
                    map = map2;
                    iArr = iArr2;
                    i = i3;
                }
                if (this.d != null) {
                    ConstraintWidget constraintWidgetD2 = d(this.b, childAt2);
                    if (constraintWidgetD2 != null) {
                        Rect rectY2 = motionLayout.y(constraintWidgetD2);
                        ConstraintSet constraintSet2 = this.d;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        qr0 qr0Var2 = lr0Var2.g;
                        int i6 = constraintSet2.d;
                        if (i6 != 0) {
                            lr0.h(rectY2, rect, i6, width2, height2);
                        } else {
                            rect = rectY2;
                        }
                        qr0Var2.c = 1.0f;
                        qr0Var2.d = 1.0f;
                        lr0Var2.g(qr0Var2);
                        qr0Var2.d(rect.left, rect.top, rect.width(), rect.height());
                        qr0Var2.a(constraintSet2.i(lr0Var2.c));
                        lr0Var2.i.d(rect, constraintSet2, i6, lr0Var2.c);
                    } else if (motionLayout.L != 0) {
                        Debug.b();
                        Debug.d(childAt2);
                        childAt2.getClass();
                    }
                }
            }
            i3 = i + 1;
            map2 = map;
            iArr2 = iArr;
        }
        int[] iArr3 = iArr2;
        for (int i7 = 0; i7 < childCount; i7++) {
            lr0 lr0Var3 = (lr0) sparseArray.get(iArr3[i7]);
            int i8 = lr0Var3.f.k;
            if (i8 != -1) {
                lr0 lr0Var4 = (lr0) sparseArray.get(i8);
                lr0Var3.f.f(lr0Var4, lr0Var4.f);
                lr0Var3.g.f(lr0Var4, lr0Var4.g);
            }
        }
    }

    public final void b(int i, int i2) {
        MotionLayout motionLayout = this.g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.w == motionLayout.getStartState()) {
            ConstraintWidgetContainer constraintWidgetContainer = this.b;
            ConstraintSet constraintSet = this.d;
            motionLayout.h(constraintWidgetContainer, optimizationLevel, (constraintSet == null || constraintSet.d == 0) ? i : i2, (constraintSet == null || constraintSet.d == 0) ? i2 : i);
            ConstraintSet constraintSet2 = this.c;
            if (constraintSet2 != null) {
                ConstraintWidgetContainer constraintWidgetContainer2 = this.a;
                int i3 = constraintSet2.d;
                int i4 = i3 == 0 ? i : i2;
                if (i3 == 0) {
                    i = i2;
                }
                motionLayout.h(constraintWidgetContainer2, optimizationLevel, i4, i);
                return;
            }
            return;
        }
        ConstraintSet constraintSet3 = this.c;
        if (constraintSet3 != null) {
            ConstraintWidgetContainer constraintWidgetContainer3 = this.a;
            int i5 = constraintSet3.d;
            motionLayout.h(constraintWidgetContainer3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
        }
        ConstraintWidgetContainer constraintWidgetContainer4 = this.b;
        ConstraintSet constraintSet4 = this.d;
        int i6 = (constraintSet4 == null || constraintSet4.d == 0) ? i : i2;
        if (constraintSet4 == null || constraintSet4.d == 0) {
            i = i2;
        }
        motionLayout.h(constraintWidgetContainer4, optimizationLevel, i6, i);
    }

    public final void e(ConstraintSet constraintSet, ConstraintSet constraintSet2) {
        this.c = constraintSet;
        this.d = constraintSet2;
        this.a = new ConstraintWidgetContainer();
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer();
        this.b = constraintWidgetContainer;
        ConstraintWidgetContainer constraintWidgetContainer2 = this.a;
        boolean z = MotionLayout.G0;
        MotionLayout motionLayout = this.g;
        ConstraintWidgetContainer constraintWidgetContainer3 = motionLayout.c;
        BasicMeasure.Measurer measurer = constraintWidgetContainer3.A0;
        constraintWidgetContainer2.A0 = measurer;
        constraintWidgetContainer2.y0.f = measurer;
        BasicMeasure.Measurer measurer2 = constraintWidgetContainer3.A0;
        constraintWidgetContainer.A0 = measurer2;
        constraintWidgetContainer.y0.f = measurer2;
        constraintWidgetContainer2.w0.clear();
        this.b.w0.clear();
        c(constraintWidgetContainer3, this.a);
        c(constraintWidgetContainer3, this.b);
        if (motionLayout.F > 0.5d) {
            if (constraintSet != null) {
                g(this.a, constraintSet);
            }
            g(this.b, constraintSet2);
        } else {
            g(this.b, constraintSet2);
            if (constraintSet != null) {
                g(this.a, constraintSet);
            }
        }
        this.a.B0 = motionLayout.e();
        ConstraintWidgetContainer constraintWidgetContainer4 = this.a;
        constraintWidgetContainer4.x0.c(constraintWidgetContainer4);
        this.b.B0 = motionLayout.e();
        ConstraintWidgetContainer constraintWidgetContainer5 = this.b;
        constraintWidgetContainer5.x0.c(constraintWidgetContainer5);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams.width == -2) {
                ConstraintWidgetContainer constraintWidgetContainer6 = this.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                constraintWidgetContainer6.O(dimensionBehaviour);
                this.b.O(dimensionBehaviour);
            }
            if (layoutParams.height == -2) {
                ConstraintWidgetContainer constraintWidgetContainer7 = this.a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                constraintWidgetContainer7.P(dimensionBehaviour2);
                this.b.P(dimensionBehaviour2);
            }
        }
    }

    public final void f() {
        ConstraintWidgetContainer constraintWidgetContainer;
        boolean z;
        MotionLayout motionLayout = this.g;
        int i = motionLayout.y;
        int i2 = motionLayout.z;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        motionLayout.q0 = mode;
        motionLayout.r0 = mode2;
        b(i, i2);
        int i3 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            b(i, i2);
            motionLayout.m0 = this.a.s();
            motionLayout.n0 = this.a.m();
            motionLayout.o0 = this.b.s();
            int iM = this.b.m();
            motionLayout.p0 = iM;
            motionLayout.l0 = (motionLayout.m0 == motionLayout.o0 && motionLayout.n0 == iM) ? false : true;
        }
        int i4 = motionLayout.m0;
        int i5 = motionLayout.n0;
        int i6 = motionLayout.q0;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((motionLayout.s0 * (motionLayout.o0 - i4)) + i4);
        }
        int i7 = motionLayout.r0;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) ((motionLayout.s0 * (motionLayout.p0 - i5)) + i5);
        }
        int i8 = i5;
        ConstraintWidgetContainer constraintWidgetContainer2 = this.a;
        if (constraintWidgetContainer2.L0 || this.b.L0) {
            constraintWidgetContainer = constraintWidgetContainer2;
            z = true;
        } else {
            constraintWidgetContainer = constraintWidgetContainer2;
            z = false;
        }
        motionLayout.g(i, i2, i4, z, constraintWidgetContainer.M0 || this.b.M0, i8);
        HashMap map = motionLayout.B;
        int childCount = motionLayout.getChildCount();
        motionLayout.A0.a();
        motionLayout.J = true;
        SparseArray sparseArray = new SparseArray();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = motionLayout.getChildAt(i9);
            sparseArray.put(childAt.getId(), (lr0) map.get(childAt));
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        MotionScene.Transition transition = motionLayout.r.c;
        int i10 = transition != null ? transition.p : -1;
        if (i10 != -1) {
            for (int i11 = 0; i11 < childCount; i11++) {
                lr0 lr0Var = (lr0) map.get(motionLayout.getChildAt(i11));
                if (lr0Var != null) {
                    lr0Var.B = i10;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            lr0 lr0Var2 = (lr0) map.get(motionLayout.getChildAt(i13));
            int i14 = lr0Var2.f.k;
            if (i14 != -1) {
                sparseBooleanArray.put(i14, true);
                iArr[i12] = lr0Var2.f.k;
                i12++;
            }
        }
        if (motionLayout.e0 != null) {
            for (int i15 = 0; i15 < i12; i15++) {
                lr0 lr0Var3 = (lr0) map.get(motionLayout.findViewById(iArr[i15]));
                if (lr0Var3 != null) {
                    motionLayout.r.f(lr0Var3);
                }
            }
            Iterator it = motionLayout.e0.iterator();
            while (it.hasNext()) {
                ((MotionHelper) it.next()).onPreSetup(motionLayout, map);
            }
            for (int i16 = 0; i16 < i12; i16++) {
                lr0 lr0Var4 = (lr0) map.get(motionLayout.findViewById(iArr[i16]));
                if (lr0Var4 != null) {
                    lr0Var4.i(width, motionLayout.getNanoTime(), height);
                }
            }
        } else {
            for (int i17 = 0; i17 < i12; i17++) {
                lr0 lr0Var5 = (lr0) map.get(motionLayout.findViewById(iArr[i17]));
                if (lr0Var5 != null) {
                    motionLayout.r.f(lr0Var5);
                    lr0Var5.i(width, motionLayout.getNanoTime(), height);
                }
            }
        }
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt2 = motionLayout.getChildAt(i18);
            lr0 lr0Var6 = (lr0) map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && lr0Var6 != null) {
                motionLayout.r.f(lr0Var6);
                lr0Var6.i(width, motionLayout.getNanoTime(), height);
            }
        }
        MotionScene.Transition transition2 = motionLayout.r.c;
        float f = transition2 != null ? transition2.i : 0.0f;
        if (f != 0.0f) {
            boolean z2 = ((double) f) < 0.0d;
            float fAbs = Math.abs(f);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i19 = 0; i19 < childCount; i19++) {
                lr0 lr0Var7 = (lr0) map.get(motionLayout.getChildAt(i19));
                if (!Float.isNaN(lr0Var7.l)) {
                    for (int i20 = 0; i20 < childCount; i20++) {
                        lr0 lr0Var8 = (lr0) map.get(motionLayout.getChildAt(i20));
                        if (!Float.isNaN(lr0Var8.l)) {
                            fMin = Math.min(fMin, lr0Var8.l);
                            fMax = Math.max(fMax, lr0Var8.l);
                        }
                    }
                    while (i3 < childCount) {
                        lr0 lr0Var9 = (lr0) map.get(motionLayout.getChildAt(i3));
                        if (!Float.isNaN(lr0Var9.l)) {
                            lr0Var9.n = 1.0f / (1.0f - fAbs);
                            float f2 = lr0Var9.l;
                            if (z2) {
                                lr0Var9.m = fAbs - (((fMax - f2) / (fMax - fMin)) * fAbs);
                            } else {
                                lr0Var9.m = fAbs - (((f2 - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                qr0 qr0Var = lr0Var7.g;
                float f3 = qr0Var.e;
                float f4 = qr0Var.f;
                float f5 = z2 ? f4 - f3 : f4 + f3;
                fMin2 = Math.min(fMin2, f5);
                fMax2 = Math.max(fMax2, f5);
            }
            while (i3 < childCount) {
                lr0 lr0Var10 = (lr0) map.get(motionLayout.getChildAt(i3));
                qr0 qr0Var2 = lr0Var10.g;
                float f6 = qr0Var2.e;
                float f7 = qr0Var2.f;
                float f8 = z2 ? f7 - f6 : f7 + f6;
                lr0Var10.n = 1.0f / (1.0f - fAbs);
                lr0Var10.m = fAbs - (((f8 - fMin2) * fAbs) / (fMax2 - fMin2));
                i3++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ConstraintWidgetContainer constraintWidgetContainer, ConstraintSet constraintSet) {
        ConstraintSet.Constraint constraint;
        ConstraintSet.Constraint constraint2;
        SparseArray sparseArray = new SparseArray();
        Constraints.LayoutParams layoutParams = new Constraints.LayoutParams(-2, -2);
        sparseArray.clear();
        sparseArray.put(0, constraintWidgetContainer);
        MotionLayout motionLayout = this.g;
        sparseArray.put(motionLayout.getId(), constraintWidgetContainer);
        if (constraintSet != null && constraintSet.d != 0) {
            ConstraintWidgetContainer constraintWidgetContainer2 = this.b;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z = MotionLayout.G0;
            motionLayout.h(constraintWidgetContainer2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        for (ConstraintWidget constraintWidget : constraintWidgetContainer.w0) {
            constraintWidget.l0 = true;
            sparseArray.put(((View) constraintWidget.j0).getId(), constraintWidget);
        }
        for (ConstraintWidget constraintWidget2 : constraintWidgetContainer.w0) {
            View view = (View) constraintWidget2.j0;
            int id = view.getId();
            HashMap map = constraintSet.g;
            if (map.containsKey(Integer.valueOf(id)) && (constraint2 = (ConstraintSet.Constraint) map.get(Integer.valueOf(id))) != null) {
                constraint2.a(layoutParams);
            }
            constraintWidget2.Q(constraintSet.i(view.getId()).e.c);
            constraintWidget2.N(constraintSet.i(view.getId()).e.d);
            if (view instanceof ConstraintHelper) {
                ConstraintHelper constraintHelper = (ConstraintHelper) view;
                int id2 = constraintHelper.getId();
                HashMap map2 = constraintSet.g;
                if (map2.containsKey(Integer.valueOf(id2)) && (constraint = (ConstraintSet.Constraint) map2.get(Integer.valueOf(id2))) != null && (constraintWidget2 instanceof HelperWidget)) {
                    constraintHelper.k(constraint, (HelperWidget) constraintWidget2, layoutParams, sparseArray);
                }
                if (view instanceof androidx.constraintlayout.widget.Barrier) {
                    ((androidx.constraintlayout.widget.Barrier) view).p();
                }
            }
            layoutParams.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z2 = MotionLayout.G0;
            motionLayout.a(false, view, constraintWidget2, layoutParams, sparseArray);
            if (constraintSet.i(view.getId()).c.c == 1) {
                constraintWidget2.k0 = view.getVisibility();
            } else {
                constraintWidget2.k0 = constraintSet.i(view.getId()).c.b;
            }
        }
        for (ConstraintWidget constraintWidget3 : constraintWidgetContainer.w0) {
            if (constraintWidget3 instanceof VirtualLayout) {
                ConstraintHelper constraintHelper2 = (ConstraintHelper) constraintWidget3.j0;
                Helper helper = (Helper) constraintWidget3;
                constraintHelper2.o(helper, sparseArray);
                VirtualLayout virtualLayout = (VirtualLayout) helper;
                for (int i = 0; i < virtualLayout.x0; i++) {
                    ConstraintWidget constraintWidget4 = virtualLayout.w0[i];
                    if (constraintWidget4 != null) {
                        constraintWidget4.I = true;
                    }
                }
            }
        }
    }
}
