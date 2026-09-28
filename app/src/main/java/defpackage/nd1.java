package defpackage;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class nd1 implements ViewPager.OnAdapterChangeListener {
    public boolean a;
    public final /* synthetic */ TabLayout b;

    public nd1(TabLayout tabLayout) {
        this.b = tabLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
    public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        TabLayout tabLayout = this.b;
        if (tabLayout.O == viewPager) {
            tabLayout.l(pagerAdapter2, this.a);
        }
    }
}
