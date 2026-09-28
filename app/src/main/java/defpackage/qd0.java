package defpackage;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.v2ray.ang.ui.HomeFragment;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class qd0 extends FragmentStateAdapter {
    public final /* synthetic */ List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qd0(HomeFragment homeFragment, List list) {
        super(homeFragment);
        this.m = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int c() {
        return this.m.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment w(int i) {
        return (Fragment) this.m.get(i);
    }
}
