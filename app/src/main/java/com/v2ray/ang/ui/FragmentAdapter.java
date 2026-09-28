package com.v2ray.ang.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/v2ray/ang/ui/FragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "Landroidx/fragment/app/Fragment;", "mFragments", "<init>", "(Landroidx/fragment/app/FragmentActivity;Ljava/util/List;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FragmentAdapter extends FragmentStateAdapter {
    public final List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentAdapter(FragmentActivity fragmentActivity, List<? extends Fragment> list) {
        super(fragmentActivity);
        fragmentActivity.getClass();
        list.getClass();
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
