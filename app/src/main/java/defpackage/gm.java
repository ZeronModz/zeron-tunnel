package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.core.view.h;
import androidx.transition.ChangeTransform;
import dev.zeron.tunnel.R;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class gm extends AnimatorListenerAdapter {
    public boolean a;
    public final Matrix b = new Matrix();
    public final boolean c;
    public final boolean d;
    public final View e;
    public final im f;
    public final hm g;
    public final Matrix h;

    public gm(View view, im imVar, hm hmVar, Matrix matrix, boolean z, boolean z2) {
        this.c = z;
        this.d = z2;
        this.e = view;
        this.f = imVar;
        this.g = hmVar;
        this.h = matrix;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z = this.a;
        im imVar = this.f;
        View view = this.e;
        if (!z) {
            if (this.c && this.d) {
                Matrix matrix = this.b;
                matrix.set(this.h);
                view.setTag(R.id.transition_transform, matrix);
                float f = imVar.a;
                float f2 = imVar.b;
                float f3 = imVar.c;
                float f4 = imVar.d;
                float f5 = imVar.e;
                float f6 = imVar.f;
                float f7 = imVar.g;
                float f8 = imVar.h;
                String[] strArr = ChangeTransform.F;
                view.setTranslationX(f);
                view.setTranslationY(f2);
                WeakHashMap weakHashMap = h.a;
                cn1.n(view, f3);
                view.setScaleX(f4);
                view.setScaleY(f5);
                view.setRotationX(f6);
                view.setRotationY(f7);
                view.setRotation(f8);
            } else {
                view.setTag(R.id.transition_transform, null);
                view.setTag(R.id.parent_matrix, null);
            }
        }
        vo1.a.Z(view, null);
        float f9 = imVar.a;
        float f10 = imVar.b;
        float f11 = imVar.c;
        float f12 = imVar.d;
        float f13 = imVar.e;
        float f14 = imVar.f;
        float f15 = imVar.g;
        float f16 = imVar.h;
        String[] strArr2 = ChangeTransform.F;
        view.setTranslationX(f9);
        view.setTranslationY(f10);
        WeakHashMap weakHashMap2 = h.a;
        cn1.n(view, f11);
        view.setScaleX(f12);
        view.setScaleY(f13);
        view.setRotationX(f14);
        view.setRotationY(f15);
        view.setRotation(f16);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.g.a;
        Matrix matrix2 = this.b;
        matrix2.set(matrix);
        View view = this.e;
        view.setTag(R.id.transition_transform, matrix2);
        im imVar = this.f;
        float f = imVar.a;
        float f2 = imVar.b;
        float f3 = imVar.c;
        float f4 = imVar.d;
        float f5 = imVar.e;
        float f6 = imVar.f;
        float f7 = imVar.g;
        float f8 = imVar.h;
        String[] strArr = ChangeTransform.F;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        WeakHashMap weakHashMap = h.a;
        cn1.n(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        String[] strArr = ChangeTransform.F;
        View view = this.e;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap weakHashMap = h.a;
        cn1.n(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
