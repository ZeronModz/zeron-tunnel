package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class y90 implements LifecycleEventObserver {
    public final /* synthetic */ String a;
    public final /* synthetic */ FragmentResultListener b;
    public final /* synthetic */ Lifecycle c;
    public final /* synthetic */ FragmentManager d;

    public y90(FragmentManager fragmentManager, String str, FragmentResultListener fragmentResultListener, Lifecycle lifecycle) {
        this.d = fragmentManager;
        this.a = str;
        this.b = fragmentResultListener;
        this.c = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Bundle bundle;
        Lifecycle.Event event2 = Lifecycle.Event.ON_START;
        FragmentManager fragmentManager = this.d;
        String str = this.a;
        if (event == event2 && (bundle = (Bundle) fragmentManager.k.get(str)) != null) {
            this.b.onFragmentResult(str, bundle);
            fragmentManager.clearFragmentResult(str);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.c.c(this);
            fragmentManager.l.remove(str);
        }
    }
}
