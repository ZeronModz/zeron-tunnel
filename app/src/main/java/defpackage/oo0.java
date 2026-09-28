package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class oo0 extends ig1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oo0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ig1, android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        View view;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                WeakReference weakReference = MaterialContainerTransformSharedElementCallback.e;
                Drawable background = ((Window) obj).getDecorView().getBackground();
                if (background != null) {
                    background.mutate().clearColorFilter();
                    break;
                }
                break;
            case 2:
                Activity activity = (Activity) obj;
                WeakReference weakReference2 = MaterialContainerTransformSharedElementCallback.e;
                if (weakReference2 != null && (view = (View) weakReference2.get()) != null) {
                    view.setAlpha(1.0f);
                    MaterialContainerTransformSharedElementCallback.e = null;
                }
                activity.finish();
                activity.overridePendingTransition(0, 0);
                break;
        }
    }

    @Override // defpackage.ig1, android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                MaterialContainerTransformSharedElementCallback.a((Window) obj);
                break;
            case 1:
                MaterialContainerTransformSharedElementCallback.a((Window) obj);
                break;
        }
    }
}
