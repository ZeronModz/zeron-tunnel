package defpackage;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class y2 implements ViewBinding {
    public final DrawerLayout a;
    public final DrawerLayout b;
    public final NavigationView c;
    public final TabLayout d;
    public final MaterialToolbar e;
    public final ViewPager2 f;

    public y2(DrawerLayout drawerLayout, DrawerLayout drawerLayout2, NavigationView navigationView, TabLayout tabLayout, MaterialToolbar materialToolbar, ViewPager2 viewPager2) {
        this.a = drawerLayout;
        this.b = drawerLayout2;
        this.c = navigationView;
        this.d = tabLayout;
        this.e = materialToolbar;
        this.f = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.a;
    }
}
