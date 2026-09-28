package defpackage;

import android.widget.FrameLayout;
import androidx.core.view.h;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ha0 implements LifecycleEventObserver {
    public final /* synthetic */ sa0 a;
    public final /* synthetic */ FragmentStateAdapter b;

    public ha0(FragmentStateAdapter fragmentStateAdapter, sa0 sa0Var) {
        this.b = fragmentStateAdapter;
        this.a = sa0Var;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        FragmentStateAdapter fragmentStateAdapter = this.b;
        if (fragmentStateAdapter.e.M()) {
            return;
        }
        lifecycleOwner.getLifecycle().c(this);
        sa0 sa0Var = this.a;
        FrameLayout frameLayout = (FrameLayout) sa0Var.a;
        WeakHashMap weakHashMap = h.a;
        if (frameLayout.isAttachedToWindow()) {
            fragmentStateAdapter.z(sa0Var);
        }
    }
}
