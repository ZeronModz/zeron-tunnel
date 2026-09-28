package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.expandable.ExpandableWidget;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class r40 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ExpandableWidget c;
    public final /* synthetic */ ExpandableBehavior d;

    public r40(ExpandableBehavior expandableBehavior, View view, int i, ExpandableWidget expandableWidget) {
        this.d = expandableBehavior;
        this.a = view;
        this.b = i;
        this.c = expandableWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.d;
        if (expandableBehavior.a == this.b) {
            ExpandableWidget expandableWidget = this.c;
            expandableBehavior.s((View) expandableWidget, view, expandableWidget.isExpanded(), false);
        }
        return false;
    }
}
