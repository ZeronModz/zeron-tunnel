package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.RectF;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vo0 extends Visibility {
    public final VisibilityAnimatorProvider a;
    public final VisibilityAnimatorProvider b;
    public final ArrayList c = new ArrayList();

    public vo0(VisibilityAnimatorProvider visibilityAnimatorProvider, VisibilityAnimatorProvider visibilityAnimatorProvider2) {
        this.a = visibilityAnimatorProvider;
        this.b = visibilityAnimatorProvider2;
    }

    public static void a(ArrayList arrayList, VisibilityAnimatorProvider visibilityAnimatorProvider, ViewGroup viewGroup, View view, boolean z) {
        if (visibilityAnimatorProvider == null) {
            return;
        }
        Animator animatorCreateAppear = z ? visibilityAnimatorProvider.createAppear(viewGroup, view) : visibilityAnimatorProvider.createDisappear(viewGroup, view);
        if (animatorCreateAppear != null) {
            arrayList.add(animatorCreateAppear);
        }
    }

    public final AnimatorSet b(ViewGroup viewGroup, View view, boolean z) {
        int iC;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        a(arrayList, this.a, viewGroup, view, z);
        a(arrayList, this.b, viewGroup, view, z);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            a(arrayList, (VisibilityAnimatorProvider) it.next(), viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        int iD = d(z);
        RectF rectF = ng1.a;
        if (iD != 0 && getDuration() == -1 && (iC = MaterialAttributes.c(context, iD, -1)) != -1) {
            setDuration(iC);
        }
        int iE = e(z);
        TimeInterpolator timeInterpolatorC = c();
        if (iE != 0 && getInterpolator() == null) {
            setInterpolator(kf2.v(context, iE, timeInterpolatorC));
        }
        AnimatorSetCompat.a(animatorSet, arrayList);
        return animatorSet;
    }

    public TimeInterpolator c() {
        return AnimationUtils.b;
    }

    public int d(boolean z) {
        return 0;
    }

    public int e(boolean z) {
        return 0;
    }

    @Override // android.transition.Visibility
    public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return b(viewGroup, view, false);
    }
}
