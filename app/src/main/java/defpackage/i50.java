package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.recyclerview.widget.r;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.search.h;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i50 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i50(Object obj, int i) {
        this.a = i;
        this.c = obj;
        this.b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.b = true;
                break;
            case 2:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!this.b) {
                    ((View) obj).setVisibility(4);
                }
                break;
            case 1:
                r rVar = (r) obj;
                if (this.b) {
                    this.b = false;
                } else if (((Float) rVar.z.getAnimatedValue()).floatValue() != 0.0f) {
                    rVar.A = 2;
                    rVar.s.invalidate();
                } else {
                    rVar.A = 0;
                    rVar.g(0);
                }
                break;
            case 2:
                ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) obj;
                if (!this.b) {
                    scrollingTabContainerView.setVisibility(0);
                    break;
                }
                break;
            default:
                h hVar = (h) obj;
                hVar.l(this.b ? 1.0f : 0.0f);
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = hVar.c;
                clippableRoundedCornerLayout.a = null;
                clippableRoundedCornerLayout.b = 0.0f;
                clippableRoundedCornerLayout.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.b) {
                    ((View) obj).setVisibility(0);
                }
                break;
            case 1:
            default:
                super.onAnimationStart(animator);
                break;
            case 2:
                ((ScrollingTabContainerView) obj).setVisibility(0);
                this.b = false;
                break;
            case 3:
                ((h) obj).l(this.b ? 0.0f : 1.0f);
                break;
        }
    }

    public i50(View view, boolean z) {
        this.a = 0;
        this.b = z;
        this.c = view;
    }

    public i50(h hVar, boolean z) {
        this.a = 3;
        this.c = hVar;
        this.b = z;
    }
}
