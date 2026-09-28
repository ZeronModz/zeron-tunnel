package defpackage;

import android.view.View;
import androidx.transition.Transition;
import com.google.android.material.transition.MaterialContainerTransform;
import com.google.android.material.transition.d;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class no0 extends jg1 {
    public final /* synthetic */ View a;
    public final /* synthetic */ d b;
    public final /* synthetic */ View c;
    public final /* synthetic */ View d;
    public final /* synthetic */ MaterialContainerTransform e;

    public no0(MaterialContainerTransform materialContainerTransform, View view, d dVar, View view2, View view3) {
        this.e = materialContainerTransform;
        this.a = view;
        this.b = dVar;
        this.c = view2;
        this.d = view3;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.e.v(this);
        this.c.setAlpha(1.0f);
        this.d.setAlpha(1.0f);
        this.a.getOverlay().remove(this.b);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.a.getOverlay().add(this.b);
        this.c.setAlpha(0.0f);
        this.d.setAlpha(0.0f);
    }
}
