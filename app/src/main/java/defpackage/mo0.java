package defpackage;

import android.transition.Transition;
import android.view.View;
import com.google.android.material.transition.platform.MaterialContainerTransform;
import com.google.android.material.transition.platform.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class mo0 extends ig1 {
    public final /* synthetic */ View a;
    public final /* synthetic */ d b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ MaterialContainerTransform e;

    public mo0(MaterialContainerTransform materialContainerTransform, View view, d dVar, View view2, View view3) {
        this.e = materialContainerTransform;
        this.a = view;
        this.b = dVar;
        this.c = view2;
        this.d = view3;
    }

    @Override // defpackage.ig1, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        MaterialContainerTransform materialContainerTransform = this.e;
        materialContainerTransform.removeListener(this);
        if (materialContainerTransform.a) {
            return;
        }
        this.c.setAlpha(1.0f);
        this.d.setAlpha(1.0f);
        this.a.getOverlay().remove(this.b);
    }

    @Override // defpackage.ig1, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.a.getOverlay().add(this.b);
        this.c.setAlpha(0.0f);
        this.d.setAlpha(0.0f);
    }
}
