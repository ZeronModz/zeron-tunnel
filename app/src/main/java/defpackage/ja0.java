package defpackage;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class ja0 implements LifecycleEventObserver {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ g6 b;

    public ja0(Handler handler, g6 g6Var) {
        this.a = handler;
        this.b = g6Var;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            lifecycleOwner.getLifecycle().c(this);
        }
    }
}
