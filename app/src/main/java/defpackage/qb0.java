package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import dev.zeron.tunnel.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class qb0 extends FrameLayout {
    public static final /* synthetic */ int c = 0;
    public ViewGroup a;
    public boolean b;

    public static void a(View view, ArrayList arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (this.b) {
            super.onViewAdded(view);
        } else {
            u7.p("This GhostViewHolder is detached!");
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        ViewGroup viewGroup = this.a;
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            viewGroup.setTag(R.id.ghost_view_holder, null);
            viewGroup.getOverlay().remove(this);
            this.b = false;
        }
    }
}
