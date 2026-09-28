package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.motion.utils.ArcCurveFit;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.CustomSupport;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.motion.widget.Key;
import androidx.constraintlayout.motion.widget.KeyTrigger;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class lr0 {
    public KeyTrigger[] A;
    public final View b;
    public final int c;
    public CurveFit[] j;
    public ArcCurveFit k;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap x;
    public HashMap y;
    public HashMap z;
    public final Rect a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final qr0 f = new qr0();
    public final qr0 g = new qr0();
    public final ir0 h = new ir0();
    public final ir0 i = new ir0();
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList u = new ArrayList();
    public final float[] v = new float[1];
    public final ArrayList w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public lr0(View view) {
        this.b = view;
        this.c = view.getId();
        view.getLayoutParams();
    }

    public static void h(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(Key key) {
        this.w.add(key);
    }

    public final float b(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.n;
            if (f3 != 1.0d) {
                float f4 = this.m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        Easing easing = this.f.a;
        float f5 = Float.NaN;
        for (qr0 qr0Var : this.u) {
            Easing easing2 = qr0Var.a;
            if (easing2 != null) {
                float f6 = qr0Var.c;
                if (f6 < f) {
                    easing = easing2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = qr0Var.c;
                }
            }
        }
        if (easing == null) {
            return f;
        }
        float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
        double d = (f - f2) / f7;
        float fA = (((float) easing.a(d)) * f7) + f2;
        if (fArr != null) {
            fArr[0] = (float) easing.b(d);
        }
        return fA;
    }

    public final void c(double d, float[] fArr, float[] fArr2) {
        float f;
        char c;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].c(d, dArr);
        this.j[0].f(d, dArr2);
        float f2 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.o;
        qr0 qr0Var = this.f;
        float f3 = qr0Var.e;
        float f4 = qr0Var.f;
        float f5 = qr0Var.g;
        float f6 = qr0Var.h;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        int i = 0;
        while (i < iArr.length) {
            double[] dArr3 = dArr;
            float f10 = (float) dArr3[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                c = 4;
                f3 = f10;
                f7 = f11;
            } else if (i2 == 2) {
                c = 4;
                f4 = f10;
                f2 = f11;
            } else if (i2 != 3) {
                c = 4;
                if (i2 == 4) {
                    f6 = f10;
                    f9 = f11;
                }
            } else {
                c = 4;
                f5 = f10;
                f8 = f11;
            }
            i++;
            dArr = dArr3;
        }
        float f12 = (f8 / 2.0f) + f7;
        float f13 = (f9 / 2.0f) + f2;
        lr0 lr0Var = qr0Var.m;
        if (lr0Var != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            lr0Var.c(d, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float fSin = (float) (((Math.sin(d3) * d2) + ((double) f14)) - ((double) (f5 / 2.0f)));
            float fCos = (float) ((((double) f15) - (Math.cos(d3) * d2)) - ((double) (f6 / 2.0f)));
            double d4 = f7;
            f = 2.0f;
            double d5 = f2;
            float fCos2 = (float) ((Math.cos(d3) * d5) + (Math.sin(d3) * d4) + ((double) f16));
            float fSin2 = (float) ((Math.sin(d3) * d5) + (((double) f17) - (Math.cos(d3) * d4)));
            f3 = fSin;
            f4 = fCos;
            f12 = fCos2;
            f13 = fSin2;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f5 / f) + f3 + 0.0f;
        fArr[1] = (f6 / f) + f4 + 0.0f;
        fArr2[0] = f12;
        fArr2[1] = f13;
    }

    public final void d(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.v;
        float fB = b(f, fArr2);
        CurveFit[] curveFitArr = this.j;
        int i = 0;
        if (curveFitArr == null) {
            qr0 qr0Var = this.g;
            float f4 = qr0Var.e;
            qr0 qr0Var2 = this.f;
            float f5 = f4 - qr0Var2.e;
            float f6 = qr0Var.f - qr0Var2.f;
            float f7 = qr0Var.g - qr0Var2.g;
            float f8 = (qr0Var.h - qr0Var2.h) + f6;
            fArr[0] = ((f7 + f5) * f2) + ((1.0f - f2) * f5);
            fArr[1] = (f8 * f3) + ((1.0f - f3) * f6);
            return;
        }
        double d = fB;
        curveFitArr[0].f(d, this.q);
        this.j[0].c(d, this.p);
        float f9 = fArr2[0];
        while (true) {
            dArr = this.q;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f9);
            i++;
        }
        ArcCurveFit arcCurveFit = this.k;
        if (arcCurveFit == null) {
            qr0.e(f2, f3, fArr, this.o, dArr, this.p);
            return;
        }
        double[] dArr2 = this.p;
        if (dArr2.length > 0) {
            arcCurveFit.c(d, dArr2);
            this.k.f(d, this.q);
            qr0.e(f2, f3, fArr, this.o, this.q, this.p);
        }
    }

    public final float e() {
        float[] fArr = new float[2];
        double d = 0.0d;
        double d2 = 0.0d;
        float fHypot = 0.0f;
        for (int i = 0; i < 100; i++) {
            float f = i * 0.01010101f;
            double dA = f;
            qr0 qr0Var = this.f;
            Easing easing = qr0Var.a;
            float f2 = Float.NaN;
            float f3 = 0.0f;
            for (qr0 qr0Var2 : this.u) {
                Easing easing2 = qr0Var2.a;
                qr0 qr0Var3 = qr0Var;
                if (easing2 != null) {
                    float f4 = qr0Var2.c;
                    if (f4 < f) {
                        f3 = f4;
                        easing = easing2;
                    } else if (Float.isNaN(f2)) {
                        f2 = qr0Var2.c;
                    }
                }
                qr0Var = qr0Var3;
            }
            qr0 qr0Var4 = qr0Var;
            if (easing != null) {
                if (Float.isNaN(f2)) {
                    f2 = 1.0f;
                }
                dA = (((float) easing.a((f - f3) / r16)) * (f2 - f3)) + f3;
            }
            this.j[0].c(dA, this.p);
            qr0Var4.c(dA, this.o, this.p, fArr, 0);
            if (i > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
        }
        return fHypot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f(float f, long j, View view, KeyCache keyCache) {
        boolean zE;
        boolean z;
        float f2;
        ViewTimeCycle.PathRotate pathRotate;
        float f3;
        boolean z2;
        double d;
        float f4;
        float f5;
        float f6;
        float fSin;
        float f7;
        ViewTimeCycle.PathRotate pathRotate2 = null;
        float fB = b(f, null);
        int i = this.E;
        if (i != -1) {
            float f8 = 1.0f / i;
            float fFloor = ((float) Math.floor(fB / f8)) * f8;
            float f9 = (fB % f8) / f8;
            if (!Float.isNaN(this.F)) {
                f9 = (f9 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fB = ((interpolator != null ? interpolator.getInterpolation(f9) : ((double) f9) > 0.5d ? 1.0f : 0.0f) * f8) + fFloor;
        }
        HashMap map = this.y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((ViewSpline) it.next()).d(view, fB);
            }
        }
        HashMap map2 = this.x;
        if (map2 != null) {
            ViewTimeCycle.PathRotate pathRotate3 = null;
            zE = false;
            for (ViewTimeCycle viewTimeCycle : map2.values()) {
                if (viewTimeCycle instanceof ViewTimeCycle.PathRotate) {
                    pathRotate3 = (ViewTimeCycle.PathRotate) viewTimeCycle;
                } else {
                    zE |= viewTimeCycle.e(fB, j, view, keyCache);
                }
            }
            pathRotate2 = pathRotate3;
        } else {
            zE = false;
        }
        CurveFit[] curveFitArr = this.j;
        qr0 qr0Var = this.f;
        if (curveFitArr != null) {
            double d2 = fB;
            curveFitArr[0].c(d2, this.p);
            this.j[0].f(d2, this.q);
            ArcCurveFit arcCurveFit = this.k;
            if (arcCurveFit != null) {
                double[] dArr = this.p;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    arcCurveFit.c(d2, dArr);
                    this.k.f(d2, this.q);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.H) {
                pathRotate = pathRotate2;
                f3 = 1.0f;
                z2 = zE;
                d = d2;
                f4 = 2.0f;
            } else {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f4 = 2.0f;
                double[] dArr3 = this.q;
                f3 = 1.0f;
                boolean z3 = this.d;
                float f10 = qr0Var.e;
                float fCos = qr0Var.f;
                float f11 = qr0Var.g;
                int i2 = 1;
                float f12 = qr0Var.h;
                pathRotate = pathRotate2;
                if (iArr.length != 0) {
                    f5 = f11;
                    if (qr0Var.p.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        qr0Var.p = new double[i3];
                        qr0Var.q = new double[i3];
                    }
                } else {
                    f5 = f11;
                }
                Arrays.fill(qr0Var.p, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = qr0Var.p;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    qr0Var.q[i5] = dArr3[i4];
                }
                float f13 = Float.NaN;
                float f14 = f2;
                float f15 = f14;
                float f16 = f15;
                float f17 = f16;
                int i6 = 0;
                while (true) {
                    double[] dArr5 = qr0Var.p;
                    f6 = f12;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        f7 = f10;
                    } else {
                        f7 = f10;
                        float f18 = (float) (Double.isNaN(qr0Var.p[i6]) ? 0.0d : qr0Var.p[i6] + 0.0d);
                        float f19 = (float) qr0Var.q[i6];
                        if (i6 == i2) {
                            f15 = f19;
                            f12 = f6;
                            f10 = f18;
                        } else if (i6 == 2) {
                            f14 = f19;
                            f10 = f7;
                            f12 = f6;
                            fCos = f18;
                        } else if (i6 == 3) {
                            f16 = f19;
                            f10 = f7;
                            f12 = f6;
                            f5 = f18;
                        } else if (i6 == 4) {
                            f17 = f19;
                            f10 = f7;
                            f12 = f18;
                        } else if (i6 == 5) {
                            f10 = f7;
                            f12 = f6;
                            f13 = f18;
                        }
                        i6++;
                        i2 = 1;
                    }
                    f10 = f7;
                    f12 = f6;
                    i6++;
                    i2 = 1;
                }
                float f20 = f10;
                lr0 lr0Var = qr0Var.m;
                if (lr0Var != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    lr0Var.c(d2, fArr, fArr2);
                    float f21 = fArr[0];
                    float f22 = fArr[1];
                    float f23 = fArr2[0];
                    float f24 = fArr2[1];
                    z2 = zE;
                    d = d2;
                    double d3 = f20;
                    double d4 = fCos;
                    fSin = (float) (((Math.sin(d4) * d3) + ((double) f21)) - ((double) (f5 / 2.0f)));
                    fCos = (float) ((((double) f22) - (Math.cos(d4) * d3)) - ((double) (f6 / 2.0f)));
                    double d5 = f15;
                    double d6 = f14;
                    float fCos2 = (float) ((Math.cos(d4) * d3 * d6) + (Math.sin(d4) * d5) + ((double) f23));
                    float fSin2 = (float) ((Math.sin(d4) * d3 * d6) + (((double) f24) - (Math.cos(d4) * d5)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (!Float.isNaN(f13)) {
                        view.setRotation((float) (Math.toDegrees(Math.atan2(fSin2, fCos2)) + ((double) f13)));
                    }
                } else {
                    fSin = f20;
                    z2 = zE;
                    d = d2;
                    if (!Float.isNaN(f13)) {
                        view.setRotation(f13 + ((float) Math.toDegrees(Math.atan2((f17 / 2.0f) + f14, (f16 / 2.0f) + f15))) + f2);
                    }
                }
                float f25 = fSin;
                if (view instanceof FloatLayout) {
                    ((FloatLayout) view).layout(f25, fCos, f25 + f5, fCos + f6);
                } else {
                    float f26 = f25 + 0.5f;
                    int i7 = (int) f26;
                    float f27 = fCos + 0.5f;
                    int i8 = (int) f27;
                    int i9 = (int) (f26 + f5);
                    int i10 = (int) (f27 + f6);
                    int i11 = i9 - i7;
                    int i12 = i10 - i8;
                    if (i11 != view.getMeasuredWidth() || i12 != view.getMeasuredHeight() || z3) {
                        view.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    view.layout(i7, i8, i9, i10);
                }
                this.d = false;
            }
            if (this.C != -1) {
                View viewFindViewById = this.D;
                if (viewFindViewById == null) {
                    viewFindViewById = ((View) view.getParent()).findViewById(this.C);
                    this.D = viewFindViewById;
                }
                if (viewFindViewById != null) {
                    float bottom = (this.D.getBottom() + viewFindViewById.getTop()) / f4;
                    float right = (this.D.getRight() + this.D.getLeft()) / f4;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(right - view.getLeft());
                        view.setPivotY(bottom - view.getTop());
                    }
                }
            }
            HashMap map3 = this.y;
            if (map3 != null) {
                for (SplineSet splineSet : map3.values()) {
                    if (splineSet instanceof ViewSpline.PathRotate) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view.setRotation(((ViewSpline.PathRotate) splineSet).a(fB) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (pathRotate != null) {
                double[] dArr7 = this.q;
                double d7 = dArr7[0];
                double d8 = dArr7[1];
                ViewTimeCycle.PathRotate pathRotate4 = pathRotate;
                view.setRotation(pathRotate4.d(fB, j, view, keyCache) + ((float) Math.toDegrees(Math.atan2(d8, d7))));
                z = z2 | pathRotate4.h;
            } else {
                z = z2;
            }
            int i13 = 1;
            while (true) {
                CurveFit[] curveFitArr2 = this.j;
                if (i13 >= curveFitArr2.length) {
                    break;
                }
                CurveFit curveFit = curveFitArr2[i13];
                float[] fArr3 = this.t;
                curveFit.d(d, fArr3);
                CustomSupport.b((ConstraintAttribute) qr0Var.n.get(this.r[i13 - 1]), view, fArr3);
                i13++;
            }
            ir0 ir0Var = this.h;
            if (ir0Var.b == 0) {
                if (fB <= f2) {
                    view.setVisibility(ir0Var.c);
                } else {
                    int i14 = this.i.c;
                    if (fB >= f3) {
                        view.setVisibility(i14);
                    } else if (i14 != ir0Var.c) {
                        view.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i15 = 0;
                while (true) {
                    KeyTrigger[] keyTriggerArr = this.A;
                    if (i15 >= keyTriggerArr.length) {
                        break;
                    }
                    keyTriggerArr[i15].h(view, fB);
                    i15++;
                }
            }
        } else {
            boolean z4 = zE;
            float f28 = qr0Var.e;
            qr0 qr0Var2 = this.g;
            float fK = hz.k(qr0Var2.e, f28, fB, f28);
            float f29 = qr0Var.f;
            float fK2 = hz.k(qr0Var2.f, f29, fB, f29);
            float f30 = qr0Var.g;
            float f31 = qr0Var2.g;
            float fK3 = hz.k(f31, f30, fB, f30);
            float f32 = qr0Var.h;
            float f33 = qr0Var2.h;
            float f34 = fK + 0.5f;
            int i16 = (int) f34;
            float f35 = fK2 + 0.5f;
            int i17 = (int) f35;
            int i18 = (int) (f34 + fK3);
            int iK = (int) (f35 + hz.k(f33, f32, fB, f32));
            int i19 = i18 - i16;
            int i20 = iK - i17;
            if (f31 != f30 || f33 != f32 || this.d) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i19, 1073741824), View.MeasureSpec.makeMeasureSpec(i20, 1073741824));
                this.d = false;
            }
            view.layout(i16, i17, i18, iK);
            z = z4;
        }
        HashMap map4 = this.z;
        if (map4 != null) {
            for (ViewOscillator viewOscillator : map4.values()) {
                if (viewOscillator instanceof ViewOscillator.PathRotateSet) {
                    double[] dArr8 = this.q;
                    view.setRotation(((ViewOscillator.PathRotateSet) viewOscillator).a(fB) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    viewOscillator.e(view, fB);
                }
            }
        }
        return z;
    }

    public final void g(qr0 qr0Var) {
        View view = this.b;
        qr0Var.d((int) view.getX(), (int) view.getY(), view.getWidth(), view.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:430:0x0c58. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0ccb  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x12df  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x12ce A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r48, long r49, int r51) {
        /*
            Method dump skipped, instruction units count: 5184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr0.i(int, long, int):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        qr0 qr0Var = this.f;
        sb.append(qr0Var.e);
        sb.append(" y: ");
        sb.append(qr0Var.f);
        sb.append(" end: x: ");
        qr0 qr0Var2 = this.g;
        sb.append(qr0Var2.e);
        sb.append(" y: ");
        sb.append(qr0Var2.f);
        return sb.toString();
    }
}
