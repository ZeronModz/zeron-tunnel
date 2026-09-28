package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y41 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ y41(View view, float f, float f2, int i) {
        this.a = i;
        this.b = view;
        this.c = f;
        this.d = f2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        float f = this.d;
        float f2 = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                view.setScaleX(f2);
                view.setScaleY(f);
                break;
            default:
                view.setScaleX(f2);
                view.setScaleY(f);
                break;
        }
    }
}
