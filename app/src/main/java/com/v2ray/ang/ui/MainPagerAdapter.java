package com.v2ray.ang.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/v2ray/ang/ui/MainPagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "Landroidx/fragment/app/FragmentActivity;", "activity", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "app_playstoreRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainPagerAdapter extends FragmentStateAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        fragmentActivity.getClass();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int c() {
        return 2;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment w(int i) {
        return i != 0 ? i != 1 ? new HomeFragment() : new LogsFragment() : new HomeFragment();
    }
}
