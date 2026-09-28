package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.transition.Transition;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.motion.MaterialBottomContainerBackHelper;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 10:
                zzu zzuVar = (zzu) obj;
                zzuVar.setEnabled(true);
                zzuVar.zzb().setEnabled(true);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.w = null;
                actionBarOverlayLayout.j = false;
                break;
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.G(5);
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.U.get()).requestLayout();
                    break;
                }
                break;
            case 2:
                ((CircularRevealWidget) obj).destroyCircularRevealCache();
                break;
            case 3:
                b00 b00Var = (b00) obj;
                b00Var.p();
                b00Var.r.start();
                break;
            case 4:
                ((ExpandableTransformationBehavior) obj).b = null;
                break;
            case 5:
                ((HideBottomViewOnScrollBehavior) obj).i = null;
                break;
            case 6:
                MaterialBottomContainerBackHelper materialBottomContainerBackHelper = (MaterialBottomContainerBackHelper) obj;
                materialBottomContainerBackHelper.b.setTranslationY(0.0f);
                materialBottomContainerBackHelper.b(0.0f);
                break;
            case 7:
                View view = (View) obj;
                if (view != null) {
                    view.setVisibility(0);
                }
                break;
            case 8:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.s(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 9:
                ((Transition) obj).l();
                animator.removeListener(this);
                break;
            default:
                zzu zzuVar = (zzu) obj;
                zzuVar.setEnabled(true);
                zzuVar.zzb().setEnabled(true);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 2:
                ((CircularRevealWidget) obj).buildCircularRevealCache();
                break;
            case 10:
                zzu zzuVar = (zzu) obj;
                zzuVar.setEnabled(false);
                zzuVar.zzb().setEnabled(false);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
