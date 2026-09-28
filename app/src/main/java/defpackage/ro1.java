package defpackage;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.ViewTransitionController;
import androidx.constraintlayout.motion.widget.d;
import androidx.constraintlayout.widget.SharedValues;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ro1 implements SharedValues.SharedValuesListener {
    public final /* synthetic */ d a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewTransitionController e;

    public ro1(ViewTransitionController viewTransitionController, d dVar, int i, boolean z, int i2) {
        this.e = viewTransitionController;
        this.a = dVar;
        this.b = i;
        this.c = z;
        this.d = i2;
    }

    @Override // androidx.constraintlayout.widget.SharedValues.SharedValuesListener
    public final void onNewValue(int i, int i2, int i3) {
        ViewTransitionController viewTransitionController = this.e;
        MotionLayout motionLayout = viewTransitionController.a;
        d dVar = this.a;
        int i4 = dVar.v;
        dVar.v = i2;
        if (this.b != i || i4 == i2) {
            return;
        }
        boolean z = this.c;
        int i5 = this.d;
        if (z) {
            if (i5 == i2) {
                int childCount = motionLayout.getChildCount();
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = motionLayout.getChildAt(i6);
                    if (dVar.c(childAt)) {
                        int currentState = motionLayout.getCurrentState();
                        dVar.a(viewTransitionController, viewTransitionController.a, currentState, motionLayout.p(currentState), childAt);
                    }
                }
                return;
            }
            return;
        }
        if (i5 != i2) {
            int childCount2 = motionLayout.getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = motionLayout.getChildAt(i7);
                if (dVar.c(childAt2)) {
                    int currentState2 = motionLayout.getCurrentState();
                    dVar.a(viewTransitionController, viewTransitionController.a, currentState2, motionLayout.p(currentState2), childAt2);
                }
            }
        }
    }
}
