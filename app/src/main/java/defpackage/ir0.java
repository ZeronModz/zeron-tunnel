package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ir0 implements Comparable {
    public int c;
    public float a = 0.0f;
    public int b = 0;
    public final LinkedHashMap d = new LinkedHashMap();
    public float e = 1.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 0.0f;
    public float i = 1.0f;
    public float j = 1.0f;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 0.0f;
    public float o = 0.0f;
    public float p = Float.NaN;
    public float q = Float.NaN;

    public static boolean c(float f, float f2) {
        return (Float.isNaN(f) || Float.isNaN(f2)) ? Float.isNaN(f) != Float.isNaN(f2) : Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(HashMap map, int i) {
        for (String str : map.keySet()) {
            ViewSpline viewSpline = (ViewSpline) map.get(str);
            if (viewSpline != null) {
                str.getClass();
                byte b = -1;
                switch (str.hashCode()) {
                    case -1249320806:
                        if (str.equals("rotationX")) {
                            b = 0;
                        }
                        break;
                    case -1249320805:
                        if (str.equals("rotationY")) {
                            b = 1;
                        }
                        break;
                    case -1225497657:
                        if (str.equals("translationX")) {
                            b = 2;
                        }
                        break;
                    case -1225497656:
                        if (str.equals("translationY")) {
                            b = 3;
                        }
                        break;
                    case -1225497655:
                        if (str.equals("translationZ")) {
                            b = 4;
                        }
                        break;
                    case -1001078227:
                        if (str.equals("progress")) {
                            b = 5;
                        }
                        break;
                    case -908189618:
                        if (str.equals("scaleX")) {
                            b = 6;
                        }
                        break;
                    case -908189617:
                        if (str.equals("scaleY")) {
                            b = 7;
                        }
                        break;
                    case -760884510:
                        if (str.equals("transformPivotX")) {
                            b = 8;
                        }
                        break;
                    case -760884509:
                        if (str.equals("transformPivotY")) {
                            b = 9;
                        }
                        break;
                    case -40300674:
                        if (str.equals("rotation")) {
                            b = 10;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            b = 11;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            b = 12;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            b = 13;
                        }
                        break;
                }
                switch (b) {
                    case 0:
                        viewSpline.b(i, Float.isNaN(this.h) ? 0.0f : this.h);
                        break;
                    case 1:
                        viewSpline.b(i, Float.isNaN(this.a) ? 0.0f : this.a);
                        break;
                    case 2:
                        viewSpline.b(i, Float.isNaN(this.m) ? 0.0f : this.m);
                        break;
                    case 3:
                        viewSpline.b(i, Float.isNaN(this.n) ? 0.0f : this.n);
                        break;
                    case 4:
                        viewSpline.b(i, Float.isNaN(this.o) ? 0.0f : this.o);
                        break;
                    case 5:
                        viewSpline.b(i, Float.isNaN(this.q) ? 0.0f : this.q);
                        break;
                    case 6:
                        viewSpline.b(i, Float.isNaN(this.i) ? 1.0f : this.i);
                        break;
                    case 7:
                        viewSpline.b(i, Float.isNaN(this.j) ? 1.0f : this.j);
                        break;
                    case 8:
                        viewSpline.b(i, Float.isNaN(this.k) ? 0.0f : this.k);
                        break;
                    case 9:
                        viewSpline.b(i, Float.isNaN(this.l) ? 0.0f : this.l);
                        break;
                    case 10:
                        viewSpline.b(i, Float.isNaN(this.g) ? 0.0f : this.g);
                        break;
                    case 11:
                        viewSpline.b(i, Float.isNaN(this.f) ? 0.0f : this.f);
                        break;
                    case 12:
                        viewSpline.b(i, Float.isNaN(this.p) ? 0.0f : this.p);
                        break;
                    case 13:
                        viewSpline.b(i, Float.isNaN(this.e) ? 1.0f : this.e);
                        break;
                    default:
                        if (str.startsWith("CUSTOM")) {
                            String str2 = str.split(",")[1];
                            LinkedHashMap linkedHashMap = this.d;
                            if (linkedHashMap.containsKey(str2)) {
                                ConstraintAttribute constraintAttribute = (ConstraintAttribute) linkedHashMap.get(str2);
                                if (viewSpline instanceof ViewSpline.CustomSet) {
                                    ((ViewSpline.CustomSet) viewSpline).f.append(i, constraintAttribute);
                                } else {
                                    constraintAttribute.a();
                                    viewSpline.toString();
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    public final void b(View view) {
        this.c = view.getVisibility();
        this.e = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.f = view.getElevation();
        this.g = view.getRotation();
        this.h = view.getRotationX();
        this.a = view.getRotationY();
        this.i = view.getScaleX();
        this.j = view.getScaleY();
        this.k = view.getPivotX();
        this.l = view.getPivotY();
        this.m = view.getTranslationX();
        this.n = view.getTranslationY();
        this.o = view.getTranslationZ();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ((ir0) obj).getClass();
        return Float.compare(0.0f, 0.0f);
    }

    public final void d(Rect rect, ConstraintSet constraintSet, int i, int i2) {
        rect.width();
        rect.height();
        ConstraintSet.Constraint constraintI = constraintSet.i(i2);
        ConstraintSet.PropertySet propertySet = constraintI.c;
        ConstraintSet.Motion motion = constraintI.d;
        int i3 = propertySet.c;
        this.b = i3;
        int i4 = propertySet.b;
        this.c = i4;
        this.e = (i4 == 0 || i3 != 0) ? propertySet.d : 0.0f;
        ConstraintSet.Transform transform = constraintI.f;
        boolean z = transform.m;
        this.f = transform.n;
        this.g = transform.b;
        this.h = transform.c;
        this.a = transform.d;
        this.i = transform.e;
        this.j = transform.f;
        this.k = transform.g;
        this.l = transform.h;
        this.m = transform.j;
        this.n = transform.k;
        this.o = transform.l;
        Easing.c(motion.d);
        this.p = motion.h;
        this.q = constraintI.c.e;
        for (String str : constraintI.g.keySet()) {
            ConstraintAttribute constraintAttribute = (ConstraintAttribute) constraintI.g.get(str);
            int iOrdinal = constraintAttribute.c.ordinal();
            if (iOrdinal != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.d.put(str, constraintAttribute);
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                }
            }
            float f = this.g + 90.0f;
            this.g = f;
            if (f > 180.0f) {
                this.g = f - 360.0f;
                return;
            }
            return;
        }
        this.g -= 90.0f;
    }
}
