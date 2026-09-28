package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.CollapsibleActionView;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class kp0 extends FrameLayout implements CollapsibleActionView {
    public final android.view.CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public kp0(View view) {
        super(view.getContext());
        this.a = (android.view.CollapsibleActionView) view;
        addView(view);
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
