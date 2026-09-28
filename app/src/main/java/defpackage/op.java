package defpackage;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-6bfc5c3105a4be2b3e0ed36dbd4f8244cea9222f352ced40fd941a9b8aa981c8 */
/* JADX INFO: loaded from: classes.dex */
public final class op implements LifecycleEventObserver {
    public final /* synthetic */ ComponentActivity a;

    public op(ComponentActivity componentActivity) {
        this.a = componentActivity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        lifecycleOwner.getClass();
        event.getClass();
        ComponentActivity componentActivity = this.a;
        ComponentActivity.access$ensureViewModelStore(componentActivity);
        componentActivity.getLifecycle().c(this);
    }
}
