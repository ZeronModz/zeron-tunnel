package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;

    public /* synthetic */ m50(View view, float f, int i) {
        this.a = i;
        this.b = view;
        this.c = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        float f = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                view.setAlpha(f);
                break;
            case 1:
                view.setAlpha(f);
                break;
            case 2:
                view.setAlpha(f);
                break;
            case 3:
                view.setAlpha(f);
                break;
            case 4:
                view.setTranslationX(f);
                break;
            case 5:
                view.setTranslationX(f);
                break;
            case 6:
                view.setTranslationY(f);
                break;
            default:
                view.setTranslationY(f);
                break;
        }
    }
}
