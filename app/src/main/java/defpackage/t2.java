package defpackage;

import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.ForwardingListener;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 extends ForwardingListener {
    public final /* synthetic */ ActivityChooserView j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(ActivityChooserView activityChooserView, FrameLayout frameLayout) {
        super(frameLayout);
        this.j = activityChooserView;
    }

    @Override // androidx.appcompat.widget.ForwardingListener
    public final ShowableListMenu b() {
        return this.j.getListPopupWindow();
    }

    @Override // androidx.appcompat.widget.ForwardingListener
    public final boolean c() {
        ActivityChooserView activityChooserView = this.j;
        if (activityChooserView.b() || !activityChooserView.q) {
            return true;
        }
        activityChooserView.o = false;
        activityChooserView.c(activityChooserView.p);
        return true;
    }

    @Override // androidx.appcompat.widget.ForwardingListener
    public final boolean d() {
        this.j.a();
        return true;
    }
}
