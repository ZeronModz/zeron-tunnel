package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.g;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class gz extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ gz(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                g gVar = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = gVar.f;
                if (arrayList != null && !gVar.g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Animatable2Compat.AnimationCallback) it.next()).a(gVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                g gVar = this.b;
                ArrayList arrayList = gVar.f;
                if (arrayList != null && !gVar.g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Animatable2Compat.AnimationCallback) it.next()).b(gVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
