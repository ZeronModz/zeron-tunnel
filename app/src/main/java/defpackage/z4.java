package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class z4 extends j03 {
    public final ObjectAnimator q;
    public final boolean r;

    public z4(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        a5 a5Var = new a5();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        a5Var.b = numberOfFrames2;
        int[] iArr = a5Var.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            iArr = new int[numberOfFrames2];
            a5Var.a = iArr;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames2 - i4) - 1 : i4);
            iArr[i4] = duration;
            i3 += duration;
        }
        a5Var.c = i3;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(a5Var.c);
        objectAnimatorOfInt.setInterpolator(a5Var);
        this.r = z2;
        this.q = objectAnimatorOfInt;
    }

    @Override // defpackage.j03
    public final boolean d() {
        return this.r;
    }

    @Override // defpackage.j03
    public final void r() {
        this.q.reverse();
    }

    @Override // defpackage.j03
    public final void u() {
        this.q.start();
    }

    @Override // defpackage.j03
    public final void w() {
        this.q.cancel();
    }
}
