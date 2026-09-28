package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.transition.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class wo0 extends Visibility {
    public final VisibilityAnimatorProvider E;
    public final VisibilityAnimatorProvider F;
    public final ArrayList G = new ArrayList();

    public wo0(VisibilityAnimatorProvider visibilityAnimatorProvider, VisibilityAnimatorProvider visibilityAnimatorProvider2) {
        this.E = visibilityAnimatorProvider;
        this.F = visibilityAnimatorProvider2;
    }

    public static void L(ArrayList arrayList, VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator animatorCreateAppear = z ? visibilityAnimatorProvider.createAppear(viewGroup, view) : visibilityAnimatorProvider.createDisappear(viewGroup, view);
        if (animatorCreateAppear != null) {
            arrayList.add(animatorCreateAppear);
        }
    }

    @Override // androidx.transition.Visibility
    public final Animator I(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return M(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public final Animator J(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return M(viewGroup, view, false);
    }

    public final AnimatorSet M(ViewGroup viewGroup, View view, boolean z) {
        int iC;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        L(arrayList, this.E, viewGroup, view, z);
        L(arrayList, this.F, viewGroup, view, z);
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            L(arrayList, (VisibilityAnimatorProvider) it.next(), viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        int iO = O(z);
        RectF rectF = mg1.a;
        if (iO != 0 && this.c == -1 && (iC = MaterialAttributes.c(context, iO, -1)) != -1) {
            y(iC);
        }
        int iP = P(z);
        TimeInterpolator timeInterpolatorN = N();
        if (iP != 0 && this.d == null) {
            A(kf2.v(context, iP, timeInterpolatorN));
        }
        AnimatorSetCompat.a(animatorSet, arrayList);
        return animatorSet;
    }

    public TimeInterpolator N() {
        return AnimationUtils.b;
    }

    public int O(boolean z) {
        return 0;
    }

    public int P(boolean z) {
        return 0;
    }
}
