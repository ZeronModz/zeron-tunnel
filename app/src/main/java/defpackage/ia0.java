package defpackage;

import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ia0 extends FragmentManager.FragmentLifecycleCallbacks {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FrameLayout b;

    public ia0(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.a = fragment;
        this.b = frameLayout;
    }
}
