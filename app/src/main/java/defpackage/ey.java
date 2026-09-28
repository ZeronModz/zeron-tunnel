package defpackage;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ey {
    public static final String c = new String("WRAP_DIMENSION");
    public static final String d = new String("PARENT_DIMENSION");
    public int a;
    public String b;

    public static ey b() {
        ey eyVar = new ey();
        eyVar.a = 0;
        eyVar.b = c;
        return eyVar;
    }

    public final void a(ConstraintWidget constraintWidget, int i) {
        String str = this.b;
        String str2 = d;
        String str3 = c;
        if (i == 0) {
            if (str == str3) {
                constraintWidget.O(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                return;
            }
            if (str == str2) {
                constraintWidget.O(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                return;
            } else {
                if (str == null) {
                    constraintWidget.O(ConstraintWidget.DimensionBehaviour.FIXED);
                    constraintWidget.Q(this.a);
                    return;
                }
                return;
            }
        }
        if (str == str3) {
            constraintWidget.P(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            return;
        }
        if (str == str2) {
            constraintWidget.P(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
        } else if (str == null) {
            constraintWidget.P(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.N(this.a);
        }
    }
}
