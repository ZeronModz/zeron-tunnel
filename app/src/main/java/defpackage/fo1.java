package defpackage;

import android.view.View;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class fo1 extends PagerSnapHelper {
    public final /* synthetic */ ViewPager2 f;

    public fo1(ViewPager2 viewPager2) {
        this.f = viewPager2;
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public final View e(RecyclerView.LayoutManager layoutManager) {
        Object obj = this.f.n.b;
        return super.e(layoutManager);
    }
}
