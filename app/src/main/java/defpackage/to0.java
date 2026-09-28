package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.motion.MaterialSideContainerBackHelper;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class to0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ MaterialSideContainerBackHelper c;

    public to0(MaterialSideContainerBackHelper materialSideContainerBackHelper, boolean z, int i) {
        this.c = materialSideContainerBackHelper;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.c;
        materialSideContainerBackHelper.b.setTranslationX(0.0f);
        materialSideContainerBackHelper.c(0.0f, this.b, this.a);
    }
}
