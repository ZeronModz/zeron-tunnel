package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.core.view.h;
import androidx.customview.widget.ViewDragHelper$Callback;
import java.util.Arrays;
import java.util.WeakHashMap;

 
 
public final class mn1 {
    public static final x11 x = new x11(1);
    public int a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public float n;
    public int o;
    public final int p;
    public int q;
    public final OverScroller r;
    public final ViewDragHelper$Callback s;
    public View t;
    public boolean u;
    public final ViewGroup v;
    public int c = -1;
    public final g6 w = new g6(this, 29);

    public mn1(Context context, ViewGroup viewGroup, ViewDragHelper$Callback viewDragHelper$Callback) {
        if (viewDragHelper$Callback == null) {
            u7.r("Callback may not be null");
            throw null;
        }
        this.v = viewGroup;
        this.s = viewDragHelper$Callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.p = i;
        this.o = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.r = new OverScroller(context, x);
    }

    public static boolean k(View view, int i, int i2) {
        return view != null && i >= view.getLeft() && i < view.getRight() && i2 >= view.getTop() && i2 < view.getBottom();
    }

    public final void a() {
        b();
        if (this.a == 2) {
            OverScroller overScroller = this.r;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            this.s.i(this.t, overScroller.getCurrX(), overScroller.getCurrY());
        }
        q(0);
    }

    public final void b() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void c(int i, View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.v;
        if (parent != viewGroup) {
            p60.h("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", viewGroup, ")");
            return;
        }
        this.t = view;
        this.c = i;
        this.s.g(i, view);
        q(1);
    }

    public final boolean d(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (this.q & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        float f3 = this.b;
        if (fAbs <= f3 && fAbs2 <= f3) {
            return false;
        }
        if (fAbs < fAbs2 * 0.5f) {
            this.s.getClass();
        }
        return (this.i[i] & i2) == 0 && fAbs > ((float) this.b);
    }

     
     
    public final boolean e(android.view.View r4, float r5, float r6) {
         
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn1.e(android.view.View, float, float):boolean");
    }

    public final void f(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int g(int i, int i2, int i3) {
        if (i == 0) {
            return 0;
        }
        float width = this.v.getWidth() / 2;
        float fSin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int iAbs = Math.abs(i2);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fSin / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f), 600);
    }

    public final boolean h() {
        if (this.a == 2) {
            OverScroller overScroller = this.r;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                View view = this.t;
                WeakHashMap weakHashMap = h.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.t;
                WeakHashMap weakHashMap2 = h.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.s.i(this.t, currX, currY);
            }
            if (zComputeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                this.v.post(this.w);
            }
        }
        return this.a == 2;
    }

    public final View i(int i, int i2) {
        ViewGroup viewGroup = this.v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean j(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.r;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            q(0);
            return false;
        }
        View view = this.t;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            i3 = i3 > 0 ? i8 : -i8;
        }
        int i9 = (int) this.n;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i8) {
            i4 = i4 > 0 ? i8 : -i8;
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i10 = iAbs5 + iAbs6;
        int i11 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i10;
        } else {
            f = iAbs3;
            f2 = i11;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i10;
        } else {
            f3 = iAbs4;
            f4 = i11;
        }
        float f6 = f3 / f4;
        ViewDragHelper$Callback viewDragHelper$Callback = this.s;
        overScroller.startScroll(left, top, i5, i6, (int) ((g(i6, i4, viewDragHelper$Callback.d()) * f6) + (g(i5, i3, viewDragHelper$Callback.c(view)) * f5)));
        q(2);
        return true;
    }

    public final void l(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            b();
        }
        VelocityTracker velocityTrackerObtain = this.l;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.l = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        ViewDragHelper$Callback viewDragHelper$Callback = this.s;
        int i2 = 0;
        if (actionMasked == 0) {
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewI = i((int) x2, (int) y);
            o(x2, y, pointerId);
            u(pointerId, viewI);
            if ((this.q & this.h[pointerId]) != 0) {
                viewDragHelper$Callback.f(pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                m();
            }
            b();
            return;
        }
        if (actionMasked == 2) {
            if (this.a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i2 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i2);
                    if ((this.k & (1 << pointerId2)) != 0) {
                        float x3 = motionEvent.getX(i2);
                        float y2 = motionEvent.getY(i2);
                        float f = x3 - this.d[pointerId2];
                        float f2 = y2 - this.e[pointerId2];
                        n(f, f2, pointerId2);
                        if (this.a != 1) {
                            View viewI2 = i((int) x3, (int) y2);
                            if (e(viewI2, f, f2) && u(pointerId2, viewI2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i2++;
                }
                p(motionEvent);
                return;
            }
            int i3 = this.c;
            if ((this.k & (1 << i3)) != 0) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                float x4 = motionEvent.getX(iFindPointerIndex);
                float y3 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f;
                int i4 = this.c;
                int i5 = (int) (x4 - fArr[i4]);
                int i6 = (int) (y3 - this.g[i4]);
                int left = this.t.getLeft() + i5;
                int top = this.t.getTop() + i6;
                int left2 = this.t.getLeft();
                int top2 = this.t.getTop();
                if (i5 != 0) {
                    left = viewDragHelper$Callback.a(left, this.t);
                    WeakHashMap weakHashMap = h.a;
                    this.t.offsetLeftAndRight(left - left2);
                }
                if (i6 != 0) {
                    top = viewDragHelper$Callback.b(top, this.t);
                    WeakHashMap weakHashMap2 = h.a;
                    this.t.offsetTopAndBottom(top - top2);
                }
                if (i5 != 0 || i6 != 0) {
                    viewDragHelper$Callback.i(this.t, left, top);
                }
                p(motionEvent);
                return;
            }
            return;
        }
        if (actionMasked == 3) {
            if (this.a == 1) {
                this.u = true;
                viewDragHelper$Callback.j(this.t, 0.0f, 0.0f);
                this.u = false;
                if (this.a == 1) {
                    q(0);
                }
            }
            b();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x5 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            o(x5, y4, pointerId3);
            if (this.a != 0) {
                if (k(this.t, (int) x5, (int) y4)) {
                    u(pointerId3, this.t);
                    return;
                }
                return;
            }
            u(pointerId3, i((int) x5, (int) y4));
            if ((this.q & this.h[pointerId3]) != 0) {
                viewDragHelper$Callback.f(pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.a == 1 && pointerId4 == this.c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i2 >= pointerCount2) {
                    i = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i2);
                if (pointerId5 != this.c) {
                    View viewI3 = i((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                    View view = this.t;
                    if (viewI3 == view && u(pointerId5, view)) {
                        i = this.c;
                        break;
                    }
                }
                i2++;
            }
            if (i == -1) {
                m();
            }
        }
        f(pointerId4);
    }

    public final void m() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float f2 = this.n;
        float fAbs = Math.abs(xVelocity);
        if (fAbs < f2) {
            xVelocity = 0.0f;
        } else if (fAbs > f) {
            xVelocity = xVelocity > 0.0f ? f : -f;
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float f3 = this.n;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 < f3) {
            f = 0.0f;
        } else if (fAbs2 <= f) {
            f = yVelocity;
        } else if (yVelocity <= 0.0f) {
            f = -f;
        }
        this.u = true;
        this.s.j(this.t, xVelocity, f);
        this.u = false;
        if (this.a == 1) {
            q(0);
        }
    }

     
     
     
     
     
     
     
     
     
     
     
     
    public final void n(float f, float f2, int i) {
        boolean zD = d(f, f2, i, 1);
        int r0 = zD ? 1 : 0;
        if (d(f2, f, i, 4)) {
            r0 = (zD ? 1 : 0) | 4;
        }
        int r02 = r0;
        if (d(f, f2, i, 2)) {
            r02 = (r0 != 0 ? 1 : 0) | 2;
        }
        int r03 = r02;
        if (d(f2, f, i, 8)) {
            r03 = (r02 != 0 ? 1 : 0) | 8;
        }
        if (r03 != 0) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | r03;
            this.s.e(r03, i);
        }
    }

    public final void o(float f, float f2, int i) {
        float[] fArr = this.d;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
            fArr = fArr2;
        }
        this.f[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.e;
        this.g[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.h;
        int i3 = (int) f;
        int i4 = (int) f2;
        ViewGroup viewGroup = this.v;
        int i5 = i3 < viewGroup.getLeft() + this.o ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.o) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.o) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.o) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.k |= 1 << i;
    }

    public final void p(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.k & (1 << pointerId)) != 0) {
                float x2 = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x2;
                this.g[pointerId] = y;
            }
        }
    }

    public final void q(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.s.h(i);
            if (this.a == 0) {
                this.t = null;
            }
        }
    }

    public final boolean r(int i, int i2) {
        if (this.u) {
            return j(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        u7.p("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

     
     
     
    public final boolean s(android.view.MotionEvent r19) {
         
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn1.s(android.view.MotionEvent):boolean");
    }

    public final boolean t(View view, int i, int i2) {
        this.t = view;
        this.c = -1;
        boolean zJ = j(i, i2, 0, 0);
        if (!zJ && this.a == 0 && this.t != null) {
            this.t = null;
        }
        return zJ;
    }

    public final boolean u(int i, View view) {
        if (view == this.t && this.c == i) {
            return true;
        }
        if (view == null || !this.s.k(i, view)) {
            return false;
        }
        this.c = i;
        c(i, view);
        return true;
    }
}
