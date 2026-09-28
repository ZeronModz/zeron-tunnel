package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.v2ray.ang.Hometab;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes3.dex */
public final class yd0 implements TabLayout.OnTabSelectedListener {
    public final /* synthetic */ Hometab a;

    public yd0(Hometab hometab) {
        this.a = hometab;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabReselected(TabLayout.Tab tab) {
        tab.getClass();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabSelected(TabLayout.Tab tab) {
        tab.getClass();
        boolean z = tab.d == 1;
        Hometab hometab = this.a;
        hometab.i = z;
        hometab.invalidateOptionsMenu();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public final void onTabUnselected(TabLayout.Tab tab) {
        tab.getClass();
    }
}
