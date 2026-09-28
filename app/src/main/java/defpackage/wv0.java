package defpackage;

import android.view.View;
import androidx.viewpager.widget.PagerTabStrip;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class wv0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PagerTabStrip b;

    public /* synthetic */ wv0(PagerTabStrip pagerTabStrip, int i) {
        this.a = i;
        this.b = pagerTabStrip;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        PagerTabStrip pagerTabStrip = this.b;
        switch (i) {
            case 0:
                pagerTabStrip.a.setCurrentItem(r0.getCurrentItem() - 1);
                break;
            default:
                ViewPager viewPager = pagerTabStrip.a;
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                break;
        }
    }
}
